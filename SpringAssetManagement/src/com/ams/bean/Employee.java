package com.ams.bean;


import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

	@Id
	@GeneratedValue
	@Column(name="Empno")
	private int empID;
	@Column(name="Ename")
	private String empName;
	@Column(name="job")
	private String job;
	@Column(name="mgr")
	private int mgrId;
	@Column(name="hiredate")
	private Date hireDate;
	
	/*Used as foreign key values*/
	@ManyToOne
	@JoinColumn(name="Dept_ID")
	private Department department;
	
	/*Used as Primary key values*/
	@OneToMany(mappedBy="employee")
	private Set<Employee> employees;

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getMgrId() {
		return mgrId;
	}

	public void setMgrId(int mgrId) {
		this.mgrId = mgrId;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	public Employee(int empID, String empName, String job, int mgrId,
			Date hireDate, Department department, Set<Employee> employees) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.job = job;
		this.mgrId = mgrId;
		this.hireDate = hireDate;
		this.department = department;
		this.employees = employees;
	}

	public Employee(String empName, String job, int mgrId, Date hireDate,
			Department department, Set<Employee> employees) {
		super();
		this.empName = empName;
		this.job = job;
		this.mgrId = mgrId;
		this.hireDate = hireDate;
		this.department = department;
		this.employees = employees;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", job="
				+ job + ", mgrId=" + mgrId + ", hireDate=" + hireDate
				+ ", department=" + department + ", employees=" + employees
				+ "]";
	}
	
	
	
}
