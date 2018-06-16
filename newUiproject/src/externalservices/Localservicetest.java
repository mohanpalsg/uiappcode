package externalservices;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

import com.google.gson.Gson;

import dataobjects.StrategyinvestResult;

public class Localservicetest {

	private LookupExternalService lkupextsrvc;
	private String serviceurl;
	
	public Localservicetest()
	{
		lkupextsrvc = new LookupExternalService();
		serviceurl = "http://localhost:8080/restclear-0.0.1-SNAPSHOT/restservices/rest/";
	}
	public void callDataUpdate() {
		// TODO Auto-generated method stub
		lkupextsrvc.callDataUpdate(serviceurl);
	}

	public void callRTUpdate() {
		// TODO Auto-generated method stub
		lkupextsrvc.callRTUpdate(serviceurl);
	}

	public ArrayList<StrategyinvestResult> lookUpInvestTrend(String diff) {
		// TODO Auto-generated method stub
		return lookUpInvestTrend(serviceurl,diff);
	}

	private ArrayList<StrategyinvestResult> lookUpInvestTrend(String serviceurl, String diff) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		ArrayList<StrategyinvestResult> resultobj = new ArrayList<StrategyinvestResult>();
		try
		{
		URL url = new URL(serviceurl+"InvestTrendHandlerService?diff="+diff+"&code=MuttonBriyani");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Accept", "application/json");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));

			String output="",result="";
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				result = result+output;
			}
System.out.println(result);
			
			
			Gson gson = new Gson();  
			
			resultobj = new ArrayList<StrategyinvestResult> (Arrays.asList(gson.fromJson(result, StrategyinvestResult[].class)));
		
			
			 System.out.println("Converted");
			// conn.disconnect();
		}
		
		
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e);
			
		}
		System.out.println(resultobj.size());
		return resultobj;
	
	}
	public ArrayList<StrategyinvestResult> lookUpInvestWave(String diff) {
		// TODO Auto-generated method stub
		return lookUpInvestWave(serviceurl,diff);
	}
	private ArrayList<StrategyinvestResult> lookUpInvestWave(String serviceurl2, String diff) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		ArrayList<StrategyinvestResult> resultobj = new ArrayList<StrategyinvestResult>();
		try
		{
		URL url = new URL(serviceurl+"InvestWaveHandlerService?diff="+diff+"&code=MuttonBriyani");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Accept", "application/json");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));

			String output="",result="";
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				result = result+output;
			}
System.out.println(result);
			
			
			Gson gson = new Gson();  
			
			resultobj = new ArrayList<StrategyinvestResult> (Arrays.asList(gson.fromJson(result, StrategyinvestResult[].class)));
		
			
			 System.out.println("Converted");
			// conn.disconnect();
		}
		
		
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e);
			
		}
		System.out.println(resultobj.size());
		return resultobj;
	
	
	}

}
