import java.util.Scanner;
public class third {
    public static void main(String[] args) {
        Scanner ql=new Scanner(System.in);
        System.out.println("请输入两个整数");
        int a=ql.nextInt();
        int b=ql.nextInt();
        while(b!=0){
            int r=a%b;
            a=b;
            b=r;
        }
        System.out.println("两者最大公约数为"+a);

    }
}
