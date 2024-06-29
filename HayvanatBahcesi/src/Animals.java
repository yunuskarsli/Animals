import java.util.Scanner;

public class Animals {

    public static void Hayvanlar(String s){
        DenizCanliları denizCanliları=new DenizCanliları();
        ColHayvanlari colHayvanlari= new ColHayvanlari();
        KutupHayvanlari kutupHayvanlari=new KutupHayvanlari();
    }  public static void HayvanSayilari(){

    }public static void secimYap(){
        Scanner scanner =new Scanner(System.in);
        if (scanner.nextInt()==1){
            DenizCanliları.Hayvanlar(scanner.nextLine());
        }else if(scanner.nextInt()==2){
            ColHayvanlari.Hayvanlar(scanner.nextLine());
        }else if (scanner.nextInt()==3){
            KutupHayvanlari.Hayvanlar(scanner.nextLine());
        }
    }

}
