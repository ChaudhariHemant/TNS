package org.tnsif.singleinheritance;
//based class
public class Citizen {
   private String city;
   public String getCity() {
	return city;
}
public Citizen() {
	System.out.println("");
}
public Citizen(String city, String pincode, String area, long adharno) {
	super();
	this.city = city;
	this.pincode = pincode;
	this.area = area;
	this.adharno = adharno;
}
public Citizen(String city2, int pincode2, String area2, long adharNo2) {
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Citizen [city=" + city + ", pincode=" + pincode + ", area=" + area + ", adharno=" + adharno + "]";
}
public void setCity(String city) {
	this.city = city;
}
public String getPincode() {
	return pincode;
}
public void setPincode(String pincode) {
	this.pincode = pincode;
}
public String getArea() {
	return area;
}
public void setArea(String area) {
	this.area = area;
}
public long getAdharno() {
	return adharno;
}
public void setAdharno(long adharno) {
	this.adharno = adharno;
}
private String pincode;
   private String area;
   private long adharno;
}
