import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public final class ValidBraces {
    private final static Map<Character, Character> braceMapper;

    static {
        braceMapper = new HashMap<>();
        braceMapper.put(')', '(');
        braceMapper.put('}', '{');
        braceMapper.put(']', '[');
    }

    public static boolean isValid(String braces) {
        Stack<Character> stack = new Stack<>();

        for (char character : braces.toCharArray()) {
            if (character == '(' || character == '{' || character == '[') {
                stack.push(character);
            } else if (character == ')' || character == '}' || character == ']') {
                if (stack.isEmpty()) {
                    return false;
                }

                final char popped = stack.pop();
                final char openingEquivalent = braceMapper.getOrDefault(character, '0');
                if (openingEquivalent != popped) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
