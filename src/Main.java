import java.util.*;

public class Main {

    public static void main(String[] args) {
        String str = "myjava";
        String st = "";


        //Reversing String
        Solution.reverseString();
        st = Solution.recursiveRevString(str);
        System.out.println(st);

        //Pyramid
        Solution.numberPyramid();

        //Remove Whitespaces
        Solution.removeWhiteSpaces();

        //Duplicate Char Count
        Solution.duplicateCharCount();

        //Array Equality
        Solution.arrayEquality();


    }
}
