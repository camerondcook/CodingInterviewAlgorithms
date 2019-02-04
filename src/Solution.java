import java.util.*;

public class Solution {

    //Reverse String
    static void reverseString(){
        String str = "myjava";

        //Using StringBuffer
        StringBuffer sbf = new StringBuffer(str);
        System.out.println(sbf.reverse());

        //Iterative Method
        char[] strArray = str.toCharArray();
        String revString = "";
        for(int i = strArray.length - 1; i >= 0; i--){
            revString += strArray[i];
        }
        System.out.println(revString);
    }
    //Recursively Reverse String
    static String recursiveRevString(String str){
        if((null == str) || (str.length() <= 1)){
            return str;
        }
        return recursiveRevString(str.substring(1)) + str.charAt(0);
    }

    static void numberPyramid(){
        int numRows = 9;
        int rowCount = 1;

        System.out.println("Here is the pyramid");

        //Printing i spaces at the beginning of each row.
        for(int i = numRows; i > 0; i--){
            //Printing i spaces at the beginning of each row.
            for(int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            //Printing "rowCount" value "rowCount" times at the end of each row.
            for(int j = 1; j <= rowCount; j++){
                System.out.print(rowCount+" ");
            }
            System.out.println();
            rowCount++;
        }
    }

    static void removeWhiteSpaces(){
        String str = "Java is a Programming Language";
        String newstr = "";
        String inewstr = "";
        //Using "replaceAll"
        newstr = str.replaceAll("\\s+","");
        System.out.println(newstr);

        //Using iterative method
        char[] charArray = str.toCharArray();

        for(int i = 0; i < charArray.length; i++){
            if(charArray[i] != ' ' && charArray[i] != '\t'){
                inewstr += charArray[i];
            }
        }
        System.out.println(inewstr);
    }

    static void duplicateCharCount(){
        String str = "better butter";

        Map<Character, Integer> charCountMap = new HashMap<>();

        char[] charArray = str.toCharArray();

        for(char c: charArray){
            if(charCountMap.containsKey(c)){
                charCountMap.put(c,charCountMap.get(c) + 1);
            }
            else {
                charCountMap.put(c, 1);
            }
        }

        for(char c: charCountMap.keySet()){
            if(c != ' ') {
                char letter = c;
                String numDuplicates = charCountMap.get(c).toString();
                System.out.print(c + ":" + numDuplicates + " ");
            }
        }
        System.out.println();
    }

    static void arrayEquality(){
        int[] arrayOne = {2, 1, 5, 7, 4};
        int[] arrayTwo = {2, 1, 5, 7, 4};


        //Iterative Method
        boolean equal = true;
        if(arrayOne.length == arrayTwo.length){
            for(int i = 0; i < arrayOne.length; i++){
                if(arrayOne[i] != arrayTwo[i]){
                    equal = false;
                }
            }
        }
        else{

        }

        if(equal == false) {
            System.out.println("Not equal");
        }
        else{
            System.out.println("Equal");
        }

        //Using ".equals()"
        boolean equals = Arrays.equals(arrayOne, arrayTwo);
        if(equals == false) {
            System.out.println("Not equal");
        }
        else{
            System.out.println("Equal");
        }
    }






}
