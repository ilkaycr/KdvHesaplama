package TemelKavramlar;
import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {

        double kdvsiz,kdvli;


        //Scanner sınıfımızı tanımladık
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan para değeri alalım
        System.out.print("Lütfen ürünün fiyatını giriniz : ");
        kdvsiz = input.nextDouble();
        System.out.println("KDV siz fiyat : " + kdvsiz );


        double kdv = (kdvsiz <= 999 ) ? (kdv = 0.18) : (kdv = 0.08);


        //Kdv li fiyatını hesaplayalım
        kdvli = (kdvsiz*kdv)+kdvsiz;
        System.out.println("KDV li fiyatı = "+ kdvli);


        //kdv sini hesaplayalım
        System.out.println("KDV Tutarı = " + (kdvsiz*kdv));

    }
}
