package tools;

public class amadeusPkg {

	/*
	 * CON	Convention
COR	Corporate
FAM	Family
GOV	Government
MIL	Military
PKG	Package
PRO	Promotional
RAC	Standard RAC
SRS	Senior Citizen
STP	Stopover
TUR	Tour
TVL	Travel Industry
WKD	Weekend

	 */
	public String getHotelRate(String code ) {
		
		
		if(code.equals("CON")) return "Convention";
		else if(code.equals("COR")) return "Corporate";
		else if(code.equals("FAM")) return "Family";
		else if(code.equals("GOV")) return "Government";
		else if(code.equals("MIL")) return "Military";
		else if(code.equals("PKG")) return "Package";
		else if(code.equals("PRO")) return "Promotional";
		else if(code.equals("RAC")) return "Standard RAC";
		else if(code.equals("SRS")) return "Senior Citizen";
		else if(code.equals("STP")) return "Stopover";
		else if(code.equals("TUR")) return "Tour";
		else if(code.equals("TVL")) return "Travel Industry";
		else if(code.equals("WKD")) return "Weekend";
		
		else return "UNDEFINED";

	}
}
