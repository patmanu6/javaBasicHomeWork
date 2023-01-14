import java.util.Scanner;

public class scannerHomeworkTask3 {
    public static void main(String[] args) {

        Scanner inputs=new Scanner(System.in);
        System.out.println("Please enter your score");
        int grades=inputs.nextInt();
        if(grades>=90){
            System.out.println("Grade A");
            
        } else if (grades>=70&&grades<=90) {
            System.out.println("Grade B");
            
        } else if (grades>=50&grades<70) {
            System.out.println("Grade C");
            
        }else {
            System.out.println("Grade F");
        }


    }
}
