import java.util.Scanner;

public class scannerHomeworkTask4 {
    public static void main(String[] args) {
        Scanner inputs=new Scanner(System.in);
        System.out.println("Please enter your Birth month");
        String birth= inputs.next();

if(birth.equals("January")||birth.equals("February")||birth.equals("March")||birth.equals("April")||birth.equals("May")){
    System.out.println("You were born in Spring");
} else if (birth.equals("June")||birth.equals("July")||birth.equals("August")) {
    System.out.println("Your were born Summer");

} else if (birth.equals("September")||birth.equals("October")|| birth.equals("November")||birth.equals("December")) {
    System.out.println("You were born on Winter");

}else {
    System.out.println("You are an Alien");
}

    }
}
