import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * Inspired by roseattacode.org
 * http://rosettacode.org/wiki/Abundant,_deficient_and_perfect_number_classifications
 */
public class NumberClassifications {
    public enum Classification {
        ABUNDANT,
        PERFECT,
        DEFICIENT
    }

    public static void main(String[] args) {
        Map<Classification, List<ClassifiedNumber>> classifications =
                IntStream.range(1, 20000)
                        .boxed()
                        .map(ClassifiedNumber::new)
                        .collect(Collectors.groupingBy(ClassifiedNumber::getClassification));

        System.out.printf("Abundant: %d%nDeficient: %d%nPerfect: %d%n",
                classifications.get(Classification.ABUNDANT).size(),
                classifications.get(Classification.DEFICIENT).size(),
                classifications.get(Classification.PERFECT).size());
    }

    public static class ClassifiedNumber {
        private Classification classification;
        private long number;

        public ClassifiedNumber(final long number) {
            setNumber(number);
        }

        public Classification classify(final long num) {
            long total = LongStream.rangeClosed(1, num / 2)
                    .filter(i -> num % i == 0)
                    .sum();

            if (total > num) {
                return Classification.ABUNDANT;
            } else if (total < num) {
                return Classification.DEFICIENT;
            } else {
                return Classification.PERFECT;
            }
        }

        public Classification getClassification() {
            return classification;
        }

        public long getNumber() {
            return number;
        }

        public void setNumber(long number) {
            this.number = number;
            classification = classify(number);
        }
    }
}
