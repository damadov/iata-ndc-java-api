package tools;

public class math {

	public static Float roundNumber(Float value,int decimals) {
		
		Float newValue = (float) 0;
		int newInt = 0;

		newValue = (float) (value*Math.pow(10, decimals));

		newInt = Math.round(newValue);
		
		newValue = (float) ((float) newInt/Math.pow(10, decimals));
		
		return newValue;
	}
}
