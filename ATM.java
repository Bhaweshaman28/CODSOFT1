import java.util.Scanner;
public class ATM {
    static void menu() {
        System.out.println(":::::Welcome To SBI:::::");
        System.out.println("1.Deposit");
        System.out.println("2.Withdraw");
        System.out.println("3.Check Your Balance");
        System.out.println("4.Exit");
    }

    public static void main(String[] args) {
        //TASK 3 ATM_MACHINE
        Scanner sc = new Scanner(System.in);
        Acc a1 = new Acc("Badal", 101, 40000, 7001);
        System.out.println("Please Validate Yourself");
        System.out.println("Enter Account Number : ");
        int accno = sc.nextInt();
        System.out.println("Enter PIN: ");
        int inputPin = sc.nextInt();
        if(a1.authUser(accno,inputPin)) {
            menu();
            System.out.println("Enter Your Choice: ");
            int ch = sc.nextInt();
            float amount;
            while (ch != 4) {
                switch (ch) {
                    case 1:
                        System.out.println("Enter Amount To Deposit: ");
                        amount = sc.nextFloat();
                        a1.deposit(amount);
                        menu();
                        System.out.println("Enter Your Choice: ");
                        ch = sc.nextInt();
                        break;
                    case 2:
                        System.out.println("Enter Amount To Withdraw: ");
                        amount = sc.nextFloat();
                        a1.withdraw(amount);
                        menu();
                        System.out.println("Enter Your Choice: ");
                        ch = sc.nextInt();
                        break;
                    case 3:
                        System.out.print("Your Account Balance Is: ");
                        float bal = a1.showBalance();
                        System.out.println(bal);
                        menu();
                        System.out.println("Enter Your Choice: ");
                        ch = sc.nextInt();
                        break;
                    default:
                        System.out.println("Wrong Choice");
                        menu();
                        System.out.println("Enter Your Choice: ");
                        ch = sc.nextInt();
                        break;
                }
            }
        }
        else{
                System.out.println("User Credentials Not Matched");
        }
    }
}
class Acc{
    String name;
    int accno;
    float amount;
    int pin;
    Acc(String name,int accno,float amount,int pin){
        this.name = name;
        this.accno = accno;
        this.amount = amount;
        this.pin = pin;
    }
    boolean authUser(int accno,int pin){
        return((accno==this.accno)&&(pin==this.pin));
    }
    void deposit(float amount){
        if(amount>0){
            this.amount += amount;
            System.out.println(amount+" Deposited Successfully Into Your Account");
        }
        else{
            System.out.println("Please Enter A Valid Amount");
        }
    }
    void withdraw(float amount){
        if(amount>0&&amount<=this.amount){
            this.amount -= amount;
            System.out.println(amount+" Debited From Your Account");
        }
        else{
            System.out.println("Insufficient Funds");
        }
    }
    float showBalance(){
        return this.amount;
    }
}import java.util.Scanner;
public class ATM {
    static void menu() {
        System.out.println(":::::Welcome To SBI:::::");
        System.out.println("1.Deposit");
        System.out.println("2.Withdraw");
        System.out.println("3.Check Your Balance");
        System.out.println("4.Exit");
    }

    public static void main(String[] args) {
        //TASK 3 ATM_MACHINE
        Scanner sc = new Scanner(System.in);
        Acc a1 = new Acc("Badal", 101, 40000, 7001);
        System.out.println("Please Validate Yourself");
        System.out.println("Enter Account Number : ");
        int accno = sc.nextInt();
        System.out.println("Enter PIN: ");
        int inputPin = sc.nextInt();
        if(a1.authUser(accno,inputPin)) {
            menu();
            System.out.println("Enter Your Choice: ");
            int ch = sc.nextInt();
            float amount;
            while (ch != 4) {
                switch (ch) {
                    case 1:
                        System.out.println("Enter Amount To Deposit: ");
                        amount = sc.nextFloat();
                        a1.deposit(amount);
                        menu();
                        System.out.println("Enter Your Choice: ");
                        ch = sc.nextInt();
                        break;
                    case 2:
                        System.out.println("Enter Amount To Withdraw: ");
                        amount = sc.nextFloat();
                        a1.withdraw(amount);
                        menu();
                        System.out.println("Enter Your Choice: ");
                        ch = sc.nextInt();
                        break;
                    case 3:
                        System.out.print("Your Account Balance Is: ");
                        float bal = a1.showBalance();
                        System.out.println(bal);
                        menu();
                        System.out.println("Enter Your Choice: ");
                        ch = sc.nextInt();
                        break;
                    default:
                        System.out.println("Wrong Choice");
                        menu();
                        System.out.println("Enter Your Choice: ");
                        ch = sc.nextInt();
                        break;
                }
            }
        }
        else{
                System.out.println("User Credentials Not Matched");
        }
    }
}
class Acc{
    String name;
    int accno;
    float amount;
    int pin;
    Acc(String name,int accno,float amount,int pin){
        this.name = name;
        this.accno = accno;
        this.amount = amount;
        this.pin = pin;
    }
    boolean authUser(int accno,int pin){
        return((accno==this.accno)&&(pin==this.pin));
    }
    void deposit(float amount){
        if(amount>0){
            this.amount += amount;
            System.out.println(amount+" Deposited Successfully Into Your Account");
        }
        else{
            System.out.println("Please Enter A Valid Amount");
        }
    }
    void withdraw(float amount){
        if(amount>0&&amount<=this.amount){
            this.amount -= amount;
            System.out.println(amount+" Debited From Your Account");
        }
        else{
            System.out.println("Insufficient Funds");
        }
    }
    float showBalance(){
        return this.amount;
    }
}