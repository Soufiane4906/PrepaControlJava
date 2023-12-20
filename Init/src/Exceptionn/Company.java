package Exceptionn;

public class Company {
     protected String name;
     protected int nbrEmp;
     protected String mission;
     protected long capital;

     public Company(String name, int nbrEmp, String mission, long capital) {
          this.name = name;
          this.nbrEmp = nbrEmp;
          this.mission = mission;
          this.capital = capital;
     }

     protected String Mission ()throws Exceptionmissionsecret {
          return mission;
     };
     protected long Capital () throws ExceptionNonProfit{
          return capital;
     }


}

