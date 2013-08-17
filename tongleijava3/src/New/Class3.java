package New;

/**
 * Created by Administrator on 13-8-17.
 */
//题目：两个乒乓球队进行比赛，各出三人。甲队为a,b,c三人，乙队为x,y,z三人。已抽签决定比赛名单。有人向队员打听比赛的名单。
// a说他不和x比，c说他不和x,z比，请编程序找出三队赛手的名单。
public class Class3 {
        public static void main(String[] args)
        {
            char[] arr1={'a','b','c'};
            char[] arr2={'x','y','z'};
            for(int i=0;i<arr1.length;i++)
            {
                for(int j=0;j<arr2.length;j++)
                {
                    if
                     (  (arr1[i]=='a' && arr2[j]=='x') || (arr1[i]=='c' && arr2[j]=='x') || (arr1[i]=='c' && arr2[j]=='z')   )
                    {
                        continue;
                    }
                    System.out.println(arr1[i] + " vs " + arr2[j]);
                }
            }
        }
}
