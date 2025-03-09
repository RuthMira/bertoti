package Stategy.code;

public class Main {
    public static void main(String[] args) {
        // Guerreiro começa com ataque de espada
        Guerreiro guerreiro = new Guerreiro(new AtaqueEspada());
        guerreiro.atacar(); // Saída: O guerreiro ataca com sua espada!

        // Mudando para ataque de magia
        guerreiro.setEstrategiaAtaque(new AtaqueMagia());
        guerreiro.atacar(); // Saída: O guerreiro lança um feitiço poderoso!
    }
}

