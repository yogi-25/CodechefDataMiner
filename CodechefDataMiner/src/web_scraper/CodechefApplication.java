package web_scraper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CodechefApplication {

	
	public static void main(String[] args) throws IOException {
		CodechefDataManager s = new CodechefDataManager();
		s.setUserid("yogi_misal123");
		System.out.println(s.getUserCurrentRating());
		System.out.print(s.getUserNames());
		
		List<String> solvedproblem = s.getSolvedProblems();
		for(String ele : solvedproblem)
		{
			System.out.println(ele);
		}
   
//		Document doc = Jsoup.connect("https://www.codechef.com/users/yogi_misal123").timeout(5000).get();
//	   // System.out.print(doc.html());	
//	    Elements ratingDiv = doc.select("div.rating-number");
//	    
//	    System.out.print(ratingDiv.html());	

	}

}
