 class SecondLargestCharacter {
    public static void main(String[] args) {
        String str = "programming";
        char largest = '\0';
        char secondLargest = '\0';

        // Iterate through the characters in the string
        for (char c : str.toCharArray()) {
            if (c > largest) {
                secondLargest = largest;  // Update second largest before changing largest
                largest = c;
            } else if (c > secondLargest && c != largest) {
                secondLargest = c;
            }
        }

        if (secondLargest != '\0') {
            System.out.println("Second largest character: " + secondLargest);
        } else {
            System.out.println("No second largest character found.");
        }
    }
}
