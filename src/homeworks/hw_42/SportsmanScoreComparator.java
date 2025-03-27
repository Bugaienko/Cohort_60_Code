package homeworks.hw_42;

import java.util.Comparator;

/**
 * @author Sergey Bugaenko
 * {@code @date} 27.03.2025
 */

public class SportsmanScoreComparator implements Comparator<Sportsman> {

    @Override
    public int compare(Sportsman s1, Sportsman s2) {
        return Double.compare(s1.getScore(), s2.getScore());

        // Такая реализация будет работать не верно, при разнице очков меньше 1
        // 90,75 - 90,50 = 0,25 -> 0
        // 91 - 90.50 = 0.5 -> 0
//        return (int) (s1.getScore() - s2.getScore());


    }
}
