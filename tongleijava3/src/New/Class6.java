package New;

/**
 * Created by Administrator on 13-8-17.
 */
//【程序21】  题目：求1+2!+3!+...+20!的和

public class Class6 {
    public static void main(String[] args) {
        //相加次数设定为s 初始为0
        int s = 0;
        //循环 一个数 这个数循环20次 或 20以内
        for (int i = 1; i <= 20; i++)
        {
            //相乘次数设定为p 初始为1次
           int p = 1;
            //循环 一个数 这个数不大于 上面的数
            for (int j = 1; j <= i; j++)
                p *= j;
            s += p;

        }
        System.out.println(s);
    }

}
