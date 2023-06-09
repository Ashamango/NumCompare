import java.util.Scanner;

class NumCompare { // class NumCompare
    public static void main(String[] args) { //main
        Scanner in = new Scanner(System.in);
        // Declare variables
        double input1 = 0; // num input1 = 0
        double input2 = 0; // num input2 = 0
        // Prompt and input

        System.out.print("Please enter your first input:  "); // output "Please enter your first input: "
        if (in.hasNextDouble()) {
            {
                input1 = in.nextDouble(); // input input1
                System.out.print("Please enter your second input:  "); // output "Please enter your second input: "
                if (in.hasNextDouble()) {
                    {
                        {
                            input2 = in.nextDouble(); // input input2
                        }
                        // Process
                        if (input1 == input2) { // if input1 == input2 then
                            System.out.print(input1 + " is equal to " + input2); // output input1 + “is equal to” + input2
                        } else if (input1 < input2) { // else if input1> input2 then
                            System.out.print(input1 + " is less than " + input2); // output input1 + “is less than” + input2
                        } else {
                            System.out.print(input2 + " is less than " + input1); // output input1 + “is less than” + input2
                        }
                    }
                } // second end if
                else{
                    System.out.print("One or more of the inputs are invalid. Please input a number"); // output "One or more of the inputs are invalid. Please input a number."
                } // end else
            }
        } // first end if
        else {
            System.out.print("One or more of the inputs are invalid. Please input a number");// output "One or more of the inputs are invalid. Please input a number."
        } // end else
    } // return
} // end class

