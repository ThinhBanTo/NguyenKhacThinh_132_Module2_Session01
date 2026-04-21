import java.util.*;
import java.io.*;

public class b6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Nhập vào số lượng testcase: ");
        int t = Integer.parseInt(input.nextLine());
        for (int i = 1; i <= t; ++i) {
            System.out.printf("Test case: %d\n", i);
            System.out.print("Vận tốc = ");
            float v = Float.parseFloat(input.nextLine());
            System.out.print("Thời gian ");
            float t1 = Float.parseFloat(input.nextLine());
            System.out.printf("Quãng đường = %.2f", v*t1);
        }
    }
}
