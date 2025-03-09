               +------------------------+
               |   <<interface>>         |
               |   EstrategiaAtaque      |
               +------------------------+
               | + atacar(): void        |
               +------------------------+
                        ▲
                        │
    -----------------------------------
    |                                 |
+-----------------+       +-----------------+
| AtaqueEspada    |       | AtaqueMagia     |
+-----------------+       +-----------------+
| + atacar()      |       | + atacar()      |
+-----------------+       +-----------------+

                      +-----------------+
                      |   Guerreiro      |
                      +-----------------+
                      | - estrategiaAtaque: EstrategiaAtaque |
                      +-----------------+
                      | + setEstrategiaAtaque(EstrategiaAtaque) |
                      | + atacar()       |
                      +-----------------+
