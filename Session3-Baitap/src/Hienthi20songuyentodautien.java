import java.util.Scanner;

public class Hienthi20songuyentodautien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên");
        int number = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int n =2;
        System.out.println("Các số nguyên tố là: ");

        while (count<number){
            boolean check = true;

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n%i==0){
                    check=false;
                    break;
                }

            }
            count++;
            if (check){
                System.out.printf("%d\t",n);
            }
            n++;
        }

    }
}
