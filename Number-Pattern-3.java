import java.util.Scanner;

public class Number_Pattern_3 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int row = a-1; row >=1 ; row--) {
            for (int column = 1; column<=row ; column++) {
                System.out.print(column+ " ");
            }
            System.out.println();
        }
    }
}
