package test;

import java.util.ArrayList;
import java.util.Arrays;

import com.google.gson.*;

import dataobjects.StrategyinvestResult;


public class TestGson {

	/*public static void main(String args[])
	{
		
		ArrayList<StrategyinvestResult> resultobj = getgson();
		  
		  Iterator<StrategyinvestResult> it = resultobj.iterator();
		  while(it.hasNext())
		  {
			  StrategyinvestResult st= (StrategyinvestResult) it.next();
			  System.out.println(st.toString());
			  
		  }
	}*/
	public  ArrayList<StrategyinvestResult> getgson()
	{
		
		String result ="[{\"ltp\":11.5,\"support\":9.83,\"diffpercent\":16.99,\"potential\":84.87,\"stocksymbol\":\"BALLARPUR\",\"trendstatus\":\"down\",\"resistance\":21.26},{\"ltp\":1315.7,\"support\":1092.44,\"diffpercent\":20.44,\"potential\":42.03,\"stocksymbol\":\"ACC\",\"trendstatus\":\"down\",\"resistance\":1868.65},{\"ltp\":206.9,\"support\":167.94,\"diffpercent\":23.2,\"potential\":42.05,\"stocksymbol\":\"AMBUJACEM\",\"trendstatus\":\"down\",\"resistance\":293.91},{\"ltp\":7.45,\"support\":7.76,\"diffpercent\":-3.99,\"potential\":220.81,\"stocksymbol\":\"BAJAJHIND\",\"trendstatus\":\"down\",\"resistance\":23.9},{\"ltp\":34.55,\"support\":32.11,\"diffpercent\":7.6,\"potential\":169.55,\"stocksymbol\":\"AARVEEDEN\",\"trendstatus\":\"down\",\"resistance\":93.13},{\"ltp\":24.0,\"support\":66.95,\"diffpercent\":-64.15,\"potential\":719.67,\"stocksymbol\":\"BRFL\",\"trendstatus\":\"down\",\"resistance\":196.72}]\r\n";
		System.out.println(result);
		Gson gson = new Gson();  
		return new ArrayList<StrategyinvestResult> (Arrays.asList(gson.fromJson(result, StrategyinvestResult[].class)));
		
		
	}
}
