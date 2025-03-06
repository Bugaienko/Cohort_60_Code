package homeworks.hw_27.components;

/**
 * @author Sergey Bugaenko
 * {@code @date} 06.03.2025
 */

public class Memory extends Component {

    private final int size;


    public Memory(String brand, String model, int size) {
        super(brand, model);
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
