package ControlA2;

import ControlA1.Livre;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Manager extends Person {
 private int respBonus;
 private List<Employee> employees=new ArrayList<>();


    public Manager(String firstName, String lastName, float baseSalary, String entreprise, int respBonus, List<Employee> employees) {
        super(firstName, lastName, baseSalary, entreprise);
        this.respBonus = respBonus;
        this.employees = employees;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary();
    }

    @Override
    public void display() {
        super.display();
        this.toString();
    }

    @Override
    public String toString() {
        return
                "respBonus=" + respBonus +
                ", employees=" + employees +
                '}';
    }

    public void addEmployee(Employee e){
        this.employees.add(e);
    }

    public void displayEmployees(){

        for (Employee e : this.employees)  e.display();
    }

    public Employee bestEmp(){
        Iterator<Employee> it = employees.iterator();
        Employee e1 =it.next();
        while(it.hasNext()){
            Employee e2 = it.next();
            if(!e1.isBetterThan(e2)){
                e1 = e2;
            }
        }
        return e1;
    }

    public List<Employee> worstEmployee(){
        Iterator<Employee> it = employees.iterator();
        List<Employee> Worst=new ArrayList<>();

        while(it.hasNext()){
            Employee e1 = it.next();
           if(e1.getPerformance()< e1.getObjective()){
             Worst.add(e1);
            }

        }
        return Worst;
    }

}






