import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("HESAP MAKİNESİ PROGRAMI");
        System.out.println("-----------------------");

        System.out.print("1.sayıyı giriniz : ");
        int sayi1=sc.nextInt();

        System.out.print("2.sayıyı giriniz : ");
        int sayi2=sc.nextInt();

        System.out.println("Toplama : 1" +
                "\nÇıkarma : 2" +
                "\nÇarpma : 3" +
                "\nBölme : 4");
        System.out.print("Seçiminiz :");
        int secim=sc.nextInt();
        switch (secim){
            case 1:
                System.out.println("Toplam :"+(sayi1+sayi2));
                break;
            case 2:
                System.out.println("Çıkarma : "+(sayi1-sayi2));
                break;
            case 3:
                System.out.println("Çarpma :"+(sayi1*sayi2));
                break;
            case 4:
                System.out.println("Bölme : "+(sayi1/sayi2));
                break;
            default:
                System.out.println("Hatalı seçim yaptınız");
        }


    }
}
