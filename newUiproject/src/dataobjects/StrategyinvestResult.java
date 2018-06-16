package dataobjects;

public class StrategyinvestResult {

	private String stocksymbol;
	private double ltp;
	private double support;
	private double resistance;
	private String trendstatus;
	private double diffpercent;
	private double potential;
	
	
	public String getStocksymbol() {
		return stocksymbol;
	}


	public void setStocksymbol(String stocksymbol) {
		this.stocksymbol = stocksymbol;
	}


	public double getLtp() {
		return ltp;
	}


	public void setLtp(double ltp) {
		this.ltp = ltp;
	}


	public double getSupport() {
		return support;
	}


	public void setSupport(double support) {
		this.support = support;
	}


	public double getResistance() {
		return resistance;
	}


	public void setResistance(double resistance) {
		this.resistance = resistance;
	}


	public String getTrendstatus() {
		return trendstatus;
	}


	public void setTrendstatus(String trendstatus) {
		this.trendstatus = trendstatus;
	}


	public double getDiffpercent() {
		return diffpercent;
	}


	public void setDiffpercent(double diffpercent) {
		this.diffpercent = diffpercent;
	}


	public double getPotential() {
		return potential;
	}


	public void setPotential(double potential) {
		this.potential = potential;
	}


	public String toString()
	{
	return this.stocksymbol+":"+this.resistance+":"+this.support+":"+this.potential+":"+this.diffpercent+":"+this.ltp+":"+this.trendstatus;
	}
}
