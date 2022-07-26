package tools;

import java.sql.Date;
import java.util.Calendar;

public  class console {

public static void println() {
		
		if(appConfig.debugOn) {
			System.out.println("\n");
		}
	}
	public static void println(String log) {
		
		if(appConfig.debugOn) {
			System.out.println(Calendar.getInstance().getTime()+"-> "+log);
		}
	}
	public static void print(String log) {
		
		if(appConfig.debugOn) {
			System.out.print(Calendar.getInstance().getTime()+"-> "+log);
		}
	}
	public static void println(int log) {
		
		if(appConfig.debugOn) {
			System.out.println(Calendar.getInstance().getTime()+"-> "+log);
		}
	}
	public static void println(Float log) {
	
		if(appConfig.debugOn) {
			System.out.println(Calendar.getInstance().getTime()+"-> "+log);
		}
	}
	public static void println(java.util.Date dt) {
		
		if(appConfig.debugOn) {
			System.out.println(Calendar.getInstance().getTime()+"-> "+dt);
		}
	}
	public static void println(javax.xml.soap.SOAPBody body) {
		
		if(appConfig.debugOn) {
			System.out.println(Calendar.getInstance().getTime()+"-> "+body);
		}
	}

}
