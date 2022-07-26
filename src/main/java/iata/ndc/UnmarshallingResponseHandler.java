package iata.ndc;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;

class UnmarshallingResponseHandler<T> implements ResponseHandler<T> {

	@SuppressWarnings("unchecked")
	private T unmarshallRequest(InputStream response) {
		try {
			JAXBContext context = JAXBContext.newInstance("org.iata.ndc.schema");
			Unmarshaller unmarshaller = context.createUnmarshaller();
			return (T) unmarshaller.unmarshal(response);
		} catch (JAXBException e) {
			throw new ClientException(e);
		}
	}

	@Override
	public T handleResponse(HttpResponse response) throws ClientProtocolException, IOException {
		return unmarshallRequest(response.getEntity().getContent());
	}

}