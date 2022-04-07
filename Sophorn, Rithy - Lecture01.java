class Lecture01 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 01");

        //Name: Rithy Sophorn
        
        // SELF-CHECK PROBLEMS:
        // Note: you may need to put some of your answers inside comments

        // Put your answer for #1 here:
        //
        // Copy and paste the output from when you first cloned (downloaded) and ran
        // this program
        // (in other words, when you run this program, what does it print?
        // Copy that output into this file, right here, in a comment

        // It prints out "Hello from lecture 01".

        // Where in the textbook are the main topics for this question covered?

        // Put your answer for #2 here:
        // Where in the textbook are the main topics for this question covered?

        /*
        class Main {
            public static void main(String[] args) {
                for (int i = 1; i <= 100; i++) {
                System.out.println(i);
                }
            }
        }
        */

        //I used the for loop instead of a while loop because for loop will loop for a certain amount of time (definite loop) instead of indefinitely. In this case, 100 times.

        // Put your answer for #3 here:
        // Where in the textbook are the main topics for this question covered?

        /*
        class Main {
            public static void main(String[] args) {
                int row = 5;
                for (int i=0; i<row; i++){
                    for (int j =0; j<=i;j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }
        */

        // Put your answer for #4 here:
        // Where in the textbook are the main topics for this question covered?

        /*
        import java.util.*;
        public class Main {
            public static void main (String []args) {
                Scanner input = new Scanner (System.in);
                System.out.print("How many rows would you like to print? ");
                int row = input.nextInt();
                input.close();
                for (int i = 0; i<row; i++){
                    for (int j = 0; j<=i; j++){
                        System.out.print(j);
                    }
                    System.out.println();
                }
            }
        }
        */

        // Put your answer for #5 here:
        // Where in the textbook are the main topics for this question covered?

        /*
        import java.util.*;
        public class Main {
            public static void main (String [] args) {
                Scanner input = new Scanner (System.in);
                System.out.print("How many grades would you like to store? ");
                int grade = input.nextInt();

                double [] array = new double[grade];
                double total = 0;

                for (int i=0; i<array.length; i++){
                    System.out.print("Next grade? ");
                    array[i] = input.nextDouble();
                    total = total + array[i];
                }
                input.close();
                double avg = total / array.length; 
                System.out.println("The average of your grade is " + avg);
            }
        }
        */

        // Put your answer for #6 here:
        // Where in the textbook are the main topics for this question covered?

        /*
        public class food {
            public static void main (String [] args) {
                carrot();
                apple();
                banana();
            }
            public static void carrot() {
                String food = "carrot";
                int calories = 7;
                double rating = 5.0;
                System.out.println(food + " that has " + calories + " calories and a rating of " + rating);
            }
            public static void apple() {
                String food = "apple";
                int calories = 15;
                double rating = 4.5;
                System.out.println(food + " that has " + calories + " calories and a rating of " + rating);
            }
            public static void banana() {
                String food = "banana";
                int calories = 20;
                double rating = 4.0;
                System.out.println(food + " that has " + calories + " calories and a rating of " + rating);
            }
        }
        */

    }
}
