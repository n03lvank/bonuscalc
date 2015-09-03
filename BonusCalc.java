
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
		double q1Bonus = 0;
	
		if (employee1.getQ1Save() >= employee1.getMonthInvest() * 3)
		{
			q1Bonus = employee1.getQ1Save() * quarterBonusRate;
		}
		
		System.out.println(q1Bonus);
	}
}
