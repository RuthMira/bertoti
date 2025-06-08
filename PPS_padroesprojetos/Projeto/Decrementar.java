package PPS_padroesprojetos.Projeto;

public class Decrementar implements Estrategia {
    @Override
    public void executar(Model model) {
        model.setValor(model.getValor() - 1);
    }
}