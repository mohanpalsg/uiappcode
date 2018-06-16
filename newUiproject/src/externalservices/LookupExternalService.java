package externalservices;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;


import com.google.gson.Gson;


import dataobjects.StrategyinvestResult;

public class LookupExternalService {

	private String weeklyservice = "http://nsweekins-nseweek.193b.starter-ca-central-1.openshiftapps.com/restservices/rest/";
	private String dailyservice ="http://nsdayins-nseday.7e14.starter-us-west-2.openshiftapps.com/restservices/rest/";
	//daily - http://nsdayins-nseday.7e14.starter-us-west-2.openshiftapps.com 
	//weekly - http://nsweekins-nseweek.193b.starter-ca-central-1.openshiftapps.com 
	public ArrayList<StrategyinvestResult> lookUpInvestTrend(String diff) {
		// TODO Auto-generated method stub
		ArrayList<StrategyinvestResult> resultobj = new ArrayList<StrategyinvestResult>();
		try
		{
		URL url = new URL(weeklyservice+"InvestTrendHandlerService?diff="+diff+"&code=MuttonBriyani");
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
		ArrayList<StrategyinvestResult> resultobj = new ArrayList<StrategyinvestResult>();
		try
		{
		URL url = new URL(weeklyservice+"InvestWaveHandlerService?diff="+diff+"&code=MuttonBriyani");
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
			 conn.disconnect();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e);
			
		}
		return resultobj;
	}

	public void callRTUpdate() {
		// TODO Auto-generated method stub
		callRTUpdate(weeklyservice);
		callRTUpdate(dailyservice);
		
		
	}

	public void callRTUpdate(String serviceurl) {
		// TODO Auto-generated method stub
		try
		{
		URL url = new URL(serviceurl+"RTUpdateService?code=MuttonBriyani");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		//conn.setRequestProperty("Accept", MediaType.TEXT_PLAIN);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));

			String output;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}

			conn.disconnect();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
			
		}
	}

	public void callStrategyUpdate() {
		// TODO Auto-generated method stub
		
		callStrategyUpdate(weeklyservice);
		callStrategyUpdate(dailyservice);
		
		
	}

	public void callStrategyUpdate(String serviceurl) {
		// TODO Auto-generated method stub
		try
		{
		URL url = new URL(serviceurl+"StrategyUpdateService?code=MuttonBriyani");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		//conn.setRequestProperty("Accept", MediaType.TEXT_PLAIN);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));

			String output;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}

			conn.disconnect();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
			
		}
	}

	public void callDataUpdate() {
		// TODO Auto-generated method stub
		callDataUpdate(weeklyservice);
		callDataUpdate(dailyservice);
		
		
		
	}

	public void callDataUpdate(String serviceurl) {
		// TODO Auto-generated method stub
		try
		{
		URL url = new URL(serviceurl+"UpdateService?code=MuttonBriyani");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		//conn.setRequestProperty("Accept", MediaType.TEXT_PLAIN);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));

			String output;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}

			conn.disconnect();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
			
		}
	}

}
