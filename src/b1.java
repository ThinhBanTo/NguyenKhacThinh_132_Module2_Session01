import java.util.*;
import java.io.*;

public class b1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Nhập vào số lượng testcase: ");
        int t=Integer.parseInt(input.nextLine());
        for (int i=1;i<=t;++i){
            System.out.printf("Test case %d:\nbán kính: ",i);
            double r=Double.parseDouble(input.nextLine());
            if (r==0) {System.out.println("Diện tích: 0"); continue;}
            System.out.printf("Diện tích: %.2f",r*r*Math.PI);
            System.out.println();
        }
    }
}
