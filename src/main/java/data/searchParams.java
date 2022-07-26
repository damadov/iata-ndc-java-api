package data;

public class searchParams{
	
	public class Route{
		public String dep;
		public String arr;
		public String date;
		public String rdate;
		public String depCity;
		public String arrCity;
		public Boolean depMultiAirport = false;
		public Boolean arrMultiAirport = false;
		

		public String getRdate() {
			return rdate;
		}
		public void setRdate(String rdate) {
			this.rdate = rdate;
		}
		public Boolean getDepMultiAirport() {
			return depMultiAirport;
		}
		public void setDepMultiAirport(Boolean depMultiAirport) {
			this.depMultiAirport = depMultiAirport;
		}
		public Boolean getArrMultiAirport() {
			return arrMultiAirport;
		}
		public void setArrMultiAirport(Boolean arrMultiAirport) {
			this.arrMultiAirport = arrMultiAirport;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public String getDep() {
			return dep;
		}
		public void setDep(String dep) {
			this.dep = dep;
		}
		public String getArr() {
			return arr;
		}
		public void setArr(String arr) {
			this.arr = arr;
		}
		public String getDepCity() {
			return depCity;
		}
		public void setDepCity(String depCity) {
			this.depCity = depCity;
		}
		public String getArrCity() {
			return arrCity;
		}
		public void setArrCity(String arrCity) {
			this.arrCity = arrCity;
		}
		
		
	}
	
	public class Filters{
		public Boolean hasFlights = true;
		public Boolean hasHotels = true;
		public Boolean hasCars = true;
		public Boolean hasTransport = true;
		public Boolean hasPackages = true;
		
		public Boolean getHasFlights() {
			return hasFlights;
		}
		public void setHasFlights(Boolean hasFlights) {
			this.hasFlights = hasFlights;
		}
		public Boolean getHasHotels() {
			return hasHotels;
		}
		public void setHasHotels(Boolean hasHotels) {
			this.hasHotels = hasHotels;
		}
		public Boolean getHasCars() {
			return hasCars;
		}
		public void setHasCars(Boolean hasCars) {
			this.hasCars = hasCars;
		}
		public Boolean getHasTransport() {
			return hasTransport;
		}
		public void setHasTransport(Boolean hasTransport) {
			this.hasTransport = hasTransport;
		}
		public Boolean getHasPackages() {
			return hasPackages;
		}
		public void setHasPackages(Boolean hasPackages) {
			this.hasPackages = hasPackages;
		}
		
		
	}
	
	public String guid;
	public String orig;
	public String dest;
	public String fdate;
	public String rdate;
	public String ftime = "00:01:00";
	public String rtime = "00:01:00";
	public String adt;
	public String chd;
	public String inf;
	public String type;
	public String ftype;
	public Boolean multicity = false;
	public String currency = "TRY";
	public String action;
	public custguid[] custguid;
	public String depCity;
	public String arrCity;
	public String cookie;
	public Filters filters;
	public Route[] routes; 
	public Boolean depMultiAirport = false;
	public Boolean arrMultiAirport = false;
	public int rooms = 1;
	public String destCode;
	public String hotelCode;
	public String name;
	public String lat;
	public String lon;
	public String airline;
	public Customer[] custlist;
	

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLon() {
		return lon;
	}
	public void setLon(String lon) {
		this.lon = lon;
	}
	public Customer[] getCustlist() {
		return custlist;
	}
	public void setCustlist(Customer[] custlist) {
		this.custlist = custlist;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public String getDestCode() {
		return destCode;
	}
	public void setDestCode(String destCode) {
		this.destCode = destCode;
	}
	public String getHotelCode() {
		return hotelCode;
	}
	public void setHotelCode(String hotelCode) {
		this.hotelCode = hotelCode;
	}
	public int getRooms() {
	return rooms;
}
public void setRooms(int rooms) {
	this.rooms = rooms;
}
	public Boolean getDepMultiAirport() {
		return depMultiAirport;
	}
	public void setDepMultiAirport(Boolean depMultiAirport) {
		this.depMultiAirport = depMultiAirport;
	}
	public Boolean getArrMultiAirport() {
		return arrMultiAirport;
	}
	public void setArrMultiAirport(Boolean arrMultiAirport) {
		this.arrMultiAirport = arrMultiAirport;
	}
	public Filters getFilters() {
		return filters;
	}
	public void setFilters(Filters filters) {
		this.filters = filters;
	}
	public Route[] getRoutes() {
		return routes;
	}
	public void setRoutes(Route[] routes) {
		this.routes = routes;
	}
	public String getCookie() {
		return cookie;
	}
	public void setCookie(String cookie) {
		this.cookie = cookie;
	}
	public String getDepCity() {
		return depCity;
	}
	public void setDepCity(String depCity) {
		this.depCity = depCity;
	}
	public String getArrCity() {
		return arrCity;
	}
	public void setArrCity(String arrCity) {
		this.arrCity = arrCity;
	}
	public String getFtime() {
		return ftime;
	}
	public void setFtime(String ftime) {
		this.ftime = ftime;
	}
	public String getRtime() {
		return rtime;
	}
	public void setRtime(String rtime) {
		this.rtime = rtime;
	}
	public String getFtype() {
		return ftype;
	}
	public void setFtype(String ftype) {
		this.ftype = ftype;
	}

	public custguid[] getCustguid() {
		return custguid;
	}
	public void setCustguid(custguid[] custguid) {
		this.custguid = custguid;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getGuid() {
		return guid;
	}
	public Boolean getMulticity() {
		return multicity;
	}
	public void setMulticity(Boolean multicity) {
		this.multicity = multicity;
	}
	public void setGuid(String guid) {
		this.guid = guid;
	}
	public String getRdate() {
		return rdate;
	}
	public void setRdate(String rdate) {
		this.rdate = rdate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOrig() {
		return orig;
	}
	public void setOrig(String orig) {
		this.orig = orig;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public String getFdate() {
		return fdate;
	}
	public void setFdate(String fdate) {
		this.fdate = fdate;
	}
	public String getAdt() {
		return adt;
	}
	public void setAdt(String adt) {
		this.adt = adt;
	}
	public String getChd() {
		return chd;
	}
	public void setChd(String chd) {
		this.chd = chd;
	}
	public String getInf() {
		return inf;
	}
	public void setInf(String inf) {
		this.inf = inf;
	}
	
	
	
}