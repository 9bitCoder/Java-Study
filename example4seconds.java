package example;

public class example4seconds {
    public static void main(String[] args){
        //给定秒数，转换为小时数，分钟数，秒数,总和为秒数

        //1.定义变量记录秒数
        int seconds = 3661;

        //2.计算小时数
        int hours = seconds / 3600;//3661 /3600 =1 ... 1
        System.out.println(hours);

        //3.计算分钟数
        int min = seconds % 3600 / 60;//3661 % 3600 = 61  61 / 60 = 1 ... 1
        System.out.println(min);

        //4.计算秒数
        int second = seconds % 3600 % 60;//3661 % 3600 = 61  61 % 60 = 1
        System.out.println(second);
    }
}
