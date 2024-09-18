public class _51StringToBinary {
    public static void main(String[] args) {
        String str = "data";
        StringBuilder binary = new StringBuilder();

        for (char c : str.toCharArray()) {
            binary.append(Integer.toBinaryString(c)).append(" ");
        }

        System.out.println("Binary representation of 'data': " + binary.toString());
    }
}
