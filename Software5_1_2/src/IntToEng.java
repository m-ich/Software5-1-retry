import java.util.Scanner;
public class IntToEng {
    // 繝｡繧､繝ｳ繝｡繧ｽ繝�繝�
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(translateEng(input));
        sc.close();
    }

    // 謨ｰ蛟､繧定恭險ｳ縺吶ｋ螟画鋤縺吶ｋ繝｡繧ｽ繝�繝�
    static String translateEng(int n) {
    	String x = null;
    	int val = String.valueOf( n ).length();
    	int a = n/10;
    	int b = n%10;
    	int c = n/100;
		int d = a%10;
    	int e = n%100;
    	int f = n/1000;
    	int g = (n%1000)/100;
    	int h = e/10;
    	if (val < 2) {
    		x = hitoketacpl(n);
    	} else if (val == 2) {
    		x = hutaketacpl(n, a, b);
    	} else if(val == 3) {
    		x = sanketacpl(b, c, d, e);
    	} else if(val == 4) {
    		x = yonketacpl(b, e, f, g, h);

    	}
        return x;
    }

	public static String hitoketacpl(int n) {
		String x;
		if(n == 0) {
			x = "zero";
		} else {
		x = hitoketa(n);
		}
		return x;
	}

	public static String hutaketacpl(int n, int a, int b) {
		String x;
		if (a == 1) {
			x = TenToNineteen(n);
		} else {
			if (b == 0) {
				x = hutaketa(a);
			} else {
				x = hutaketa(a) + " " + hitoketa(b);
			}
		}
		return x;
	}

	public static String sanketacpl(int b, int c, int d, int e) {
		String x;
		x = sanketa(c) + " " + hutaketacpl(e,d,b);
		return x;
	}

	public static String yonketacpl(int b, int e, int f, int g, int h) {
		String x;
		x = yonketa(f) + " " + sanketacpl(b,g,h,e);
		return x;
	}

    static String hitoketa(int n) {
    	String x = "";
    	//if (n == 0) x = "zero";
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
    	if (n == 0) x = "";
    	if (n == 2) x = "twenty";
    	if (n == 3) x = "thirty";
    	if (n == 4) x = "forty";
    	if (n == 5) x = "fifty";
    	if (n == 6) x = "sixty";
    	if (n == 7) x = "seventy";
    	if (n == 8) x = "eighty";
    	if (n == 9) x = "ninety";
    	return x;
    }

    static String TenToNineteen(int n) {
    	String x = null;
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
		return x;
    }

    static String sanketa(int n) {
    	String x = null;
    	if (n == 0) {
    		x = "";
    	} else {
    		x = hitoketa(n) + " hundred";
    	}
    	return x;
    }

    static String yonketa(int n) {
    	String x = null;
    	x = hitoketa(n) + " thousand";
    	return x;
    }

}
