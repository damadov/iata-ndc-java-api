package data;


/*
 * {
  "flights":{
    "airlines":{
      "excluded":[{"code":"PC"},{"code":"KK"}],
      "included":[{"code":"TK"}]
    },
    "type":{
      "excluded":[{"code":"BUSINESS"}],
      "included":[{"code":"ECONOMY"}]
    }
  },
  "hotels":{
    "rating":{
      "excluded":[{"code":"0"},{"code":"1"},{"code":"2"}],
      "included":[]
    }
  },
  "budget":{
    "approved":{
      "limit":"2000",
      "department_limit":"110000",
      "currency":"TRY",
      "parent_guid":""
    },
    "pending":{
      "limit":"5000",
      "department_limit":"110000",
      "currency":"TRY",
      "parent_guid":"2143bf87-4770-444f-8de8-2c1b76ae7463"
    }
  }
}
 */

public class TravelPolicy {
	public class codeitem{
		public String code;
	}
	
	public class limititem{
		public Float limit;
		public Float department_limit;
		public String currency;
		public String parent_guid;
	}

	
	public class itemflights{
		public class itemairlines{
			public codeitem[] excluded;
			public codeitem[] included;
			public Boolean isFilter = true;
			public Boolean isRule = false;
		}
		public class itemtype{
			public codeitem[] excluded;
			public codeitem[] included;
			public Boolean isFilter = true;
			public Boolean isRule = false;
		}
		
		public itemairlines airlines;
		public itemtype type;
		
	}
	
	public class itemhotels{
		public class ratingitem{
			public codeitem[] excluded;
			public codeitem[] included;
			public Boolean isFilter = false;
			public Boolean isRule = true;
		}
		
		public ratingitem rating;
	}
	
	public class itembudget{

		public limititem approved;
		public limititem pending;
	}
	
	public itemflights flights;
	public itemhotels hotels;
	public itembudget budget;
	
	
}
