/* 7_1. Write a pseudocode to accept name, empId, basic, special allowances, percentage of
bonus and monthly tax saving investments. The gross monthly salary is basic + special
allowances. Compute the annual salary. The gross annual salary also includes the bonus.
Compute the annual net salary, by deducting taxes as suggested.
Income upto 1 lac – exempted
Income from 1 to 1.5 lac – 20%
Income from 1.5 lac onwards – 30%
However if there is any tax saving investment, then there is further exemption of upto 1
lac annually. This would mean that by having tax saving investments of about 1 lac, an
income of 2 lacs is non-taxable. Display the annual gross, annual net and tax payable. */

package com.pratian.qa.pltprograms;

public class EmployeeSalaryCalculation {

	public static void main(String[] args) {
		
		double monthlySalary;
		double annualSalary;
		double annualNetSalary=0;
		double annualNetSalaryExcludeInvestment;
		
		
		Employee employee= new Employee();
		
		monthlySalary= employee.getBasic()+employee.getSpecialAllowances();
		annualSalary= monthlySalary+ employee.getBonus();
		annualNetSalaryExcludeInvestment= annualSalary-employee.getTaxSavingInvestment();
		
		if(annualNetSalaryExcludeInvestment<=100000) {
			annualNetSalary=annualNetSalaryExcludeInvestment;
		}
		else if(100000<annualNetSalaryExcludeInvestment && annualNetSalaryExcludeInvestment<150000) {
			annualNetSalary=annualNetSalaryExcludeInvestment - (annualNetSalaryExcludeInvestment*(20/100));
		}
		
		else if(150000<=annualNetSalaryExcludeInvestment) {
			annualNetSalary=annualNetSalaryExcludeInvestment - (annualNetSalaryExcludeInvestment*(30/100));
		}
		else {
			System.out.println("Please check the data once");
		}
		
		System.out.println("Salary: "+ annualNetSalary);
		
	}
}
