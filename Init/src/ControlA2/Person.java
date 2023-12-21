package ControlA2;

import java.util.Objects;

public class Person {

    private String firstName ;
    private String lastName ;
    private float baseSalary ;

    private String entreprise;

    public Person(String firstName, String lastName, float baseSalary, String entreprise) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.baseSalary = baseSalary;
        this.entreprise = entreprise;
    }

    public double calculateSalary(){
      return this.baseSalary;
    }

    public void display(){
      this.toString();
    }


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", baseSalary=" + baseSalary +
                ", entreprise='" + entreprise + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(float baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(String entreprise) {
        this.entreprise = entreprise;
    }
}
