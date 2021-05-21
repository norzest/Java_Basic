package java_20210521;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class CoinMarketCapCrawlingDemo {
	public static void main(String[] args) {
		Document doc = null;
		String url = "https://coinmarketcap.com/ko/currencies/bitcoin/historical-data/";
		
		try {
			doc = Jsoup.connect(url).get();
			System.out.println("test");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		Elements elements = doc.select(".tableWrapper___IExX8 table tbody");
		System.out.println(elements);
	}
}
