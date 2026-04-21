import java.util.*;
import java.io.*;

public class b5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Nhập vào số lượng testcase: ");
        int t = Integer.parseInt(input.nextLine());
        for (int i = 1; i <= t; ++i) {
            System.out.printf("Test case: %d\n", i);
            System.out.print("Cân nặng = ");
            float w = Float.parseFloat(input.nextLine());
            System.out.print("Chiều cao = ");
            float h = Float.parseFloat(input.nextLine());

            System.out.printf("Chỉ số BMI = %.2f", w / h / h);
        }
    }
}
