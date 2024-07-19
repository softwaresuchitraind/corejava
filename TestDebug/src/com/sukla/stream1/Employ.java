package com.sukla.stream1;

public class Employ
{
	private Integer empId;
	private String empName;
	private String gender;
	private Integer age;
	private Double empSal;
	private Integer yearofJoining;
	private String department;
	public Employ(Integer empId, String empName, String gender, Integer age, Double empSal, Integer yearofJoining,
			String department)
	{
		super();
		this.empId = empId;
		this.empName = empName;
		this.gender = gender;
		this.age = age;
		this.empSal = empSal;
		this.yearofJoining = yearofJoining;
		this.department = department;
	}
	public Integer getEmpId()
	{
		return empId;
	}
	public void setEmpId(Integer empId)
	{
		this.empId = empId;
	}
	public String getEmpName()
	{
		return empName;
	}
	public void setEmpName(String empName)
	{
		this.empName = empName;
	}
	public String getGender()
	{
		return gender;
	}
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	public Integer getAge()
	{
		return age;
	}
	public void setAge(Integer age)
	{
		this.age = age;
	}
	public Double getEmpSal()
	{
		return empSal;
	}
	public void setEmpSal(Double empSal)
	{
		this.empSal = empSal;
	}
	public Integer getYearofJoining()
	{
		return yearofJoining;
	}
	public void setYearofJoining(Integer yearofJoining)
	{
		this.yearofJoining = yearofJoining;
	}
	public String getDepartment()
	{
		return department;
	}
	public void setDepartment(String department)
	{
		this.department = department;
	}
	@Override
	public String toString()
	{
		return "Employ [empId=" + empId + ", empName=" + empName + ", gender=" + gender + ", age=" + age + ", empSal="
				+ empSal + ", yearofJoining=" + yearofJoining + ", department=" + department + "]";
	}
	
	
	
}
