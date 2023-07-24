import java.util.Scanner;

public class Ungdungtinhtienlaichovay {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double money=1.0 ;
        int month=1;
        double interestRate =1.0 ;
        System.out.println("Nhập vào số tiền gửi");
        money = scanner.nextDouble();
        System.out.println("Enter number of month");
        month = scanner.nextInt();
        System.out.println("Enter annual interest rate in percentage: ");
        interestRate = scanner.nextDouble();
        double totalInterest =0;
        for (int i = 0; i < month; i++) {
            totalInterest += money*(interestRate/100)/12*month;
        }
        System.out.println("Total of interest: "+totalInterest);
    }
}
