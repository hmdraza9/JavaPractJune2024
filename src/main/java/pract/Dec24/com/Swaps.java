package pract.Dec24.com;

public class Swaps {

    public static void main(String[] args){

        Swaps.swapNumbers(-1,-2);
        Swaps.swapStrings("miss","you");

    }

    public static void swapNumbers(int a, int b){

        System.out.println("Before swap: a = "+a+", b = "+b);
        //a = 10, b = 20
        a = a + b; //a = 10 + 20 = 30
        b = a - b; //b = 30 - 20 = 10
        a = a - b; //a = 30 - 10 = 20

        System.out.println(" After swap: a = "+a+", b = "+b);


    }

    public static void swapStrings(String a, String b){

        System.out.println("Before swap: a = "+a+", b = "+b);
        //a = "miss", b = "you"
        a = a + b; //a = miss + you = missyou
        b = a.substring(0, a.length() - b.length()); //b = missyou - you = miss
        a = a.substring(b.length()); //a = missyou - miss = miss

        System.out.println(" After swap: a = "+a+", b = "+b);


    }

}
