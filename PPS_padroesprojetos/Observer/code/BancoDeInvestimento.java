package PPS_padroesprojetos.Observer.code;

import java.util.ArrayList;
import java.util.List;

// Classe concreta do sujeito (Publisher)
class BancoDeInvestimento {
    private String nomeInv;
    private boolean status;
    private int valor;
    private List<Observer> local = new ArrayList<>();

    public void setInv(String nomeInv, boolean status, int valor) {
        this.nomeInv = nomeInv;
        this.status = status;
        this.valor = valor;
        notifyObservers();
    }

    public void addBancoSede(Observer observer) {
        local.add(observer);
    }

    public void notifyObservers() {
        for (Observer observer : local) {
            observer.update(nomeInv, status, valor);
        }
    }
}
