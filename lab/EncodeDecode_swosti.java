package lab;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class EncodeDecode_swosti {
    public static void main(String[] args) {
    	try {
    		String url = "This string has space";
    		String encodedUrl = URLEncoder.encode(url, "UTF-8");
    		System.out.println(encodedUrl); 
    		String decodedUrl = URLDecoder.decode(encodedUrl, "UTF-8");
    		System.out.println(decodedUrl); 
    		} catch (Exception e) {
    		e.printStackTrace();
    		}
    }
}
