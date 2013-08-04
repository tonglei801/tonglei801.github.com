/**
 * Created by Administrator on 13-8-4.
 */
public class E8 {
    public static void main(String[] args) {
        int a = Integer.parseInt(getInfo("a"));
        int n = Integer.parseInt(getInfo("n"));
             System.out.println("s = " + task(n  , a ));

        private static int task(int n , int a){
            int sum = 0 ;
            int temp = a ;

            for (int i = 0 ; i < n ; i++) {
                sum += a ;
                temp *= 10 ;
                a += temp ;
            }

        return sum ;
        }
        private static String getInfo(String message){
            System.out.println("请输入  "+message);
            return (new Scanner(System.in)).nextLine() ;
        }
}
}
