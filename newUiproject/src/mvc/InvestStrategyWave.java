package mvc;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import dataobjects.StrategyinvestResult;
import externalservices.Localservicetest;
import externalservices.LookupExternalService;



/**
 * Servlet implementation class InvestStrategyWave
 */
@WebServlet("/InvestStrategyWave")
public class InvestStrategyWave extends HttpServlet {
	
	
    
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
     * @see HttpServlet#HttpServlet()
     */
    public InvestStrategyWave() {
        super();
        
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(false);
		String diff = (String) session.getAttribute("diffselected");
		
		if (diff == null)
			diff = "50";
		
		LookupExternalService lookserv = new LookupExternalService();
		 Localservicetest ltest = new Localservicetest();
		ArrayList <StrategyinvestResult> resultlist= new ArrayList <StrategyinvestResult>();
		  String mock = getServletContext().getInitParameter("mock");
			if(!mock.equals("true"))
  		resultlist=lookserv.lookUpInvestWave(diff);
  		else
  		resultlist = ltest.lookUpInvestWave(diff);
	    
	    System.out.println(resultlist.size());
		
		//String lowdiff = (String) session.getAttribute("pricedifflowselected");
		
		// load strategy trend and return the json data
		
		// symbol,ltp,basetrend as support,basehigh as resistance, and diff percentage from support.
	    
	    request.setAttribute("diffselected", diff);
	    request.setAttribute("stocklist", resultlist);
		request.getRequestDispatcher("InvestStrategy2.jsp").forward(request, response);
	}

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
HttpSession session = request.getSession(false);
		
		
		session.setAttribute("diffselected", request.getParameter("diffselected"));
		
		
		
	
		
		doGet(request, response);
	}

}
