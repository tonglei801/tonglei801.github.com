package New;

/**
 * Created by Administrator on 13-8-17.
 */
//有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。
public class Class5 {
    public static void main(String[] args) {

        System.out.println(add(20));

    }

//求斐波那契(fibonacci)数列

    public static double fibonacci(int pos) {

        if(pos==1||pos==2) {

            return 1;

        }

        else {

            return fibonacci(pos-1)+fibonacci(pos-2);

        }

    }

//求和

    public static double add(int i) {

        String output ="";

        double sum = 0;

        int j = i+2;

        for(i=3;i<=j;i++) {

            sum += fibonacci(i)/fibonacci(i-1); //求和

            output += (int)fibonacci(i)+"/"+(int)fibonacci(i-1)+ "+";//输出控制表达式

        }

        System.out.println(output.substring(0, output.length()-1)+ "=");//打印表达式

        return sum;

    }
}
