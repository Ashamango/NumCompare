import java.util.Scanner;

public class NumCompare { // class NumCompare
    public static void main(String[] args) { //main
            Scanner in = new Scanner(System.in);

            // Prompt and input
            System.out.print("Please enter your first input:  "); // output "Please enter your first input: "
            double input1 = in.nextDouble(); // input input1
            System.out.print("Please enter your second input:  "); // output "Please enter your second input: "
            double input2 = in.nextDouble(); // input input2

            // Process
            if(in.hasNextDouble())
            {
                System.out.print("These are invalid inputs. Please try again.");
                in.nextLine();
            }
            else if(input1 == input2) // else if input1 == input2 then
            {
                System.out.print(input1 + "is equal to" + input2); // output input1 + “is equal to” + input2
                in.nextLine();
            }
            else if(input1<input2) // else if input1> input2 then
            {
                System.out.print(input1 + "is less than" + input2); // output input1 + “is less than” + input2
                in.nextLine();
            }
            else //else
            {
                System.out.print(input2 + "is less than" + input1); // output input2 + “is less than” + input1
                in.nextLine();
            } // endif
        } // return
    } // end class


