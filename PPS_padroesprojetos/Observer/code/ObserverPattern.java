package PPS_padroesprojetos.Observer.code;

// Teste do padrão Observer
public class ObserverPattern {
    public static void main(String[] args) {
        BancoDeInvestimento banco = new BancoDeInvestimento();
        SedeSP sp = new SedeSP();
        SedeRJ rj = new SedeRJ();
        
        banco.addBancoSede(sp);
        banco.addBancoSede(rj);
        
        banco.setInv("Investimento A", true, 10000);
    }
}
