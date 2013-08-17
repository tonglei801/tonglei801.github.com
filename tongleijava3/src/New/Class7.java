package New;

/**
 * Created by Administrator on 13-8-17.
 */
//【程序22】  题目：利用递归方法求5!。

public class Class7 {
    public static long Fac(int i) { /*阶乘算法*/
        if (i > 1)
            return (i * Fac(i - 1)); /*递归*/
        else
            return 1;
    }


    public static void main(String args[]) {
        int i = 6;

        System.out.println(Fac(i));
    }


}
