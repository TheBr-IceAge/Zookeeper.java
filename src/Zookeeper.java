import java.io.File;
import java.util.Scanner;
import java.util.Random;
import java.time.LocalTime;

public class Zookeeper {
    public static void main(String[] args) {
        System.out.println("What camera do you want to see: ");
        System.out.println("1. Camel/n2.Hippo/n3.Peter/n4.Lynx");
        int cameraChoice = input.nextInt();
        if(cameraChoice == 1){
            printCamel();
        }
        else if(cameraChoice == 2){
            ;
        }
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        LocalTime time = LocalTime.now();

        String animalType = "Camel";
        double habitatTemp = 50.0+(100.0-50.0)* random.nextDouble();

        System.out.println("Animal type: " + animalType);
        System.out.println("Current time: " + time);
        System.out.printf("Habitat temperature: %.2f%n ", habitatTemp);

        String camel = """
            Look at our camel
            
             ___.-''''-.
            /___  @    |
            ',,,,.     |         _.'''''''._
                 '     |        /           \\
                 |     \\    _.-'             \\
                 |      '.-'                  '-.
                 |                               ',
                 |                                '',
                  ',,-,                           ':;
                       ',,| ;,,                 ,' ;;
                          ! ; !'',,,',',,,,'!  ;   ;:
                         : ;  ! !       ! ! ;  ;   :;
                         ; ;   ! !      ! !  ; ;   ;,
                        ; ;    ! !     ! !   ; ;     
                        ; ;    ! !    ! !     ; ;
                       ;,,      !,!   !,!     ;,;
                       /_I      L_I   L_I     /_I
        
                """;
        System.out.println(camel);

        File file = new File("Zookeeper/animals/hippo.txt");
        try{
            Scanner fr = new Scanner(file);
            while(fr.hasNextLine()){
                String i = fr.nextLine();
                System.out.println(i);
            }
        } catch (Exception e){
            System.out.println("No file");
        }
        File file2 = new File("Zookeeper/animals/peter.txt");
        try{
            Scanner fr = new Scanner(file2);
            while(fr.hasNextLine()){
                String i = fr.nextLine();
                System.out.println(i);
            }
        } catch (Exception e){
            System.out.println("No file");
        }
        File file3 = new File("Zookeeper/animals/lynx.txt");
        try{
            Scanner fr = new Scanner(file3);
            while(fr.hasNextLine()){
                String i = fr.nextLine();
                System.out.println(i);
            }
        } catch (Exception e){
            System.out.println("No file");
        }
    }
}
