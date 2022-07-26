package iata.controller;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

import org.iata.ndc.schema.AirShoppingRQ;
import org.iata.ndc.schema.AirShoppingRS;
import org.iata.ndc.schema.SeatAvailabilityRQ;
import org.iata.ndc.schema.SeatAvailabilityRS;

import iata.objects.Product;
import iata.ndc.AirShoppingRQBuilder;
import iata.ndc.NdcClient;
import iata.ndc.SeatAvailabilityRQBuilder;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
    name = "ProductController",
    urlPatterns = {"/product"}
)
public class ProductController extends HttpServlet {

	  /**
	 * 
	 */
	private static final long serialVersionUID = 808918138855812900L;
	private static final String API_KEY = "nnpzytp6zbv7zj28wrnhrbvp";
		private static final String template = "Hello, %s!";
		private final AtomicLong counter = new AtomicLong();
	  
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {
      
	  

		iataTest();
		Product prd =  new Product(counter.incrementAndGet(), String.format(ProductController.template, "pisoco"));
		System.out.println("Success");
  }
  
  private void iataTest() {
	  
	
	  
		AirShoppingRQBuilder builder = new AirShoppingRQBuilder();
		builder.addTravelAgencySender("Test agency", "0000XXXX", "test agent");
		//builder.addOriginDestination("CDG", "LHR", new Date());
		builder.addAirlinePreference("ZZ");
		//SeatAvailabilityRQ request = builder.build();
		AirShoppingRQ request = builder.build();

		//NdcClient client = new NdcClient("http://iata.api.mashery.com/kronos/api",API_KEY);
		NdcClient client = new NdcClient("http://iata.api.mashery.com/Zeus/NDC",API_KEY);
		AirShoppingRS response = null;
		try {
			response = client.airShopping(request);
			System.out.println("iata call successfully");
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
  
  
}


