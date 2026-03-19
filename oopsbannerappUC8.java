import java.util.*;

public class BannerAppUC8 {

    public static void main(String[] args) {

        // HashMap to store character patterns
        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        });

        patternMap.put('P', new String[]{
            "**** ",
            "*   *",
            "**** ",
            "*    ",
            "*    "
        });

        patternMap.put('S', new String[]{
            " ****",
            "*    ",
            " *** ",
            "    *",
            "**** "
        });

        String word = "OOPS";

        // Build and print banner
        for (int i = 0; i < 5; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                String[] pattern = patternMap.get(ch);
                if (pattern != null) {
                    line.append(pattern[i]).append("  ");
                }
            }
            System.out.println(line);
        }
    }
}