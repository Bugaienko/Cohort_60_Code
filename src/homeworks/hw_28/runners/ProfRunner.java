package homeworks.hw_28.runners;

/**
 * @author Sergey Bugaenko
 * {@code @date} 07.03.2025
 */

public class ProfRunner extends Human {
    {
        typeRunner = "Спортсмен-профи";
    }


    public ProfRunner() {
        super(25, 5);
    }

    public ProfRunner(int runSpeed, int restTime) {
        super(runSpeed, restTime);
    }
}
