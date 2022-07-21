package bigDecimal;

import java.math.BigDecimal;

public class BigDecimalTreino {

	public static void main(String[] args) {

		BigDecimal a = new BigDecimal("0.03");
		BigDecimal b = new BigDecimal("0.04");
		BigDecimal c = b.subtract(a);
		
		System.out.println(c);
		
		BigDecimal d = b.multiply(a);
		System.out.println(d);
		

	}

}
