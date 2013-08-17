package New;

import java.util.Scanner;

/**
 * Created by Administrator on 13-8-17.
 */
public class Class2 {
    public static void main(String[] args) {
        System.out.println("请输入您的利润:");
        //做个input输入 调用Scanner方法
        Scanner sc = new Scanner(System.in);
        //设定 双精度  奖金数
        double i = sc.nextDouble();
        //设定 双精度  范围累计的奖金数
        double r = 0;
        //设定 双精度  利润数
        double s = i;

        //如果利润小于等于10万 奖金比例是10%  做输出
    if(i<=100000) {
        r=i*0.1;
        System.out.println("您的奖金是:"+ r + "元");
    }
    //如果利润小于等于20万 利润10万范围的奖金比例是10% 加上 利润小于20万范围的奖金比例是7.5%的合  做输出
    else if(i<200000){
        r=i*0.1+(i-100000)*0.075;
        System.out.println("您的奖金是:"+ r + "元");
    }
    else if(i<400000){
        r=i*0.1+(i-100000)*0.075+(i-200000)*0.05;
        System.out.println("您的奖金是:"+ r + "元");
    }
    else if(i<600000){
        r=i*0.1+(i-100000)*0.075+(i-200000)*0.05+(i-400000)*0.03;
        System.out.println("您的奖金是:"+ r + "元");
    }
    else if(i<1000000){
        r=i*0.1+(i-100000)*0.075+(i-200000)*0.05+(i-400000)*0.03+(i-600000)*0.015;
        System.out.println("您的奖金是:"+ r + "元");
    }
    else r=i*0.1+(i-100000)*0.075+(i-200000)*0.05+(i-400000)*0.03+(i-600000)*0.015+(i-1000000)*0.01;{
            System.out.println("您的奖金是:"+ r + "元");
        }

        System.out.println("您的利润是:"+ s +"元");

    }
}
