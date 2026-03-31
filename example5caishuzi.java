package example;

import java.util.Random;
import java.util.Scanner;

public class example5caishuzi {

    public static void main(String[] args){
        //生成一个1-100之间的随机数，利用键盘录入模拟猜的动作，直到猜中为止
        //1.生成一个1-100之间的随机数

        Random r = new Random();
        int num =r.nextInt(100)+1   ;

        //2.利用键盘录入模拟猜的动作
        while(true) {
            Scanner sc = new Scanner(System.in);
            int guess = sc.nextInt();

            // 3.判断猜中了没有
            if (guess == num) {
                System.out.println("恭喜你猜中了");
            } else if (guess > num) {
                System.out.println("你猜的数字太大了");
            } else {
                System.out.println("你猜的数字太小了");
                break;
            }
        }

    }
}
