
public class EstacaoMeteorologica {
    private double temperatura;
    private double precipitacao;
    private Dashboard dashboard;
    private Previsao previsao;

    public EstacaoMeteorologica() {
        this.dashboard = new Dashboard();
        this.previsao = new Previsao();
    }

    public void atualizarMedicoes(double temp, double preci) {
        this.temperatura = temp;
        this.precipitacao = preci;
        notificar();
    }

    private void notificar() {
   
        dashboard.fazerDashboard(temperatura, precipitacao);
        previsao.fazerDashboard(temperatura, precipitacao);
    }
}


public class Dashboard {
    public void fazerDashboard(double temp, double preci) {
        System.out.println("Dashboard atualizado: Temp=" + temp + " / Precip=" + preci);
    }
}


public class Previsao {
    public void fazerDashboard(double temp, double preci) {
        System.out.println("Previsão baseada em Temp=" + temp);
    }
}


public class AntiPatternExample {
    public static void main(String[] args) {
        EstacaoMeteorologica estacao = new EstacaoMeteorologica();
        estacao.atualizarMedicoes(28.3, 9.1);
    }
}
