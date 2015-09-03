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
        double employee1Q1Bonus = 0;
        double employee1Q2Bonus = 0;
        double employee1Q3Bonus = 0;
        double employee1Q4Bonus = 0;
        double employee2Q1Bonus = 0;
        double employee2Q2Bonus = 0;
        double employee2Q3Bonus = 0;
        double employee2Q4Bonus = 0;
        /*
         * If employee quarterly savings in q1 or q2 or q3 or q4 are equal to or
         * greater than their monthly invest multiplied by 3 months, they will
         * receive a 3% quarterly bonus. E.g. employee1 receives 3% bonus in q2
         * and q4
         */
        
        /*
         * If employee quarterly savings added together are equal to or greater
         * than monthly invest multiplied by 12, employee will receive 5% year
         * bonus on the amount
         */
        
        if (employee1.getQ1Save() >= employee1.getMonthInvest() * 3) {
            employee1Q1Bonus = employee1.getQ1Save() * quarterBonusRate;
        }
        if (employee1.getQ2Save() >= employee1.getMonthInvest() * 3) {
            employee1Q2Bonus = employee1.getQ2Save() * quarterBonusRate;
        }
        if (employee1.getQ3Save() >= employee1.getMonthInvest() * 3) {
            employee1Q3Bonus = employee1.getQ3Save() * quarterBonusRate;
        }
        if (employee1.getQ4Save() >= employee1.getMonthInvest() * 3) {
            employee1Q4Bonus = employee1.getQ4Save() * quarterBonusRate;
        }
        
        double employee1QuarterBonuses = employee1Q1Bonus + employee1Q2Bonus + employee1Q3Bonus + employee1Q4Bonus;
        double employee1SumQuarterlySavings = employee1.getQ1Save() + employee1.getQ2Save() + employee1.getQ3Save()
        + employee1.getQ4Save();
        double employee1YearBonus = 0;
        
        // calculate employee1 yearly bonus
        if (employee1SumQuarterlySavings >= employee1.getMonthInvest() * 12) {
            employee1YearBonus = employee1SumQuarterlySavings * yearBonusRate;
        }
        
        if (employee2.getQ1Save() >= employee2.getMonthInvest() * 3) {
            employee2Q1Bonus = employee2.getQ1Save() * quarterBonusRate;
        }
        if (employee2.getQ2Save() >= employee2.getMonthInvest() * 3) {
            employee2Q2Bonus = employee2.getQ2Save() * quarterBonusRate;
        }
        if (employee2.getQ3Save() >= employee2.getMonthInvest() * 3) {
            employee2Q3Bonus = employee2.getQ3Save() * quarterBonusRate;
        }
        if (employee2.getQ4Save() >= employee2.getMonthInvest() * 3) {
            employee2Q4Bonus = employee2.getQ4Save() * quarterBonusRate;
        }
        
        double employee2QuarterBonuses = employee2Q1Bonus + employee2Q2Bonus + employee2Q3Bonus + employee2Q4Bonus;
        double employee2SumQuarterlySavings = employee2.getQ1Save() + employee2.getQ2Save() + employee2.getQ3Save()
        + employee2.getQ4Save();
        double employee2YearBonus = 0;
        
        // calculate employee2 yearly bonus
        if (employee2SumQuarterlySavings >= employee2.getMonthInvest() * 12) {
            employee2YearBonus = employee2SumQuarterlySavings * yearBonusRate;
        }
        // Finally, add up entire bonus amounts paid out to all employees
        System.out.println(employee1QuarterBonuses + employee1YearBonus + employee2QuarterBonuses + employee2YearBonus);
    }
}
