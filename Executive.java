public class Executive extends Employee{   
private double bonus;   
private int ext=5;
public Executive (String eName, String eAddress, String ePhone,  String socSecNumber, double rate)   {      
   super (eName, eAddress, ePhone, socSecNumber, rate);      
   bonus = 0;    
}  
public void awardBonus (double execBonus){      
   bonus = execBonus;   
}   
public double pay(){      
   double payment = super.pay() + bonus;      
   bonus = 0;      
   return payment;  
 }
public double getVacationDays() {
  return super.getVacationDays() + ext;
   }
   
public void bonus(double execBonus) throws BonusTooHighException{

   if(execBonus > 10000)
      throw new BonusTooHighException("bonus should be less than 10k");
   bonus = execBonus;
  
}
public double getBonus() {
   return bonus;
}

}
