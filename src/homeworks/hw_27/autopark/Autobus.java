package homeworks.hw_27.autopark;

/**
 * @author Sergey Bugaenko
 * {@code @date} 05.03.2025
 */


/*
Ассоциация - это связь, при которой один объект связан с другим объектов. Это наиболее общая форма связи

Агрегация - это форма ассоциации, представляющая собой отношение "часть-целое",
где часть может существовать независимо от целого

Композиция - это более жесткая форма агрегации (также отношение часть-целое), НО где часть не может существовать без целого.
Обычно, часть создается вместе с целым. Если целое уничтожается, часть также уничтожается. (жизненные циклы объекта)

Ассоциации (в том числе и Агрегация, и Композиция) реализуются через создание ссылок в классе на другие объекты.
Это значит, что класс содержит поля, которые ссылаются на объекты других классов.

Ассоциации - это отношение между двумя классами, где один класс использует другой класс в качестве одного из своих полей.

Автобус содержит Водителя. HAS-A. Агрегация. Водитель может существовать отдельно от автобуса.

Автобус содержит Автопилот. HAS-A. Композиция. Автопилот является неотъемлемой частью автобуса.
Жесткая / неразрывная связь. Часть создается вместе с целым.

Важные аспекты ассоциации.

Направленность. Ассоциация может однонаправленная или двунаправленная.

Кардинальность связи. Определяет сколько объектов одного класса может быть ассоциировано с объектом другого класса.

One-to-One (один к одному), One-to-Many (Один ко многим), Many-to-Many (многие ко многим)

1 : 1 -> Автобус и двигатель
Каждый автобус может иметь ровно один двигатель. И на каждый двигатель приходится ровно один автобус.

1 : Many -> Автобус и список пассажиров. Один автобус может иметь множество пассажиров. Один пассажир - в одном автобусе.

Many : Many -> Список автобусов и список автобусных остановок.
Каждый автобус останавливается на множестве остановок
На каждой остановке может обслуживаться множество автобусов



 */

public class Autobus {

    private static int counter = 1;

    // Уникальный идентификатор объекта
    private final int id;

    private BusDriver driver; // агрегация (мягкая связь)
    private Autopilot autopilot; // композиция (жесткая связь)

    private final int capacity;
    private int countPassengers;

    private final Passenger[] passengers;

    public Autobus(BusDriver driver, int capacity) {
        this.id = counter++;
        this.driver = driver;
        driver.setAutobus(this);
        this.capacity = capacity;
        this.autopilot = new Autopilot("AP-v0001");
        this.passengers = new Passenger[capacity];
    }

    // TODO переписать, используя StringBuilder
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Autobus: { id: ");
        sb.append(id).append("; capacity: ").append(capacity);
        sb.append("; ").append(driver.toString());
        sb.append("; ").append(autopilot.toString());
        sb.append("; passengers: ").append(countPassengers);
        sb.append(" }");

        return sb.toString();

//        return "Autobus {" +
//                "id=" + id +
//                ", driver=" + driver.toString() +
//                ", autopilot=" + autopilot.toString() +
//                ", capacity=" + capacity +
//                '}';
    }

    public void showListPassengers() {

        if (countPassengers == 0) {
            System.out.println("[]");
            return;
        }

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < countPassengers; i++) {
            sb.append(passengers[i].toString());
            sb.append((i < countPassengers - 1) ? ", " : "]");
        }

        System.out.println(sb.toString());
    }

    public boolean takePassenger(Passenger passenger) {
        if (passenger == null) return false;

         /*
          1. Надо проверить свободное место
          2. Находится ли уже этот пассажир в автобусе
          3. Если есть место и пассажир еще не в автобусе - садим на борт:
             3.1. Добавляем его в список пассажиров
             3.2. Увеличиваем кол-во пассажиров
             3.3. Возвращаем true
          4. Иначе (3.3) - что-то пошло не так - выдаем сообщение об ошибке и возвращаем false
         */

        if (countPassengers < capacity) {
            // Место есть
            // Надо проверить п.2.
            if (isPassengerInBus(passenger) >= 0) {
                // Метод вернул 0 или больше (т.е. валидный индекс), значит пассажир в автобусе
                System.out.printf("Пассажир с id %d уже в автобусе c id %d\n",
                        passenger.getId(), this.id);
                return false;
            }

            // Садим на борт пассажира
            passengers[countPassengers] = passenger;
            countPassengers++;
            System.out.printf("Пассажир с id %d завершил посадку в автобус c id %d\n",
                    passenger.getId(), this.id);
            return true;
        }

        // Свободного места в автобусе нет
        System.out.printf("В автобусе с id %d свободных мест нет!\n", this.id);
        return false;

    }

    private int isPassengerInBus(Passenger passenger) {
        for (int i = 0; i < countPassengers; i++) {
            if (passengers[i].getId() == passenger.getId()) {
                // id совпали - значит это один и тот же объект
                return i;
            }
        }
        // пассажира с таким id нет в массиве пассажиров
        return -1;
    }

    public boolean dropPassenger(Passenger passenger) {
        /*
        1. Убедиться, что пассажир в автобусе - если нет - вернуть false
        2. Удалить его из массива ->
            2.1. Сдвинуть всех пассажиров "справа" от него.
            2.2. Не забыть изменить кол-во пассажиров
            2.3. Вернуть true
         */

        if (passenger == null || countPassengers == 0) return false;

        int index = isPassengerInBus(passenger);

        if (index == -1) {
            // Такого пассажира в автобусе нет.
            System.out.printf("Пассажир с id %d в автобусе (%d) не найден!\n", passenger.getId(), this.id);
            return false;
        }

        // Удаление пассажира их списка
        for (int i = index; i < countPassengers - 1; i++) {
            passengers[i] = passengers[i + 1];
        }

        // Не обязательная строка
        passengers[countPassengers - 1] = null;
        // обязательная строка
        countPassengers--;

        System.out.printf("Пассажир (%d) вышел из автобуса (%d)\n", passenger.getId(), this.id);
        return true;
    }


    public void setDriver(BusDriver driver) {
        this.driver.setAutobus(null);
        this.driver = driver;
        this.driver.setAutobus(this);

    }

    public int getId() {
        return id;
    }

    public BusDriver getDriver() {
        return driver;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public Autopilot getAutopilot() {
        return autopilot;
    }


}
