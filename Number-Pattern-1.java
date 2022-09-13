import java.util.Scanner;

public class Number_Pattern_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int row = 1; row <=a ; row++) {

            for (int column = 1; column <=row ; column++) {
                System.out.print(row+ "");
            }
            System.out.println();

        }
    }
}
