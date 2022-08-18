import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class WordsChecker {
    protected String text;

    public WordsChecker(String text) {
        this.text = text;
    }

    public boolean hasWord(String word) {
        String[] words = text.split("\\P{IsAlphabetic}+");
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(words[i].toLowerCase())) {
                words[i] = words[i].toLowerCase();
            }
        }

        Set<String> set = new HashSet<>();
        set.addAll(Arrays.asList(words));

        if (set.contains(word)) {
            return true;
        } else {
            return false;
        }
    }
}
