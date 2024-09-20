public class _59FirstNonRepeatingCharacter {
    public static char findFirstNonRepeating(String str) {
        for (int i = 0; i < str.length(); i++) {
            boolean isNonRepeating = true;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    isNonRepeating = false;
                    break;
                }
            }
            if (isNonRepeating) {
                return str.charAt(i);
            }
        }
        return '\0'; // return null character if no non-repeating character is found
    }

    public static void main(String[] args) {
        String str = "swiss";
        char result = findFirstNonRepeating(str);
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}

