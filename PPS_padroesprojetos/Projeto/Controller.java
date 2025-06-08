package PPS_padroesprojetos.Projeto;

public class Controller {
    private Estrategia estrategia;

    public void setEstrategia(Estrategia estrategia) {
        this.estrategia = estrategia;
    }

    public void executar(Model model) {
        if (estrategia != null) {
            estrategia.executar(model);
        }
    }
}