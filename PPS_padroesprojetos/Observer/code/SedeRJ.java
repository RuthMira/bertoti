package PPS_padroesprojetos.Observer.code;

class SedeRJ implements Observer {
    @Override
    public void update(String nomeInv, boolean status, int valor) {
        System.out.println("Sede RJ recebeu atualização: " + nomeInv + " Status: " + status + " Valor: " + valor);
    }
}
