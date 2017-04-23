package tw.com.JsoupTest;




import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class SamepleCode {
 public static void main(String[] args) throws IOException {
  BufferedReader br = new BufferedReader(new FileReader("D:/SampleTest.html"));
  StringBuilder html = new StringBuilder();
  try {

   String line = br.readLine();
   while (line != null) {
    html.append(line);
    html.append(System.lineSeparator());
    line = br.readLine();
   }
  } finally {
   br.close();
  }
  Document doc = Jsoup.parse(html.toString());
  for (Element tds : doc.select("td")) {
   System.out.println(tds.text());
  }
 }
}
