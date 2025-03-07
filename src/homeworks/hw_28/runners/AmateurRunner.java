package homeworks.hw_28.runners;

/**
 * @author Sergey Bugaenko
 * {@code @date} 07.03.2025
 */

public class AmateurRunner extends Human {

    // Блок инициализации
    {
        typeRunner = "Любитель";
    }

    public AmateurRunner() {
        super(15, 10);

    }

    public AmateurRunner(int runSpeed, int restTime) {
        super(runSpeed, restTime);
    }


}
