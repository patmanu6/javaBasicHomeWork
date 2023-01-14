import java.util.Scanner;

public class scannerHomework {
    public static void main(String[] args) {
        Scanner inputs=new Scanner(System.in);
        System.out.println("Please enter person heights in inches");
        int num=inputs.nextInt();
        
        if(num<60){
            System.out.println("short");
            
        } else if (num>=60&&num<=72) {
            System.out.println("medium");

            
        } else if (num>72) {
            System.out.println("tall");
        }


    }
}
