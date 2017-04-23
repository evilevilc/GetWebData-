

//funtion 1 
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
 
import java.io.IOException;
import java.util.Iterator;



//funtion 2

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.util.EntityUtils;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.HttpClient;




public class Test {
	public static void main(String[] args ){
//		try{
			//funtion 1  use	Jsoup
			String url = "http://goodinfo.tw/StockInfo/StockDividendPolicy.asp?STOCK_ID=3022";
	        try {
	            Document doc = Jsoup.connect(url).get();
	            System.out.println(doc.title());
	            System.out.println(doc.text());
	            
	            Elements h1s = doc.select("span.titletext");
	 
	            Element thisOne = null;
	            for(Iterator it = h1s.iterator(); it.hasNext();)
	            {
	                thisOne = (Element)it.next();
	                System.out.println(thisOne.html());
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
			
			//funtion 2
//			FileWriter fw = new FileWriter("test.txt");
//			BufferedWriter bw = new BufferedWriter(fw);
//			
//			HttpClient httpClient = new DefaultHttpClient();
//			
//			HttpGet httpGet = new HttpGet("http://goodinfo.tw/StockInfo/StockDividendPolicy.asp?STOCK_ID=3022");
//			
//			HttpResponse response = httpClient.execute(httpGet);
//			
//			String str = EntityUtils.toString(response.getEntity());
//			if(response.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
//				System.out.println(str);
//				bw.write(str);
//			}else{
//				System.out.println(response.getStatusLine());
//			}
//				//close  connection
//			httpGet.releaseConnection();
//			bw.flush();
//			fw.close();
//			bw.close();
//		}catch(Exception e){
//			e.printStackTrace();
//		}
	}
}
