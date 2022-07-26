package tools;

import data.AmadeusCarResult;
import data.AmadeusHotelResult;
import data.AmadeusRoomResult;
import data.Basket;
import data.BasketOffer;
import data.BasketOffers;
import data.BookingHotelResult;
import data.BookingResult;
import data.Button;
import data.Company;
import data.Customer;
import data.Destination;
import data.Error;
import data.Flights;
import data.HotelAgreement;
import data.HotelAgreementRooms;
import data.Image;
import data.Notification;
import data.OfferFlightResult;
import data.OfferHotelResult;
import data.OriginDestination;
import data.OtherService;
import data.Passenger;
import data.PassengerFare;
import data.PaymentData;
import data.Pnr;
import data.PnrHistory;
import data.PoiList;
import data.PreBookingResult;
import data.ReconcilationReport;
import data.Rule;
import data.SalesReportItem;
import data.Tax;
import data.Ticket;
import data.TicketDesignator;
import data.Transfer;
import data.Visa;
import data.pnrParams;

public class appendPool {

	public static String[] appendString(String[] pnrlist, String pnr) {
		String[] tkts = null;
		 
		 try {
			 if (pnrlist != null && pnrlist.length>0) {
				 tkts = new String[pnrlist.length+1];
				 
				 for(int i =0;i<pnrlist.length;i++) {
					 tkts[i] = pnrlist[i];
				 }
				 tkts[pnrlist.length] = pnr;
			 }
			 else {
				 tkts = new String[1];
				 tkts[0] = pnr;
			 }
			 
			 return tkts;
		 }
		 catch(Exception ex) {
			 tools.console.println(ex.getMessage());
			 return null;
		 }
		 
	 }
	public static int[] appendInt(int[] list, int item) {
		int[] tkts = null;
		 
		 try {
			 if (list != null && list.length>0) {
				 tkts = new int[list.length+1];
				 
				 for(int i =0;i<list.length;i++) {
					 tkts[i] = list[i];
				 }
				 tkts[list.length] = item;
			 }
			 else {
				 tkts = new int[1];
				 tkts[0] = item;
			 }
			 
			 return tkts;
		 }
		 catch(Exception ex) {
			 tools.console.println(ex.getMessage());
			 return null;
		 }
		 
	 }
	
	public static Basket[] appendBasket(Basket[] pnrlist, Basket pnr) {
		Basket[] tkts = null;
		 
		 try {
			 if (pnrlist != null && pnrlist.length>0) {
				 tkts = new Basket[pnrlist.length+1];
				 
				 for(int i =0;i<pnrlist.length;i++) {
					 tkts[i] = pnrlist[i];
				 }
				 tkts[pnrlist.length] = pnr;
			 }
			 else {
				 tkts = new Basket[1];
				 tkts[0] = pnr;
			 }
			 
			 return tkts;
		 }
		 catch(Exception ex) {
			 tools.console.println(ex.getMessage());
			 return null;
		 }
		 
	 }
	public static BasketOffer[] appendBasketOffer(BasketOffer[] pnrlist, BasketOffer pnr) {
		BasketOffer[] tkts = null;
		 
		 try {
			 if (pnrlist != null && pnrlist.length>0) {
				 tkts = new BasketOffer[pnrlist.length+1];
				 
				 for(int i =0;i<pnrlist.length;i++) {
					 tkts[i] = pnrlist[i];
				 }
				 tkts[pnrlist.length] = pnr;
			 }
			 else {
				 tkts = new BasketOffer[1];
				 tkts[0] = pnr;
			 }
			 
			 return tkts;
		 }
		 catch(Exception ex) {
			 tools.console.println(ex.getMessage());
			 return null;
		 }
		 
	 }
	
	
	public static BookingResult[] appendPnr(BookingResult[] pnrlist, BookingResult pnr) {
		 BookingResult[] tkts = null;
		 
		 try {
			 if (pnrlist != null && pnrlist.length>0) {
				 tkts = new BookingResult[pnrlist.length+1];
				 
				 for(int i =0;i<pnrlist.length;i++) {
					 tkts[i] = pnrlist[i];
				 }
				 tkts[pnrlist.length] = pnr;
			 }
			 else {
				 tkts = new BookingResult[1];
				 tkts[0] = pnr;
			 }
			 
			 return tkts;
		 }
		 catch(Exception ex) {
			 tools.console.println(ex.getMessage());
			 return null;
		 }
		 
	 }
	

	
	public static Pnr[] appendPnr(Pnr[] pnrlist, Pnr pnr) {
		Pnr[] tkts = null;
		 
		 try {
			 if (pnrlist != null && pnrlist.length>0) {
				 tkts = new Pnr[pnrlist.length+1];
				 
				 for(int i =0;i<pnrlist.length;i++) {
					 tkts[i] = pnrlist[i];
				 }
				 tkts[pnrlist.length] = pnr;
			 }
			 else {
				 tkts = new Pnr[1];
				 tkts[0] = pnr;
			 }
			 
			 return tkts;
		 }
		 catch(Exception ex) {
			 tools.console.println(ex.getMessage());
			 return null;
		 }
		 
	 }
	public static pnrParams[] appendPnrParam(pnrParams[] pnrlist, pnrParams pnr) {
		pnrParams[] tkts = null;
		 
		 try {
			 if (pnrlist != null && pnrlist.length>0) {
				 tkts = new pnrParams[pnrlist.length+1];
				 
				 for(int i =0;i<pnrlist.length;i++) {
					 tkts[i] = pnrlist[i];
				 }
				 tkts[pnrlist.length] = pnr;
			 }
			 else {
				 tkts = new pnrParams[1];
				 tkts[0] = pnr;
			 }
			 
			 return tkts;
		 }
		 catch(Exception ex) {
			 tools.console.println(ex.getMessage());
			 return null;
		 }
		 
	 }
	public static PreBookingResult[] appendPnr(PreBookingResult[] pnrlist, PreBookingResult pnr) {
		PreBookingResult[] tkts = null;
		 
		 try {
			 if (pnrlist != null && pnrlist.length>0) {
				 tkts = new PreBookingResult[pnrlist.length+1];
				 
				 for(int i =0;i<pnrlist.length;i++) {
					 tkts[i] = pnrlist[i];
				 }
				 tkts[pnrlist.length] = pnr;
			 }
			 else {
				 tkts = new PreBookingResult[1];
				 tkts[0] = pnr;
			 }
			 
			 return tkts;
		 }
		 catch(Exception ex) {
			 tools.console.println(ex.getMessage());
			 return null;
		 }
		 
	 }
	public static BookingHotelResult[] appendPnr(BookingHotelResult[] pnrlist, BookingHotelResult pnr) {
		BookingHotelResult[] tkts = null;
		 
		 try {
			 if (pnrlist != null && pnrlist.length>0) {
				 tkts = new BookingHotelResult[pnrlist.length+1];
				 
				 for(int i =0;i<pnrlist.length;i++) {
					 tkts[i] = pnrlist[i];
				 }
				 tkts[pnrlist.length] = pnr;
			 }
			 else {
				 tkts = new BookingHotelResult[1];
				 tkts[0] = pnr;
			 }
			 
			 return tkts;
		 }
		 catch(Exception ex) {
			 tools.console.println(ex.getMessage());
			 return null;
		 }
		 
	 }
	 
	 public static Flights[] appendFlight(Flights[] flts, Flights flt) {
		 Flights[] tkts = null;
		 
		 try {
			 if (flts != null && flts.length>0) {
				 tkts = new Flights[flts.length+1];
				 
				 for(int i =0;i<flts.length;i++) {
					 tkts[i] = flts[i];
				 }
				 tkts[flts.length] = flt;
			 }
			 else {
				 tkts = new Flights[1];
				 tkts[0] = flt;
			 }
			 
			 return tkts;
		 }
		 catch(Exception ex) {
			 tools.console.println(ex.getMessage());
			 return null;
		 }
		 
	 }
	 
	 
	 public static Passenger[] appendPax(Passenger[] paxlist, Passenger pax) {
		 Passenger[] tkts = null;
		 
		 try {
			 if (paxlist != null && paxlist.length>0) {
				 tkts = new Passenger[paxlist.length+1];
				 
				 for(int i =0;i<paxlist.length;i++) {
					 tkts[i] = paxlist[i];
				 }
				 tkts[paxlist.length] = pax;
			 }
			 else {
				 tkts = new Passenger[1];
				 tkts[0] = pax;
			 }
			 
			 return tkts;
		 }
		 catch(Exception ex) {
			 tools.console.println(ex.getMessage());
			 return null;
		 }
		 
	 }
	 
	 public static Customer[] appendCustomer(Customer[] paxlist, Customer pax) {
		 Customer[] tkts = null;
		 
		 try {
			 if (paxlist != null && paxlist.length>0) {
				 tkts = new Customer[paxlist.length+1];
				 
				 for(int i =0;i<paxlist.length;i++) {
					 tkts[i] = paxlist[i];
				 }
				 tkts[paxlist.length] = pax;
			 }
			 else {
				 tkts = new Customer[1];
				 tkts[0] = pax;
			 }
			 
			 return tkts;
		 }
		 catch(Exception ex) {
			 tools.console.println(ex.getMessage());
			 return null;
		 }
		 
	 }
	 
	 public static PnrHistory[] appendLog(PnrHistory[] histlist, PnrHistory hist) {
		 PnrHistory[] tkts = null;
		 
		 try {
			 if (histlist != null && histlist.length>0) {
				 tkts = new PnrHistory[histlist.length+1];
				 
				 for(int i =0;i<histlist.length;i++) {
					 tkts[i] = histlist[i];
				 }
				 tkts[histlist.length] = hist;
			 }
			 else {
				 tkts = new PnrHistory[1];
				 tkts[0] = hist;
			 }
			 
			 return tkts;
		 }
		 catch(Exception ex) {
			 tools.console.println(ex.getMessage());
			 return null;
		 }
		 
	 }
	 
	 public static OriginDestination[] appendLog(OriginDestination[] list, OriginDestination item) {
		 OriginDestination[] newlist = null;
		 
		 try {
			 if (list != null && list.length>0) {
				 newlist = new OriginDestination[list.length+1];
				 
				 for(int i =0;i<list.length;i++) {
					 newlist[i] = list[i];
				 }
				 newlist[list.length] = item;
			 }
			 else {
				 newlist = new OriginDestination[1];
				 newlist[0] = item;
			 }
			 
			 return newlist;
		 }
		 catch(Exception ex) {
			 tools.console.println(ex.getMessage());
			 return null;
		 }
		 
	 }
	 
	 public static OfferFlightResult[] appendLog(OfferFlightResult[] list, OfferFlightResult item) {
		 OfferFlightResult[] newlist = null;
		 
		 try {
			 if (list != null && list.length>0) {
				 newlist = new OfferFlightResult[list.length+1];
				 
				 for(int i =0;i<list.length;i++) {
					 newlist[i] = list[i];
				 }
				 newlist[list.length] = item;
			 }
			 else {
				 newlist = new OfferFlightResult[1];
				 newlist[0] = item;
			 }
			 
			 return newlist;
		 }
		 catch(Exception ex) {
			 tools.console.println(ex.getMessage());
			 return null;
		 }
		 
	 }
	 public static OfferHotelResult[] appendLog(OfferHotelResult[] list, OfferHotelResult item) {
		 OfferHotelResult[] newlist = null;
		 
		 try {
			 if (list != null && list.length>0) {
				 newlist = new OfferHotelResult[list.length+1];
				 
				 for(int i =0;i<list.length;i++) {
					 newlist[i] = list[i];
				 }
				 newlist[list.length] = item;
			 }
			 else {
				 newlist = new OfferHotelResult[1];
				 newlist[0] = item;
			 }
			 
			 return newlist;
		 }
		 catch(Exception ex) {
			 tools.console.println(ex.getMessage());
			 return null;
		 }
		 
	 }
	 public static BasketOffers[] appendLog(BasketOffers[] list, BasketOffers item) {
		 BasketOffers[] newlist = null;
		 
		 try {
			 if (list != null && list.length>0) {
				 newlist = new BasketOffers[list.length+1];
				 
				 for(int i =0;i<list.length;i++) {
					 newlist[i] = list[i];
				 }
				 newlist[list.length] = item;
			 }
			 else {
				 newlist = new BasketOffers[1];
				 newlist[0] = item;
			 }
			 
			 return newlist;
		 }
		 catch(Exception ex) {
			 tools.console.println(ex.getMessage());
			 return null;
		 }
		 
	 }
	 
	 public static AmadeusRoomResult[] appendLog(AmadeusRoomResult[] list, AmadeusRoomResult item) {
		 AmadeusRoomResult[] newlist = null;
		 
		 try {
			 if (list != null && list.length>0) {
				 newlist = new AmadeusRoomResult[list.length+1];
				 
				 for(int i =0;i<list.length;i++) {
					 newlist[i] = list[i];
				 }
				 newlist[list.length] = item;
			 }
			 else {
				 newlist = new AmadeusRoomResult[1];
				 newlist[0] = item;
			 }
			 
			 return newlist;
		 }
		 catch(Exception ex) {
			 tools.console.println(ex.getMessage());
			 return null;
		 }
		 
	 }
	 
	 public static AmadeusHotelResult[] appendLog(AmadeusHotelResult[] list, AmadeusHotelResult item) {
		 AmadeusHotelResult[] newlist = null;
		 
		 try {
			 if (list != null && list.length>0) {
				 newlist = new AmadeusHotelResult[list.length+1];
				 
				 for(int i =0;i<list.length;i++) {
					 newlist[i] = list[i];
				 }
				 newlist[list.length] = item;
			 }
			 else {
				 newlist = new AmadeusHotelResult[1];
				 newlist[0] = item;
			 }
			 
			 return newlist;
		 }
		 catch(Exception ex) {
			 tools.console.println(ex.getMessage());
			 return null;
		 }
		 
	 }
	 
	 public static AmadeusCarResult[] appendLog(AmadeusCarResult[] list, AmadeusCarResult item) {
		 AmadeusCarResult[] newlist = null;
		 
		 try {
			 if (list != null && list.length>0) {
				 newlist = new AmadeusCarResult[list.length+1];
				 
				 for(int i =0;i<list.length;i++) {
					 newlist[i] = list[i];
				 }
				 newlist[list.length] = item;
			 }
			 else {
				 newlist = new AmadeusCarResult[1];
				 newlist[0] = item;
			 }
			 
			 return newlist;
		 }
		 catch(Exception ex) {
			 tools.console.println(ex.getMessage());
			 return null;
		 }
		 
	 }
	 
	 public static Ticket[] appendTicket(Ticket[] list, Ticket item) {
		 Ticket[] newlist = null;
		 
		 try {
			 if (list != null && list.length>0) {
				 newlist = new Ticket[list.length+1];
				 
				 for(int i =0;i<list.length;i++) {
					 newlist[i] = list[i];
				 }
				 newlist[list.length] = item;
			 }
			 else {
				 newlist = new Ticket[1];
				 newlist[0] = item;
			 }
			 
			 return newlist;
		 }
		 catch(Exception ex) {
			 tools.console.println(ex.getMessage());
			 return null;
		 }
		 
	 }
	 
	 public static Tax[] appendTicket(Tax[] list, Tax item) {
		 Tax[] newlist = null;
		 
		 try {
			 if (list != null && list.length>0) {
				 newlist = new Tax[list.length+1];
				 
				 for(int i =0;i<list.length;i++) {
					 newlist[i] = list[i];
				 }
				 newlist[list.length] = item;
			 }
			 else {
				 newlist = new Tax[1];
				 newlist[0] = item;
			 }
			 
			 return newlist;
		 }
		 catch(Exception ex) {
			 tools.console.println(ex.getMessage());
			 return null;
		 }
		 
	 }
	 
	 public static TicketDesignator[] appendDesignator(TicketDesignator[] list, TicketDesignator item) {
		 TicketDesignator[] newlist = null;
		 
		 try {
			 if (list != null && list.length>0) {
				 newlist = new TicketDesignator[list.length+1];
				 
				 for(int i =0;i<list.length;i++) {
					 newlist[i] = list[i];
				 }
				 newlist[list.length] = item;
			 }
			 else {
				 newlist = new TicketDesignator[1];
				 newlist[0] = item;
			 }
			 
			 return newlist;
		 }
		 catch(Exception ex) {
			 tools.console.println(ex.getMessage());
			 return null;
		 }
		 
	 }
	 
	 public static Notification[] appendNotification(Notification[] list, Notification item) {
		 Notification[] newlist = null;
		 
		 try {
			 if (list != null && list.length>0) {
				 newlist = new Notification[list.length+1];
				 
				 for(int i =0;i<list.length;i++) {
					 newlist[i] = list[i];
				 }
				 newlist[list.length] = item;
			 }
			 else {
				 newlist = new Notification[1];
				 newlist[0] = item;
			 }
			 
			 return newlist;
		 }
		 catch(Exception ex) {
			 tools.console.println(ex.getMessage());
			 return null;
		 }
		 
	 }
	 
	 public static Passenger[] appendPassenger(Passenger[] list, Passenger item) {
		 Passenger[] newlist = null;
		 
		 try {
			 if (list != null && list.length>0) {
				 newlist = new Passenger[list.length+1];
				 
				 for(int i =0;i<list.length;i++) {
					 newlist[i] = list[i];
				 }
				 newlist[list.length] = item;
			 }
			 else {
				 newlist = new Passenger[1];
				 newlist[0] = item;
			 }
			 
			 return newlist;
		 }
		 catch(Exception ex) {
			 tools.console.println(ex.getMessage());
			 return null;
		 }
		 
	 }
	 
	 public static PassengerFare[] appendPassengerFare(PassengerFare[] list, PassengerFare item) {
		 PassengerFare[] newlist = null;
		 
		 try {
			 if (list != null && list.length>0) {
				 newlist = new PassengerFare[list.length+1];
				 
				 for(int i =0;i<list.length;i++) {
					 newlist[i] = list[i];
				 }
				 newlist[list.length] = item;
			 }
			 else {
				 newlist = new PassengerFare[1];
				 newlist[0] = item;
			 }
			 
			 return newlist;
		 }
		 catch(Exception ex) {
			 tools.console.println(ex.getMessage());
			 return null;
		 }
		 
	 }
	 
	 public static ReconcilationReport[] appendReconItem(ReconcilationReport[] list, ReconcilationReport item) {
		 ReconcilationReport[] newlist = null;
		 
		 try {
			 if (list != null && list.length>0) {
				 newlist = new ReconcilationReport[list.length+1];
				 
				 for(int i =0;i<list.length;i++) {
					 newlist[i] = list[i];
				 }
				 newlist[list.length] = item;
			 }
			 else {
				 newlist = new ReconcilationReport[1];
				 newlist[0] = item;
			 }
			 
			 return newlist;
		 }
		 catch(Exception ex) {
			 tools.console.println(ex.getMessage());
			 return null;
		 }
		 
	 }
	 public static SalesReportItem[] appendSalesItem(SalesReportItem[] list, SalesReportItem item) {
		 SalesReportItem[] newlist = null;
		 
		 try {
			 if (list != null && list.length>0) {
				 newlist = new SalesReportItem[list.length+1];
				 
				 for(int i =0;i<list.length;i++) {
					 newlist[i] = list[i];
				 }
				 newlist[list.length] = item;
			 }
			 else {
				 newlist = new SalesReportItem[1];
				 newlist[0] = item;
			 }
			 
			 return newlist;
		 }
		 catch(Exception ex) {
			 tools.console.println(ex.getMessage());
			 return null;
		 }
		 
	 }

	 
	 public static Rule[] appendRule(Rule[] list, Rule item) {
		 Rule[] newlist = null;
		 
		 try {
			 if (list != null && list.length>0) {
				 newlist = new Rule[list.length+1];
				 
				 for(int i =0;i<list.length;i++) {
					 newlist[i] = list[i];
				 }
				 newlist[list.length] = item;
			 }
			 else {
				 newlist = new Rule[1];
				 newlist[0] = item;
			 }
			 
			 return newlist;
		 }
		 catch(Exception ex) {
			 tools.console.println(ex.getMessage());
			 return null;
		 }
		 
	 }
	 public static Error[] appendError(Error[] list, Error item) {
		 Error[] newlist = null;
		 
		 try {
			 if (list != null && list.length>0) {
				 newlist = new Error[list.length+1];
				 
				 for(int i =0;i<list.length;i++) {
					 newlist[i] = list[i];
				 }
				 newlist[list.length] = item;
			 }
			 else {
				 newlist = new Error[1];
				 newlist[0] = item;
			 }
			 
			 return newlist;
		 }
		 catch(Exception ex) {
			 tools.console.println(ex.getMessage());
			 return null;
		 }
		 
	 }
	 public static OtherService[] appendService(OtherService[] list, OtherService item) {
		 OtherService[] newlist = null;
		 
		 try {
			 if (list != null && list.length>0) {
				 newlist = new OtherService[list.length+1];
				 
				 for(int i =0;i<list.length;i++) {
					 newlist[i] = list[i];
				 }
				 newlist[list.length] = item;
			 }
			 else {
				 newlist = new OtherService[1];
				 newlist[0] = item;
			 }
			 
			 return newlist;
		 }
		 catch(Exception ex) {
			 tools.console.println(ex.getMessage());
			 return null;
		 }
		 
	 }
	 public static Image[] appendImage(Image[] list, Image item) {
		 Image[] newlist = null;
		 
		 try {
			 if (list != null && list.length>0) {
				 newlist = new Image[list.length+1];
				 
				 for(int i =0;i<list.length;i++) {
					 newlist[i] = list[i];
				 }
				 newlist[list.length] = item;
			 }
			 else {
				 newlist = new Image[1];
				 newlist[0] = item;
			 }
			 
			 return newlist;
		 }
		 catch(Exception ex) {
			 tools.console.println(ex.getMessage());
			 return null;
		 }
		 
	 }
	 public static Visa[] appendVisa(Visa[] list, Visa item) {
		 Visa[] newlist = null;
		 
		 try {
			 if (list != null && list.length>0) {
				 newlist = new Visa[list.length+1];
				 
				 for(int i =0;i<list.length;i++) {
					 newlist[i] = list[i];
				 }
				 newlist[list.length] = item;
			 }
			 else {
				 newlist = new Visa[1];
				 newlist[0] = item;
			 }
			 
			 return newlist;
		 }
		 catch(Exception ex) {
			 tools.console.println(ex.getMessage());
			 return null;
		 }
		 
	 }
	 public static Transfer[] appendTransfer(Transfer[] list, Transfer item) {
		 Transfer[] newlist = null;
		 
		 try {
			 if (list != null && list.length>0) {
				 newlist = new Transfer[list.length+1];
				 
				 for(int i =0;i<list.length;i++) {
					 newlist[i] = list[i];
				 }
				 newlist[list.length] = item;
			 }
			 else {
				 newlist = new Transfer[1];
				 newlist[0] = item;
			 }
			 
			 return newlist;
		 }
		 catch(Exception ex) {
			 tools.console.println(ex.getMessage());
			 return null;
		 }
		 
	 }
	 
	 public static PaymentData[] appendPayment(PaymentData[] list, PaymentData item) {
		 PaymentData[] newlist = null;
		 
		 try {
			 if (list != null && list.length>0) {
				 newlist = new PaymentData[list.length+1];
				 
				 for(int i =0;i<list.length;i++) {
					 newlist[i] = list[i];
				 }
				 newlist[list.length] = item;
			 }
			 else {
				 newlist = new PaymentData[1];
				 newlist[0] = item;
			 }
			 
			 return newlist;
		 }
		 catch(Exception ex) {
			 tools.console.println(ex.getMessage());
			 return null;
		 }
		 
	 }
	 
	 public static Button[] appendButton(Button[] list, Button item) {
		 Button[] newlist = null;
		 
		 try {
			 if (list != null && list.length>0) {
				 newlist = new Button[list.length+1];
				 
				 for(int i =0;i<list.length;i++) {
					 newlist[i] = list[i];
				 }
				 newlist[list.length] = item;
			 }
			 else {
				 newlist = new Button[1];
				 newlist[0] = item;
			 }
			 
			 return newlist;
		 }
		 catch(Exception ex) {
			 tools.console.println(ex.getMessage());
			 return null;
		 }
		 
	 }
	 
	 public static HotelAgreement[] appendAgree(HotelAgreement[] list, HotelAgreement item) {
		 HotelAgreement[] newlist = null;
		 
		 try {
			 if (list != null && list.length>0) {
				 newlist = new HotelAgreement[list.length+1];
				 
				 for(int i =0;i<list.length;i++) {
					 newlist[i] = list[i];
				 }
				 newlist[list.length] = item;
			 }
			 else {
				 newlist = new HotelAgreement[1];
				 newlist[0] = item;
			 }
			 
			 return newlist;
		 }
		 catch(Exception ex) {
			 tools.console.println(ex.getMessage());
			 return null;
		 }
		 
	 }
	 public static HotelAgreementRooms[] appendAgreeRoom(HotelAgreementRooms[] list, HotelAgreementRooms item) {
		 HotelAgreementRooms[] newlist = null;
		 
		 try {
			 if (list != null && list.length>0) {
				 newlist = new HotelAgreementRooms[list.length+1];
				 
				 for(int i =0;i<list.length;i++) {
					 newlist[i] = list[i];
				 }
				 newlist[list.length] = item;
			 }
			 else {
				 newlist = new HotelAgreementRooms[1];
				 newlist[0] = item;
			 }
			 
			 return newlist;
		 }
		 catch(Exception ex) {
			 tools.console.println(ex.getMessage());
			 return null;
		 }
		 
	 }
	 public static OriginDestination[] appendOrigDest(OriginDestination[] list, OriginDestination item) {
		 OriginDestination[] newlist = null;
		 
		 try {
			 if (list != null && list.length>0) {
				 newlist = new OriginDestination[list.length+1];
				 
				 for(int i =0;i<list.length;i++) {
					 newlist[i] = list[i];
				 }
				 newlist[list.length] = item;
			 }
			 else {
				 newlist = new OriginDestination[1];
				 newlist[0] = item;
			 }
			 
			 return newlist;
		 }
		 catch(Exception ex) {
			 tools.console.println(ex.getMessage());
			 return null;
		 }
		 
	 }
	
	 
}
