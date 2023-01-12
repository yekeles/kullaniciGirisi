import java.util.Scanner;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        String userName, password ;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanıcı Adını Giriniz : ");
        userName = inp.nextLine();
        System.out.print("Kullanıcı Şifresini Giriniz : ");
        password = inp.nextLine();
        if((userName.equals("artemis")) && (password.equals("123456"))) {
            System.out.println("Kullanıcı Adı ve Şifre Doğru; Giriş Yapabildiniz!... ");
        } else {
            System.out.println("Kullanıcı Adı veya Şifre Yanlış, Şifrenizi Yenielemk İsterminiz...");


            Scanner sifre = new Scanner(System.in);
            System.out.print("Şifre Oluşturmak İsterseniz \"1\" İstemezseniz \"2\" Yazınız : ");
            int number = sifre.nextInt();
            switch (number) {
                case 1 :
                    String passwordNew;
                    Scanner newInp = new Scanner(System.in);
                    System.out.print("Yeni Şifrenizi Belirleyiniz : ");
                    passwordNew = newInp.nextLine();
                    if (passwordNew.equals("123456")) {
                        System.out.println("Şifreniz Bir Önceki Şifrenizle Aynı Olamaz Farklı Bir Şifre Deneyiniz!... ");
                    } else {
                        System.out.println("Şifreniz Oluşturuldu !...");
                    }
                case 2 :
                    System.out.println("İyi Günler Dileriz !...");


            }

        }
    }
}