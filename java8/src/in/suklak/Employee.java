package in.suklak;

public class Employee implements Comparable<Employee>
{
	private int empId;
	private String empName;
	private double empSal;
	public int getEmpId()
	{
		return empId;
	}
	public void setEmpId(int empId)
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
	public double getEmpSal()
	{
		return empSal;
	}
	public void setEmpSal(double empSal)
	{
		this.empSal = empSal;
	}
	public Employee(int empId, String empName, double empSal)
	{
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	@Override
	public String toString()
	{
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	
	@Override
	public int compareTo(Employee o)
	{
		 return compare(this, o);
	}
	public static int compare(Employee x, Employee y) {
        return (x.getEmpId() < y.getEmpId()) ? -1 : ((x.getEmpId() == y.getEmpId()) ? 0 : 1);
    }

	@Override
	public int hashCode()
	{
		// TODO Auto-generated method stub
		return empId;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Employee e =(Employee)obj;
		if(this.empId==e.empId)
			return true;
		else
			return false;
	}
}
