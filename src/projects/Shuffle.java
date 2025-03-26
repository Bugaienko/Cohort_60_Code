package projects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/**
 * @author Sergey Bugaenko
 * {@code @date} 25.03.2025
 */

public class Shuffle {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(3, 4, 5, 6));

        Collections.shuffle(list);

        System.out.println(list);
    }
}
