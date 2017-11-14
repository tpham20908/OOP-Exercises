public class BasePlusCommissionEmployee extends CommissionEmployee {
  double baseSalary;

  public BasePlusCommissionEmployee(String firstName, String lastName,
    String SIN, double grossSale, double commissionRate, double baseSalary) {
    super(firstName, lastName, SIN, grossSale, commissionRate);
    this.baseSalary = baseSalary;
  }

  public double getPaymentAmount() {
    return super.getPaymentAmount() + baseSalary;
  }
}