import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Inspired by Rosetta code.org
 * http://rosettacode.org/wiki/SHA-256
 */
public class SHA256 {
    public static void main(String[] args)
            throws UnsupportedEncodingException, NoSuchAlgorithmException {
        String hash = hash("Rosetta code");
        System.out.println(hash);
        System.out.println("764faf5c61ac315f1497f9dfa542713965b785e5cc2f707d6468d7d1124cdfcf".equals(hash));
    }

    public static String hash(final String content)
            throws UnsupportedEncodingException, NoSuchAlgorithmException {
        return hash(content, "");
    }

    public static String hash(final String content, final String salt)
            throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(salt.getBytes("UTF-8"));
        byte[] bytes = md.digest(content.getBytes("UTF-8"));
        StringBuilder sb = new StringBuilder();
        for (byte aByte : bytes) {
            sb.append(Integer.toString((aByte & 0xff) + 0x100, 16).substring(1));
        }
        return sb.toString();
    }
}
