import java.util.*;
import java.io.*;
public class b4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Nhập vào số lượng testcase: ");
        int t = Integer.parseInt(input.nextLine());
        for (int i = 1; i <= t; ++i) {
            System.out.printf("Test case: %d\n", i);
            System.out.print("width = ");
            float width = Float.parseFloat(input.nextLine());
            System.out.print("height = ");
            float height = Float.parseFloat(input.nextLine());
            System.out.printf("Diện tích: %.2f\nChu vi: %.2f\n", width * height,2 * (width + height));
        }
    }
}
