package Exceptionn;

public class CompanyWitjoutProfit extends Company{
    public CompanyWitjoutProfit(String name, int nbrEmp, String mission, long capital) {
        super(name, nbrEmp, mission, capital);
    }

    @Override
    protected long Capital() throws ExceptionNonProfit {
       throw  new ExceptionNonProfit ("company without profit");
    }
}
