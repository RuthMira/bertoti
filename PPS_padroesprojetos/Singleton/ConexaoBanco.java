package PPS_padroesprojetos.Singleton;
public class ConexaoBanco {
    private static ConexaoBanco instance;
    private String status;

    private ConexaoBanco() {
        this.status = "Desconectado";
    }

    public static ConexaoBanco getInstance() {
        if (instance == null) {
            instance = new ConexaoBanco();
        }
        return instance;
    }

    public void conectar() {
        status = "Conectado";
        System.out.println("Banco de dados conectado.");
    }

    public void desconectar() {
        status = "Desconectado";
        System.out.println("Banco de dados desconectado.");
    }

    public String getStatus() {
        return status;
    }

    public static void main(String[] args) {
        ConexaoBanco conexao1 = ConexaoBanco.getInstance();
        conexao1.conectar();
        System.out.println("Status: " + conexao1.getStatus());

        ConexaoBanco conexao2 = ConexaoBanco.getInstance();
        conexao2.desconectar();
        System.out.println("Status: " + conexao2.getStatus());
    }
}
