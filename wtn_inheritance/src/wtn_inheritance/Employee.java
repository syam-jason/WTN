package wtn_inheritance;

public class Employee extends Person
{
	double salary;
	int emp_yr;
	String insurancenum;
	Employee(String n,double s,int y,String ins)
	{
		super(n);
		salary=s;
		emp_yr=y;
		insurancenum=ins;
	}
	public void setSalary(double s)
	{
		salary=s;
	}
	public void setYear(int y)
	{
		emp_yr=y;
	}
	public void setInsurancenum(String ins)
	{
		insurancenum=ins;
	}
	public double getSalary()
	{
		return salary;
	}
	public int getYear()
	{
		return emp_yr;
	}
	public String getInsurance()
	{
		return insurancenum;
	}
	public String toString()
	{
		return super.toString()+" "+salary+" "+emp_yr+" "+insurancenum; 
	}
}