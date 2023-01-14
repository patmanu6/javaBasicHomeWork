import java.util.Scanner;

public class scannerHomeworkTask2 {
    public static void main(String[] args) {
        Scanner inputs=new Scanner(System.in);
        System.out.println("Please enter a day");
        int day=inputs.nextInt();

        if(day>=1&day<=5){
            System.out.println("It is a weekday");

        } else if (day>=6&day==7) {
            System.out.println("It is a weekend");
            
        }else {
            System.out.println("Invalid");
        }


    }
}
