# Projeto MVC com Strategy, Observer e Composite

## Visão Geral

Este projeto demonstra como integrar os padrões de projeto **Strategy**, **Observer** e **Composite** dentro da arquitetura **MVC (Model-View-Controller)** usando Java e Swing. O objetivo é mostrar, de forma didática, como cada padrão contribui para a separação de responsabilidades e flexibilidade do código.

---

## Estrutura do Projeto

### Como cada padrão foi aplicado

1. **MVC (Model-View-Controller)**
    - **Model:** Responsável pelos dados e regras de negócio (neste caso, um valor inteiro que pode ser incrementado ou decrementado).
    - **View:** Interface gráfica feita com Swing, responsável por exibir o valor e os botões de controle.
    - **Controller:** Recebe as ações da View e manipula o Model de acordo com a estratégia escolhida.

2. **Observer (Model-View)**
    - O Model estende `Observable` e notifica a View (que implementa `Observer`) sempre que o valor é alterado.
    - Isso garante que a interface gráfica seja atualizada automaticamente sempre que houver mudanças nos dados.

3. **Strategy (Controller)**
    - O Controller utiliza o padrão Strategy para definir diferentes formas de alterar o valor do Model.
    - Existem duas estratégias: **Incrementar** e **Decrementar**, cada uma implementando uma interface comum.
    - O Controller pode trocar de estratégia dinamicamente, tornando o código flexível e extensível.

4. **Composite (View - Swing)**
    - A View utiliza o padrão Composite ao compor a interface gráfica com vários componentes Swing (`JPanel`, `JButton`, etc).
    - Isso permite criar interfaces complexas a partir de componentes simples, facilitando a manutenção e expansão da interface.

---

## Funcionamento Didático

- Ao iniciar o programa, a janela exibe o valor atual e dois botões: **"Incrementar"** e **"Decrementar"**.
- Quando um botão é pressionado, o Controller define a estratégia correspondente e executa a ação sobre o Model.
- O Model notifica a View sobre a mudança, e a interface é atualizada automaticamente.
- A interface gráfica é composta de vários componentes Swing, demonstrando o uso do padrão Composite.

---

## Exemplo de Uso

- Clique em **"Incrementar"** para aumentar o valor.
- Clique em **"Decrementar"** para diminuir o valor.
- O valor exibido será atualizado automaticamente, sem necessidade de atualizar manualmente a interface.

---

## Benefícios

- Baixo acoplamento entre as camadas.
- Fácil manutenção e expansão (novas estratégias, novas views, etc).
- Separação clara de responsabilidades.

---

## Conclusão

Este projeto mostra, de forma simples e didática, como combinar múltiplos padrões de projeto para criar aplicações Java robustas, flexíveis e fáceis de manter.