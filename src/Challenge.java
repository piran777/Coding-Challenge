public class Challenge {
    public static String firstNonRepeated(String s) {
        int[] charCount = new int[256]; // Assuming ASCII characters


        for (char c : s.toCharArray()) {  // Count the occurrences of each character in the string
            charCount[c]++; // We are counting to see how many times a letter is repeated
        }


        for (char c : s.toCharArray()) {  // Find the first non-repeated character
            if (charCount[c] == 1) { //here we check if the count is 1 and only 1
                return String.valueOf(c); //if so we return the string value of the character.
            }
        }

        return ""; // No non-repeated character found means we return an empty string
    }

    public static void main(String[] args) { //test cases.

        String result1 = firstNonRepeated("hello");
        System.out.println("First non-repeated character: " + result1);

        String result2 = firstNonRepeated("aabcc");
        System.out.println("First non-repeated character: " + result2);

        String result3 = firstNonRepeated("aabbcc");
        System.out.println("First non-repeated character: " + result3);
    }
}