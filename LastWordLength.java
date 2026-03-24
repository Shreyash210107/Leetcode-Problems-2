public class LastWordLength {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        
        int length = 0;
        int i = s.length() - 1;

        // Step 1: Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Step 2: Count last word length
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        // Output result
        System.out.println("Length of last word: " + length);
    }
}