import java.util.Scanner;
public class Std_calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //TASK_2 STUDENT GRADE CALCULATOR
        System.out.print("Enter Science Marks[Out of 100] : ");
        float science = sc.nextFloat();
        System.out.println("Enter Maths Marks[Out of 100] : ");
        float maths = sc.nextFloat();
        System.out.println("Enter Science English[Out of 100] : ");
        float english = sc.nextFloat();
        System.out.println("Enter Social_Studies Marks[Out of 100] : ");
        float social_studies = sc.nextFloat();
        System.out.println("Enter Computer_Science Marks[Out of 100] : ");
        float computer_science = sc.nextFloat();
        float sum = science+maths+english+social_studies+computer_science;
        float average_percentage  = (sum/5);
        String grade = "";
        if(average_percentage>=90.0){
            grade = "A+";
        }
        else if(average_percentage>=80.0&&average_percentage<90.0){
            grade = "A";
        }
        else if(average_percentage>=70.0&&average_percentage<80.0){
            grade="B";
        }
        else if(average_percentage>=60.0&&average_percentage<70.0){
            grade="C";
        }
        else{
            grade="D";
        }
        System.out.println("Percentage: "+average_percentage+" Grade: "+grade);
    }
}