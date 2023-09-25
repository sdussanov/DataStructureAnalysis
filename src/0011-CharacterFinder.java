import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class CharacterFinder {
    private String input;

    public CharacterFinder(String input) {
        this.input = input.toLowerCase();
    }

    public Character findFirstNonRepeatedChar() {
        Map<Character, Integer> map = new HashMap<>();
        var chars = input.toCharArray();

        for (char ch : chars) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : chars) {
            if (map.get(ch) == 1)
                return ch;
        }

        return Character.MIN_VALUE;
    }

    public Character findFirstRepeatedChar() {
        Set<Character> set = new HashSet<>();

        for (char ch : input.toCharArray()) {
            if (set.contains(ch))
                return ch;

            set.add(ch);
        }

        return Character.MIN_VALUE;
    }
}
