package Exceptionn;



import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws ExceptionNonProfit {
        SecretCompany ONCF = new SecretCompany("ONCF",15863,"mision_oncf",52545);
       CompanyWitjoutProfit Banque_populaire= new CompanyWitjoutProfit("Banque populaire",58752,"mision_Banque",525885);
         ArrayList<Company> cmps8 =new ArrayList<>();
        cmps8.add(ONCF);
       cmps8.add(Banque_populaire);
       Companies c = new Companies(cmps8);
       c.afficher();

}}