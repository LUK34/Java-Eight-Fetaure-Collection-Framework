package com.javaeight;

public class Employee 
{
	private Integer eid;
	private String ename;
	private Integer esal;
	
	public Employee(Integer eid, String ename, Integer esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Integer getEsal() {
		return esal;
	}

	public void setEsal(Integer esal) {
		this.esal = esal;
	}
	
	 

}
