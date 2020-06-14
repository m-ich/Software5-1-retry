import java.util.Scanner;
public class IntToEng {
    // メインメソッド
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(translateEng(input));
    }

    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	String x = null;
    	int val = String.valueOf( n ).length();
    	int a = n/10;
    	int b = n%10;
    	int c = n/100;
    	if (val < 2) {
    		x = hitoketa(n);
    	}
    	if (val == 2) {
    		if (a == 1) {
       			if (n == 10) x = "ten";
    			if (n == 11) x = "eleven";
    			if (n == 12) x = "twelve";
    			if (n == 13) x = "thirteen";
    			if (n == 14) x = "fourteen";
    			if (n == 15) x = "fifteen";
    			if (n == 16) x = "sixteen";
    			if (n == 17) x = "seventeen";
    			if (n == 18) x = "eighteen";
    			if (n == 19) x = "nineteen";
    		} else {
    			if (b == 0) {
    				x = hutaketa(a);
    			} else {
    				x = hutaketa(a) + " " + hitoketa(b);
    			}
    		}
    	}
        return x;
    }

    static String hitoketa(int n) {
    	String x = null;
    	if (n == 0) x = "zero";
    	if (n == 1) x = "one";
		if (n == 2) x = "two";
		if (n == 3) x = "three";
		if (n == 4) x = "four";
		if (n == 5) x = "five";
		if (n == 6) x = "six";
		if (n == 7) x = "seven";
		if (n == 8) x = "eight";
		if (n == 9) x = "nine";
		return x;
    }

    static String hutaketa(int n) {
    	String x = null;
    	if (n == 2) x = "twenty";
    	if (n == 3) x = "thirty";
    	if (n == 4) x = "fourty";
    	if (n == 5) x = "fifty";
    	if (n == 6) x = "sixty";
    	if (n == 7) x = "seventy";
    	if (n == 8) x = "eighty";
    	if (n == 9) x = "ninety";
    	return x;
    }

}
