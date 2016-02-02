package core;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class MathFuctions {

	//   *   *   *  Random Number Generators   *   *   *   //
	
	public static double randomDouble(double minimun, double maximum){
		return (Math.random() * ((maximum-minimun) + 1) + minimun);
	}
	
	public static int randomInt(int minimun, int maximum){
		return (int)roundTo(randomDouble(minimun, maximum), 1);
	}
	
	//  *   *   *  Rounding Methods   *   *   *   //
	
	public static double roundTo(double input, int pointsAfterDecimal){
		if(pointsAfterDecimal > -1){		
			String decimalFormat = "#.";
			for(int i = 0; i < pointsAfterDecimal; i++){
				decimalFormat = decimalFormat + "#";
			}
			DecimalFormat df = new DecimalFormat(decimalFormat);
			df.setRoundingMode(RoundingMode.HALF_UP);
			
			return Double.parseDouble(df.format(input));
		} else {
			return ((int)(input * Math.pow(10, pointsAfterDecimal) + .5)) / (Math.pow(10, pointsAfterDecimal));
		}
	}
	
	public static double roundMoney(double input) {
		return roundTo(input, 2);
	}
	
}
