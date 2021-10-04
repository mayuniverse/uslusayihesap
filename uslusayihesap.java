import java.util.Scanner;

public class uslusayihesap {
    public static void main(String[] args) {
        // import sınıfını tanımla
        Scanner inp = new Scanner(System.in);

        //değişkenleri tanımla
        int altsayi,ustsayi,total = 1;

        //kullanıcıdan input al
        System.out.println("Sayı giriniz");
        altsayi = inp.nextInt();
        System.out.println("Üssünü giriniz");
        ustsayi = inp.nextInt();

        // hesaplamaları yapalım
        for(int i=1; i<=ustsayi; i++){
            total *= altsayi;
        }
        System.out.println(total);
    }
    
}
