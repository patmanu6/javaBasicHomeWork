import java.util.Scanner;

public class scannerHomeworkTask5 {
    public static void main(String[] args) {
        Scanner inputs=new Scanner(System.in);
        System.out.println("Please enter a 3 distinct numbers");
        int value1=inputs.nextInt();
        int value2=inputs.nextInt();
        int value3=inputs.nextInt();


if(value1>value2&&value1>value3){
    System.out.println("The first value is  larger");
    
} else if (value2>value1&&value2>value3) {
    System.out.println("The second value is larger");
    
}else if (value3>2&&value3>value1){
    System.out.println("The third value is larger");
}


    }
}
