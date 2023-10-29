import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 100) + 1; //the random num
        try {
            createFile(n); //just to make the code more organized(this creates the random numbers in the file based on n)

            Scanner myinput = new Scanner(new File("Numbers.txt"));
            int mysum = 0;
            int mycount = 0;
            while (myinput.hasNextInt()) {
                int number = myinput.nextInt();
                mysum += number;
                mycount++;
            }
            double avg = (double) mysum / mycount;//calculating the average

            myinput.close();

            System.out.printf("The average of the numbers is %.2f", avg);//what appears to the use
        } catch (Exception e) { // in case it doesn't exist
            System.out.println("There is an Error! Try again.");

        }

        }

    public static void createFile(int n){
        try {

            PrintWriter w = new PrintWriter("Numbers.txt");//creating the file
            for (int i = 0; i < n; i++) {
                int num = (int) (Math.random() * 101);
                w.println(num);//adding the numbers
            }
            w.close();
        } catch (Exception e) { // just in case
            System.out.println("Error");
        }
    }
  }

