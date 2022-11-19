package mutable_immutable;

public class Exercise01 {

    /*
    Create a method that takes a String and returns a String
    if the given String have even length and length is at least 2, then insert * in the middle of the String
    aa -> a*a
    java -> ja*va
    yoanna -> yoa*nna

    if the given String have odd length and length is at least 3, then insert * in before and after the middle character
    aaa -> a*a*a
    olena -> ol*e*na

    if the String is empty or having length of 1, then return String itself

    method name = insertStar

    "" -> ""
    a -> a
    aa -> a*a
    bbb -> b*b*b
     */

    public static String insertStar(String str){
        if(str.length() <= 1) return str;

        //the length at least 2
        if(str.length() % 2 == 0){ // a*a bb*bb
            return new StringBuilder(str).insert(str.length()/2, "*").toString();
        }
        else{ // 3,5,7
            return new StringBuilder(str).insert(str.length()/2, "*").insert(str.length()/2+2, "*").toString();
        }
    }

    public static void main(String[] args) {
        System.out.println(insertStar(""));
        System.out.println(insertStar("a"));
        System.out.println(insertStar("aa"));
        System.out.println(insertStar("aaa"));
        System.out.println(insertStar("aaaa"));
        System.out.println(insertStar("aaaaa"));
        System.out.println(insertStar("aaaaaa"));

    }
}
