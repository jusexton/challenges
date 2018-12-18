import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Comment Stripping Tests")
public class CommentStrippingTests {
    @DisplayName("Should strip out comments and return new text without the stripped comments")
    @Test
    public void testCommentStripping() {
        assertEquals(
                "apples, pears\ngrapes\nbananas",
                CommentStripping.stripComments("apples, pears # and bananas\ngrapes\nbananas !apples", new String[]{"#", "!"}));

        assertEquals(
                "a\nc\nd",
                CommentStripping.stripComments("a #b\nc\nd $e f g", new String[]{"#", "$"}));
    }
}
