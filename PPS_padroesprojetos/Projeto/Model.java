package PPS_padroesprojetos.Projeto;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private int valor = 0;
    private List<Observer> observers = new ArrayList<>();

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
        notifyObservers();
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    private void notifyObservers() {
        for (Observer o : observers) {
            o.update(valor);
        }
    }
}