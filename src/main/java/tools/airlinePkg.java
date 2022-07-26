package tools;

import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public  class airlinePkg {

	private static String equipment_json = "{\n" + 
			" \"request\": {\n" + 
			"  \"endpoint\": \"all\",\n" + 
			"  \"url\": \"https://api.flightstats.com/flex/equipment/rest/v1/json/all\"\n" + 
			" },\n" + 
			" \"equipment\": [\n" + 
			"  {\n" + 
			"   \"iata\": \"100\",\n" + 
			"   \"name\": \"Fokker 100\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"141\",\n" + 
			"   \"name\": \"BAE Systems 146-100 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"142\",\n" + 
			"   \"name\": \"BAE Systems 146-200 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"143\",\n" + 
			"   \"name\": \"BAE Systems 146-300 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"146\",\n" + 
			"   \"name\": \"BAE Systems 146 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"14F\",\n" + 
			"   \"name\": \"BAE Systems 146 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"14X\",\n" + 
			"   \"name\": \"BAE Systems 146-100 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"14Y\",\n" + 
			"   \"name\": \"BAE Systems 146-200 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"14Z\",\n" + 
			"   \"name\": \"BAE Systems 146-300 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"219\",\n" + 
			"   \"name\": \"Indonesian Aerospace (IAe) N219\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"220\",\n" + 
			"   \"name\": \"Airbus A220 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"221\",\n" + 
			"   \"name\": \"Airbus A220-100 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"223\",\n" + 
			"   \"name\": \"Airbus A220-300 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"275\",\n" + 
			"   \"name\": \"Embraer 175 E2\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"290\",\n" + 
			"   \"name\": \"Embraer 190 E2\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"295\",\n" + 
			"   \"name\": \"Embraer 195 E2\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"310\",\n" + 
			"   \"name\": \"Airbus A310 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"312\",\n" + 
			"   \"name\": \"Airbus A310-200 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"313\",\n" + 
			"   \"name\": \"Airbus A310-300 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"318\",\n" + 
			"   \"name\": \"Airbus A318\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"319\",\n" + 
			"   \"name\": \"Airbus A319\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"31A\",\n" + 
			"   \"name\": \"Airbus A318 (sharklets)\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"31B\",\n" + 
			"   \"name\": \"Airbus A319 (sharklets)\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"31F\",\n" + 
			"   \"name\": \"Airbus A310 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"31N\",\n" + 
			"   \"name\": \"Airbus A319neo\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"31X\",\n" + 
			"   \"name\": \"Airbus A310-200 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"31Y\",\n" + 
			"   \"name\": \"Airbus A310-300 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"320\",\n" + 
			"   \"name\": \"Airbus A320\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"321\",\n" + 
			"   \"name\": \"Airbus A321\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"32A\",\n" + 
			"   \"name\": \"Airbus A320 (sharklets)\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"32B\",\n" + 
			"   \"name\": \"Airbus A321 (sharklets)\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"32F\",\n" + 
			"   \"name\": \"Airbus A320 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"32N\",\n" + 
			"   \"name\": \"Airbus A320neo\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"32Q\",\n" + 
			"   \"name\": \"Airbus A321neo\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"32R\",\n" + 
			"   \"name\": \"Airbus A320 Short Range\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"32S\",\n" + 
			"   \"name\": \"Airbus A318 / A319 / A320 / A321\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"32V\",\n" + 
			"   \"name\": \"Airbus A320 Long Range\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"32X\",\n" + 
			"   \"name\": \"Airbus A321 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"330\",\n" + 
			"   \"name\": \"Airbus A330\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"332\",\n" + 
			"   \"name\": \"Airbus A330-200\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"333\",\n" + 
			"   \"name\": \"Airbus A330-300\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"339\",\n" + 
			"   \"name\": \"Airbus A330-900neo\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"33F\",\n" + 
			"   \"name\": \"Airbus A330 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"33X\",\n" + 
			"   \"name\": \"Airbus A330-200 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"33Y\",\n" + 
			"   \"name\": \"Airbus A330-300 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"340\",\n" + 
			"   \"name\": \"Airbus A340\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"342\",\n" + 
			"   \"name\": \"Airbus A340-200\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"343\",\n" + 
			"   \"name\": \"Airbus A340-300\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"345\",\n" + 
			"   \"name\": \"Airbus A340-500\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"346\",\n" + 
			"   \"name\": \"Airbus A340-600\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"350\",\n" + 
			"   \"name\": \"Airbus A350\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"351\",\n" + 
			"   \"name\": \"Airbus A350-1000\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"358\",\n" + 
			"   \"name\": \"Airbus A350-800\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"359\",\n" + 
			"   \"name\": \"Airbus A350-900\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"380\",\n" + 
			"   \"name\": \"Airbus A380 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"388\",\n" + 
			"   \"name\": \"Airbus A380-800 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"389\",\n" + 
			"   \"name\": \"Airbus A380-900\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"38F\",\n" + 
			"   \"name\": \"Airbus A380-800F Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"703\",\n" + 
			"   \"name\": \"Boeing 707-320B / 320C Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"707\",\n" + 
			"   \"name\": \"Boeing 707 / 720 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"70F\",\n" + 
			"   \"name\": \"Boeing 707-320B / 320C Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"70M\",\n" + 
			"   \"name\": \"Boeing 707-320B / 320C Mixed Configuration\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"717\",\n" + 
			"   \"name\": \"Boeing 717-200\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"721\",\n" + 
			"   \"name\": \"Boeing 727-100 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"722\",\n" + 
			"   \"name\": \"Boeing 727-200 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"727\",\n" + 
			"   \"name\": \"Boeing 727 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"72A\",\n" + 
			"   \"name\": \"Boeing 727-200 Advanced Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"72B\",\n" + 
			"   \"name\": \"Boeing 727-100 Mixed Configuration\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"72C\",\n" + 
			"   \"name\": \"Boeing 727-200 Mixed Configuration\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"72F\",\n" + 
			"   \"name\": \"Boeing 727 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"72M\",\n" + 
			"   \"name\": \"Boeing 727 Mixed Configuration\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"72S\",\n" + 
			"   \"name\": \"Boeing 727-200/200 Advanced Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"72W\",\n" + 
			"   \"name\": \"Boeing 727-200 (winglets) Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"72X\",\n" + 
			"   \"name\": \"Boeing 727-100 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"72Y\",\n" + 
			"   \"name\": \"Boeing 727-200 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"731\",\n" + 
			"   \"name\": \"Boeing 737-100 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"732\",\n" + 
			"   \"name\": \"Boeing 737-200 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"733\",\n" + 
			"   \"name\": \"Boeing 737-300 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"734\",\n" + 
			"   \"name\": \"Boeing 737-400 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"735\",\n" + 
			"   \"name\": \"Boeing 737-500 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"736\",\n" + 
			"   \"name\": \"Boeing 737-600 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"737\",\n" + 
			"   \"name\": \"Boeing 737 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"738\",\n" + 
			"   \"name\": \"Boeing 737-800 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"739\",\n" + 
			"   \"name\": \"Boeing 737-900 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"73A\",\n" + 
			"   \"name\": \"Boeing 737-200 Advanced Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"73C\",\n" + 
			"   \"name\": \"Boeing 737-300 (winglets) Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"73E\",\n" + 
			"   \"name\": \"Boeing 737-500 (winglets) Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"73F\",\n" + 
			"   \"name\": \"Boeing 737 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"73G\",\n" + 
			"   \"name\": \"Boeing 737-700 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"73H\",\n" + 
			"   \"name\": \"Boeing 737-800 (winglets) Passenger/BBJ2\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"73J\",\n" + 
			"   \"name\": \"Boeing 737-900 (winglets) Passenger/BBJ3\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"73K\",\n" + 
			"   \"name\": \"Boeing 737-800 Freighter (winglets)\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"73L\",\n" + 
			"   \"name\": \"Boeing 737-200 Mixed Configuration\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"73M\",\n" + 
			"   \"name\": \"Boeing 737 Mixed Configuration\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"73N\",\n" + 
			"   \"name\": \"Boeing 737-300 Mixed Configuration\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"73P\",\n" + 
			"   \"name\": \"Boeing 737-400 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"73Q\",\n" + 
			"   \"name\": \"Boeing 737-400 Mixed Configuration\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"73R\",\n" + 
			"   \"name\": \"Boeing 737-700 Mixed Configuration/BBJC\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"73S\",\n" + 
			"   \"name\": \"Boeing 737-700 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"73W\",\n" + 
			"   \"name\": \"Boeing 737-700 (winglets) Passenger/BBJ1\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"73X\",\n" + 
			"   \"name\": \"Boeing 737-200 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"73Y\",\n" + 
			"   \"name\": \"Boeing 737-300 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"741\",\n" + 
			"   \"name\": \"Boeing 747-100 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"742\",\n" + 
			"   \"name\": \"Boeing 747-200 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"743\",\n" + 
			"   \"name\": \"Boeing 747-300 / 747-100/200 SUD Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"744\",\n" + 
			"   \"name\": \"Boeing 747-400 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"747\",\n" + 
			"   \"name\": \"Boeing 747 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"74B\",\n" + 
			"   \"name\": \"Boeing 747-400 Swingtail Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"74C\",\n" + 
			"   \"name\": \"Boeing 747-200 Mixed Configuration\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"74D\",\n" + 
			"   \"name\": \"Boeing 747-300 / 747-200 SUD Mixed Configuration\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"74E\",\n" + 
			"   \"name\": \"Boeing 747-400 Mixed Configuration\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"74F\",\n" + 
			"   \"name\": \"Boeing 747 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"74H\",\n" + 
			"   \"name\": \"Boeing 747-8 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"74J\",\n" + 
			"   \"name\": \"Boeing 747-400 (Domestic) Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"74L\",\n" + 
			"   \"name\": \"Boeing 747SP Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"74M\",\n" + 
			"   \"name\": \"Boeing 747 Mixed Configuration\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"74N\",\n" + 
			"   \"name\": \"Boeing 747-8F Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"74R\",\n" + 
			"   \"name\": \"Boeing 747SR Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"74T\",\n" + 
			"   \"name\": \"Boeing 747-100 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"74U\",\n" + 
			"   \"name\": \"Boeing 747-300 / 747-200 SUD Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"74V\",\n" + 
			"   \"name\": \"Boeing 747SR Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"74X\",\n" + 
			"   \"name\": \"Boeing 747-200 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"74Y\",\n" + 
			"   \"name\": \"Boeing 747-400 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"752\",\n" + 
			"   \"name\": \"Boeing 757-200 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"753\",\n" + 
			"   \"name\": \"Boeing 757-300 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"757\",\n" + 
			"   \"name\": \"Boeing 757 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"75C\",\n" + 
			"   \"name\": \"Boeing 757-200 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"75D\",\n" + 
			"   \"name\": \"Boeing 757-232\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"75F\",\n" + 
			"   \"name\": \"Boeing 757-200 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"75M\",\n" + 
			"   \"name\": \"Boeing 757-200 Mixed Configuration\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"75T\",\n" + 
			"   \"name\": \"Boeing 757-300 (winglets) Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"75V\",\n" + 
			"   \"name\": \"Boeing 757-200 Freighter (winglets)\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"75W\",\n" + 
			"   \"name\": \"Boeing 757-200 (winglets) Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"762\",\n" + 
			"   \"name\": \"Boeing 767-200 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"763\",\n" + 
			"   \"name\": \"Boeing 767-300 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"764\",\n" + 
			"   \"name\": \"Boeing 767-400 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"767\",\n" + 
			"   \"name\": \"Boeing 767 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"76C\",\n" + 
			"   \"name\": \"Boeing 767-432(ER) Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"76E\",\n" + 
			"   \"name\": \"Boeing 767-381(ER) Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"76F\",\n" + 
			"   \"name\": \"Boeing 767 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"76G\",\n" + 
			"   \"name\": \"Boeing 767-3P6(ER) Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"76L\",\n" + 
			"   \"name\": \"Boeing 767-332(ER) Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"76P\",\n" + 
			"   \"name\": \"Boeing 767-300 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"76Q\",\n" + 
			"   \"name\": \"Boeing 767-332 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"76V\",\n" + 
			"   \"name\": \"Boeing 767-300 (winglets) Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"76W\",\n" + 
			"   \"name\": \"Boeing 767-300 (winglets) Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"76X\",\n" + 
			"   \"name\": \"Boeing 767-200 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"76Y\",\n" + 
			"   \"name\": \"Boeing 767-300 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"772\",\n" + 
			"   \"name\": \"Boeing 777-200 / 200ER\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"773\",\n" + 
			"   \"name\": \"Boeing 777-300\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"777\",\n" + 
			"   \"name\": \"Boeing 777\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"77F\",\n" + 
			"   \"name\": \"Boeing 777 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"77L\",\n" + 
			"   \"name\": \"Boeing 777-200LR\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"77W\",\n" + 
			"   \"name\": \"Boeing 777-300ER\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"77X\",\n" + 
			"   \"name\": \"Boeing 777-200F Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"781\",\n" + 
			"   \"name\": \"Boeing 787-10\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"783\",\n" + 
			"   \"name\": \"Boeing 787-3\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"787\",\n" + 
			"   \"name\": \"Boeing 787\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"788\",\n" + 
			"   \"name\": \"Boeing 787-8\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"789\",\n" + 
			"   \"name\": \"Boeing 787-9\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"78P\",\n" + 
			"   \"name\": \"Boeing 787-8\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"78R\",\n" + 
			"   \"name\": \"Boeing 787-8\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"7M7\",\n" + 
			"   \"name\": \"Boeing 737MAX 7 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"7M8\",\n" + 
			"   \"name\": \"Boeing 737MAX 8 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"7M9\",\n" + 
			"   \"name\": \"Boeing 737MAX 9 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"7S8\",\n" + 
			"   \"name\": \"Boeing 737-800 (Scimitar Winglets) Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"A22\",\n" + 
			"   \"name\": \"Antonov An-22\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"A26\",\n" + 
			"   \"name\": \"Antonov An-26\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"A28\",\n" + 
			"   \"name\": \"Antonov An-28 / PZL Mielec M-28 Skytruck\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"A30\",\n" + 
			"   \"name\": \"Antonov An-30\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"A32\",\n" + 
			"   \"name\": \"Antonov An-32\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"A38\",\n" + 
			"   \"name\": \"Antonov An-38\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"A40\",\n" + 
			"   \"name\": \"Antonov An-140\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"A4F\",\n" + 
			"   \"name\": \"Antonov An-124 Ruslan\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"A58\",\n" + 
			"   \"name\": \"Antonov An-158\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"A5F\",\n" + 
			"   \"name\": \"Antonov An-225\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"A78\",\n" + 
			"   \"name\": \"Antonov An178\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"A81\",\n" + 
			"   \"name\": \"Antonov AN148-100\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"AB3\",\n" + 
			"   \"name\": \"Airbus A300 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"AB4\",\n" + 
			"   \"name\": \"Airbus A300B2 / A300B4 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"AB6\",\n" + 
			"   \"name\": \"Airbus A300-600 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"ABB\",\n" + 
			"   \"name\": \"Airbus A300-600ST Beluga Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"ABF\",\n" + 
			"   \"name\": \"Airbus A300 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"ABX\",\n" + 
			"   \"name\": \"Airbus A300B4 / A300C4 / A300F4 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"ABY\",\n" + 
			"   \"name\": \"Airbus A300-600 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"ACD\",\n" + 
			"   \"name\": \"Twin Commander Aircraft / Turbo Commander /Jetprop Commander\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"ACP\",\n" + 
			"   \"name\": \"Twin Commander Aircraft\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"ACT\",\n" + 
			"   \"name\": \"Twin (Aero) Turbo Commander / Jetprop Commander\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"AGH\",\n" + 
			"   \"name\": \"AgustaWestland A109\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"AJ2\",\n" + 
			"   \"name\": \"Regional Jet Aircraft China ARJ21\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"AJ7\",\n" + 
			"   \"name\": \"Regional Jet Aircraft China ARJ21-700\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"AN4\",\n" + 
			"   \"name\": \"Antonov An-24\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"AN6\",\n" + 
			"   \"name\": \"Antonov An-26 / An-30 / An-32\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"AN7\",\n" + 
			"   \"name\": \"Antonov An-72 / An-74\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"ANF\",\n" + 
			"   \"name\": \"Antonov An-12\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"APF\",\n" + 
			"   \"name\": \"BAE Systems ATP Freighter\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"APH\",\n" + 
			"   \"name\": \"Eurocopter (Aerospatiale) SA330 Puma / SA332 Super Puma\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"AR1\",\n" + 
			"   \"name\": \"Avro RJ100\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"AR7\",\n" + 
			"   \"name\": \"Avro RJ70\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"AR8\",\n" + 
			"   \"name\": \"Avro RJ85\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"ARJ\",\n" + 
			"   \"name\": \"Avro RJ70 / RJ85 / RJ100\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"ARX\",\n" + 
			"   \"name\": \"Avro RJX\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"AT3\",\n" + 
			"   \"name\": \"ATR 42-300\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"AT4\",\n" + 
			"   \"name\": \"ATR 42-300 / 320\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"AT5\",\n" + 
			"   \"name\": \"ATR 42-500\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"AT6\",\n" + 
			"   \"name\": \"ATR 42-600\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"AT7\",\n" + 
			"   \"name\": \"ATR 72\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"ATD\",\n" + 
			"   \"name\": \"ATR 42-400\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"ATF\",\n" + 
			"   \"name\": \"ATR 72 Freighter\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"ATP\",\n" + 
			"   \"name\": \"BAE Systems ATP\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"ATR\",\n" + 
			"   \"name\": \"ATR 42 / ATR 72\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"ATZ\",\n" + 
			"   \"name\": \"ATR 42 Freighter\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"AW6\",\n" + 
			"   \"name\": \"AgustaWestland AW169\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"AW8\",\n" + 
			"   \"name\": \"AgustaWestland AW189\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"AWH\",\n" + 
			"   \"name\": \"AgustaWestland AW139\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"AX1\",\n" + 
			"   \"name\": \"Avro RJX100\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"AX8\",\n" + 
			"   \"name\": \"Avro RJX85\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"AXX\",\n" + 
			"   \"name\": \"Avro RJX85\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"B11\",\n" + 
			"   \"name\": \"BAE Systems (BAC) One-Eleven\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"B12\",\n" + 
			"   \"name\": \"BAE Systems (BAC) One-Eleven 200\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"B13\",\n" + 
			"   \"name\": \"BAE Systems (BAC) One-Eleven 300\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"B14\",\n" + 
			"   \"name\": \"BAE Systems (BAC) One-Eleven 400 / 475\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"B15\",\n" + 
			"   \"name\": \"BAE Systems (BAC) One-Eleven 500 / RomBac One-Eleven 560\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"B56\",\n" + 
			"   \"name\": \"Beech Aircraft Turbo Baron\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"B58\",\n" + 
			"   \"name\": \"Beech Aircraft Baron 58 Foxstar\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"B65\",\n" + 
			"   \"name\": \"Beech Aircraft Queen Air 65 (U-8F)\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"B72\",\n" + 
			"   \"name\": \"Boeing 720-020B\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"BE1\",\n" + 
			"   \"name\": \"Hawker Beechcraft 1900 Airliner\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"BE2\",\n" + 
			"   \"name\": \"Hawker Beechcraft (Light aircraft-twin piston engines)\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"BE4\",\n" + 
			"   \"name\": \"Hawker 400 Beechjet/400A/400XP/400T\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"BE9\",\n" + 
			"   \"name\": \"Hawker Beechcraft C99 Airliner\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"BEC\",\n" + 
			"   \"name\": \"Hawker Beechcraft (Light aircraft)\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"BEF\",\n" + 
			"   \"name\": \"Hawker Beechcraft 1900 Freighter\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"BEH\",\n" + 
			"   \"name\": \"Hawker Beechcraft 1900D Airliner\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"BEP\",\n" + 
			"   \"name\": \"Hawker Beechcraft (Light aircraft-single piston engine)\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"BES\",\n" + 
			"   \"name\": \"Hawker Beechcraft 1900C Airliner\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"BET\",\n" + 
			"   \"name\": \"Hawker Beechcraft (Light aircraft-twin turboprop engines)\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"BH2\",\n" + 
			"   \"name\": \"Bell (Helicopters)\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"BNI\",\n" + 
			"   \"name\": \"Britten-Norman BN-2A / BN-2B Islander\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"BNT\",\n" + 
			"   \"name\": \"Britten-Norman BN-2A Mk.III Trislander\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"BTA\",\n" + 
			"   \"name\": \"Business Turbo-Prop Aircraft\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"BUS\",\n" + 
			"   \"name\": \"Surface Equipment-Bus\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"C17\",\n" + 
			"   \"name\": \"Boeing C17 Globemaster\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"C21\",\n" + 
			"   \"name\": \"Comac ARJ21\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"C27\",\n" + 
			"   \"name\": \"Comac ARJ21-700\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"C28\",\n" + 
			"   \"name\": \"Cessna Caravan 1-208 Super\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"C29\",\n" + 
			"   \"name\": \"Comac ARJ21-900\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"CC7\",\n" + 
			"   \"name\": \"Bombardier Global 7000\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"CCJ\",\n" + 
			"   \"name\": \"Canadair (Bombardier) CL-600 / 601 / 604 / 605 Challenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"CCX\",\n" + 
			"   \"name\": \"Bombardier BD-700 Global Express/Global 500\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"CD2\",\n" + 
			"   \"name\": \"Gippsland Aeronautics N22B / N24A Nomad\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"CJ1\",\n" + 
			"   \"name\": \"Cessna 500 / 501 / 525 / M2 Citation\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"CJ2\",\n" + 
			"   \"name\": \"Cessna 550 / 551 / 552 Citation\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"CJ5\",\n" + 
			"   \"name\": \"Cessna 560 Citation\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"CJ6\",\n" + 
			"   \"name\": \"Cessna 650 Citation\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"CJ8\",\n" + 
			"   \"name\": \"Cessna 680 Citation\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"CJL\",\n" + 
			"   \"name\": \"Cessna 560 XL/XLS Citation\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"CJM\",\n" + 
			"   \"name\": \"Cessna 510 Mustang Citation\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"CJT\",\n" + 
			"   \"name\": \"Citation Latitude\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"CJX\",\n" + 
			"   \"name\": \"Cessna 750 Citation X\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"CL3\",\n" + 
			"   \"name\": \"Bombardier Challenger 300\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"CL4\",\n" + 
			"   \"name\": \"Canadair CL-44D4\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"CL5\",\n" + 
			"   \"name\": \"Bombardier Challenger 350\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"CN1\",\n" + 
			"   \"name\": \"Cessna (Light aircraft-single piston engine)\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"CN2\",\n" + 
			"   \"name\": \"Cessna (Light aircraft-twin piston engines)\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"CN4\",\n" + 
			"   \"name\": \"Cessna 401/402\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"CN7\",\n" + 
			"   \"name\": \"Cessna 750 Citation X\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"CNA\",\n" + 
			"   \"name\": \"Cessna (Light aircraft)\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"CNC\",\n" + 
			"   \"name\": \"Cessna (Light aircraft-single turboprop engine)\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"CNF\",\n" + 
			"   \"name\": \"Cessna 208B Freighter\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"CNJ\",\n" + 
			"   \"name\": \"Cessna Citation\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"CNT\",\n" + 
			"   \"name\": \"Cessna (Light aircraft-twin turboprop engines)\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"CR1\",\n" + 
			"   \"name\": \"Canadair (Bombardier) Regional Jet 100\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"CR2\",\n" + 
			"   \"name\": \"Canadair (Bombardier) Regional Jet 200\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"CR7\",\n" + 
			"   \"name\": \"Canadair (Bombardier) Regional Jet 700 and Challenger 870\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"CR9\",\n" + 
			"   \"name\": \"Canadair (Bombardier) Regional Jet 900 and Challenger 890\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"CRA\",\n" + 
			"   \"name\": \"Canadair (Bombardier) Regional Jet 705\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"CRF\",\n" + 
			"   \"name\": \"Canadair (Bombardier) Regional Jet Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"CRJ\",\n" + 
			"   \"name\": \"Canadair (Bombardier) Regional Jet\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"CRK\",\n" + 
			"   \"name\": \"Canadair (Bombardier) Regional Jet 1000\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"CRV\",\n" + 
			"   \"name\": \"Aerospatiale (Sud) SE210 Caravelle\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"CS1\",\n" + 
			"   \"name\": \"Bombardier CS100\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"CS2\",\n" + 
			"   \"name\": \"CASA / IAe 212 Aviocar\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"CS3\",\n" + 
			"   \"name\": \"Bombardier CS300\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"CS5\",\n" + 
			"   \"name\": \"CASA / IAe CN-235\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"CS9\",\n" + 
			"   \"name\": \"CASA / IAe C-295\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"CSB\",\n" + 
			"   \"name\": \"Bombardier C Series\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"CV2\",\n" + 
			"   \"name\": \"Convair 240 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"CV4\",\n" + 
			"   \"name\": \"Convair 440 Metropolitan Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"CV5\",\n" + 
			"   \"name\": \"Convair 580 Passenger\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"CV6\",\n" + 
			"   \"name\": \"Convair 600/640 Passenger\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"CVF\",\n" + 
			"   \"name\": \"Convair 240 / 340 / 440 / 580 / 5800 / 600 / 640 Freighter\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"CVR\",\n" + 
			"   \"name\": \"Convair 240 / 440 / 580 Passenger\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"CVV\",\n" + 
			"   \"name\": \"Convair 240 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"CVX\",\n" + 
			"   \"name\": \"Convair 340 / 440 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"CVY\",\n" + 
			"   \"name\": \"Convair 580 / 5800 / 600 / 640 Freighter\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"CWC\",\n" + 
			"   \"name\": \"Curtiss C-46 Commando\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"D10\",\n" + 
			"   \"name\": \"Boeing (Douglas) DC-10 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"D11\",\n" + 
			"   \"name\": \"Boeing (Douglas) DC-10-10 / 15 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"D1C\",\n" + 
			"   \"name\": \"Boeing (Douglas) DC-10-30 / 40 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"D1F\",\n" + 
			"   \"name\": \"Boeing (Douglas) DC-10 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"D1M\",\n" + 
			"   \"name\": \"Boeing (Douglas) DC-10-30 Mixed Configuration\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"D1X\",\n" + 
			"   \"name\": \"Boeing (Douglas) DC-10-10 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"D1Y\",\n" + 
			"   \"name\": \"Boeing (Douglas) DC-10-30 / 40 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"D20\",\n" + 
			"   \"name\": \"Dassault Falcon 2000/2000DX\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"D28\",\n" + 
			"   \"name\": \"Fairchild Dornier 228\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"D2L\",\n" + 
			"   \"name\": \"Dassault Falcon 2000EX/EASY/LX\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"D38\",\n" + 
			"   \"name\": \"Fairchild Dornier 328-100\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"D3F\",\n" + 
			"   \"name\": \"Boeing (Douglas) DC-3 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"D3X\",\n" + 
			"   \"name\": \"De Havilland (B/E Aerospace) Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"D42\",\n" + 
			"   \"name\": \"Diamond Aircraft DA42 Twin Star\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"D4X\",\n" + 
			"   \"name\": \"De Havilland (Bombardier) DHC-8-400 Dash 8Q Freighter\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"D6F\",\n" + 
			"   \"name\": \"Boeing (Douglas) DC-6A / DC-6B / DC-6C Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"D85\",\n" + 
			"   \"name\": \"McDonnell Douglas DC-8-50 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"D86\",\n" + 
			"   \"name\": \"McDonnell Douglas DC-8-61 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"D87\",\n" + 
			"   \"name\": \"McDonnell Douglas DC-8-71 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"D8A\",\n" + 
			"   \"name\": \"McDonnell Douglas DC-8-63 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"D8B\",\n" + 
			"   \"name\": \"McDonnell Douglas DC-8-73 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"D8F\",\n" + 
			"   \"name\": \"Boeing (Douglas) DC-8 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"D8L\",\n" + 
			"   \"name\": \"Boeing (Douglas) DC-8-62 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"D8M\",\n" + 
			"   \"name\": \"Boeing (Douglas) DC-8-62 Mixed Configuration\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"D8Q\",\n" + 
			"   \"name\": \"Boeing (Douglas) DC-8-72 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"D8T\",\n" + 
			"   \"name\": \"Boeing (Douglas) DC-8-50 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"D8X\",\n" + 
			"   \"name\": \"Boeing (Douglas) DC-8-61 / 62 / 63 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"D8Y\",\n" + 
			"   \"name\": \"Boeing (Douglas) DC-8-71 / 72 / 73 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"D91\",\n" + 
			"   \"name\": \"Boeing (Douglas) DC-9-10 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"D92\",\n" + 
			"   \"name\": \"Boeing (Douglas) DC-9-20 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"D93\",\n" + 
			"   \"name\": \"Boeing (Douglas) DC-9-30 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"D94\",\n" + 
			"   \"name\": \"Boeing (Douglas) DC-9-40 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"D95\",\n" + 
			"   \"name\": \"Boeing (Douglas) DC-9-50 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"D9C\",\n" + 
			"   \"name\": \"Boeing (Douglas) DC-9-30 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"D9D\",\n" + 
			"   \"name\": \"Boeing (Douglas) DC-9-40 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"D9F\",\n" + 
			"   \"name\": \"Boeing (Douglas) DC-9 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"D9L\",\n" + 
			"   \"name\": \"Dassault Falcon 900LX\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"D9S\",\n" + 
			"   \"name\": \"McDonnell Douglas DC-9-30/40/50 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"D9X\",\n" + 
			"   \"name\": \"Boeing (Douglas) DC-9-10 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"DC3\",\n" + 
			"   \"name\": \"Boeing (Douglas) DC-3 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"DC4\",\n" + 
			"   \"name\": \"Boeing (Douglas) DC-4\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"DC6\",\n" + 
			"   \"name\": \"Boeing (Douglas) DC-6B Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"DC8\",\n" + 
			"   \"name\": \"Boeing (Douglas) DC-8 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"DC9\",\n" + 
			"   \"name\": \"Boeing (Douglas) DC-9 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"DF1\",\n" + 
			"   \"name\": \"Dassault Falcon 10 / 100\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"DF2\",\n" + 
			"   \"name\": \"Dassault Falcon 20 / 200\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"DF3\",\n" + 
			"   \"name\": \"Dassault Falcon 50/900\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"DF5\",\n" + 
			"   \"name\": \"Dassault Falcon 50 / 50EX\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"DF7\",\n" + 
			"   \"name\": \"Dassault Falcon 7X\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"DF8\",\n" + 
			"   \"name\": \"Dassault Falcon 8X\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"DF9\",\n" + 
			"   \"name\": \"Dassault Falcon 900/900B/900C/900DX/900EX/EASY\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"DFL\",\n" + 
			"   \"name\": \"Dassault Falcon\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"DH1\",\n" + 
			"   \"name\": \"De Havilland (Bombardier) DHC-8-100 Dash 8 / 8Q\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"DH2\",\n" + 
			"   \"name\": \"De Havilland (Bombardier) DHC-8-200 Dash 8 / 8Q\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"DH3\",\n" + 
			"   \"name\": \"De Havilland (Bombardier) DHC-8-300 Dash 8 / 8Q\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"DH4\",\n" + 
			"   \"name\": \"De Havilland (Bombardier) DHC-8-400 Dash 8Q\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"DH7\",\n" + 
			"   \"name\": \"De Havilland (Bombardier) DHC-7 Dash 7\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"DH8\",\n" + 
			"   \"name\": \"De Havilland (Bombardier) DHC-8 Dash 8\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"DHB\",\n" + 
			"   \"name\": \"De Havilland (Bombardier) DHC-2 Beaver / Turbo Beaver\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"DHC\",\n" + 
			"   \"name\": \"De Havilland (Bombardier) DHC-4 Caribou\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"DHD\",\n" + 
			"   \"name\": \"BAE Systems (De Havilland) 104 Dove\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"DHF\",\n" + 
			"   \"name\": \"De Havilland (Bombardier) DHC-8 Freighter\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"DHH\",\n" + 
			"   \"name\": \"BAE Systems (De Havilland) 114 Heron\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"DHL\",\n" + 
			"   \"name\": \"De Havilland (Bombardier) DHC-3 Turbo Otter\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"DHO\",\n" + 
			"   \"name\": \"De Havilland (Bombardier) DHC-3 Otter / Turbo Otter\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"DHP\",\n" + 
			"   \"name\": \"De Havilland (Bombardier) DHC-2 Beaver\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"DHR\",\n" + 
			"   \"name\": \"De Havilland (Bombardier) DHC-2 Turbo Beaver\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"DHS\",\n" + 
			"   \"name\": \"De Havilland (Bombardier) DHC-3 Otter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"DHT\",\n" + 
			"   \"name\": \"De Havilland (Bombardier) DHC-6 Twin Otter\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"E45\",\n" + 
			"   \"name\": \"Embraer EMB-145XR\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"E70\",\n" + 
			"   \"name\": \"Embraer 170\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"E75\",\n" + 
			"   \"name\": \"Embraer 175\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"E7W\",\n" + 
			"   \"name\": \"Embraer 175 (Enhanced Winglets)\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"E90\",\n" + 
			"   \"name\": \"Embraer 190\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"E95\",\n" + 
			"   \"name\": \"Embraer 195 and Legacy 1000\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"EA5\",\n" + 
			"   \"name\": \"Eclipse 500\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"EAC\",\n" + 
			"   \"name\": \"Eclipse\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"EC3\",\n" + 
			"   \"name\": \"Eurocopter EC130 / EC130T2\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"EC4\",\n" + 
			"   \"name\": \"Eurocopter EC145 / EC145T2\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"EC5\",\n" + 
			"   \"name\": \"Eurocopter EC155\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"EC7\",\n" + 
			"   \"name\": \"Eurocopter EC175\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"EM2\",\n" + 
			"   \"name\": \"Embraer 120 Brasilia\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"EM4\",\n" + 
			"   \"name\": \"Embraer Legacy 450\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"EM5\",\n" + 
			"   \"name\": \"Embraer Legacy 500\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"EM7\",\n" + 
			"   \"name\": \"Embraer RJ 170\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"EM9\",\n" + 
			"   \"name\": \"Embraer RJ 190\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"EMB\",\n" + 
			"   \"name\": \"Embraer 110 Bandeirante\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"EMJ\",\n" + 
			"   \"name\": \"Embraer 170 / 175 / 190 / 195\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"EML\",\n" + 
			"   \"name\": \"Embraer Legacy\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"EP1\",\n" + 
			"   \"name\": \"Embraer EMB-500 Phenom 100\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"EP3\",\n" + 
			"   \"name\": \"Embraer EMB-505 Phenom 300\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"EPH\",\n" + 
			"   \"name\": \"Embraer Phenom\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"ER3\",\n" + 
			"   \"name\": \"Embraer RJ135 and Legacy 600/650\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"ER4\",\n" + 
			"   \"name\": \"Embraer RJ145\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"ERD\",\n" + 
			"   \"name\": \"Embraer RJ140\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"ERJ\",\n" + 
			"   \"name\": \"Embraer RJ135 / RJ140 / RJ145\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"ERX\",\n" + 
			"   \"name\": \"Embraer RJ145XR\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"F21\",\n" + 
			"   \"name\": \"Fokker F28 Fellowship 1000\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"F22\",\n" + 
			"   \"name\": \"Fokker F28 Fellowship 2000\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"F23\",\n" + 
			"   \"name\": \"Fokker F28 Fellowship 3000\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"F24\",\n" + 
			"   \"name\": \"Fokker F28 Fellowship 4000\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"F27\",\n" + 
			"   \"name\": \"Fokker F27 Friendship / Fairchild Industries F-27\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"F28\",\n" + 
			"   \"name\": \"Fokker F28 Fellowship\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"F50\",\n" + 
			"   \"name\": \"Fokker 50\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"F5F\",\n" + 
			"   \"name\": \"Fokker 50 Freighter\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"F70\",\n" + 
			"   \"name\": \"Fokker 70\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"FA7\",\n" + 
			"   \"name\": \"Fairchild Dornier 728\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"FDJ\",\n" + 
			"   \"name\": \"Fairchild Dornier 328Jet\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"FK7\",\n" + 
			"   \"name\": \"Fairchild Industries FH-227\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"FR3\",\n" + 
			"   \"name\": \"Fairchild 328 JET\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"FR4\",\n" + 
			"   \"name\": \"Fairchild 428 JET\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"FRJ\",\n" + 
			"   \"name\": \"Fairchild Dornier 328JET\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"G2B\",\n" + 
			"   \"name\": \"Gulfstream Aerospace G-1159 Gulfstream IIB\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"G2S\",\n" + 
			"   \"name\": \"Gulfstream Aerospace G-1159 Gulfstream IISP\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"GA1\",\n" + 
			"   \"name\": \"Gippsland Aeronautics GA10\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"GA8\",\n" + 
			"   \"name\": \"Gippsland Aeronautics GA8 Airvan\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"GJ2\",\n" + 
			"   \"name\": \"Gulfstream Aerospace G-1159 Gulfstream II\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"GJ3\",\n" + 
			"   \"name\": \"Gulfstream Aerospace G-1159A Gulfstream III\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"GJ4\",\n" + 
			"   \"name\": \"Gulfstream Aerospace IV (G300/G350/G400/G450/IVSP)\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"GJ5\",\n" + 
			"   \"name\": \"Gulfstream Aerospace V (G500/G550)\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"GJ6\",\n" + 
			"   \"name\": \"Gulfstream Aerospace G650\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"GR1\",\n" + 
			"   \"name\": \"Gulfstream Aerospace G-100 / G-150 (Astra SPX)\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"GR2\",\n" + 
			"   \"name\": \"Gulfstream Aerospace G-200 (Galaxy)\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"GR3\",\n" + 
			"   \"name\": \"Gulfstream Aerospace G-280\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"GRG\",\n" + 
			"   \"name\": \"Grumman G-21 Goose (Amphibian)\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"GRJ\",\n" + 
			"   \"name\": \"Gulfstream Aerospace\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"GRM\",\n" + 
			"   \"name\": \"Grumman G-73 Turbo Mallard (Amphibian)\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"GRS\",\n" + 
			"   \"name\": \"Gulfstream Aerospace (Grumman) G-159 Gulfstream I\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"H20\",\n" + 
			"   \"name\": \"Hawker 200\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"H21\",\n" + 
			"   \"name\": \"Hawker 1000\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"H24\",\n" + 
			"   \"name\": \"Hawker 4000\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"H25\",\n" + 
			"   \"name\": \"Hawker 750/800/800XP/800SP\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"H28\",\n" + 
			"   \"name\": \"Hawker 850XP/900\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"H29\",\n" + 
			"   \"name\": \"Hawker 900XP\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"HBA\",\n" + 
			"   \"name\": \"Hawker Beechcraft\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"HEC\",\n" + 
			"   \"name\": \"Helio H-250 Courier / H-295 / 395 Super Courier\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"HHJ\",\n" + 
			"   \"name\": \"Honda HA-420 HondaJet\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"HOV\",\n" + 
			"   \"name\": \"Surface Equipment-Hovercraft\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"HS7\",\n" + 
			"   \"name\": \"BAE Systems (Hawker Siddeley) 748 / Andover\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"I14\",\n" + 
			"   \"name\": \"Ilyushin II-114 Passenger\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"I4F\",\n" + 
			"   \"name\": \"Ilyushin II-114T Freighter\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"I93\",\n" + 
			"   \"name\": \"Ilyushin II-96-300 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"I9F\",\n" + 
			"   \"name\": \"Ilyushin II-96 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"I9M\",\n" + 
			"   \"name\": \"Ilyushin II-96M Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"I9X\",\n" + 
			"   \"name\": \"Ilyushin II-96-300 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"I9Y\",\n" + 
			"   \"name\": \"Ilyushin II-96T Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"IL6\",\n" + 
			"   \"name\": \"Ilyushin II-62\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"IL7\",\n" + 
			"   \"name\": \"Ilyushin II-76\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"IL8\",\n" + 
			"   \"name\": \"Ilyushin II-18\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"IL9\",\n" + 
			"   \"name\": \"Ilyushin II-96 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"ILW\",\n" + 
			"   \"name\": \"Ilyushin II-86\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"J31\",\n" + 
			"   \"name\": \"BAE Systems Jetstream 31\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"J32\",\n" + 
			"   \"name\": \"BAE Systems Jetstream 32\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"J41\",\n" + 
			"   \"name\": \"BAE Systems Jetstream 41\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"JST\",\n" + 
			"   \"name\": \"BAE Systems Jetstream\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"JU5\",\n" + 
			"   \"name\": \"Junkers Ju 52/3m\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"L10\",\n" + 
			"   \"name\": \"Lockheed Martin L-1011 TriStar Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"L11\",\n" + 
			"   \"name\": \"Lockheed Martin L-1011TriStar 1/50/100/150/200/250 Passenge\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"L15\",\n" + 
			"   \"name\": \"Lockheed Martin L-1011 TriStar 500 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"L1F\",\n" + 
			"   \"name\": \"Lockheed Martin L-1011 TriStar Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"L49\",\n" + 
			"   \"name\": \"Lockheed L-749 Constellation / L-1049 Super Constellation\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"L4F\",\n" + 
			"   \"name\": \"Aircraft Industries (LET) 410 Freighter\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"L4T\",\n" + 
			"   \"name\": \"Aircraft Industries (LET) 410\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"LCH\",\n" + 
			"   \"name\": \"Surface Equipment-Launch / Boat\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"LHS\",\n" + 
			"   \"name\": \"Surface Equipment - Line Haul Service (Truck)\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"LJ2\",\n" + 
			"   \"name\": \"Learjet 23 / 24 / 25\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"LJ3\",\n" + 
			"   \"name\": \"Learjet 28 / 29 / 31 / 35 / 36\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"LJ4\",\n" + 
			"   \"name\": \"Learjet 40 / 45\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"LJ6\",\n" + 
			"   \"name\": \"Learjet 55 / 60\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"LJ7\",\n" + 
			"   \"name\": \"Learjet 70 /75\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"LJ8\",\n" + 
			"   \"name\": \"Learjet 85\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"LJA\",\n" + 
			"   \"name\": \"Light Jet Aircraft\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"LMO\",\n" + 
			"   \"name\": \"Surface Equipment-Limousine\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"LOE\",\n" + 
			"   \"name\": \"Lockheed Martin L-188 Electra\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"LOF\",\n" + 
			"   \"name\": \"Lockheed Martin L-188 Electra Freighter\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"LOH\",\n" + 
			"   \"name\": \"Lockheed Martin L-182 / L-282/ L-382 (L-100) Hercules\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"LOM\",\n" + 
			"   \"name\": \"Lockheed L-188 Electra Mixed Configuration\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"LRJ\",\n" + 
			"   \"name\": \"Learjet\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"M11\",\n" + 
			"   \"name\": \"Boeing (Douglas) MD-11 Passenger\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"M1F\",\n" + 
			"   \"name\": \"Boeing (Douglas) MD-11 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"M1M\",\n" + 
			"   \"name\": \"Boeing (Douglas) MD-11 Mixed Configuration\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": true,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"M2F\",\n" + 
			"   \"name\": \"Boeing (Douglas) MD82 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"M3F\",\n" + 
			"   \"name\": \"Boeing (Douglas) MD83 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"M6F\",\n" + 
			"   \"name\": \"Xian Yunshuji MA600 Freighter\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"M80\",\n" + 
			"   \"name\": \"Boeing (Douglas) MD-80\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"M81\",\n" + 
			"   \"name\": \"Boeing (Douglas) MD-81\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"M82\",\n" + 
			"   \"name\": \"Boeing (Douglas) MD-82\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"M83\",\n" + 
			"   \"name\": \"Boeing (Douglas) MD-83\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"M87\",\n" + 
			"   \"name\": \"Boeing (Douglas) MD-87\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"M88\",\n" + 
			"   \"name\": \"Boeing (Douglas) MD-88\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"M8F\",\n" + 
			"   \"name\": \"Boeing (Douglas) MD88 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"M90\",\n" + 
			"   \"name\": \"Boeing (Douglas) MD-90\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"M95\",\n" + 
			"   \"name\": \"McDonnell Douglas MD-95\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"MA6\",\n" + 
			"   \"name\": \"Xian Yunshuji MA-60/MA600 Passenger\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"MBH\",\n" + 
			"   \"name\": \"Eurocopter (MBB) BO105\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"MD9\",\n" + 
			"   \"name\": \"MD Helicopters Inc MD 900 Explorer\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"MIH\",\n" + 
			"   \"name\": \"Mil Mi-8 / Mi-17 / Mi-171 / Mi-172\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"MU2\",\n" + 
			"   \"name\": \"Mitsubishi Aircraft Corporation MU-2\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"ND2\",\n" + 
			"   \"name\": \"Aerospatiale (Nord) 262\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"NDC\",\n" + 
			"   \"name\": \"Aerospatiale SN601 Corvette\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"NDE\",\n" + 
			"   \"name\": \"Eurocopter (Aerospatiale) AS350 Ecureuil / AS355 Ecureuil 2\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"NDH\",\n" + 
			"   \"name\": \"Eurocopter (Aerospatiale) SA365C / SA365N Dauphin 2\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"P12\",\n" + 
			"   \"name\": \"Pilatus PC-XII (1T)\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"P18\",\n" + 
			"   \"name\": \"Piaggio Aero P180 Avanti II\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"PA1\",\n" + 
			"   \"name\": \"Piper (Light aircraft-single piston engine)\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"PA2\",\n" + 
			"   \"name\": \"Piper (Light aircraft-twin piston engines)\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"PAG\",\n" + 
			"   \"name\": \"Piper (Light aircraft)\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"PAT\",\n" + 
			"   \"name\": \"Piper (Light aircraft-twin turboprop engines)\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"PL2\",\n" + 
			"   \"name\": \"Pilatus PC-12\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"PL4\",\n" + 
			"   \"name\": \"Pilatus PC-24\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"PL6\",\n" + 
			"   \"name\": \"Pilatus PC-6 Turbo Porter\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"PN6\",\n" + 
			"   \"name\": \"Vulcanair (Partenavia) P.68\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"PR1\",\n" + 
			"   \"name\": \"Hawker 390 Premier 1/1A\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"RFS\",\n" + 
			"   \"name\": \"Surface Equipment-Road Feeder Service (Truck)\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"S20\",\n" + 
			"   \"name\": \"Saab 2000\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"S58\",\n" + 
			"   \"name\": \"Sikorsky S-58T\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"S61\",\n" + 
			"   \"name\": \"Sikorsky S-61\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"S76\",\n" + 
			"   \"name\": \"Sikorsky S-76\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"SF3\",\n" + 
			"   \"name\": \"Saab 340\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"SFA\",\n" + 
			"   \"name\": \"Saab 340\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"SFB\",\n" + 
			"   \"name\": \"Saab 340B\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"SFF\",\n" + 
			"   \"name\": \"Saab 340 Freighter\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"SH3\",\n" + 
			"   \"name\": \"Shorts 330 (SD3-30)\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"SH6\",\n" + 
			"   \"name\": \"Shorts 360 (SD3-60)\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"SHB\",\n" + 
			"   \"name\": \"Shorts SC.5 Belfast\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"SHS\",\n" + 
			"   \"name\": \"Shorts Skyvan (SC-7)\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"SSC\",\n" + 
			"   \"name\": \"Aerospatiale/British Aerospace Concorde\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"SU1\",\n" + 
			"   \"name\": \"Sukhoi Superjet 100\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"SU7\",\n" + 
			"   \"name\": \"Sukhoi Superjet 100-75\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"SU9\",\n" + 
			"   \"name\": \"Sukhoi Superjet 100-95\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"SWF\",\n" + 
			"   \"name\": \"Fairchld (Swearingen) SA226 Freighter\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"SWM\",\n" + 
			"   \"name\": \"Fairchild (Swearingen)SA26/SA226/SA227Merlin/Metro/Expediter\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"SY8\",\n" + 
			"   \"name\": \"Shaanxi Y-8\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"T20\",\n" + 
			"   \"name\": \"Tupolev Tu-204 /  Tu-214\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"T2F\",\n" + 
			"   \"name\": \"Tupolev Tu-204 Freighter\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"T34\",\n" + 
			"   \"name\": \"Tupolev Tu-334\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"TBM\",\n" + 
			"   \"name\": \"SOCATA TBM-700\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": true\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"TRN\",\n" + 
			"   \"name\": \"Surface Equipment-Train Standard Service\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"TRS\",\n" + 
			"   \"name\": \"Surface Equipment-Train High Speed Train\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"TU3\",\n" + 
			"   \"name\": \"Tupolev Tu-134\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"TU5\",\n" + 
			"   \"name\": \"Tupolev Tu-154\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"VCV\",\n" + 
			"   \"name\": \"British Aerospace (Vickers) Viscount\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"WWP\",\n" + 
			"   \"name\": \"Israel Aerospace Industries 1124 Westwind\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"YK2\",\n" + 
			"   \"name\": \"Yakovlev Yak-42 / Yak-142\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"YK4\",\n" + 
			"   \"name\": \"Yakovlev Yak-40\",\n" + 
			"   \"turboProp\": false,\n" + 
			"   \"jet\": true,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"YN2\",\n" + 
			"   \"name\": \"Harbin Yunshuji Y12\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"YN7\",\n" + 
			"   \"name\": \"Xian Yunshuji Y7\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  },\n" + 
			"  {\n" + 
			"   \"iata\": \"YS1\",\n" + 
			"   \"name\": \"NAMC YS-11\",\n" + 
			"   \"turboProp\": true,\n" + 
			"   \"jet\": false,\n" + 
			"   \"widebody\": false,\n" + 
			"   \"regional\": false\n" + 
			"  }\n" + 
			" ]\n" + 
			"}";
	
	private static String airline_json = "{\n" + 
			"  \"0A\": \"Amber Air\",\n" + 
			"  \"0B\": \"Blue Air\",\n" + 
			"  \"0D\": \"Darwin Airline\",\n" + 
			"  \"2B\": \"Aerocondor\",\n" + 
			"  \"2C\": \"SNCF\",\n" + 
			"  \"2E\": \"Smokey Bay Air\",\n" + 
			"  \"2I\": \"Star Peru\",\n" + 
			"  \"2J\": \"Air Burkina\",\n" + 
			"  \"2K\": \"Aerolineas Galapagos\",\n" + 
			"  \"2L\": \"Helvetic Airways\",\n" + 
			"  \"2M\": \"Moldavian Airlines\",\n" + 
			"  \"2N\": \"Nextjet\",\n" + 
			"  \"2O\": \"Island Air Service\",\n" + 
			"  \"2P\": \"Air Philippines\",\n" + 
			"  \"2Q\": \"Avitrans Nordic\",\n" + 
			"  \"2U\": \"Sun dOr International Air\",\n" + 
			"  \"2W\": \"Welcome Air\",\n" + 
			"  \"2Y\": \"Air Andaman\",\n" + 
			"  \"2Z\": \"TTA\",\n" + 
			"  \"3B\": \"Job Air\",\n" + 
			"  \"3C\": \"Regionsair\",\n" + 
			"  \"3E\": \"Multi-Aero, Inc. d/b/a Air Choice One\",\n" + 
			"  \"3F\": \"Pacific Airways Inc\",\n" + 
			"  \"3H\": \"Air Inuit\",\n" + 
			"  \"3I\": \"Aerolineas Del Sur\",\n" + 
			"  \"3K\": \"Jetstar Asia\",\n" + 
			"  \"3L\": \"Intersky Luftfahrt\",\n" + 
			"  \"3M\": \"Gulfstream\",\n" + 
			"  \"3O\": \"Air Arabia Maroc\",\n" + 
			"  \"3P\": \"Tiara Air Aruba\",\n" + 
			"  \"3R\": \"Gromov Airline\",\n" + 
			"  \"3S\": \"Air Antilles Express\",\n" + 
			"  \"3T\": \"Turan Air\",\n" + 
			"  \"3U\": \"Sichuan Airlines\",\n" + 
			"  \"3W\": \"EuroManx\",\n" + 
			"  \"3Y\": \"Kartika Airlines\",\n" + 
			"  \"3Z\": \"Everts Air\",\n" + 
			"  \"4C\": \"Aires\",\n" + 
			"  \"4D\": \"Air Sinai\",\n" + 
			"  \"4E\": \"Tanana Air Service\",\n" + 
			"  \"4G\": \"Gazprom Avia\",\n" + 
			"  \"4H\": \"United Airways Bangladesh\",\n" + 
			"  \"4J\": \"Somon Air\",\n" + 
			"  \"4K\": \"Kenn Borek Air\",\n" + 
			"  \"4L\": \"Euroline\",\n" + 
			"  \"4M\": \"LAN Argentina\",\n" + 
			"  \"4N\": \"Air North\",\n" + 
			"  \"4O\": \"Interjet\",\n" + 
			"  \"4Q\": \"Safi Airways\",\n" + 
			"  \"4R\": \"Hamburg International\",\n" + 
			"  \"4T\": \"Belair Airlines\",\n" + 
			"  \"4U\": \"Germanwings\",\n" + 
			"  \"4V\": \"Lignes Aeriennes Congolaises\",\n" + 
			"  \"4W\": \"Warbelow\",\n" + 
			"  \"4Y\": \"Flight Alaska\",\n" + 
			"  \"5C\": \"NatureAir\",\n" + 
			"  \"5G\": \"Skyservice Airlines\",\n" + 
			"  \"5H\": \"Five Forty Aviation\",\n" + 
			"  \"5J\": \"Cebu Air\",\n" + 
			"  \"5L\": \"Aerosur\",\n" + 
			"  \"5M\": \"FlyMontserrat\",\n" + 
			"  \"5N\": \"Nordavia\",\n" + 
			"  \"5O\": \"Europe Airpost\",\n" + 
			"  \"5P\": \"Aerolinea Principal\",\n" + 
			"  \"5Q\": \"BQB Air\",\n" + 
			"  \"5R\": \"Karthago Airlines\",\n" + 
			"  \"5T\": \"Canadian North\",\n" + 
			"  \"5U\": \"Royal Belau Airways\",\n" + 
			"  \"5V\": \"Lviv Airlines\",\n" + 
			"  \"5W\": \"Astraeus\",\n" + 
			"  \"5Y\": \"Express Rail Link\",\n" + 
			"  \"5Z\": \"Bismillah Airlines\",\n" + 
			"  \"6A\": \"Aviacsa\",\n" + 
			"  \"6C\": \"Air Timor\",\n" + 
			"  \"6E\": \"IndiGo Air\",\n" + 
			"  \"6F\": \"MAT Airways\",\n" + 
			"  \"6G\": \"Gulfstream Connection\",\n" + 
			"  \"6H\": \"Israir Airlines\",\n" + 
			"  \"6I\": \"Fly 6ix\",\n" + 
			"  \"6J\": \"Jubba Airways\",\n" + 
			"  \"6K\": \"KyrgyzTransAvia\",\n" + 
			"  \"6L\": \"Aklak Air\",\n" + 
			"  \"6N\": \"Nordic Airways\",\n" + 
			"  \"6P\": \"Gryphon Airlines\",\n" + 
			"  \"6Q\": \"Cham Wings Airlines\",\n" + 
			"  \"6R\": \"Alrosa\",\n" + 
			"  \"6S\": \"Kato Airline\",\n" + 
			"  \"6T\": \"Air Mandalay Ltd\",\n" + 
			"  \"6V\": \"Mars RK\",\n" + 
			"  \"6W\": \"Saratov Air\",\n" + 
			"  \"6Y\": \"SMARTLYNX AIRLINES Ltd\",\n" + 
			"  \"6Z\": \"Euro-Asia Air\",\n" + 
			"  \"7C\": \"Jeju Airlines\",\n" + 
			"  \"7D\": \"Donbass Aero\",\n" + 
			"  \"7E\": \"Sylt Air Gmbh\",\n" + 
			"  \"7F\": \"First Air\",\n" + 
			"  \"7G\": \"Star Flyer\",\n" + 
			"  \"7H\": \"Era Aviation\",\n" + 
			"  \"7I\": \"Insel Air International\",\n" + 
			"  \"7J\": \"Tajik Air\",\n" + 
			"  \"7K\": \"Kogalym Avia\",\n" + 
			"  \"7L\": \"Aerocaribbean\",\n" + 
			"  \"7M\": \"Mayair, S.A. de C.V.\",\n" + 
			"  \"7N\": \"National Airways\",\n" + 
			"  \"7P\": \"Air Castilla\",\n" + 
			"  \"7R\": \"Rusline Air\",\n" + 
			"  \"7V\": \"Federal Airlines (Pty) Ltd\",\n" + 
			"  \"7W\": \"Wind Rose\",\n" + 
			"  \"7Z\": \"Halcyonair Cabo Verde Airways S.A.\",\n" + 
			"  \"8B\": \"Business Air Centre Co\",\n" + 
			"  \"8D\": \"Servant Air, Inc.\",\n" + 
			"  \"8E\": \"Bering Air\",\n" + 
			"  \"8F\": \"STP Airways\",\n" + 
			"  \"8G\": \"Girjet\",\n" + 
			"  \"8J\": \"Jet4You.Com\",\n" + 
			"  \"8L\": \"Lucky Air Co. Ltd.\",\n" + 
			"  \"8M\": \"Myanmar Airways\",\n" + 
			"  \"8N\": \"Barents Airlink\",\n" + 
			"  \"8O\": \"West Coast Air\",\n" + 
			"  \"8P\": \"Pacific Coastal Airlines\",\n" + 
			"  \"8Q\": \"Onur Air\",\n" + 
			"  \"8R\": \"TRIP Linhas Aereas S.A.\",\n" + 
			"  \"8T\": \"Air Tindi Ltd\",\n" + 
			"  \"8U\": \"Afriqiyah Airways\",\n" + 
			"  \"8V\": \"Wright Air Service\",\n" + 
			"  \"8W\": \"Private Wings\",\n" + 
			"  \"9B\": \"Accesrail\",\n" + 
			"  \"9C\": \"Spring Airlines\",\n" + 
			"  \"9D\": \"Toumai Air Tchad\",\n" + 
			"  \"9E\": \"Pinnacle Airlines\",\n" + 
			"  \"9F\": \"Eurostar\",\n" + 
			"  \"9G\": \"9G Rail Ltd\",\n" + 
			"  \"9H\": \"Dutch Antilles Express\",\n" + 
			"  \"9J\": \"Dana Airlines Ltd\",\n" + 
			"  \"9K\": \"Cape Air\",\n" + 
			"  \"9L\": \"Colgan Airlines\",\n" + 
			"  \"9M\": \"Central Mountain Air\",\n" + 
			"  \"9O\": \"National Airways Cameroon\",\n" + 
			"  \"9R\": \"Satena\",\n" + 
			"  \"9U\": \"Air Moldova\",\n" + 
			"  \"9V\": \"Avior Airlines\",\n" + 
			"  \"9W\": \"Jet Airways\",\n" + 
			"  \"9X\": \"New Axis Airways\",\n" + 
			"  \"9Y\": \"Air Kazakstan\",\n" + 
			"  \"A0\": \"L'Avion\",\n" + 
			"  \"A2\": \"Astra Airlines\",\n" + 
			"  \"A3\": \"Aegean Airlines\",\n" + 
			"  \"A4\": \"Aerocon\",\n" + 
			"  \"A5\": \"Airlinair\",\n" + 
			"  \"A6\": \"Air Alps Aviation\",\n" + 
			"  \"A7\": \"Air Comet\",\n" + 
			"  \"A8\": \"Benin Golf Air\",\n" + 
			"  \"A9\": \"Georgian Airways\",\n" + 
			"  \"AA\": \"American Airlines\",\n" + 
			"  \"AB\": \"Air Berlin\",\n" + 
			"  \"AC\": \"Air Canada\",\n" + 
			"  \"AD\": \"Azul Airlines\",\n" + 
			"  \"AE\": \"Mandarin Airlines\",\n" + 
			"  \"AF\": \"Air France\",\n" + 
			"  \"AH\": \"Air Algerie\",\n" + 
			"  \"AI\": \"Nacil Air India\",\n" + 
			"  \"AJ\": \"Aerocontractors\",\n" + 
			"  \"AK\": \"Airasia\",\n" + 
			"  \"AM\": \"Aeromexico\",\n" + 
			"  \"AO\": \"Avianova\",\n" + 
			"  \"AP\": \"Air One\",\n" + 
			"  \"AQ\": \"Aloha Airlines\",\n" + 
			"  \"AR\": \"Aerolineas Argentinas\",\n" + 
			"  \"AS\": \"Alaska Airlines\",\n" + 
			"  \"AT\": \"Royal Air Maroc\",\n" + 
			"  \"AU\": \"Austral Lineas Aereas\",\n" + 
			"  \"AV\": \"Avianca\",\n" + 
			"  \"AW\": \"Africa World Airlines Limited\",\n" + 
			"  \"AX\": \"American Connection\",\n" + 
			"  \"AY\": \"Finnair\",\n" + 
			"  \"AZ\": \"Alitalia\",\n" + 
			"  \"B2\": \"Belavia\",\n" + 
			"  \"B3\": \"Bellview Airlines\",\n" + 
			"  \"B5\": \"East African Safari Air\",\n" + 
			"  \"B6\": \"JetBlue\",\n" + 
			"  \"B7\": \"Uni Air\",\n" + 
			"  \"B8\": \"Eritrean Airlines\",\n" + 
			"  \"B9\": \"Iran Air Tours\",\n" + 
			"  \"BA\": \"British Airways\",\n" + 
			"  \"BB\": \"Seaborne Airlines\",\n" + 
			"  \"BC\": \"Skymark Airlines\",\n" + 
			"  \"BD\": \"BMI\",\n" + 
			"  \"BE\": \"Flybe\",\n" + 
			"  \"BF\": \"Vincent Aviation\",\n" + 
			"  \"BG\": \"Biman Airlines\",\n" + 
			"  \"BH\": \"Hawkair\",\n" + 
			"  \"BI\": \"Royal Brunei\",\n" + 
			"  \"BJ\": \"Nouvelair\",\n" + 
			"  \"BK\": \"Okay Airways\",\n" + 
			"  \"BL\": \"Pacific Airlines\",\n" + 
			"  \"BN\": \"Bahrain Air\",\n" + 
			"  \"BP\": \"Air Botswana\",\n" + 
			"  \"BR\": \"Eva Air\",\n" + 
			"  \"BS\": \"British International\",\n" + 
			"  \"BT\": \"Air Baltic\",\n" + 
			"  \"BU\": \"SAS Norway\",\n" + 
			"  \"BV\": \"Blue Panorama Air\",\n" + 
			"  \"BW\": \"Caribbean Airlines\",\n" + 
			"  \"BX\": \"Coast Air\",\n" + 
			"  \"C3\": \"ICAR Airlines\",\n" + 
			"  \"C4\": \"Alma De Mexico\",\n" + 
			"  \"C5\": \"CommutAir\",\n" + 
			"  \"C7\": \"Rico Linhas Aereas\",\n" + 
			"  \"C8\": \"CRONOSAIR\",\n" + 
			"  \"C9\": \"Cirrus Airlines\",\n" + 
			"  \"CA\": \"Air China\",\n" + 
			"  \"CB\": \"Scotairways\",\n" + 
			"  \"CC\": \"Macair Airlines\",\n" + 
			"  \"CE\": \"Nationwide Air\",\n" + 
			"  \"CF\": \"City Airline\",\n" + 
			"  \"CG\": \"Airlines PNG\",\n" + 
			"  \"CH\": \"Bemidji Airlines\",\n" + 
			"  \"CI\": \"China Airlines\",\n" + 
			"  \"CJ\": \"China Northern Airlines\",\n" + 
			"  \"CL\": \"Lufthansa CityLine\",\n" + 
			"  \"CM\": \"Copa Airlines\",\n" + 
			"  \"CN\": \"Islands Nationair\",\n" + 
			"  \"CO\": \"Continental Airlines\",\n" + 
			"  \"CQ\": \"Sunshine Express Airlines\",\n" + 
			"  \"CT\": \"Civil Air Transport\",\n" + 
			"  \"CU\": \"Cubana\",\n" + 
			"  \"CW\": \"Air Marshall Islands\",\n" + 
			"  \"CX\": \"Cathay Pacific\",\n" + 
			"  \"CY\": \"Cyprus Airways\",\n" + 
			"  \"CZ\": \"China Southern Airlines\",\n" + 
			"  \"D2\": \"Severstal Air\",\n" + 
			"  \"D3\": \"Daallo Airlines\",\n" + 
			"  \"D4\": \"Alidaunia\",\n" + 
			"  \"D6\": \"Inter Air\",\n" + 
			"  \"D7\": \"Airasia X\",\n" + 
			"  \"D9\": \"Aeroflot-Don\",\n" + 
			"  \"DB\": \"Brit Air\",\n" + 
			"  \"DC\": \"Golden Air\",\n" + 
			"  \"DD\": \"Nok Air\",\n" + 
			"  \"DE\": \"Condor\",\n" + 
			"  \"DG\": \"South East Asian Airlines\",\n" + 
			"  \"DH\": \"Asia Sahand Airlines\",\n" + 
			"  \"DI\": \"DBA\",\n" + 
			"  \"DJ\": \"Virgin Blue\",\n" + 
			"  \"DL\": \"Delta Air Lines\",\n" + 
			"  \"DN\": \"Air Deccan\",\n" + 
			"  \"DO\": \"Air Vallee\",\n" + 
			"  \"DR\": \"Air Link\",\n" + 
			"  \"DT\": \"Taag\",\n" + 
			"  \"DU\": \"Hemus Air\",\n" + 
			"  \"DV\": \"Jsc Aircompany Scat\",\n" + 
			"  \"DX\": \"Danish Air Transport\",\n" + 
			"  \"DY\": \"Norwegian Air\",\n" + 
			"  \"DZ\": \"Djibouti Air\",\n" + 
			"  \"E0\": \"Eos Airlines\",\n" + 
			"  \"E3\": \"Domodedovo Airlines\",\n" + 
			"  \"E4\": \"Eastok Avia\",\n" + 
			"  \"E5\": \"Samara Airlines\",\n" + 
			"  \"E8\": \"JSC Semeyavia\",\n" + 
			"  \"EA\": \"European Air Express\",\n" + 
			"  \"EC\": \"Avialeasing\",\n" + 
			"  \"EE\": \"Aero Airlines\",\n" + 
			"  \"EF\": \"Far Eastern Air\",\n" + 
			"  \"EG\": \"Japan Asia Airways\",\n" + 
			"  \"EI\": \"Aer Lingus\",\n" + 
			"  \"EJ\": \"New England Airlines\",\n" + 
			"  \"EK\": \"Emirates\",\n" + 
			"  \"EL\": \"Air Nippon\",\n" + 
			"  \"EN\": \"Air Dolomiti\",\n" + 
			"  \"EO\": \"Hewa Bora Airways\",\n" + 
			"  \"EP\": \"Iran Aseman Airlines\",\n" + 
			"  \"EQ\": \"TAME Linea Aerea del Ecuador\",\n" + 
			"  \"ET\": \"Ethiopian Airlines\",\n" + 
			"  \"EU\": \"Chengdu Airlines\",\n" + 
			"  \"EW\": \"Eurowings\",\n" + 
			"  \"EY\": \"Etihad Airways\",\n" + 
			"  \"EZ\": \"Sun Air Of Scandinavia\",\n" + 
			"  \"F2\": \"SafariLink\",\n" + 
			"  \"F5\": \"Fly540 S.A\",\n" + 
			"  \"F7\": \"Flybaboo\",\n" + 
			"  \"F9\": \"Frontier Airlines\",\n" + 
			"  \"FB\": \"Bulgaria Air\",\n" + 
			"  \"FC\": \"Finncomm Airlines\",\n" + 
			"  \"FD\": \"Thai Airasia\",\n" + 
			"  \"FE\": \"Far Eastern Air Transport\",\n" + 
			"  \"FG\": \"Ariana Afghan Airlines\",\n" + 
			"  \"FI\": \"Icelandair\",\n" + 
			"  \"FJ\": \"Air Pacific\",\n" + 
			"  \"FL\": \"Airtran Airways\",\n" + 
			"  \"FM\": \"Shanghai Airlines\",\n" + 
			"  \"FN\": \"Regional Air Lines\",\n" + 
			"  \"FO\": \"Felix Airways\",\n" + 
			"  \"FP\": \"Freedom Air\",\n" + 
			"  \"FQ\": \"Brindabella Airlines\",\n" + 
			"  \"FR\": \"Ryanair\",\n" + 
			"  \"FS\": \"ItAli Airlines\",\n" + 
			"  \"FT\": \"Siem Reap Airways Intl\",\n" + 
			"  \"FV\": \"GTK Rossia\",\n" + 
			"  \"FW\": \"IBEX Airlines\",\n" + 
			"  \"FY\": \"Firefly\",\n" + 
			"  \"FZ\": \"Flydubai\",\n" + 
			"  \"G0\": \"Ghana Intl Airlines\",\n" + 
			"  \"G3\": \"Gol Transportes Aereos\",\n" + 
			"  \"G4\": \"Allegiant Air LLC\",\n" + 
			"  \"G8\": \"Go Air\",\n" + 
			"  \"G9\": \"Air Arabia\",\n" + 
			"  \"GA\": \"Garuda Indonesia\",\n" + 
			"  \"GE\": \"Transasia Airways\",\n" + 
			"  \"GF\": \"Gulf Air\",\n" + 
			"  \"GI\": \"Itek Air\",\n" + 
			"  \"GJ\": \"Eurofly\",\n" + 
			"  \"GL\": \"Air Greenland\",\n" + 
			"  \"GQ\": \"Big Sky Airlines\",\n" + 
			"  \"GR\": \"Aurigny Air\",\n" + 
			"  \"GS\": \"TianJin Airlines\",\n" + 
			"  \"GT\": \"GB Airways\",\n" + 
			"  \"GU\": \"Aviateca\",\n" + 
			"  \"GV\": \"Grant Aviation, Inc.\",\n" + 
			"  \"GW\": \"Kuban Airlines\",\n" + 
			"  \"GY\": \"Gabon Airlines\",\n" + 
			"  \"GZ\": \"Air Rarotonga\",\n" + 
			"  \"H2\": \"Sky Airline\",\n" + 
			"  \"H3\": \"Harbour Air\",\n" + 
			"  \"H4\": \"Heli Securite\",\n" + 
			"  \"H7\": \"Eagle Air\",\n" + 
			"  \"H8\": \"Dalavia\",\n" + 
			"  \"H9\": \"Pegasus Airlines\",\n" + 
			"  \"HA\": \"Hawaiian Airlines\",\n" + 
			"  \"HB\": \"Homer Air\",\n" + 
			"  \"HD\": \"Hokkaido International Airlines\",\n" + 
			"  \"HE\": \"LGW\",\n" + 
			"  \"HF\": \"Hapagfly\",\n" + 
			"  \"HG\": \"Niki\",\n" + 
			"  \"HH\": \"Taban Air\",\n" + 
			"  \"HI\": \"Papillon Airways\",\n" + 
			"  \"HM\": \"Air Seychelles\",\n" + 
			"  \"HO\": \"Juneyao Airlines\",\n" + 
			"  \"HR\": \"Hahn Air\",\n" + 
			"  \"HS\": \"Svenska Air\",\n" + 
			"  \"HT\": \"Aeromist-Kharkov\",\n" + 
			"  \"HU\": \"Hainan Airlines\",\n" + 
			"  \"HV\": \"Transavia.com\",\n" + 
			"  \"HW\": \"North-Wright Airways Ltd.\",\n" + 
			"  \"HX\": \"Hong Kong Airlines\",\n" + 
			"  \"HY\": \"Uzbekistan Airways\",\n" + 
			"  \"HZ\": \"SAT Airlines\",\n" + 
			"  \"I2\": \"Munich Airlines\",\n" + 
			"  \"I3\": \"ATA Airlines\",\n" + 
			"  \"I4\": \"International AirLink\",\n" + 
			"  \"I5\": \"Compagnie Aerienne Mali\",\n" + 
			"  \"I7\": \"Paramount Airways\",\n" + 
			"  \"I8\": \"Izhavia\",\n" + 
			"  \"I9\": \"Air Italy\",\n" + 
			"  \"IA\": \"Iraqi Airways\",\n" + 
			"  \"IB\": \"Iberia\",\n" + 
			"  \"IC\": \"Nacil Indian Airline\",\n" + 
			"  \"IE\": \"Solomon Airlines\",\n" + 
			"  \"IF\": \"Islas Airways\",\n" + 
			"  \"IG\": \"Meridiana\",\n" + 
			"  \"IH\": \"Falcon Air\",\n" + 
			"  \"IK\": \"Imair Airline\",\n" + 
			"  \"IN\": \"Macedonian Airlines\",\n" + 
			"  \"IP\": \"Atyrau Aue Joly\",\n" + 
			"  \"IQ\": \"Augsburg Airways\",\n" + 
			"  \"IR\": \"Iran Air\",\n" + 
			"  \"IS\": \"Island Airlines, Inc.\",\n" + 
			"  \"IT\": \"Kingfisher Airlines\",\n" + 
			"  \"IV\": \"Wind Jet\",\n" + 
			"  \"IX\": \"Air India Express\",\n" + 
			"  \"IY\": \"Yemenia Airways\",\n" + 
			"  \"IZ\": \"Arkia\",\n" + 
			"  \"J0\": \"Jetlink Express\",\n" + 
			"  \"J2\": \"Azerbaijan Airlines\",\n" + 
			"  \"J3\": \"Northwestern Air\",\n" + 
			"  \"J4\": \"Jet For You\",\n" + 
			"  \"J5\": \"Alaska Seaplane Service L.L.C.\",\n" + 
			"  \"J6\": \"Avcom\",\n" + 
			"  \"J7\": \"Centre-Avia Airlines\",\n" + 
			"  \"J8\": \"Berjaya Air\",\n" + 
			"  \"J9\": \"Jazeera Airways\",\n" + 
			"  \"JA\": \"B&H Airlines\",\n" + 
			"  \"JB\": \"Helijet International\",\n" + 
			"  \"JD\": \"Beijing Capital Airlines\",\n" + 
			"  \"JE\": \"Mango\",\n" + 
			"  \"JH\": \"Fuji Dream Airlines\",\n" + 
			"  \"JJ\": \"Tam Linhas Aereas\",\n" + 
			"  \"JK\": \"Spanair\",\n" + 
			"  \"JL\": \"Japan Airlines\",\n" + 
			"  \"JM\": \"Air Jamaica\",\n" + 
			"  \"JN\": \"Avia-Jaynar\",\n" + 
			"  \"JO\": \"Jalways\",\n" + 
			"  \"JP\": \"Adria Airways\",\n" + 
			"  \"JQ\": \"Jetstar\",\n" + 
			"  \"JR\": \"Joy Air\",\n" + 
			"  \"JS\": \"Air Koryo\",\n" + 
			"  \"JT\": \"Lion Air\",\n" + 
			"  \"JU\": \"Jat Airways\",\n" + 
			"  \"JV\": \"Bearskin Airlines\",\n" + 
			"  \"JX\": \"Nice Helicopteres\",\n" + 
			"  \"JY\": \"Air Turks \",\n" + 
			"  \"JZ\": \"Skyways Ab\",\n" + 
			"  \"K2\": \"Eurolot\",\n" + 
			"  \"K3\": \"Taquan Air Services\",\n" + 
			"  \"K5\": \"Wings Of Alaska SeaPort Airline\",\n" + 
			"  \"K6\": \"Bravo Air Congo\",\n" + 
			"  \"K7\": \"Air KBZ\",\n" + 
			"  \"K8\": \"Zambia Skyways\",\n" + 
			"  \"K9\": \"TonleSap Airlines\",\n" + 
			"  \"KA\": \"Dragonair\",\n" + 
			"  \"KB\": \"Druk Air\",\n" + 
			"  \"KC\": \"Air Astana\",\n" + 
			"  \"KD\": \"KD Avia\",\n" + 
			"  \"KE\": \"Korean Air\",\n" + 
			"  \"KF\": \"Blue1\",\n" + 
			"  \"KG\": \"Aerogaviota\",\n" + 
			"  \"KH\": \"Kyrgyz Air\",\n" + 
			"  \"KI\": \"Kuban Airlines\",\n" + 
			"  \"KJ\": \"BMED\",\n" + 
			"  \"KK\": \"Atlasjet Airlines\",\n" + 
			"  \"KL\": \"KLM\",\n" + 
			"  \"KM\": \"Air Malta\",\n" + 
			"  \"KN\": \"China United Airlines\",\n" + 
			"  \"KO\": \"KHors\",\n" + 
			"  \"KQ\": \"Kenya Airways\",\n" + 
			"  \"KR\": \"Comores Aviation\",\n" + 
			"  \"KS\": \"Penair\",\n" + 
			"  \"KT\": \"Katmai Air LLC\",\n" + 
			"  \"KU\": \"Kuwait Airways\",\n" + 
			"  \"KV\": \"Kavminvody Avia\",\n" + 
			"  \"KW\": \"Wataniya Airways\",\n" + 
			"  \"KX\": \"Cayman Airways\",\n" + 
			"  \"KY\": \"Kunming Airlines\",\n" + 
			"  \"L3\": \"LTU\",\n" + 
			"  \"L5\": \"Lufttransport As\",\n" + 
			"  \"L6\": \"Tbilaviamsheni\",\n" + 
			"  \"L9\": \"Belle Air Europe\",\n" + 
			"  \"LA\": \"Lan Airlines\",\n" + 
			"  \"LF\": \"Flynordic\",\n" + 
			"  \"LG\": \"Luxair\",\n" + 
			"  \"LH\": \"Lufthansa\",\n" + 
			"  \"LI\": \"Liat\",\n" + 
			"  \"LJ\": \"Jin Air\",\n" + 
			"  \"LM\": \"Livingston\",\n" + 
			"  \"LN\": \"Libyan Airlines\",\n" + 
			"  \"LO\": \"LOT Polish Airlines\",\n" + 
			"  \"LP\": \"LAN Peru\",\n" + 
			"  \"LR\": \"Lacsa\",\n" + 
			"  \"LS\": \"Jet2.com\",\n" + 
			"  \"LT\": \"LTU\",\n" + 
			"  \"LV\": \"Albanian Airlines\",\n" + 
			"  \"LW\": \"Pacific Wings\",\n" + 
			"  \"LX\": \"Swiss\",\n" + 
			"  \"LY\": \"El Al\",\n" + 
			"  \"LZ\": \"Belle Air\",\n" + 
			"  \"M2\": \"AIR MANAS\",\n" + 
			"  \"M3\": \"North Flying As\",\n" + 
			"  \"M5\": \"Kenmore Air\",\n" + 
			"  \"M6\": \"Meta Linhas Aereas\",\n" + 
			"  \"M7\": \"MAS AIR\",\n" + 
			"  \"M9\": \"Motor-Sich JSC\",\n" + 
			"  \"MA\": \"Malev\",\n" + 
			"  \"MD\": \"Air Madagascar\",\n" + 
			"  \"ME\": \"Middle East Airlines\",\n" + 
			"  \"MF\": \"Xiamen Airlines\",\n" + 
			"  \"MH\": \"Malaysia Airlines\",\n" + 
			"  \"MI\": \"Silkair\",\n" + 
			"  \"MJ\": \"Mihin Lanka\",\n" + 
			"  \"MK\": \"Air Mauritius\",\n" + 
			"  \"ML\": \"Air Mediterranee\",\n" + 
			"  \"MM\": \"Soc Aero De Medellin\",\n" + 
			"  \"MN\": \"Comair\",\n" + 
			"  \"MO\": \"Calm Air International\",\n" + 
			"  \"MP\": \"Martinair\",\n" + 
			"  \"MS\": \"Egyptair\",\n" + 
			"  \"MU\": \"China Eastern Airlines\",\n" + 
			"  \"MW\": \"Maya Island Air\",\n" + 
			"  \"MX\": \"Mexicana\",\n" + 
			"  \"MY\": \"Maxjet Airways\",\n" + 
			"  \"MZ\": \"Saereo S.A\",\n" + 
			"  \"N2\": \"Dagestan Airlines\",\n" + 
			"  \"N3\": \"Omskavia\",\n" + 
			"  \"N4\": \"Trans Air Benin\",\n" + 
			"  \"N5\": \"Norfolk Air\",\n" + 
			"  \"N6\": \"Alpine Air Private Ltd.\",\n" + 
			"  \"N7\": \"Lagun Air\",\n" + 
			"  \"N9\": \"Kabo Air\",\n" + 
			"  \"NA\": \"North American Airlines\",\n" + 
			"  \"NC\": \"National Jet Systems\",\n" + 
			"  \"ND\": \"Sky Wings Airlines\",\n" + 
			"  \"NF\": \"Air Vanuatu\",\n" + 
			"  \"NG\": \"Lauda Air\",\n" + 
			"  \"NH\": \"All Nippon Airways\",\n" + 
			"  \"NI\": \"PGA-Portug_lia Airlines\",\n" + 
			"  \"NK\": \"Spirit Airlines\",\n" + 
			"  \"NL\": \"Shaheen Air International\",\n" + 
			"  \"NM\": \"Manx2\",\n" + 
			"  \"NN\": \"VIM Airlines\",\n" + 
			"  \"NQ\": \"Air Japan\",\n" + 
			"  \"NR\": \"Max Air\",\n" + 
			"  \"NS\": \"Hebei Airlines\",\n" + 
			"  \"NT\": \"Binter Canarias\",\n" + 
			"  \"NU\": \"Japan Transocean Air\",\n" + 
			"  \"NW\": \"Northwest Airlines\",\n" + 
			"  \"NX\": \"Air Macau\",\n" + 
			"  \"NY\": \"Air Iceland\",\n" + 
			"  \"NZ\": \"Air New Zealand\",\n" + 
			"  \"O2\": \"Oceanic Airlines\",\n" + 
			"  \"O4\": \"Antrak Air\",\n" + 
			"  \"O6\": \"OceanAir\",\n" + 
			"  \"O7\": \"Ozjet\",\n" + 
			"  \"OA\": \"Olympic Airlines\",\n" + 
			"  \"OB\": \"Boliviana de Aviacion - BoA\",\n" + 
			"  \"OC\": \"Oriental Air Bridge Co., Ltd. (ORC)\",\n" + 
			"  \"OF\": \"Air Finland\",\n" + 
			"  \"OG\": \"One Two Go Airlines\",\n" + 
			"  \"OK\": \"Czech Airlines\",\n" + 
			"  \"OL\": \"Olt Ostfriesische Lufttr\",\n" + 
			"  \"OM\": \"Miat Mongolian Airlines\",\n" + 
			"  \"ON\": \"Our Airline\",\n" + 
			"  \"OP\": \"Chalk Ocean Airways\",\n" + 
			"  \"OR\": \"Arkefly\",\n" + 
			"  \"OS\": \"Austrian\",\n" + 
			"  \"OT\": \"Aeropelican Air Services\",\n" + 
			"  \"OU\": \"Croatia Airlines\",\n" + 
			"  \"OV\": \"Estonian Air\",\n" + 
			"  \"OX\": \"Orient Thai Airlines\",\n" + 
			"  \"OY\": \"Andes Lineas Aereas\",\n" + 
			"  \"OZ\": \"Asiana Airlines\",\n" + 
			"  \"P0\": \"Proflight Commuter Services\",\n" + 
			"  \"P2\": \"AirKenya Express\",\n" + 
			"  \"P3\": \"Passaredo\",\n" + 
			"  \"P4\": \"Aero Lineas Sosa\",\n" + 
			"  \"P5\": \"Aerorepublica\",\n" + 
			"  \"P6\": \"Pascan Aviation Inc.\",\n" + 
			"  \"P8\": \"Pantanal Linhas Aereas\",\n" + 
			"  \"P9\": \"Perm Airlines\",\n" + 
			"  \"PB\": \"Provincial Airlines\",\n" + 
			"  \"PC\": \"Air Fiji\",\n" + 
			"  \"PD\": \"Porter Airlines Inc.\",\n" + 
			"  \"PE\": \"Peoples Vienna Line\",\n" + 
			"  \"PG\": \"Bangkok Airways\",\n" + 
			"  \"PJ\": \"Air Saint Pierre\",\n" + 
			"  \"PK\": \"Pakistan International Airlines\",\n" + 
			"  \"PL\": \"Southern Air Charter\",\n" + 
			"  \"PM\": \"Pamir Airways\",\n" + 
			"  \"PN\": \"China West Air\",\n" + 
			"  \"PR\": \"Philippine Airlines\",\n" + 
			"  \"PS\": \"Ukraine Intl Airlines\",\n" + 
			"  \"PU\": \"Pluna\",\n" + 
			"  \"PV\": \"Saint Barth Commuter\",\n" + 
			"  \"PW\": \"Precision Air\",\n" + 
			"  \"PX\": \"Air Niugini\",\n" + 
			"  \"PY\": \"Surinam Airways\",\n" + 
			"  \"PZ\": \"Tam Mercosur\",\n" + 
			"  \"Q2\": \"Maldivian\",\n" + 
			"  \"Q3\": \"Anguilla Air Services\",\n" + 
			"  \"Q4\": \"Starlink Aviation\",\n" + 
			"  \"Q5\": \"40 Mile Air\",\n" + 
			"  \"Q6\": \"Skytrans\",\n" + 
			"  \"Q7\": \"SkyBahamas\",\n" + 
			"  \"Q8\": \"Trans Air Congo\",\n" + 
			"  \"QB\": \"Georgian National Air\",\n" + 
			"  \"QC\": \"Air Corridor\",\n" + 
			"  \"QF\": \"Qantas Airways\",\n" + 
			"  \"QG\": \"Global Aviation\",\n" + 
			"  \"QH\": \"Kyrgyzstan Air\",\n" + 
			"  \"QI\": \"Cimber Air\",\n" + 
			"  \"QK\": \"Air Canada Jazz\",\n" + 
			"  \"QL\": \"LASER Airlines\",\n" + 
			"  \"QM\": \"Air Malawi\",\n" + 
			"  \"QP\": \"Airkenya Aviation\",\n" + 
			"  \"QR\": \"Qatar Airways\",\n" + 
			"  \"QS\": \"Smart Wings\",\n" + 
			"  \"QU\": \"East African Airlines\",\n" + 
			"  \"QV\": \"Lao Airlines\",\n" + 
			"  \"QW\": \"Blue Wings\",\n" + 
			"  \"QX\": \"Horizon Air\",\n" + 
			"  \"QZ\": \"PT Indonesia Airasia\",\n" + 
			"  \"R2\": \"Orenair\",\n" + 
			"  \"R3\": \"Yakutia Air\",\n" + 
			"  \"R4\": \"STC Russia\",\n" + 
			"  \"R6\": \"Danu Oro Transportas\",\n" + 
			"  \"R7\": \"Aserca\",\n" + 
			"  \"RA\": \"Royal Nepal Airlines\",\n" + 
			"  \"RB\": \"Syrian Arab Airlines\",\n" + 
			"  \"RC\": \"Atlantic Airways\",\n" + 
			"  \"RE\": \"Aer Arann\",\n" + 
			"  \"RG\": \"VRG Linhas Aereas Sa\",\n" + 
			"  \"RH\": \"Robin Hood Aviation\",\n" + 
			"  \"RI\": \"Mandala Airlines\",\n" + 
			"  \"RJ\": \"Royal Jordanian\",\n" + 
			"  \"RK\": \"REGION-AVIA\",\n" + 
			"  \"RL\": \"Royal Falcon\",\n" + 
			"  \"RO\": \"Tarom\",\n" + 
			"  \"RQ\": \"Kam Air\",\n" + 
			"  \"RT\": \"Rak Airways\",\n" + 
			"  \"RU\": \"TCI Skyking Ltd\",\n" + 
			"  \"RV\": \"Caspian Airlines\",\n" + 
			"  \"RX\": \"Regent Airways\",\n" + 
			"  \"RZ\": \"SANSA Airlines\",\n" + 
			"  \"S0\": \"Slok Air International\",\n" + 
			"  \"S2\": \"Jet Lite\",\n" + 
			"  \"S3\": \"Santa Barbara Airlines\",\n" + 
			"  \"S4\": \"SATA International\",\n" + 
			"  \"S5\": \"Shuttle America\",\n" + 
			"  \"S6\": \"Sun Air\",\n" + 
			"  \"S7\": \"S7\",\n" + 
			"  \"S9\": \"Starbow Airlines\",\n" + 
			"  \"SA\": \"South African Airways\",\n" + 
			"  \"SB\": \"Aircalin\",\n" + 
			"  \"SC\": \"Shandong Airlines Co., Ltd.\",\n" + 
			"  \"SD\": \"Sudan Airways\",\n" + 
			"  \"SE\": \"XL Airways France\",\n" + 
			"  \"SF\": \"Tassili Airlines\",\n" + 
			"  \"SG\": \"SpiceJet\",\n" + 
			"  \"SH\": \"Sharp Airlines\",\n" + 
			"  \"SI\": \"Blue Islands\",\n" + 
			"  \"SJ\": \"Sriwijaya Air\",\n" + 
			"  \"SK\": \"Scandinavian Airlines\",\n" + 
			"  \"SL\": \"Solenta Aviation\",\n" + 
			"  \"SM\": \"Spirit of Manila Airlines\",\n" + 
			"  \"SN\": \"Brussels Airlines\",\n" + 
			"  \"SO\": \"SALSA d\",\n" + 
			"  \"SP\": \"SATA Air Acores\",\n" + 
			"  \"SQ\": \"Singapore Airlines\",\n" + 
			"  \"SS\": \"Corsair\",\n" + 
			"  \"SU\": \"Aeroflot\",\n" + 
			"  \"SV\": \"Saudi Arabian Airlines\",\n" + 
			"  \"SW\": \"Air Namibia\",\n" + 
			"  \"SX\": \"Skybus Airlines\",\n" + 
			"  \"SY\": \"Sun Country\",\n" + 
			"  \"T3\": \"Eastern Airways\",\n" + 
			"  \"T4\": \"TRIP Linhas Aereas\",\n" + 
			"  \"T5\": \"Turkmenistan Airlines\",\n" + 
			"  \"T6\": \"Tavrey Aircompany\",\n" + 
			"  \"T7\": \"Twin Jet\",\n" + 
			"  \"TA\": \"Taca Intl Airlines\",\n" + 
			"  \"TC\": \"Air Tanzania\",\n" + 
			"  \"TD\": \"Atlantis European Airway\",\n" + 
			"  \"TE\": \"FlyLAL\",\n" + 
			"  \"TF\": \"Malmo Aviation\",\n" + 
			"  \"TG\": \"Thai Airways Intl\",\n" + 
			"  \"TJ\": \"Tradewind Aviation\",\n" + 
			"  \"TK\": \"Turkish Airlines\",\n" + 
			"  \"TL\": \"Airnorth Regional\",\n" + 
			"  \"TM\": \"Lam Mozambique\",\n" + 
			"  \"TN\": \"Air Tahiti Nui\",\n" + 
			"  \"TO\": \"Transavia.com France\",\n" + 
			"  \"TP\": \"TAP Portugal\",\n" + 
			"  \"TQ\": \"Tandem Aero\",\n" + 
			"  \"TR\": \"Tiger Airways\",\n" + 
			"  \"TS\": \"Air Transat\",\n" + 
			"  \"TT\": \"Tiger Airways Australia\",\n" + 
			"  \"TU\": \"Tunisair\",\n" + 
			"  \"TV\": \"Tibet Airlines\",\n" + 
			"  \"TW\": \"T\",\n" + 
			"  \"TX\": \"Air Caraibes\",\n" + 
			"  \"TY\": \"Air Caledonie\",\n" + 
			"  \"TZ\": \"ATA Airlines\",\n" + 
			"  \"U2\": \"EasyJet\",\n" + 
			"  \"U3\": \"Avies Air Company\",\n" + 
			"  \"U4\": \"PMT Air\",\n" + 
			"  \"U5\": \"USA 3000\",\n" + 
			"  \"U6\": \"Ural Airlines\",\n" + 
			"  \"U7\": \"Air Uganda\",\n" + 
			"  \"U8\": \"Armavia\",\n" + 
			"  \"U9\": \"Tatarstan Air\",\n" + 
			"  \"UA\": \"United Airlines\",\n" + 
			"  \"UB\": \"Myanma Airways\",\n" + 
			"  \"UD\": \"Hex Air\",\n" + 
			"  \"UE\": \"Nasair\",\n" + 
			"  \"UF\": \"UM Air\",\n" + 
			"  \"UG\": \"Sevenair\",\n" + 
			"  \"UH\": \"US Helicopter Corp\",\n" + 
			"  \"UJ\": \"Almasria Universal Airlines\",\n" + 
			"  \"UL\": \"Srilankan Airlines\",\n" + 
			"  \"UM\": \"Air Zimbabwe\",\n" + 
			"  \"UN\": \"Transaero\",\n" + 
			"  \"UO\": \"Hong Kong Express Airways\",\n" + 
			"  \"UP\": \"Bahamasair\",\n" + 
			"  \"UQ\": \"O Connor Airlines\",\n" + 
			"  \"UR\": \"UT Air\",\n" + 
			"  \"US\": \"US Airways\",\n" + 
			"  \"UT\": \"UT Air\",\n" + 
			"  \"UU\": \"Air Austral\",\n" + 
			"  \"UV\": \"Helicopteros Del Sureste\",\n" + 
			"  \"UX\": \"Air Europa\",\n" + 
			"  \"UY\": \"Cameroon Airlines\",\n" + 
			"  \"UZ\": \"Buraq Air\",\n" + 
			"  \"V0\": \"Conviasa\",\n" + 
			"  \"V2\": \"Vision Airlines\",\n" + 
			"  \"V3\": \"Carpatair\",\n" + 
			"  \"V4\": \"Vieques Air Link\",\n" + 
			"  \"V5\": \"Danube Wings\",\n" + 
			"  \"V6\": \"VIP S.A.\",\n" + 
			"  \"V7\": \"Air Senegal\",\n" + 
			"  \"V8\": \"Iliamna Air Taxi\",\n" + 
			"  \"VA\": \"V Australia\",\n" + 
			"  \"VB\": \"VivaAerobus\",\n" + 
			"  \"VC\": \"Strategic Airlines Pty Ltd\",\n" + 
			"  \"VE\": \"Avensa\",\n" + 
			"  \"VF\": \"Valuair\",\n" + 
			"  \"VG\": \"VLM Airlines\",\n" + 
			"  \"VH\": \"Aeropostal\",\n" + 
			"  \"VK\": \"Virgin Nigeria\",\n" + 
			"  \"VM\": \"Viaggio Air\",\n" + 
			"  \"VN\": \"Vietnam Airlines\",\n" + 
			"  \"VO\": \"Tyrolean Airways\",\n" + 
			"  \"VQ\": \"Viking Hellas Airlines\",\n" + 
			"  \"VR\": \"Tacv Cabo Verde Airlines\",\n" + 
			"  \"VS\": \"Virgin Atlantic\",\n" + 
			"  \"VT\": \"Air Tahiti\",\n" + 
			"  \"VU\": \"Air Ivoire\",\n" + 
			"  \"VV\": \"Aerosvit Airlines\",\n" + 
			"  \"VW\": \"Aeromar\",\n" + 
			"  \"VX\": \"Virgin America \",\n" + 
			"  \"VY\": \"Vueling Airlines\",\n" + 
			"  \"VZ\": \"Velvet Sky\",\n" + 
			"  \"W2\": \"Canadian Western Air\",\n" + 
			"  \"W3\": \"Arik Air\",\n" + 
			"  \"W4\": \"LC Busre\",\n" + 
			"  \"W5\": \"Mahan Airlines\",\n" + 
			"  \"W6\": \"Wizz Air\",\n" + 
			"  \"W7\": \"Sayakhat Airlines\",\n" + 
			"  \"W9\": \"Air Bagan\",\n" + 
			"  \"WA\": \"KLM Cityhopper\",\n" + 
			"  \"WB\": \"Rwandair Express\",\n" + 
			"  \"WC\": \"Islena Airlines\",\n" + 
			"  \"WF\": \"Wideroe\",\n" + 
			"  \"WH\": \"Webjet Linhas Aereas\",\n" + 
			"  \"WJ\": \"Air Labrador\",\n" + 
			"  \"WK\": \"Edelweiss Air\",\n" + 
			"  \"WL\": \"Aeroperlas\",\n" + 
			"  \"WM\": \"Windward Island Airways\",\n" + 
			"  \"WN\": \"Southwest Airlines\",\n" + 
			"  \"WP\": \"Island Air\",\n" + 
			"  \"WR\": \"JSC Aviaprad\",\n" + 
			"  \"WS\": \"Westjet\",\n" + 
			"  \"WT\": \"Wasaya Airways LP\",\n" + 
			"  \"WU\": \"Wizz Air Ukraine\",\n" + 
			"  \"WW\": \"bmibaby\",\n" + 
			"  \"WX\": \"Cityjet\",\n" + 
			"  \"WY\": \"Oman Air\",\n" + 
			"  \"X3\": \"TUIfly\",\n" + 
			"  \"X4\": \"Air Excursions, LLC\",\n" + 
			"  \"X7\": \"Air Service\",\n" + 
			"  \"X9\": \"City Star Airlines\",\n" + 
			"  \"XC\": \"KD Air\",\n" + 
			"  \"XE\": \"Expressjet Airlines\",\n" + 
			"  \"XF\": \"Vladivostok Air\",\n" + 
			"  \"XK\": \"CCM Airlines\",\n" + 
			"  \"XL\": \"LAN Ecuador\",\n" + 
			"  \"XM\": \"Alitalia Express\",\n" + 
			"  \"XP\": \"Xtra Airways\",\n" + 
			"  \"XQ\": \"Sun Express\",\n" + 
			"  \"XR\": \"Skywest Airlines\",\n" + 
			"  \"XU\": \"African Express Airways\",\n" + 
			"  \"XV\": \"BVI Airways\",\n" + 
			"  \"XW\": \"Sky Express\",\n" + 
			"  \"XY\": \"Al-Khayala\",\n" + 
			"  \"Y0\": \"Yellow Airtaxi\",\n" + 
			"  \"Y1\": \"Taymir\",\n" + 
			"  \"Y4\": \"Volaris\",\n" + 
			"  \"Y5\": \"Asia Wings\",\n" + 
			"  \"Y7\": \"NordStar\",\n" + 
			"  \"Y8\": \"Passaredo Linhas Aereas\",\n" + 
			"  \"Y9\": \"Kish Air\",\n" + 
			"  \"YC\": \"Yamal Air\",\n" + 
			"  \"YD\": \"Mauritania Airways\",\n" + 
			"  \"YG\": \"South Airlines\",\n" + 
			"  \"YI\": \"Air Sunshine\",\n" + 
			"  \"YK\": \"Cyprus Turkish Airlines\",\n" + 
			"  \"YL\": \"Yamal Airlines\",\n" + 
			"  \"YM\": \"Montenegro Airlines\",\n" + 
			"  \"YN\": \"Air Creebec (1994) Inc.\",\n" + 
			"  \"YO\": \"Heli Air Monaco\",\n" + 
			"  \"YQ\": \"Polet Airlines\",\n" + 
			"  \"YR\": \"Scenic Airlines\",\n" + 
			"  \"YS\": \"Regional\",\n" + 
			"  \"YT\": \"Yeti Airlines\",\n" + 
			"  \"YU\": \"Euroatlantic Airways\",\n" + 
			"  \"YV\": \"Mesa Airlines\",\n" + 
			"  \"YW\": \"Air Nostrum\",\n" + 
			"  \"YX\": \"Midwest Airlines\",\n" + 
			"  \"Z2\": \"Zestair\",\n" + 
			"  \"Z3\": \"PM Air LLC\",\n" + 
			"  \"Z4\": \"Puma Air\",\n" + 
			"  \"Z5\": \"GMG Airlines\",\n" + 
			"  \"Z6\": \"Dnieproavia\",\n" + 
			"  \"Z8\": \"Amaszonas\",\n" + 
			"  \"ZA\": \"Interavia Airlines\",\n" + 
			"  \"ZB\": \"Monarch Airlines\",\n" + 
			"  \"ZE\": \"Lineas Azteca\",\n" + 
			"  \"ZF\": \"Athens Airways\",\n" + 
			"  \"ZH\": \"Shenzhen Airlines\",\n" + 
			"  \"ZI\": \"Aigle Azur\",\n" + 
			"  \"ZJ\": \"Zambezi airlines\",\n" + 
			"  \"ZK\": \"Great Lakes Aviation\",\n" + 
			"  \"ZL\": \"Regional Express\",\n" + 
			"  \"ZN\": \"NAYSA\",\n" + 
			"  \"ZO\": \"Central Air Transport Services (CATS)\",\n" + 
			"  \"ZU\": \"Bashkortostan Air\",\n" + 
			"  \"ZV\": \"Zagros Airlines\",\n" + 
			"  \"ZY\": \"Sky Airlines\"\n" + 
			"}";
	
	private static String selAirline = "";
	private static String selEquipment = "";

	public static String getAirlineName(String code) {


		Gson gson = new GsonBuilder().create();

		selAirline = "";
		Map<String, Object> map = gson.fromJson(airline_json, new TypeToken<Map<String, Object>>(){}.getType());
		map.forEach((x,y)-> setAirline(code,x,y));
		
		//tools.console.println("Selected Airline :"+selAirline);
		return selAirline;
	}
	
	public static void setAirline(String code,String key,Object value) {
		
		if(code.equals(key)) {
			selAirline = value.toString();
		}
	}
	
	public static String getAirlineName(String code,String lang) {
		
		code = code.trim().replaceAll(" ", "");
		
		if(code.equals("TK")) {if(lang.equals("TR")) return "Türk Havayolları"; else return "Turkish Airlines";}
		else if(code.equals("AJ")) {if(lang.equals("TR")) return "AnadoluJet"; else return "AnadoluJet";}
		else if(code.equals("KK")) {if(lang.equals("TR")) return "AtlasGlobal"; else return "AtlasGlogbal";}
		else if(code.equals("LH")) {if(lang.equals("TR")) return "Lufthansa"; else return "Lufthansa";}
		else if(code.equals("AF")) {if(lang.equals("TR")) return "AirFrance"; else return "AirFrance";}
		else if(code.equals("BA")) {if(lang.equals("TR")) return "British Airways"; else return "British Airways";}
		else if(code.equals("PC")) {if(lang.equals("TR")) return "Pegasus"; else return "Pegasus";}
		else if(code.equals("EK")) {if(lang.equals("TR")) return "Emirates"; else return "Emirates";}
		else if(code.equals("FZ")) {if(lang.equals("TR")) return "FlyDubai"; else return "FlyDubai";}
		else if(code.equals("KL")) {if(lang.equals("TR")) return "KLM"; else return "KLM";}
		else if(code.equals("J2")) {if(lang.equals("TR")) return "Azerbaycan Havayolları"; else return "Azerbaijan Airlines";}
		else if(code.equals("GF")) {if(lang.equals("TR")) return "Gulf Air"; else return "Gulf Air";}
		else if(code.equals("SU")) {if(lang.equals("TR")) return "Aeroflot"; else return "Aeroflot";}
		//else {return code;}
		else {return getAirlineName(code);}
		
		
	}
	/*"   \"iata\": \"YS1\",\n" + 
	"   \"name\": \"NAMC YS-11\",\n" + 
	"   \"turboProp\": true,\n" + 
	"   \"jet\": false,\n" + 
	"   \"widebody\": false,\n" + 
	"   \"regional\": false\n" + */
	public static String getEquipName(String code) {
		 @SuppressWarnings("unused")
		class equip{
			 String iata;
			 String name;
			 String turboProp;
			 String jet;
			 String widebody;
			 String regional;
		}
		
		Gson gson = new GsonBuilder().create();
		try {
		equip[] list = gson.fromJson(equipment_json, equip[].class);
		if(list!=null) {
			for(int i=0;i<list.length;i++) {
				if(list[i].iata.equals(code))
					return list[i].name;
			}
		}
		return code;
		}catch(Exception ex) {
			return code;
		}
	}
	
	public static String getAirEquip(String code) {
		
		if(code.contains("380")) {return "Airbus A380";}
		else if(code.contains("330")) {return "Airbus A330";}
		else if(code.contains("321")) {return "Airbus A321";}
		else if(code.contains("320")) {return "Airbus A320";}
		else if(code.contains("319")) {return "Airbus A319";}
		else if(code.contains("310")) {return "Airbus A310";}
		
		else if(code.startsWith("33") || code.startsWith("A33")) {return "Airbus A330";}
		else if(code.startsWith("321") || code.startsWith("A321")) {return "Airbus A321";}
		else if(code.startsWith("320") || code.startsWith("A32")) {return "Airbus A320";}
		else if(code.startsWith("319") || code.startsWith("A319")) {return "Airbus A319";}
		
		else if(code.contains("787")) {return "Boeing 787";}
		else if(code.contains("777")) {return "Boeing 777";}
		else if(code.contains("767")) {return "Boeing 767";}
		else if(code.contains("757")) {return "Boeing 757";}
		else if(code.contains("747")) {return "Boeing 747";}
		else if(code.contains("737")) {return "Boeing 737";}
		
		else if(code.startsWith("78") || code.startsWith("B78")) {return "Boeing 787";}
		else if(code.startsWith("77") || code.startsWith("B77")) {return "Boeing 777";}
		else if(code.startsWith("76") || code.startsWith("B76")) {return "Boeing 767";}
		else if(code.startsWith("75") || code.startsWith("B75")) {return "Boeing 757";}
		else if(code.startsWith("74") || code.startsWith("B74")) {return "Boeing 747";}
		else if(code.startsWith("73") || code.startsWith("B73")) {return "Boeing 737";}
		
		else return getEquipName(code);
		
	}
}
