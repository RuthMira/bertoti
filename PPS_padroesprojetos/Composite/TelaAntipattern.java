import javax.swing.*;

public class TelaAntipattern extends JFrame {

    public TelaAntipattern() {
        JButton botao = new JButton("Clique");
        JTextField texto = new JTextField("Digite aqui");

        this.setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        this.add(texto); 
        this.add(botao); 

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new TelaAntipattern();
    }
}
