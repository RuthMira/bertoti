
class ObserverAntiPattern {
    private double temperatura;
    private double precipitacao;
    private Dashboard dashboard;
    private Previsao previsao;

    public ObserverAntiPattern() {
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


class Dashboard {
    public void fazerDashboard(double temp, double preci) {
        System.out.println("Dashboard atualizado: Temp=" + temp + " / Precip=" + preci);
    }
}


class Previsao {
    public void fazerDashboard(double temp, double preci) {
        System.out.println("Previsão baseada em Temp=" + temp);
    }
}


public class ObserverAntipattern {
    public static void main(String[] args) {
        ObserverAntiPattern estacao = new ObserverAntiPattern();
        estacao.atualizarMedicoes(28.3, 9.1);
    }
}