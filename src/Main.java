// Library
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        keepGoingTest();
    }

    public static void operatorsTest() {
        /*
        Arithmetic Operators
        int x = 5
        int y = 5
        + | x + y | 10
        - | x - y | 0
        * | x * y | 25
        / | x / y | 1
        % | x % y | 0  ****
         */

        // What would print out?
        int sum1 = 10 + 5;
        int sum2 = sum1 + 5;
        double x = 100.0 / 3;
        int reminder = 20 % 3;

        System.out.println("sum1: " + sum1);
        System.out.println("sum2: " + sum2);
        System.out.println("x: " + x);
        System.out.println("Reminder of 20 is: " + reminder);
    }

    public static void variableTest() {

        String myName = "First";
        int age = 18;
        int nextYear = 1;
        boolean isFemale = false;

        // What would print out?
        System.out.println("Hi! my name is" + myName);
        System.out.println("My age is " + age + nextYear);
    }

    public static void sampleComment() {
        Scanner input = new Scanner(System.in);

        // create an integer called firstNum
        // create an integer called secondNum
        // create a variable for sum
        int firstNum, secondNum, sum;

        // ask user for firstNum
        System.out.print("Enter first number: ");
        firstNum = input.nextInt();

        // ask user for secondNum
        System.out.print("Enter second number: ");
        secondNum = input.nextInt();

        // put firstNum + secondNum in sum
        sum = firstNum + secondNum;

        // tell user "answer is" sum
        System.out.println("The answer is: " + sum);
    }

    public static void drinkingBar() {
        Scanner sc = new Scanner(System.in);

        // Create a prompt asking for user's age
        System.out.println("What is your age?: ");
        int age = sc.nextInt();
        // age > 18 you can enter then you can't enter our pub
        boolean canEnterPub = age > 18; // False

        // Check if user's can enter pub
        if(canEnterPub) {
            // age > 18
            System.out.println("Let's get drunk!");
        } else if (age == 18) {
            System.out.println("You can enter but can't drink");
        } else {
            // age < 18
            System.out.println("You can't drink yet!");
        }
    }

    public static void meowThreeTimes() {

        int num = 0;
        while(num < 3){
            System.out.println("Meow");
            num++;
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Meow");
        }

    }

    public static void keepGoingTest(){
        // create new Scanner (input) object
        Scanner sc = new Scanner(System.in);

        // Create correct answer variable
        String correct = "LCS";
        boolean keepGoing = true;
        // Create Sentry
        int tries = 0;

        while(keepGoing){
            // Create a user prompt for input
            tries++;
            System.out.println("You have try: " + tries + " times");
            System.out.println("What is the password?");
            // guess = user's input
            String guess = sc.nextLine();

            // Create a control structure

            //if guess = password print...
        if(guess.equals(correct)){
                System.out.println("Correct!");
                keepGoing = false;
                // If tries >= 3 End
            } else if (tries >= 3) {
                System.out.println("Launching Nuke");
                keepGoing = false;
            }
        }
    }
    public static void forLoopTest() {

        for (int i = 0; i < 10; i++) {
            System.out.println("This is number of " + i);
        }

        System.out.println();

        for (int i = 10; i > 0; i--) {
            System.out.println("This is number of " + i);
        }

        System.out.println();

        for (int i = 0; i < 10; i+=2) {
            System.out.println("This is number of " + i);
        }
    }

    public static void scannerTest() {
        Scanner input = new Scanner(System.in);
        // String input
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        // int input
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        // double input
        System.out.println("Enter your weight: ");
        double weight = input.nextDouble();
        // boolean input
        System.out.println("Are you Married?");
        boolean isMarried = input.nextBoolean();

        System.out.println("Hi! " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Married: " + isMarried);
    }
}