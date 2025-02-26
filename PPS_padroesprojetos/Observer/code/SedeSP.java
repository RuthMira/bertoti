package PPS_padroesprojetos.Observer.code;

// Implementação concreta dos Observers
class SedeSP implements Observer {
    @Override
    public void update(String nomeInv, boolean status, int valor) {
        System.out.println("Sede SP recebeu atualização: " + nomeInv + " Status: " + status + " Valor: " + valor);
    }
}
