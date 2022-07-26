package data;


public class OfferFlightResult
{
	public Float BaseFare;
	public Float Tax;
	public Float TotalFare;
	public String ElapsedTime;
	public String DepDate;
	public String ArrDate;
	public String DepTime;
	public String ArrTime;
	public String FlightNumber;
	public String DepartureAirport;
	public String ArrivalAirport;
	public String OperatingAirline;
	public String AirEquipType;
	public String MarketingAirline;
	public Float ServiceFeeAmount;
	public String TicketDesignatorCode;
	public String TicketDesignatorExtension;
	public String Terminal;
	public String Currency;
	public String Cabin;
	public String BusinessFare;
	public String CabinClass;
	public String ClassDesc;
	public String ClassCode;
	public String RuleLink;
	public String ndcFlightSegRef;
	public String ndcOfferID;
	public String ndcOfferItemID;
	public String key;
	public Float excRate;
	public Boolean hasMoreResults = false;
	public Boolean isConnected = false;
	public String status;
	public String keywords;
	public Customer[] custlist;
	
	public Airitinerary airitin;
	public AiritineraryPrice airitinprice;

	public String amadeusRecommendationId;
	public String amadeusCombinationId;
	public String amadeusControlNumber;
	public String amadeusReferenceNumber;
	public Boolean needConfirm = false;
	public String cookie;
	
	public String OfferId;
	public String source;
	public String fop;
	public Invoice invoice;
	public PaymentCard payInfo;
public String action;
public String pnrstr;	

public LimitMessage limitMessage;
public ComplianceMessage compMessage;

public String BrandCode;
public String OrgAmount;
public String OrgCurrency;

public String OfferExpirationDateTime;
public String PaymentTimeLimitDateTime;


	public String getNdcOfferItemID() {
	return ndcOfferItemID;
}
public void setNdcOfferItemID(String ndcOfferItemID) {
	this.ndcOfferItemID = ndcOfferItemID;
}
	public String getOfferExpirationDateTime() {
	return OfferExpirationDateTime;
}
public void setOfferExpirationDateTime(String offerExpirationDateTime) {
	OfferExpirationDateTime = offerExpirationDateTime;
}
public String getPaymentTimeLimitDateTime() {
	return PaymentTimeLimitDateTime;
}
public void setPaymentTimeLimitDateTime(String paymentTimeLimitDateTime) {
	PaymentTimeLimitDateTime = paymentTimeLimitDateTime;
}
	public String getOrgAmount() {
	return OrgAmount;
}
public void setOrgAmount(String orgAmount) {
	OrgAmount = orgAmount;
}
public String getOrgCurrency() {
	return OrgCurrency;
}
public void setOrgCurrency(String orgCurrency) {
	OrgCurrency = orgCurrency;
}
	public String getBrandCode() {
	return BrandCode;
}
public void setBrandCode(String brandCode) {
	BrandCode = brandCode;
}
	public LimitMessage getLimitMessage() {
	return limitMessage;
}
public void setLimitMessage(LimitMessage limitMessage) {
	this.limitMessage = limitMessage;
}
public ComplianceMessage getCompMessage() {
	return compMessage;
}
public void setCompMessage(ComplianceMessage compMessage) {
	this.compMessage = compMessage;
}
	public String getPnrstr() {
	return pnrstr;
}
public void setPnrstr(String pnrstr) {
	this.pnrstr = pnrstr;
}
	public String getKeywords() {
	return keywords;
}
public void setKeywords(String keywords) {
	this.keywords = keywords;
}
	public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
	public String getAction() {
	return action;
}
public void setAction(String action) {
	this.action = action;
}
	public Boolean getNeedConfirm() {
		return needConfirm;
	}
	public void setNeedConfirm(Boolean needConfirm) {
		this.needConfirm = needConfirm;
	}
	public String getAmadeusControlNumber() {
		return amadeusControlNumber;
	}
	public void setAmadeusControlNumber(String amadeusControlNumber) {
		this.amadeusControlNumber = amadeusControlNumber;
	}
	public String getAmadeusReferenceNumber() {
		return amadeusReferenceNumber;
	}
	public void setAmadeusReferenceNumber(String amadeusReferenceNumber) {
		this.amadeusReferenceNumber = amadeusReferenceNumber;
	}
	public PaymentCard getPayInfo() {
		return payInfo;
	}
	public void setPayInfo(PaymentCard payInfo) {
		this.payInfo = payInfo;
	}
	public Invoice getInvoice() {
		return invoice;
	}
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	public String getFop() {
		return fop;
	}
	public void setFop(String fop) {
		this.fop = fop;
	}
	public Customer[] getCustlist() {
		return custlist;
	}
	public void setCustlist(Customer[] custlist) {
		this.custlist = custlist;
	}
	public Boolean getIsConnected() {
		return isConnected;
	}
	public void setIsConnected(Boolean isConnected) {
		this.isConnected = isConnected;
	}
	public String getCookie() {
		return cookie;
	}
	public void setCookie(String cookie) {
		this.cookie = cookie;
	}
	public Airitinerary getAiritin() {
		return airitin;
	}
	public void setAiritin(Airitinerary airitin) {
		this.airitin = airitin;
	}
	public AiritineraryPrice getAiritinprice() {
		return airitinprice;
	}
	public void setAiritinprice(AiritineraryPrice airitinprice) {
		this.airitinprice = airitinprice;
	}
	public Boolean getHasMoreResults() {
		return hasMoreResults;
	}
	public void setHasMoreResults(Boolean hasMoreResults) {
		this.hasMoreResults = hasMoreResults;
	}
	public Float getExcRate() {
		return excRate;
	}
	public void setExcRate(Float excRate) {
		this.excRate = excRate;
	}
	public String getNdcFlightSegRef() {
		return ndcFlightSegRef;
	}
	public void setNdcFlightSegRef(String ndcFlightSegRef) {
		this.ndcFlightSegRef = ndcFlightSegRef;
	}
	public String getNdcOfferID() {
		return ndcOfferID;
	}
	public void setNdcOfferID(String ndcOfferID) {
		this.ndcOfferID = ndcOfferID;
	}
	public String getAmadeusRecommendationId() {
		return amadeusRecommendationId;
	}
	public void setAmadeusRecommendationId(String amadeusRecommendationId) {
		this.amadeusRecommendationId = amadeusRecommendationId;
	}
	public String getAmadeusCombinationId() {
		return amadeusCombinationId;
	}
	public void setAmadeusCombinationId(String amadeusCombinationId) {
		this.amadeusCombinationId = amadeusCombinationId;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getRuleLink() {
		return RuleLink;
	}
	public void setRuleLink(String ruleLink) {
		RuleLink = ruleLink;
	}
	public String getCabinClass() {
		return CabinClass;
	}
	public void setCabinClass(String cabinClass) {
		CabinClass = cabinClass;
	}
	public String getClassDesc() {
		return ClassDesc;
	}
	public void setClassDesc(String classDesc) {
		ClassDesc = classDesc;
	}
	public String getClassCode() {
		return ClassCode;
	}
	public void setClassCode(String classCode) {
		ClassCode = classCode;
	}
	public String getOfferId() {
		return OfferId;
	}
	public void setOfferId(String offerId) {
		OfferId = offerId;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDepTime() {
		return DepTime;
	}
	public void setDepTime(String depTime) {
		DepTime = depTime;
	}
	public String getArrTime() {
		return ArrTime;
	}
	public void setArrTime(String arrTime) {
		ArrTime = arrTime;
	}
	public String getBusinessFare() {
		return BusinessFare;
	}
	public void setBusinessFare(String businessFare) {
		BusinessFare = businessFare;
	}
	public String getCabin() {
		return Cabin;
	}
	public void setCabin(String cabin) {
		Cabin = cabin;
	}
	public String getTerminal() {
		return Terminal;
	}
	public void setTerminal(String terminal) {
		Terminal = terminal;
	}
	public String getCurrency() {
		return Currency;
	}
	public void setCurrency(String currency) {
		Currency = currency;
	}
	public String getElapsedTime() {
		return ElapsedTime;
	}
	public void setElapsedTime(String elapsedTime) {
		ElapsedTime = elapsedTime;
	}
	public String getDepDate() {
		return DepDate;
	}
	public void setDepDate(String depDate) {
		DepDate = depDate;
	}
	public String getArrDate() {
		return ArrDate;
	}
	public void setArrDate(String arrDate) {
		ArrDate = arrDate;
	}
	public String getFlightNumber() {
		return FlightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		FlightNumber = flightNumber;
	}
	public String getDepartureAirport() {
		return DepartureAirport;
	}
	public void setDepartureAirport(String departureAirport) {
		DepartureAirport = departureAirport;
	}
	public String getArrivalAirport() {
		return ArrivalAirport;
	}
	public void setArrivalAirport(String arrivalAirport) {
		ArrivalAirport = arrivalAirport;
	}
	public String getOperatingAirline() {
		return OperatingAirline;
	}
	public void setOperatingAirline(String operatingAirline) {
		OperatingAirline = operatingAirline;
	}
	public String getAirEquipType() {
		return AirEquipType;
	}
	public void setAirEquipType(String airEquipType) {
		AirEquipType = airEquipType;
	}
	public String getMarketingAirline() {
		return MarketingAirline;
	}
	public void setMarketingAirline(String marketingAirline) {
		MarketingAirline = marketingAirline;
	}
	public String getTicketDesignatorCode() {
		return TicketDesignatorCode;
	}
	public void setTicketDesignatorCode(String ticketDesignatorCode) {
		TicketDesignatorCode = ticketDesignatorCode;
	}
	public String getTicketDesignatorExtension() {
		return TicketDesignatorExtension;
	}
	public void setTicketDesignatorExtension(String ticketDesignatorExtension) {
		TicketDesignatorExtension = ticketDesignatorExtension;
	}
	public Float getBaseFare() {
		return BaseFare;
	}
	public void setBaseFare(Float baseFare) {
		BaseFare = baseFare;
	}
	public Float getTax() {
		return Tax;
	}
	public void setTax(Float tax) {
		Tax = tax;
	}
	public Float getTotalFare() {
		return TotalFare;
	}
	public void setTotalFare(Float totalFare) {
		TotalFare = totalFare;
	}
	public Float getServiceFeeAmount() {
		return ServiceFeeAmount;
	}
	public void setServiceFeeAmount(Float serviceFeeAmount) {
		ServiceFeeAmount = serviceFeeAmount;
	}
	
	
	
}