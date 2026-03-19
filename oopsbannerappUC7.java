import java.util.*;

public class BannerAppUC7 {

    // Static Inner Class
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter
        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Create mapping list
        List<CharacterPatternMap> patterns = Arrays.asList(
            new CharacterPatternMap('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
            }),
            new CharacterPatternMap('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
            }),
            new CharacterPatternMap('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
            })
        );

        String word = "OOPS";

        // Build banner
        for (int i = 0; i < 5; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                for (CharacterPatternMap cp : patterns) {
                    if (cp.getCharacter() == ch) {
                        line.append(cp.getPattern()[i]).append("  ");
                    }
                }
            }
            System.out.println(line);
        }
    }
}