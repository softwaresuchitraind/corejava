package com.sukla;

public class User
{
	private String UserName;
	private String userid;
	private Address address;
	public String getUserName()
	{
		return UserName;
	}
	public void setUserName(String userName)
	{
		UserName = userName;
	}
	public String getUserid()
	{
		return userid;
	}
	public void setUserid(String userid)
	{
		this.userid = userid;
	}
	public Address getAddress()
	{
		return address;
	}
	public void setAddress(Address address)
	{
		this.address = address;
	}
	@Override
	public String toString()
	{
		return "User [UserName=" + UserName + ", userid=" + userid + ", address=" + address + "]";
	}
	

}
