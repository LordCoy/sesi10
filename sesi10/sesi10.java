import java.util.Scanner;

public class sesi10{
    public static void main(String[] args) {
        System.out.print("Input kata :");
        Scanner sc = new Scanner(System.in);
        String inputan = sc.nextLine();
        System.out.println("Kebalikan kata dari"+ inputan +" = "+sesi10.reverse(inputan));
        sesi10.isPallindrom(inputan, sesi10.reverse(inputan));
        sc.close();
    }
        
    public static void isPallindrom(String text, String textreverse) {
        String s = text;
        String r = textreverse;

        boolean Palindrom = s.equalsIgnoreCase(r);
        if (Palindrom == true){
            System.out.println("Kata"+s+" adalah palindrom");
        }else{
            System.out.println("Kata"+s+" Bukan palindrom");
        }        
    }

    public static String reverse(String text) {
        String s = text;
        Integer jml = s.length();
        String hasil = "";
        
        for (int i = jml ;i > 0 ; i--){
            hasil = hasil + s.substring(i-1,i);
        }
        return hasil;
    }
}