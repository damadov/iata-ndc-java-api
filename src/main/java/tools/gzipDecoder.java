package tools;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.zip.GZIPInputStream;

public class gzipDecoder {

	
	public static String decode(ByteArrayOutputStream out ,String encoding) throws UnsupportedEncodingException {
	
		String res = "";
		try{
			byte[] barr = out.toByteArray();
	        InputStream gzipStream = new GZIPInputStream(new ByteArrayInputStream(barr));
	        Reader decoder = new InputStreamReader(gzipStream, encoding);
	        BufferedReader buffered = new BufferedReader(decoder);
	        int n = 0;
	        char[] cbuf = new char[1024];
	        Writer w = new StringWriter();
	        while ((n = buffered.read(cbuf)) != -1) {
	            w.write(cbuf,0,n);
	        }
	        res = w.toString();
	        return res;
		}
		catch(Exception ex) {
			tools.console.println("Decoding Error:"+ex.getMessage());
			res = new String(out.toByteArray(), tools.appConfig.encoding);
			return res;
		}
		
	}
	
	public static String decode(BufferedReader buffered  ,String encoding) throws UnsupportedEncodingException {
		
		String res = "";
		try{
	        int n = 0;
	        char[] cbuf = new char[1024];
	        Writer w = new StringWriter();
	        while ((n = buffered.read(cbuf)) != -1) {
	            w.write(cbuf,0,n);
	        }
	        res = w.toString();
	        return res;
		}
		catch(Exception ex) {
			tools.console.println("Decoding Error:"+ex.getMessage());
			return "";
		}
		
	}
	
	
}
