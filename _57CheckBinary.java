 class _57CheckBinary {
    public static void main(String[] args) {
        String str = "1010";
        boolean isBinary = true;

        // Check each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != '0' && ch != '1') {
                isBinary = false;
                break;
            }
        }

        if (isBinary) {
            System.out.println(str + " is a valid binary number.");
        } else {
            System.out.println(str + " is not a valid binary number.");
        }
    }
}
