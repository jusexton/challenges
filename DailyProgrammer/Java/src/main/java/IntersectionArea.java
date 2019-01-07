import java.awt.geom.Rectangle2D;
import java.util.Arrays;

/**
 * Inspired by r/dailyprogrammer
 * https://www.reddit.com/r/dailyprogrammer/comments/5jpt8v/20161222_challenge_296_intermediate_intersecting/
 * All Bonuses
 */
public class IntersectionArea {
    public static double getIntersection(Rectangle2D[] rectangles) {
        if (rectangles.length < 2) {
            return 0.0;
        }

        Rectangle2D intersection = Arrays.stream(rectangles)
                .reduce(rectangles[0], Rectangle2D::createIntersection);

        return intersection.getWidth() * intersection.getHeight();
    }

    public static double getIntersection(String... rectanglePositions) {
        Rectangle2D[] rectangles = parseRectangles(rectanglePositions);
        return getIntersection(rectangles);
    }

    private static Rectangle2D[] parseRectangles(String... rectangleStrings) {
        return Arrays.stream(rectangleStrings)
                .map(IntersectionArea::parseRectangle)
                .toArray(Rectangle2D[]::new);
    }

    private static Rectangle2D parseRectangle(final String input) {
        Rectangle2D rectangle = new Rectangle2D.Double();

        double[] coords = Arrays.stream(input.trim().split("[, ]"))
                .mapToDouble(Double::parseDouble)
                .toArray();

        rectangle.setFrameFromDiagonal(coords[0], coords[1], coords[2], coords[3]);
        return rectangle;
    }
}
