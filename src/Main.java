import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner valami=new Scanner(System.in);
       float sum=0;
        for (int i=0;i<5;i++){
            System.out.println("Addj meg egy számot!");
            int szam=valami.nextInt();
            sum+=szam;
        }
        System.out.println((float)sum/5);
    }
}