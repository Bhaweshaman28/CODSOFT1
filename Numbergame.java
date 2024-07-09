import java.util.Scanner;
public class Numbergame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //TASK_1 NUMBER GAME
        int generatedNumber = (int)(Math.random()*100);
        System.out.println("\t\tNUMBER GAME");
        System.out.println("Enter A Guess Number[2-Digit] : ");
        int userNumber = sc.nextInt();
        int rounds = 1;
        while(userNumber!=generatedNumber){
            if(userNumber>generatedNumber){
                System.out.println("\t----Too High----");
                System.out.println("Try Again{Input a Number} : ");
                userNumber = sc.nextInt();
                rounds +=1;
                if(rounds>=4){
                    System.out.println("Maximum Attempts reached ");
                    break;
                }
            }
            else if(userNumber<generatedNumber) {
                System.out.println("----Too Low----");
                System.out.println("Try Again{Input a Number} : ");
                userNumber = sc.nextInt();
                rounds +=1;
                if(rounds>=4){
                    System.out.println("Maximum Attempts reached ");
                    break;
                }
            }
        }
        if(userNumber==generatedNumber) {
            System.out.println("You Won after " + rounds + " rounds");
        }
        else {
            System.out.println("--You Lost--");
        }
    }
}