package example;

import java.util.Scanner;

public class example1jiajian {
    //1. public（公开的）
    //相当于你家的门是开着的，谁都能进。
    // 在 Java 里，这表示这个方法对其他代码是“可见”的，JVM（Java 运行环境）能找到并执行它。
    //2. static（静态的）
    //相当于你家的大门不需要钥匙，直接推就能进。
    // 在 Java 里，这表示这个方法属于“类本身”，而不是某个具体的对象。比如，你不需要先创建一个“计算器”对象，就能直接运行这个方法。
    //3. void（空的）
    //相当于你按了“开始游戏”按钮后，按钮本身不会给你返回任何东西（比如分数或道具）。
    // 在 Java 里，这表示这个方法执行完后不返回任何结果。
    //4. main（主要的）
    //这是方法的名字，是 Java 规定的“启动方法”的固定名字。
    // 就像游戏里的“开始”按钮必须叫“开始”一样，Java 程序的启动方法必须叫 main。
    //5. String[] args（字符串数组参数）
    //相当于你玩游戏时，启动前可以输入一些“额外信息”（比如选择难度、角色等）。
    // 在 Java 里，这是一个存储命令行参数的数组，比如你运行程序时输入的额外内容会存在这里。
    //总结：
    //这行代码的作用就是告诉 Java 运行环境：“从这里开始执行我的程序！” 所有 Java 程序都需要这行代码作为“入口”，就像所有房子都需要一个大门一样。
    //举个例子：
    //如果把你的 Java 程序比作一个蛋糕店，那么 main 方法就是蛋糕店的“开门营业”按钮。当你运行程序时，JVM 会找到这个按钮并按下它，然后开始执行后面的代码（比如做蛋糕、卖蛋糕的步骤）。
    public static void main(String[] args) {

        //用于创建一个Scanner对象，用于从标准输入（键盘）读取用户输入
        //Scanner: Java标准库中的一个类，用于解析基本数据类型和字符串的输入。
        //sc: 变量名，用于引用创建的Scanner对象。
        //new Scanner(System.in): 创建Scanner实例
        // 参数System.in表示从标准输入流（键盘）读取数据。
        // 读取整数 int num = sc.nextInt();
        // 读取字符串 String str = sc.nextLine();
        // 读取浮点数 double d = sc.nextDouble();

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        System.out.println(num1);

        int num2 =sc.nextInt();
        System.out.println(num2);

        int sum = num1 + num2;
        System.out.println(sum);
    }
}
