class RemoveLastCharacter {
    public static void main(String[] args) {
        String str = "remove";
        String result = str.substring(0, str.length() - 1);
        System.out.println("After removing last character: " + result);
    }
}
