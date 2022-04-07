import java.util.Scanner;
public class calc{
    public static void main(String[] args) {
        double sayi1,sayi2;
        int secim;
        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci sayiyi giriniz:");
        sayi1=scan.nextDouble();
        System.out.println("Ikinci sayiyi giriniz:");
        sayi2=scan.nextDouble();
        System.out.println("Islem seciniz:\n1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        secim=scan.nextInt();
        if(secim==1)
        System.out.println("Sonuc:"+(sayi1+sayi2));
        else if(secim==2)
        System.out.println("Sonuc:"+(sayi1-sayi2));
        else if(secim==3)
        System.out.println("Sonuc:"+(sayi1*sayi2));
        else if(secim==4)
        System.out.println("Sonuc:"+(sayi1/sayi2));
        else
        System.out.println("HATA");

    }
}