import java.util.*;
import java.io.*;
public class b3 {
    public static int ucln(int a,int b){
        if (b==0) return a;
        return ucln(b,a%b);
    }
    public static int bcnn(int a,int b){
        return a*b/ucln(a,b);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Nhập vào số lượng testcase: ");
        int t=Integer.parseInt(input.nextLine());
        for (int i=1;i<=t;++i){
            System.out.printf("Test case: %d\n",i);
            System.out.print("Tử 1: ");
            int a=Integer.parseInt(input.nextLine());
            System.out.print("Mẫu 1: ");
            int b=Integer.parseInt(input.nextLine());
            System.out.print("Tử 2: ");
            int c=Integer.parseInt(input.nextLine());
            System.out.print("Mẫu 2: ");
            int d=Integer.parseInt(input.nextLine());

            if (b==0 || d==0) { System.out.println("Bạn nhập sai rồi!\nVui lòng thử lại testcase sau"); continue;}
            System.out.printf("Kết quả: %d/%d",a*bcnn(b,d)/b+c*bcnn(b,d)/d,bcnn(b,d));
            System.out.println();
        }
    }
}
