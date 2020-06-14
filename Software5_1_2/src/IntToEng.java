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
    	if (val < 2) {
    		x = hitoketa(n);
    	}
    	if (val == 2) {
    		int	a = n/10;
    		if (a == 1) {
    			
    		} else {
    			hutaketa(a);
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
    	return x;
    }
    
}
