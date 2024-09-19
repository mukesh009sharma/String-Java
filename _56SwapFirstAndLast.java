public class _56SwapFirstAndLast {
    public static void main(String[] args) {
        String str = "hello";
        if (str.length() > 1) {
            String result = str.charAt(str.length() - 1) 
                            + str.substring(1, str.length() - 1) 
                            + str.charAt(0);
            System.out.println("After swapping first and last characters: " + result);
        } else {
            System.out.println("String is too short to swap characters.");
        }
    }
}
