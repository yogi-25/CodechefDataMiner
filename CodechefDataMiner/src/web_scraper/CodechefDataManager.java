package web_scraper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CodechefDataManager {
	private Document doc;
	private String userId;
	public void setUserid(String userId) throws IOException
	{
		this.userId = userId;
	    doc = Jsoup.connect("https://www.codechef.com/users/"+this.userId).timeout(5000).get();
	}
	public int getUserCurrentRating()
	{
		Elements ratingDiv=  doc.select("div.rating-number");
		return Integer.parseInt(ratingDiv.html());
		
	}
	
	public String getUserNames()
	{
		Elements getUsername = doc.select("div.user-profile-container header .h2-style");
		return getUsername.html();
		
	}
	public List<String> getSolvedProblems()
	{
		Element getsolvedproblem = doc.select("section.problems-solved article").get(1);
		Elements solvedproblem = doc.select("p").get(1).select("span a");
		List<String> result = new ArrayList<String>();
		for(Element ele :solvedproblem)
		{
			result.add(ele.html());
		}
		return result;
	}
	/*
	public int partialSolvedCount()
	{
		
	}
	public int fullySolvedCount()
	{
		
	}*/

}
