import java.util.Scanner;

public class Cacsonguyentonhohon100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Các số nguyên tố là: ");
        for (int i = 2; i <100 ; i++) {
            boolean check = true;
            for (int j = 2; j <Math.sqrt(i) ; j++) {
                if (i%j==0){
                    check = false;
                    break;
                }
                if (check){
                    System.out.printf("%d\t",i);
                }
            }
        }
    }
}
