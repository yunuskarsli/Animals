import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animals animals =new Animals();
        Users users=new Users();

        Scanner scanner =new Scanner(System.in);
        System.out.println("Arven Hayvanat Bahçesine Hoşgeldiniz");
        System.out.println("giriş için kullanıcı belirleyiniz "
                            +"ziyaretçi Girişi için 1 e tıklayınız"
                            +"Bakıcı girişi için 2 ye tıklayınız");

        int giris=scanner.nextInt();

        if (giris==1){
            System.out.println("ziyaretçi girişi yapıldı");
            System.out.println("Hangi hayvanat bahçesine giriş yapmak istiyorsunuz");
             if(scanner.nextInt()==1){
                System.out.println("deniz canlılarına girdiniz");
                 System.out.println("ne yapmak istiyorsunuz örnek: yem vermek");


            }else if(scanner.nextInt()==2) {
                System.out.println("kutup canlılarına girdiniz");
                 System.out.println("yem vermek için onaylayınız");


            }else if(scanner.nextInt()==3) {
                System.out.println("çöl canlılarına girdiniz");
                 System.out.println("ne yapmak istiyorsunuz örnek: yem vermek");
            }
            System.out.println("ziyaretçi için açıldı");
            System.out.println("ne yapmak istiyorsunuz örnek: yem vermek");
            Ziyaretçi.yemVer(4);



        }else if(giris==2){
            System.out.println("bakımcı girişi yapıldı");
            System.out.println("Hangi hayvanat bahçesine giriş yapmak istiyorsunuz");
            System.out.println("deniz canlıları,kutup hayvanları,col hayvanları");
            scanner.nextLine();
            String secim =scanner.nextLine();
            System.out.println("bakımcı için açıldı");
            System.out.println("ne yapmak istiyorsunuz örnek: hayvan çoğaltmak");
            secim=scanner.nextLine();
            System.out.println("hangi hayvanı çoğaltacaksınız");
            Animals.Hayvanlar(scanner.nextLine());

            Animals.Hayvanlar(scanner.nextLine());
            System.out.println("kaç tane çoğaltalım");

            System.out.println("c");



        }
    }
}