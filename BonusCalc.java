public class BonusCalc {

	public static void main(String[] args) {

		BonusCalcData employee1 = new BonusCalcData();
		BonusCalcData employee2 = new BonusCalcData();

		employee1.setMonthInvest(2000);
		employee1.setQ1Save(5000);
		employee1.setQ2Save(7000);
		employee1.setQ3Save(4000);
		employee1.setQ4Save(8000);

		employee2.setMonthInvest(3000);
		employee2.setQ1Save(6000);
		employee2.setQ2Save(9000);
		employee2.setQ3Save(10000);
		employee2.setQ4Save(17000);

		double quarterBonusRate = 0.03;
		double yearBonusRate = 0.05;

        
        /*If employee quarterly savings in q1 or q2 or q3 or q4 are equal to or greater than
        their monthly invest multiplied by 3 months, they will recieve
         a 3% quarter bonus. E.g. employee1 receives 3% bonus in q2 and q4*/
        
		if (employee1.getQ1Save() || employee1.getQ2Save() || employee1.getQ3Save() ||
            employee1.getQ4Save >= employee1.getMonthInvest * 3{
                

		}
            
            
            
        /*If employee quarterly savings added together are equal to or greater than monthly invest
         multiplied by 12, employee will recieve 5% year bonus on the amount */
            
            
        // Finally, add up entire bonus amounts paid out to all employees
	}
}
