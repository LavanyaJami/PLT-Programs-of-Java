/* 7_2. Write a pseudocode to accept name, empId, basic, special allowances, percentage of
bonus and monthly tax saving investments. The gross monthly salary is basic + special
allowances. Compute the annual salary. The gross annual salary also includes the bonus.
Compute the annual net salary, by deducting taxes as suggested.
Income upto 1 lac – exempted
Income from 1 to 1.5 lac – 20%
Income from 1.5 lac onwards – 30%
However if there is any tax saving investment, then there is further exemption of upto 1
lac annually. This would mean that by having tax saving investments of about 1 lac, an
income of 2 lacs is non-taxable. Display the annual gross, annual net and tax payable.*/

package com.pratian.qa.pltprograms;

public class Employee {

		String employeeName;
		String empId;
		double basic;
		double SpecialAllowances;
		float percentOfBonus;
		double taxAmount;
		double taxSavingInvestment;
		double bonus;
		
		public double getBonus() {
			return bonus;
		}
		public void setBonus(double bonus) {
			this.bonus = bonus;
		}
		public String getEmployeeName() {
			return employeeName;
		}
		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}
		public String getEmpId() {
			return empId;
		}
		public void setEmpId(String empId) {
			this.empId = empId;
		}
		public double getBasic() {
			return basic;
		}
		public void setBasic(double basic) {
			this.basic = basic;
		}
		public double getSpecialAllowances() {
			return SpecialAllowances;
		}
		public void setSpecialAllowances(double specialAllowances) {
			SpecialAllowances = specialAllowances;
		}
		public float getPercentOfBonus() {
			return percentOfBonus;
		}
		public void setPercentOfBonus(float percentOfBonus) {
			this.percentOfBonus = percentOfBonus;
		}
		public double getTaxSavingInvestment() {
			return taxSavingInvestment;
		}
		public void setTaxSavingInvestment(double taxSavingInvestment) {
			this.taxSavingInvestment = taxSavingInvestment;
		}
		
		public Employee() {
			super();
		}
		public Employee(String employeeName, String empId, double basic, double specialAllowances, float percentOfBonus,
				double taxSavingInvestment) {
			super();
			this.employeeName = employeeName;
			this.empId = empId;
			this.basic = basic;
			SpecialAllowances = specialAllowances;
			this.percentOfBonus = percentOfBonus;
			this.taxSavingInvestment = taxSavingInvestment;
		}
		
}
