//ensapculation achiecve the data hiding using the private accesss specifire
package org.tnsif.encapsulation;

public class HDFC {
     private String accType;
     private long accountNO;
     private long atmcardNO;
     private int pinNO;
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public long getAccountNO() {
		return accountNO;
	}
	public void setAccountNO(long accountNO) {
		this.accountNO = accountNO;
	}
	public long getAtmcardNO() {
		return atmcardNO;
	}
	public void setAtmcardNO(long atmcardNO) {
		this.atmcardNO = atmcardNO;
	}
	public int getPinNO() {
		return pinNO;
	}
	public void setPinNO(int pinNO) {
		this.pinNO = pinNO;
	}
	// default cannot acces into the another package i.e dooks
	@Override
	public String toString() {
		return "HDFC [accType=" + accType + ", accountNO=" + accountNO + ", atmcardNO=" + atmcardNO + ", pinNO=" + pinNO
				+ "]";
	}
	public void setPinNO(int pinNO2) {
		// TODO Auto-generated method stub
		
	}
	
}
