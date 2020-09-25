package io.policypremiumservice.policypremiumservice.model;

public class PolicyPremium {
	
	private long grossPremium;
	private long commission;
	private long netPremium;
	
	
	
	public PolicyPremium(long grossPremium, long commission, long netPremium) {
		super();
		this.grossPremium = grossPremium;
		this.commission = commission;
		this.netPremium = netPremium;
	}
	public long getGrossPremium() {
		return grossPremium;
	}
	public void setGrossPremium(long grossPremium) {
		this.grossPremium = grossPremium;
	}
	public long getCommission() {
		return commission;
	}
	public void setCommission(long commission) {
		this.commission = commission;
	}
	public long getNetPremium() {
		return netPremium;
	}
	public void setNetPremium(long netPremium) {
		this.netPremium = netPremium;
	}
	
	

}
