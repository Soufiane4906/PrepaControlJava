package Exceptionn;

import java.util.ArrayList;

public class Companies {
     private ArrayList <Company> ListCmps ;

    public Companies(ArrayList<Company> listCmps) {
        ListCmps = listCmps;
    }
    public Companies() {
        ListCmps = new ArrayList<>();
    }

    public ArrayList<Company> getListCmps() {
        return ListCmps;
    }

    public void setListCmps(ArrayList<Company> listCmps) {
        ListCmps = listCmps;
    }
    public void afficher() throws ExceptionNonProfit {
        for(Company c : this.ListCmps){

            try {
                System.out.println(c.Mission());
            } catch (Exceptionmissionsecret e) {
                throw new RuntimeException(e);
            }

            System.out.println(c.Capital());


        }
    }
}
