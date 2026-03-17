import java.util.HashMap;
import java.util.Map;

public class BannerApp {

    // Centralized Map for patterns
    private static final Map<Character, String[]> patternMap = new HashMap<>();

    // Initialize patterns
    static {
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
    }

    // Render function (NEW in UC8)
    public static void renderBanner(String word) {

        int height = 5;

        for (int i = 0; i < height; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    line.append(pattern[i]).append("  ");
                } else {
                    line.append("???? ").append("  ");
                }
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        renderBanner("OOPS");
    }
}