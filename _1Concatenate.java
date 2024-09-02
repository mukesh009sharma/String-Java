public class _1Concatenate{
    public static void main(String[] args) {
        //Two Approaches to do concatinate
        String s1="Hello";
        String s2="World";
        //1st using the "+"
        String result= s1+" "+s2;
        System.err.println(result);
        //2nd using the concat() method
        String resulString=s1.concat(" ").concat(s2);

    }
}