import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public final class IntersectionAreaTests {
    @Test
    public void testGetIntersectionFunction() {
        assertEquals(1.0, IntersectionArea.getIntersection("0,0 2,2", "1,1 3,3"));
        assertEquals(8.75, IntersectionArea.getIntersection("-3.5,4 1,1", "1,3.5 -2.5,-1"));
        assertEquals(0.0, IntersectionArea.getIntersection("-3.5,4 1,1"));
        //assertEquals(0.0, IntersectionArea.getIntersection("-4,4 -0.5,2", "0.5,1 3.5,3"));
        // assertEquals(2.4, IntersectionArea.getIntersection("-3,0 1.8,4", "1,1 -2.5,3.6", "-4.1,5.75 0.5,2", "-1.0,4.6 -2.9,-0.8"));
    }
}
