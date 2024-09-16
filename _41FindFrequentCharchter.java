 class FrequentCharacterNoHashMap {
    public static void main(String[] args) {
        String str = "test";
        char mostFrequent = ' ';
        int maxCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            int count = 0;

            // Count occurrences of the current character
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == currentChar) {
                    count++;
                }
            }

            // Updatemost frequent character  the count is higher
            if (count > maxCount) {
                mostFrequent = currentChar;
                maxCount = count;
            }
        }

        System.out.println("Most frequent character: " + mostFrequent);
    }
}

