import java.util.Scanner;

public class Bakici extends Users{
    Animals animals=new Animals();



    public static  void hayvanCogalt(){

        Scanner scanner=new Scanner(System.in);
        System.out.println("hangi hayvanı çoğaltmak istersiniz");
        Animals.Hayvanlar(scanner.nextLine());
        scanner.nextLine();
        System.out.println();

    }
}
