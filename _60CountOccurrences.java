class _60CountOccurrences {
    public static int countOccurrences(String str, String target) {
        int count = 0;
        int index = str.indexOf(target);
        while (index != -1) {
            count++;
            index = str.indexOf(target, index + target.length());
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "This is a test. This is only a test.";
        String target = "is";
        int count = countOccurrences(str, target);
        System.out.println("The number of occurrences of \"" + target + "\" is: " + count);
    }
}

