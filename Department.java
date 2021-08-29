package model;

public class Department {
	private String deptname;
	public Department() {

	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	@Override
	public String toString() {
		return "Department [deptname=" + deptname + "]";
	}
}
