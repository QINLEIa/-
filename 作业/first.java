import java.util.Scanner;
public class first {
    public static void main(String[] args) {
        Scanner birth=new Scanner(System.in);
        System.out.println("请输入出生年");
        int year = birth.nextInt();
        int number = 0;
        for ( int i = 0; i < 100; i++) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                number = number + 1;

            }
            year++;
        }
        System.out.println("经历了" + number + "次闰年");

    }
}
