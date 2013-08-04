/**
 * Created by Administrator on 13-8-4.
 */
//题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
public class E4 {

    public static void main(String[] args) {
        int n =360;
        int i = 2;
        System.out.print(n + "=");
        while (n > i) {
            if (n % i == 0) {
                System.out.print(i + "×");
                n = n / i;
            }
            if (n % i != 0) {
                i++;
            }
    }
    System.out.println(i);
}
}
