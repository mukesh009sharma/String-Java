class LongestWord {
    public static void main(String[] args) {
        String sentence = "Python is easy to learn";
        String[] words = sentence.split(" ");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("Longest word: " + longestWord);
    }
}
