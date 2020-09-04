//import
import java.util.Scanner;

public class DeciBinCalc {

    public static void main (final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        int decimalinput;
        int deci;
        int rest;
        System.out.println("//////////////////////////////////////////////////");
        System.out.println("// DeciBinCalc by Julian-Horn.net (BETA v0.1.3) //");
        System.out.println("//         Mailto: Info@Julian-Horn.net         //");
        System.out.println("//////////////////////////////////////////////////");
        System.out.println("//      NOTE: the output is upside down!        //");
        System.out.println("//     That means if you have 1101 as output    //");
        System.out.println("//            it means actually 1011            //");
        System.out.println("//////////////////////////////////////////////////");
        System.out.println("  ");
        System.out.println("Type in your number to convert (0 for exit): ");
        decimalinput = scanner.nextInt();
        deci = decimalinput;

        //calc modolo
    
        while (deci > 0){
            
            System.out.print("Convertet to binary: ");
            while (deci > 0) {
                
                rest = deci % 2;
                System.out.print(rest);
                deci = deci - rest;
                deci = deci / 2;
            }    
            System.out.println("  ");
            System.out.println("Type a new number to convert (0 for exit): ");
            decimalinput = scanner.nextInt();
            deci = decimalinput;
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("//////////////////////////////////////////////////");
            System.out.println("// DeciBinCalc by Julian-Horn.net (BETA v0.1.2) //");
            System.out.println("//         Mailto: Info@Julian-Horn.net         //");
            System.out.println("//////////////////////////////////////////////////");
            System.out.println("//      NOTE: the output is upside down!        //");
            System.out.println("//     That means if you have 1101 as output    //");
            System.out.println("//            it means actually 1011            //");
            System.out.println("//////////////////////////////////////////////////");
            System.out.println("  ");
            System.out.println("Type in your number to convert (0 for exit): ");
            System.out.println(decimalinput);
        

    }

    System.out.println("Exit");


    
    }
    
}

/** Versions:
 * BETA v 0.0.1 Calculating one time deci to bin                                 (File: "N/A")
 * BETA v 0.0.2 Design and comments                                              (File: "N/A")
 * BETA v 0.0.3 Output the input number                                          (File: "N/A")
 * BETA v 0.0.4 Dont output overflowed zeros (0)                                 (File: "N/A")
 * BETA v 0.1.0 Loop Calculation inclufing input                                 (File: "N/A")
 * BETA v 0.1.1 Loop Calculation including an exit while typing a zero "0"       (File: "N/A")
 * BETA v 0.1.2 Creating a description                                           (File: "https://github.com/Comet1903/DeziBinCalc")
*/


