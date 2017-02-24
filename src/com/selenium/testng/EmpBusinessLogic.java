package com.selenium.testng;

public class EmpBusinessLogic {

public double yearlyMonthlySal(EmployeeDetails empdetails){
	
	double yearlysalary=0;
	yearlysalary=empdetails.getMonthlysalary()*12;
	return yearlysalary;
}
	
}
