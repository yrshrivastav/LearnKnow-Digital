import java.util.Scanner;

public class TCSNQT1 {
    public static void main(String[] args) {
        // int vehicle = 34;
        // int wheels = 88;
        Scanner sc = new Scanner(System.in);
        System.out.println("Give no of vehicles : ");
        int vehicle = sc.nextInt();
        System.out.println("Give no of wheels : ");
        int wheels = sc.nextInt();
        if(wheels >= 2 && wheels % 2 == 0 && wheels > vehicle){
            noOfVehicles(vehicle, wheels);
        } else{
            System.out.println("INVALID INPUT");
        }
        sc.close();
    }
    public static void noOfVehicles(int vehicle, int wheels) {
        boolean found = false;
        for (int i = 1; i<=vehicle; i++){
            int tw = i;
            int fw = vehicle-i;
            if((tw * 2) + (fw * 4) == wheels){
                System.out.println("TW = "+tw+" FW = "+fw);
                found = true;
            }
        }
        if(!found){
            System.out.println("No solution found");
        }
    }
}
