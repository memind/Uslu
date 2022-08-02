import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int a,y, s = 1;
        Scanner inp = new Scanner(System.in);

        System.out.print("Üssü alınacak sayı: ");
        a = inp.nextInt();
        System.out.print("Üs olacak sayı: ");
        y = inp.nextInt();

        System.out.println("İşlem Basamakları:");

        for (int i = 1; i <= y; i++){
            s *= a;
            System.out.println(s);
        }
        
        System.out.println("Sonuç: " + s);
    }
}