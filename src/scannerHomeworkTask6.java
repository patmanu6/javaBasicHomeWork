import java.util.Scanner;

public class scannerHomeworkTask6 {
    public static void main(String[] args) {
        Scanner inputs=new Scanner(System.in);
        System.out.println("Please the name of your country");
        String nameOfCountry=inputs.nextLine();

        if(nameOfCountry.equals("Germany")){
            System.out.println("You speak German");
        }else if(nameOfCountry.equals("Russia")){
            System.out.println("You speak russia");
        }else if(nameOfCountry.equals("Ireland")){
            System.out.println("You speak Irish");
        }


    }
}
