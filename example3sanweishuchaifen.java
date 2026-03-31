package example;

import java.util.Scanner;

public class example3sanweishuchaifen {
    public static void main(String [] args){

        //键入三位数，将其分解为个位、十位、百位，分别输出
        //123 % 10 = 3
        //123 / 10 % 10 =2
        //123 / 100 = 1
        //1.键入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        //读取用户输入的整数
        int number = sc.nextInt();
        System.out.println(number);

        //2.分解
        //个位
        int ge =number % 10;
        System.out.println(ge);

        //十位
        int shi = number / 10 % 10;
        System.out.println(shi);

        //百位
        int bai = number / 100 % 10;//默认%10，与上方匹配，不写也可以运行
        System.out.println(bai);


    }

}
//公式总结
//1.个位：number % 10
//2.十位：number / 10 % 10
//3.百位：number / 100 % 10
//4.千位：number / 1000 % 10

