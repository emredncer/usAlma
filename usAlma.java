import java.util.Scanner;

public class usAlma {
    public static void main(String[] args) {
        int num1, num2;
        System.out.print("Üssü alınacak sayıyı giriniz: ");
        Scanner scan = new Scanner(System.in);
        num1 = scan.nextInt();
        System.out.print("Üs olacak sayıyı giriniz: ");
        num2= scan.nextInt();
        int total = 1;
        for (int i = 1; i<=num2 ; i++){
            total *= num1;
        }
        System.out.print("Cevap: "+total);
    }
}
