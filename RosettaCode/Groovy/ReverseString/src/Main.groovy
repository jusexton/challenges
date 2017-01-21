/**
 * Inspired By rosettacode.org
 * http://rosettacode.org/wiki/Reverse_a_string
 */
class Main {
    static void main(String[] args) {
        println(reverseString("Hello"))
    }

//    static String reverseString(final String s){
//        return new StringBuilder(s).reverse().toString()
//    }

    static String reverseString(final String s) {
        StringBuilder sb = new StringBuilder()
        for(int i = s.length() - 1; i >= 0; i--){
            sb.append(s.charAt(i))
        }
        return sb.toString()
    }
}
