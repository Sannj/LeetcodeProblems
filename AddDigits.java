package leetcode;

/**
 * Created by sanjanabadam on 5/20/16.
 */
public class AddDigits {

    public int addDigits(int num) {

        if(num<10)
            return num;
        else {
            int sum =0;
            while(num>0){
                sum += num%10;
                num = num/10;
            }
          return  addDigits(sum);

        }
    }

    public static void main(String args[]){
        AddDigits s = new AddDigits();
        int ss=38;
        System.out.println(s.addDigits(ss));
        System.out.println(ss%9);
    }
}
