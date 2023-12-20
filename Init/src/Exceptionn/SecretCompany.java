package Exceptionn;

public class SecretCompany extends Company{

    public SecretCompany(String name, int nbrEmp, String mission, long capital) {
        super(name, nbrEmp, mission, capital);
    }

    @Override
    protected String Mission() throws Exceptionmissionsecret {
        throw new Exceptionmissionsecret("Secret Mission");
    }
}
