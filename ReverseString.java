package leetcode;
import java.lang.String;

/**
 * Created by sanjanabadam on 5/19/16.
 */
public class ReverseString {
    public String reverseString(String s) {
        char[] ss = new char[s.length()];
        int j = s.length()-1;
        for(int i = 0; i<s.length();i++){
            ss[j] = s.charAt(i);
            j--;
        }
        String result = String.valueOf(ss);
        return result;
    }

    public static void main(String args[]){
        ReverseString s = new ReverseString();
        String finalString = s.reverseString("abcddefg");
        System.out.println(finalString);
    }
}
