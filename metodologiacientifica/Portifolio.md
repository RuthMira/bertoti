# Ruth Mira

<div align="center">
  <img src="img/perfil.jpg" 
       alt="Foto de perfil" 
       width="200" 
       style="border: 3px solid #007BFF; border-radius: 50%; box-shadow: 0 4px 12px rgba(0, 0, 0, 0.3);" />
  <p><i>Estudante de Banco de Dados | Desenvolvedora Full Stack</i></p>
</div>

## Introdução

Meu nome é Ruth Mira e sou estudante do quarto ano do curso de Banco de Dados. Desde o início da graduação, desenvolvi uma forte afinidade com o universo da tecnologia, especialmente nas áreas de desenvolvimento de software e análise de dados.
Tive a oportunidade de trabalhar como desenvolvedora full stack em uma empresa de pequeno porte, onde pude colocar em prática diversos conhecimentos adquiridos tanto na faculdade quanto de forma autodidata. Tenho um grande interesse por aprender novas tecnologias e me dedico bastante à leitura de documentação técnica, além de trocar experiências com colegas — o que tem sido essencial para meu crescimento profissional.
Sou apaixonada pela área de desenvolvimento e busco constantemente novos desafios que me permitam evoluir tanto tecnicamente quanto como profissional.

## Contatos
* [GIT](https://https://github.com/RuthMira)
* [LinkedIn](https://www.linkedin.com/in/ruth-mira)

## Meus Principais Conhecimentos

Ao longo da minha formação e experiências práticas, desenvolvi conhecimentos em diversas linguagens e frameworks. Tenho maior familiaridade e autonomia com:

* **C#** – Utilizei para desenvolvimento de aplicações desktop e serviços.
* **Java** – Empregada em conjunto com o framework Spring Boot para criação de APIs e sistemas web.
* **JavaScript** – Aplicado principalmente no desenvolvimento de interfaces dinâmicas.
* **Vue.js** – Framework que utilizo para criação de aplicações web interativas.
* **Python** – Usado em automações, scripts de análise e leitura de dados.
* **Spring Boot** – Forte experiência na construção de aplicações web robustas e escaláveis.
* **Desenvolvimento Full Stack** – Atuação tanto no front-end quanto no back-end, incluindo consumo e criação de APIs.
* **Leitura e interpretação de documentação técnica** – Habilidade essencial que me permite aprender novas ferramentas com autonomia.
* **Aplicações console e web** – Experiência prática com diferentes tipos de aplicações, dependendo da necessidade do projeto.

Meu foco atual é aprofundar meus conhecimentos em desenvolvimento web, arquitetura de software e boas práticas de programação, além de explorar mais sobre bancos de dados e tecnologias voltadas para análise e processamento de dados.

## Meus Projetos

### Em 2024-2

No terceiro semestre (2024-2), em parceria com a **GSW (Global Solutions & Web)**, desenvolvemos a **Porygon2**, uma aplicação web para captura, organização e consulta de grandes volumes de notícias e dados estratégicos vindos de portais e APIs públicas. Nosso objetivo foi permitir que pesquisadores filtrassem, categorizassem e acessassem informações automaticamente, com alta performance e usabilidade.

[GitHub do Projeto](https://github.com/PorygonAPI/Porygon2)

#### Tecnologias Utilizadas

- **Java 22** – linguagem base da aplicação, aproveitando os recursos modernos da JVM  
- **Spring Boot 3.3.3** (Web, Data JPA, Thymeleaf, DevTools) – agilidade no desenvolvimento, estrutura organizada e integração com MVC  
- **MySQL** – banco relacional para persistência estruturada de portais, notícias, APIs e tags  
- **Lombok** – redução de boilerplate em entidades, DTOs e configurações  
- **Jsoup** – biblioteca para web scraping de conteúdo HTML de portais  
- **Jackson** – conversão eficiente entre JSON/XML e objetos Java  
- **Maven** – gerenciamento de dependências e build da aplicação  
- **Thymeleaf** – template engine para construção do front-end dinâmico, integrado ao Spring  
- **Bootstrap** – biblioteca CSS para estilização responsiva e componentes visuais reutilizáveis  

#### Contribuições Pessoais

💻 Backend e Arquitetura
- Criação do projeto inicial com dependências Maven, estrutura de pastas em padrão MVC e configuração de conexão com banco de dados.
- Modelagem do banco de dados: diagrama físico e script SQL para criação de tabelas com relacionamentos, incluindo inserção de dados de teste.
- Desenvolvimento dos CRUDs completos para as entidades principais: **Portais**, **Tags**, **Notícias**, **Jornalistas** e **APIs**.
- Criação de método para requisição às APIs cadastradas, com validação de status ativo, salvamento em `ApiDados` e registro da **data da coleta**.
- Refatoração da lógica de raspagem de notícias para tornar o processo assíncrono, permitindo execuções simultâneas e aumentando a performance da aplicação.
- Implementação de tratamento de erros e correção de bugs identificados em testes de fluxo e integração.
- Adição de lógica para impedir salvamento de dados duplicados retornados de APIs.
- Criação de validações no backend para prevenir cadastros duplicados por nome ou URL de API.
- Implementação de lógica para ignorar e não salvar itens inválidos (sem título, jornalista ou conteúdo).
- Criação de testes unitários para tratamento de palavras com hífen e limite de caracteres em tags.

🧠 Lógica de Negócio e Recursos Avançados
- Implementação da tabela de **sinônimos** com relacionamento à entidade **Tag**, permitindo buscas inteligentes (ex: “macaxeira” retorna também “mandioca” e “aipim”).
- Criação de rotina de **análise textual automática** para vincular tags às notícias e dados de APIs no momento da coleta.
- Lógica para sugestão automática de seletores HTML com base em dados previamente salvos no banco, auxiliando no preenchimento do formulário de scraping.

 🌐 Front-end
- Desenvolvimento da página **Home** com navbar e footer reutilizáveis, além de páginas de índice para as principais entidades.
- Criação da **caixa de seleção** com os tipos de arquivo da API (XML, CSV ou JSON).
- Implementação de um **formato global de datas**, padronizado e reutilizável em diferentes telas da aplicação.
- Validações no front-end para impedir requisições de APIs inválidas ou duplicadas e garantir mensagens de retorno claras ao usuário.
- Adição de **responsividade nas tabelas** e padronização visual nos botões (cores, estilos, tamanhos).
- Exibição de **mensagens de sucesso** em tela após ações como edição de portais, reforçando o feedback visual ao usuário.

🧪 Organização e Estruturação do Código
- Criação de pasta raiz (`/codebase`) para manter a base de código bem estruturada e separada por domínios.
- Documentação das principais decisões e ajustes no `README.md`, incluindo fluxo de uso da aplicação.


#### 💡 Hard Skills

- **Java (JDK 22)** – Autonomia total: desenvolvi toda a base do projeto, incluindo estrutura MVC, lógica de negócio e integração com banco.
- **Spring Boot 3.3.3 (Web, Data JPA, DevTools, Validation)** – Nível avançado: implementei CRUDs, relacionamentos complexos, paginação, validações, tratamento global de exceções e lógica assíncrona para scraping.
- **Thymeleaf** – Nível autônomo: criei páginas HTML integradas com backend, formatação de dados, componentes reutilizáveis e exibição dinâmica de mensagens.
- **Bootstrap** – Nível intermediário: estilização e responsividade de tabelas, formulários e botões com padronização visual em todo o projeto.
- **MySQL** – Nível avançado: modelagem física do banco, criação de scripts SQL para estrutura e dados iniciais, domínio de relacionamentos N:N.
- **Maven** – Nível autônomo: gerenciamento de dependências e configuração do projeto desde o início.
- **Jsoup** – Nível intermediário: scraping de dados HTML de portais de notícias com lógica de verificação de conteúdo antes de salvar.
- **Jackson** – Nível autônomo: desserialização de dados de APIs em JSON e XML.
- **Bean Validation (Hibernate Validator)** – Nível avançado: criação de DTOs com validações customizadas para garantir integridade dos dados recebidos.
- **Git (GitHub)** – Nível avançado: versionamento com branches por feature, pull requests, resolução de conflitos e revisão de código (code review).
- **Testes Unitários (JUnit)** – Nível básico/intermediário: criação de testes para funções específicas como normalização de palavras e controle de caracteres especiais.

---

#### 🤝 Soft Skills

- **Organização** – Fui responsável por estruturar o projeto desde o início, incluindo a divisão de pastas, configuração do banco e documentação no README, garantindo um fluxo de trabalho limpo e eficiente.
- **Proatividade** – Antecipei melhorias de performance, como a refatoração para scraping assíncrono e a sugestão de reutilizar seletores do banco no formulário.
- **Resolução de Problemas** – Corrigi bugs e implementei tratamentos de erro em diversas partes da aplicação, incluindo backend e frontend, evitando falhas de fluxo.
- **Comunicação** – Colaborei com colegas para alinhar regras de negócio, conduzir refinamentos e explicar soluções técnicas durante reuniões de acompanhamento.
- **Trabalho em Equipe** – Atuei em integração contínua via GitHub, com práticas de code review e resolução de conflitos durante merges.
- **Atenção aos Detalhes** – Validei casos extremos, como a prevenção de dados duplicados e filtragem de registros sem título ou conteúdo, garantindo consistência dos dados salvos.


### Em 2022-1
Mesmo formato

### Em 2022-2
Mesmo formato

### Em 2023-1
Mesmo formato

### Em 2023-2
Mesmo formato
