package PPS_padroesprojetos.Projeto;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        model.addObserver(view);

        Controller controller = new Controller();

        JButton inc = new JButton("Incrementar");
        JButton dec = new JButton("Decrementar");

        inc.addActionListener(e -> {
            controller.setEstrategia(new Incrementar());
            controller.executar(model);
        });

        dec.addActionListener(e -> {
            controller.setEstrategia(new Decrementar());
            controller.executar(model);
        });

        JPanel panel = new JPanel();
        panel.add(inc);
        panel.add(dec);

        JFrame frame = new JFrame("MVC com Strategy, Observer e Composite");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.add(view);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}