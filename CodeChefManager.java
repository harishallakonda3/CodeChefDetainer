package com.Projects;


import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CodeChefManager {

		
		private Document dom ;
		private String userId ;
		
		
		public void setuserId(String userId) throws Exception
		{
			this.userId = userId;
			
			dom = Jsoup.connect("https://www.codechef.com/users/" + this.userId).timeout(5000).get();
			
			
			if(dom.baseUri().equals("https://www.codechef.com/"))
				throw new Exception("Wrong userID");
		}
		
		
		public String getuserCurrentrating()
		{
			Elements ratingDiv = dom.select("div.rating-number");
			
			return ratingDiv.html();
			
		}
		public String getuserName()
		{
			
            Elements userName = dom.select("h1.h2-style");
			
			return userName.html();
		}
		
		public List<String> getProblemsolved()
		{
			Element ele = dom.select("section.problems-solved article").get(0);
			List<String> result = new ArrayList<>();
			Elements solvedproblems = ele.select("p").get(0).select("span a");
			for(Element e : solvedproblems)
				result.add(e.html());
			
			return result;
			
		}	
			
		
		
		public int fullySolvedcount()
		{ String fullysolve = dom.select("section.problems-solved h5").get(0).html();
			
		  
		return extractInteger(fullysolve);
		}

		public int partialSolvedcount()
		{ String partiallysolve = dom.select("section.problems-solved h5").get(1).html();
			
		  
		return extractInteger(partiallysolve);
		}	
	
	    public int extractInteger(String text)
	    {
	    	int res = 0 ;
	    	
	    	for(int i = 0 ; i<text.length();i++)
	    	{
	    		if(Character.isDigit(text.charAt(i)))
	    		{
	    			for(int j = i ; j< text.length() ; j++)
	    			{
	    				if(Character.isDigit(text.charAt(j)) == false)
	    					break;
	    				
	    				res = res*10+(text.charAt(j)-'0');
	    			}
	    			
	    			break;
	    		}
	    	}
	    	
	    	return res ;
	    }

}
