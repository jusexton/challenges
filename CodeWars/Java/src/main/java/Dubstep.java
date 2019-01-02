import java.util.regex.Pattern;

public final class Dubstep {
    // public String songDecoder(String song) {
    //     ArrayList<String> result = new ArrayList<>();
    //     song = song.split("[WUB]+", 1)
    //     Matcher matcher = Pattern.compile("(?<=WUB)?.+(?=WUB+)").matcher(song);
    //     while (matcher.find()) {
    //         result.add(matcher.group());
    //     }
    //     return String.join(" ", result);
    // }

    public String songDecoder(String song) {
        return Pattern.compile("(WUB)+")
                .matcher(song)
                .replaceAll(" ")
                .trim();
    }
}
