import java.awt.geom.Rectangle2D;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Inspired by r/dailyprogrammer
 * https://www.reddit.com/r/dailyprogrammer/comments/5jpt8v/20161222_challenge_296_intermediate_intersecting/
 * All Bonuses
 */
public class IntersectionArea {
    public static void main(String[] args) throws IOException {
        for (String arg : args) {
            List<Rectangle2D> rectangles = Files.lines(Paths.get(arg))
                    .map(x -> x.replaceAll("[ ]", ""))
                    .map(IntersectionArea::getRectangle)
                    .collect(Collectors.toList());

            Rectangle2D intersection = rectangles.stream()
                    .reduce(rectangles.get(0), Rectangle2D::createIntersection);

            double intersectionArea = intersection.getWidth() * intersection.getHeight();
            System.out.println(intersectionArea > 0 ? intersectionArea : 0);
        }
    }

    public static Rectangle2D getRectangle(String input) {
        Rectangle2D rectangle = new Rectangle2D.Double();

        double[] coords = Arrays.stream(input.split("[,]"))
                .mapToDouble(Double::parseDouble).toArray();

        rectangle.setFrameFromDiagonal(coords[0], coords[1], coords[2], coords[3]);
        return rectangle;
    }
}
