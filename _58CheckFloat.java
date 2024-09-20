 class _58CheckFloat {
    public static boolean isValidFloat(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        String str = "3.14";
        if (isValidFloat(str)) {
            System.out.println(str + " is a valid floating-point number.");
        } else {
            System.out.println(str + " is not a valid floating-point number.");
        }
    }
}
