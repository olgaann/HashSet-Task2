import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class WordsChecker {
    protected String text;
    protected Set<String> set = new HashSet<>();

    public WordsChecker(String text) {
        this.text = text;

        String[] words = text.split("\\P{IsAlphabetic}+");
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(words[i].toLowerCase())) {
                words[i] = words[i].toLowerCase();
            }
        }

        this.set.addAll(Arrays.asList(words));
    }

    public boolean hasWord(String word) {
        if (set.contains(word)) {
            return true;
        } else {
            return false;
        }
    }
}
