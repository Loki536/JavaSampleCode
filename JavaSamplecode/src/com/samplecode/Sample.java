package com.samplecode;

public class Sample {
	
	public void empId() {
		System.out.println(123);
		
	}
	  public void empName() {
		  System.out.println("Ram");
	  }
	    public void empDob() {
	    	System.out.println(04/12/1950);
	    }
	     public void empPhone(){
	        System.out.println(973379393);
	     }
	     public void empEmail() {
	    	 System.out.println("Lokesh0666@yahoo.com");
	     }
	     public void empAddress() {
	      System.out.println("Bangalore");
	     }
	   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Sample o = new Sample();
       
       o.empName();
       o.empId();
       o.empDob();
       o.empEmail();
       o.empPhone();
       o.empAddress();
       
	}

}
