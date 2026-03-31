package example;

import java.util.Scanner;

public class example2BMI {
    public static void main(String[] args){
        //BMI=体重/身高^2

        //1.键入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入体重：");
        double weight = sc.nextDouble();

        System.out.println("请输入身高：");
        double height =sc.nextDouble();
        double BMI = weight / height * height;
        System.out.println(BMI);

    }
}
