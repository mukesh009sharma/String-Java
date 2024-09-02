public class _2FindLength {
    public static void main(String[] args) {
        String s1="Anime";
        //Finding the length of the String using method
        int length=s1.length();
        System.out.println("The length of the String is : "+length);
        int s1length=0;
        //counting characters using a loop
        String s2="Otakuu";
        int s2length=0;
        for(char c:s2.toCharArray()){
            s2length++;
        }
        System.out.println("the length of the String is : "+s2length);
    }
}
