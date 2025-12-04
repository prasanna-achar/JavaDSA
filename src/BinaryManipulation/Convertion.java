package BinaryManipulation;


public class Convertion {
	
	
	
	
	public static String convertToBinary(int n) {
		String b = "";
		while(n >= 1) {
			int x = n % 2;
//			System.out.println(x);
			b = x + b;
			n /= 2;
		}
		return b;
	}
	
	
	
	
	public static String convertToBinary(float num) {
	    String bf = "";
	    String bs = "";
	    int n = (int) num;
	    float frac = num - n; // better than num % 1

	    // Integer part
	    if (n == 0) bf = "0";
	    while (n > 0) {
	        bf = (n % 2) + bf;
	        n /= 2;
	    }

	    // Fractional part
	    int count = 0; // limit bits to avoid infinite loop
	    while (frac > 0 && count < 10) {
	        frac *= 2;
	        if (frac >= 1) {
	            bs += "1";
	            frac -= 1;
	        } else {
	            bs += "0";
	        }
	        count++;
	    }

	    return bf + "." + bs;
	}
	
	
	
	
	
	public static int convertToNumeric(String b) {
		int numeric =0;
		for(int i = b.length()-1; i>= 0; i--) {
			if(b.charAt(i) == '1') {
				numeric += (1 << (b.length() - 1) - i);
			}
		}
		return numeric;
	}
	
	
	
	public static float convertToDecimal(String b){
		String[] parts = b.split("\\.");
		int num = 0;
		float fraq = 0.0f;
		int powerOf2 = 1;
		for(int i =parts[0].length()-1; i >=0; i--) {
			if(parts[0].charAt(i)== '1') {
				num += powerOf2;
			}
			powerOf2 *=2;
		}
		float pow = 0.5f;
		if(parts.length > 1) {
			for (int i = 0; i < parts[1].length(); i++) {
				if(parts[1].charAt(i)== '1') {
					fraq += pow;
				}
				pow /=2;
				
			}
		}
		return num + fraq ;
	}
	
	
	
}
