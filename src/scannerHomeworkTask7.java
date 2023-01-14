import java.util.Scanner;

public class scannerHomeworkTask7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your grade");
        int grade=input.nextInt();


        if(grade>=90&&grade==100){
            System.out.println("Grade A Excellent");

        }else if(grade>=80&&grade<90){
            System.out.println("Grade B Good");

        }else if(grade>=70&&grade<80){
            System.out.println("Grade C Average");

        }else if(grade>60&&grade<70){
            System.out.println("Grade D that is Bad ");
        }else {
            System.out.println("Unacceptable");
        }




    }
}
