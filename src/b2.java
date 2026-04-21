import java.util.*;
import java.io.*;

public class b2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Nhập số thứ nhất (firstNumber): ");
        long n1=Long.parseLong(input.nextLine());
        System.out.print("Nhập số thứ hai (secondNumber): ");
        long n2=Long.parseLong(input.nextLine());
        System.out.println();
        System.out.println("--- Kết quả ---");
        System.out.printf("firstNumber = %d\nsecondNumber = %d\nTổng = %d\nHiệu = %d\nTích = %d\nThương = %d\nPhần dư = %d",n1,n2,n1+n2,n1-n2,n1*n2,(n2==0?0:n1/n2),n1%n2);
    }
}
