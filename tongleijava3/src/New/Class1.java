package New;

/**
 * Created by Administrator on 13-8-17.
 */
public class Class1 {
    public static void main(String[] args) {
        //int类型定义多少种排列组合
        int n = 0;
        //循环出第一个数 =1  并且小于等于4  累计添加
        for(int i = 1; i <= 4; ++i)
            //循环出第二个数 =1  并且小于等于4  累计添加
            for(int j = 1; j <= 4; ++j)
                //循环出第三个数 =1  并且小于等于4  累计添加
                for(int k = 1; k <= 4; ++k)
                    //如果 第一个数不等于第二个数 并且 第二个也不等于第三个  并且 第三个不等于第一个 并且这个组合数量不等于 0
                    if(i != j && j != k && i != k && ++n != 0)
                        //输出结果是  多少次   +n+     排列是 三位数  i j k
                        System.out.println("数字排列."+n+":"+i+""+j+""+k);
        //输出一共有多少种组合   n
        System.out.println("共有:" + n + "种");
    }
}
