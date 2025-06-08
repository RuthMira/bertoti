package PPS_padroesprojetos.Projeto;

import javax.swing.*;
import java.awt.*;

public class View extends JPanel implements Observer {
    private JLabel label = new JLabel("Valor: 0");

    public View() {
        setLayout(new FlowLayout());
        add(label);
    }

    @Override
    public void update(int valor) {
        label.setText("Valor: " + valor);
    }
}