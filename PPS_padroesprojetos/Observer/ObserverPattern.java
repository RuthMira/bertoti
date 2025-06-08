import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(double temperature);
}


class Dashboard implements Observer {
    public Dashboard() {
        System.out.println("Dashboard created.");
    }

    @Override
    public void update(double temperature) {
        fazerDash(temperature);
    }

    public void fazerDash(double temperature) {
        System.out.println("Dashboard: Temperatura atualizada para " + temperature + "°C.");
    }
}

class Previsao implements Observer {
    public Previsao() {
        System.out.println("Previsao (Forecast) created.");
    }

    @Override
    public void update(double temperature) {
        fazerDash(temperature);
    }

    public void fazerDash(double temperature) {
        System.out.println("Previsao: Temperatura recebida para previsão: " + temperature + "°C.");
    }
}


class EstacaoMeteorologica {
    private double temperatura;
    private double precipitacao;
    private List<Observer> observes; 

    public EstacaoMeteorologica() {
        this.observes = new ArrayList<>();
        System.out.println("EstacaoMeteorologica (Weather Station) created.");
    }

    public double getTemperatura() {
        return temperatura;
    }

    public double getPrecipitacao() {
        return precipitacao;
    }


    public void setTemperatura(double temperatura) {
        System.out.println("\nEstacaoMeteorologica: Setting temperatura to " + temperatura + "°C.");
        this.temperatura = temperatura;
        notificar(); 
    }

    public void setPrecipitacao(double precipitacao) {
        System.out.println("\nEstacaoMeteorologica: Setting precipitacao to " + precipitacao + "mm.");
        this.precipitacao = precipitacao;
    }

    public void addOb(Observer observer) {
        System.out.println("EstacaoMeteorologica: Adicionando observador: " + observer.getClass().getSimpleName());
        observes.add(observer);
    }

    public void removerOb(Observer observer) {
        System.out.println("EstacaoMeteorologica: Removendo observador: " + observer.getClass().getSimpleName());
        observes.remove(observer);
    }

   
    public void notificar() {
        System.out.println("EstacaoMeteorologica: Notificando observadores...");
        for (Observer observer : observes) {
            observer.update(temperatura);
        }
    }
    
}
