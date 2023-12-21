package ControlA2;

class Employee extends Person implements Comparable<Employee> {

    private int performance;
    private int perfBonus;
    private int objective;

    private Manager manager;

    public Employee(String firstName, String lastName, float baseSalary, String entreprise, int performance, int perfBonus, int objective, Manager manager) {
        super(firstName, lastName, baseSalary, entreprise);
        this.performance = performance;
        this.perfBonus = perfBonus;
        this.objective = objective;
        this.manager = manager;
    }

    @Override
    public boolean isBetterThan(Employee a) {
        return this.getPerformance()>a.getPerformance();
    }

  /*
  Employee a =new Emp(120);
  Employee b =new Emp(160);
  boolean is=a.isbetterThan(b);    is===?   false
*/
    @Override
    public double calculateSalary() {
        return super.calculateSalary();
    }

    @Override
    public void display() {
        super.display();
    }

    public int getPerformance() {
        return performance;
    }

    public void setPerformance(int performance) {
        this.performance = performance;
    }

    public int getPerfBonus() {
        return perfBonus;
    }

    public void setPerfBonus(int perfBonus) {
        this.perfBonus = perfBonus;
    }

    public int getObjective() {
        return objective;
    }

    public void setObjective(int objective) {
        this.objective = objective;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
