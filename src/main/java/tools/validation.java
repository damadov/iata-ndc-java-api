package tools;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Random;

public class validation {

	public static String validateChars(String str) {
		
		str = str.toUpperCase();
		String newstr = "";
		char[] chars = str.toCharArray();
		
		
//		for(int i=0;i<chars.length;i++) {
//			
//			if(chars[i] == 'Ç')
//				chars[i] = 'C';
//			else if(chars[i] == 'ç')
//				chars[i] = 'C';
//			else if(chars[i] == 'Ğ')
//				chars[i] = 'G';
//			else if(chars[i] == 'ğ')
//				chars[i] = 'G';
//			else if(chars[i] == 'İ')
//				chars[i] = 'I';
//			else if(chars[i] == 'ı')
//				chars[i] = 'I';
//			else if(chars[i] == 'Ö')
//				chars[i] = 'O';
//			else if(chars[i] == 'ö')
//				chars[i] = 'O';
//			else if(chars[i] == 'Ş')
//				chars[i] = 'S';
//			else if(chars[i] == 'ş')
//				chars[i] = 'S';
//			else if(chars[i] == 'Ü')
//				chars[i] = 'U';
//			else if(chars[i] == 'ü')
//				chars[i] = 'U';	
//		}
		
		return str.replaceAll("Ş", "S").replaceAll("Ğ", "G").replaceAll("Ç", "C").replaceAll("İ", "I").replaceAll("Ü", "U").replaceAll("Ö", "O");
		
	}
	
	public static String dateFormat(String date,String type,Boolean isReverse) {
		
		String str = "";
		tools.console.println(date);
		date = date.replaceAll("-", "").replaceAll(".", "");
		tools.console.println(date);
		if(type.equals("-")) {
			if(isReverse)
				str = date.substring(0, 3)+"-"+date.substring(4, 5)+"-"+date.substring(6);
			else
				str = date.substring(0, 3)+"-"+date.substring(4, 5)+"-"+date.substring(6);
		}
		
		return str;
		
	}
	
	public static long betweenDates(Date firstDate, Date secondDate) throws IOException
	{
	    return ChronoUnit.DAYS.between(firstDate.toInstant(), secondDate.toInstant());
	}
	
	public static float round(float value, int scale) {
	    int pow = 10;
	    for (int i = 1; i < scale; i++) {
	        pow *= 10;
	    }
	    float tmp = value * pow;
	    float tmpSub = tmp - (int) tmp;

	    return ( (float) ( (int) (
	            value >= 0
	            ? (tmpSub >= 0.5f ? tmp + 1 : tmp)
	            : (tmpSub >= -0.5f ? tmp : tmp - 1)
	            ) ) ) / pow;


	}
	
	public static int calculateAge(
			  String bdate,
			  String currdate) {
		
		LocalDate birthDate = LocalDate.parse(bdate);
		LocalDate currentDate = LocalDate.parse(currdate);
		
			    // validate inputs ...
			    return Period.between(birthDate, currentDate).getYears();
			}
	
	//@SuppressWarnings("unused")
	public static int random(int min, int max) {
		
		Random r = new Random();
		return r.ints(min, (max + 1)).limit(1).findFirst().getAsInt();
		
	}

}
