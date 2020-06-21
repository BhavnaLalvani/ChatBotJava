package myfirstproject;
import java.util.Scanner;
/**
 *
 * @author Bhavna Lalvani
 */
public class ChatBot {

    final static Scanner scanner = new Scanner(System.in); 

    public static void main(String[] args) {
        greet("Bhavna", "1990"); 
        remindName();
        guessAge();
        count();
        tictactoe();
        test();
        loopQuestion();
        end();
        
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("\nLet me guess your age.");
        System.out.println("Please tell me the remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("\nNow I will prove to you that I can count to any number you want.Please enter a number:");
        int num = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        System.out.println("\nLet's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times."+"\n"+
            "2. To decompose a program into several small subroutines."+"\n"+
            "3. To determine the execution time of a program."+"\n"+
            "4. To interrupt the execution of a program.");
        int quizResponse = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over
        boolean answer=false;
        while(!answer){
        if (quizResponse==2){
                answer=true;
                System.out.println("That is the correct answer!!");
        }
        else{
                 System.out.println("Please, try again.");
                 quizResponse = scanner.nextInt();
                 scanner.nextLine(); 
        }
        }
    }
    
    static void tictactoe() {
            System.out.println("\nI can also draw a tic-tac-toe for you!!Would you like me to? Yes/No :");
            String draw = scanner.nextLine();
            //System.out.println("What a great choice you have, " + draw+ "!");
            
            if ("Y".equals(draw.toUpperCase()) | "YES".equals(draw.toUpperCase())) {
                System.out.println("O X X");
                System.out.println("O X O");
                System.out.println("X O X");
            }
            else{
                System.out.println("Okay no problem!");
            }
    }
    
    static void loopQuestion(){
        System.out.println("\nLet's further test your programming knowledge.");
        System.out.println("What is the output of the below code?");
        System.out.println("\n"+
                "int i = 0; "+"\n"+
                "for (int k = 0; k < 100; k++) { "+"\n"+
                "i = i++; "+"\n"+
                "} "+"\n"+
                "System.out.println(i);"+"\n"+
                "\n"
        );
        int loopAnswer= scanner.nextInt();
        boolean answer=false;
        
        while(!answer){
        if (loopAnswer==0){
                answer=true;
                System.out.println("That is the correct answer!!");
        }
        else{
                 System.out.println("Sorry, that is incorrect. Please, try again.");
                 loopAnswer = scanner.nextInt();
                 scanner.nextLine(); 
        }
     }
        
    }
    static void end() {
        System.out.println("\nThat is all I have for now..");
        System.out.println("Have a nice day!"); 
    }
}
