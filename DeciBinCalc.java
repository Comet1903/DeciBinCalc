//import
import java.util.Scanner;

public class DeciBinCalc {

    public static void main (final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        int dezimalinput;
        int dezi;
        int rest;
        System.out.println("////////////////////////////////////////////////");
        System.out.println("// DezBinCalc by Julian-Horn.net (BETA v0.1.2 //");
        System.out.println("//        Mailto: Info@Julian-Horn.net        //");
        System.out.println("////////////////////////////////////////////////");
        System.out.println("//      Note the output is upside down!       //");
        System.out.println("//    That means if you have 1101 as output   //");
        System.out.println("//           it means actually 1011           //");
        System.out.println("////////////////////////////////////////////////");
        System.out.println("  ");
        System.out.println("Type in your number to convert (0 for exit): ");
        dezimalinput = scanner.nextInt();
        dezi = dezimalinput;

        //calc modolo
    
        while (dezi > 0){
            
            System.out.print("Convertet to binary: ");
            while (dezi > 0) {
                
                rest = dezi % 2;
                System.out.print(rest);
                dezi = dezi - rest;
                dezi = dezi / 2;
            }    
            System.out.println("  ");
            System.out.println("Type a new number to convert (0 for exit): ");
            dezimalinput = scanner.nextInt();
            dezi = dezimalinput;
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("////////////////////////////////////////////////");
            System.out.println("// DezBinCalc by Julian-Horn.net (BETA v0.1.2 //");
            System.out.println("//        Mailto: Info@Julian-Horn.net        //");
            System.out.println("////////////////////////////////////////////////");
            System.out.println("//      Note the output is upside down!       //");
            System.out.println("//    That means if you have 1101 as output   //");
            System.out.println("//           it means actually 1011           //");
            System.out.println("////////////////////////////////////////////////");
            System.out.println("  ");
            System.out.println("Type in your number to convert (0 for exit): ");
            System.out.println(dezimalinput);
        

    }

    System.out.println("Exit");


    
    }
    
}