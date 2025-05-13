# Vassal0 - Discord Bot

**Vassal0** é um **bot do Discord** desenvolvido em **Kotlin** com a biblioteca **JDA (Java Discord API)**. O bot foi criado para interagir com os usuários através de comandos específicos, proporcionando uma experiência automatizada em servidores de **RPG**. Ele é capaz de gerar resultados de dados aleatórios, realizar testes de mecânicas do jogo e muito mais.

## Funcionalidades

* **Comando de Saudação:**

  * Responde com mensagens personalizadas, como "Boa noite".

* **Eventos Aleatórios:**

  * Gera eventos dinâmicos para ambientes de RPG, trazendo mais imprevisibilidade para os jogos.

* **Testes de Mecânica (Frenzy, Fome, etc.):**

  * Simula lógicas de mecânicas de RPG, como a resistência a **Frenzy** ou determinar se o personagem **fica com fome**.

* **Testes de Dados:**

  * Permite rolar dados de maneira personalizada, considerando diferentes fatores como **dados de fome** ou **dados extras**.

* **Comandos Personalizados:**

  * Suporte para comandos flexíveis e personalizáveis para diversas interações.

## Tecnologias Usadas

* **Kotlin** - Linguagem de programação moderna e funcional.
* **JDA (Java Discord API)** - Biblioteca para integrar bots com o Discord.
* **Gradle** - Sistema de construção e gerenciamento de dependências.
* **GitHub** - Controle de versão e repositório de código.

## Como Rodar

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/seu-usuario/vassal0.git
   cd vassal0
   ```

2. **Compile o projeto:**

   * Se você ainda não tem o **Gradle** instalado, faça o download e configure o ambiente conforme necessário.
   * Compile o projeto com o comando:

     ```bash
     ./gradlew build
     ```

3. **Rodando o bot:**

   * Certifique-se de ter um **token do Discord**.
   * No arquivo `Main.kt`, insira seu **token do Discord**.
   * Execute o bot com:

     ```bash
     ./gradlew run
     ```

## Como Usar

* **Comando básico:**

  * Envie `>vai help` para obter uma lista de todos os comandos disponíveis.
  * Outros comandos incluem: `>vai boa`, `>vai evento`, `>vai frenzy`.

## Contribuições

Sinta-se à vontade para contribuir com melhorias no código, criando **pull requests** ou **abrindo issues**.

* Para **contribuir**: Fork o repositório, faça suas modificações e submeta um pull request.

* **Licença**: Este projeto está licenciado sob a licença MIT. Veja o arquivo LICENSE para mais informações.


---

**Vassal0** foi criado para automatizar interações e facilitar a gestão de jogos de RPG no Discord. Se você gosta de bots personalizados ou está buscando um exemplo de como criar interações no Discord com Kotlin, este projeto serve como um bom ponto de partida.
