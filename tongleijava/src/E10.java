/**
 * Created by Administrator on 13-8-4.
 */
public class E10 {
    public static void main(String[] args) {


        double s = 100;
        double h = s / 2;
        int i = 0;
        for (i = 2;i< 10;i++){
            s = s + h * 2;
            h = h / 2;
        }

        System.out.println("第" + i + "次落地经过" + s +"米");
        System.out.println("第" + i + "次反弹" + h + "米");
    }
}
