package method;

public class demo1 {
    public static void main(String[] args) {
        /* 定义一个方法求两个数的和
        定义格式： public  static 返回值类型 方法名(参数列表){
            方法体
         }
         调用方法：方法名(参数列表);
         */
        int sum = getSum(10,20);
        System.out.println(sum);

    }

    public static int getSum(int a,int b){
        int sum = a + b;
        return sum;
    }
}
