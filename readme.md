# Sistema Bancário Simples

Este é um sistema bancário simples em Java que permite aos usuários criar contas, fazer login, realizar operações bancárias como saque, depósito, ver saldos e transferência de dinheiro (Pix).

Criei este projeto com a finalidade de treinar minha lógica de programação, aplicar meus conceitos e fundamentos sobre como se desenvolve um sistema.

## Funcionalidades

### 1. Criar Conta

- Os usuários podem criar uma nova conta fornecendo um email, senha e opcionalmente um depósito inicial.

### 2. Fazer Login

- Os usuários podem fazer login com um email e senha previamente registrados.

### 3. Sacar

- Os usuários logados podem sacar dinheiro de suas contas, desde que tenham saldo suficiente.

### 4. Depositar

- Os usuários logados podem depositar dinheiro em suas contas.

### 5. Ver Saldo

- Os usuários logados podem verificar o saldo atual de suas contas.

### 6. Realizar Pix

- Os usuários logados podem realizar um Pix para transferir dinheiro para outra conta, fornecendo o email de destino e o valor a ser transferido.

## Estrutura do Projeto

O projeto está organizado em classes Java, onde cada classe desempenha um papel específico:

- `Conta`: Representa uma conta bancária com atributos como email, senha e saldo. Contém métodos para saque, depósito e consulta de saldo.

- `Ui`: Classe responsável pela interação com o usuário. Ela fornece menus e métodos para coletar informações do usuário, como criar uma nova conta.

- `Login`: Gerencia as operações de login, criação de contas e controle de contas logadas.

- `GerenciamentoConta`: Realiza operações bancárias, como saque, depósito, Pix e consulta de saldo, para contas logadas.

- `Interface`: Classe principal que coordena a interação do usuário com as funcionalidades do sistema.

## Como Usar

1. Compile e execute o programa Java.

2. Siga as instruções no terminal para criar uma conta ou fazer login em uma conta existente.

3. Após fazer login, você pode escolher entre as opções disponíveis para realizar operações bancárias.

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request se encontrar algum problema ou tiver sugestões para melhorar o código.

## Conceitos Utilizados

Este projeto demonstra o uso de conceitos fundamentais da programação orientada a objetos, incluindo:

- Classes e objetos para representar entidades e funcionalidades do sistema.

- Encapsulamento para proteger os dados da conta e manter o controle sobre eles.

- Herança para criar classes especializadas, como a classe `GerenciamentoConta`.

- Estruturas de controle de fluxo, como loops e condicionais, para gerenciar a lógica do programa.

- Coleta de entrada do usuário usando a classe Scanner.

- Uso de ArrayList para armazenar e gerenciar contas de usuário.

- Modularização do código em diferentes classes para manter a organização e a legibilidade.

- Manipulação de exceções para tratar erros potenciais durante a execução do programa.

## Futuras Melhorias

- **Interface Gráfica**: Planejo implementar uma interface gráfica para tornar a experiência do usuário mais amigável e visualmente atraente.

- **Conexão com Banco de Dados**: Pretendo integrar um banco de dados para permitir a persistência de dados, o que possibilitará a recuperação de informações de contas entre sessões.

- **Melhorias no Tratamento de Exceções**: Continuarei a aprimorar o tratamento de exceções para lidar com erros de forma mais robusta e informar adequadamente o usuário sobre problemas.

- **Recursos Adicionais**: Estou considerando adicionar recursos como extratos de transações, pagamentos de contas, entre outros.

- **Segurança Aprimorada**: Implementarei medidas de segurança adicionais para proteger as informações das contas e os dados dos usuários.

Este projeto está em constante evolução, e estou entusiasmado para torná-lo mais completo e confiável. Fique à vontade para contribuir ou enviar sugestões para o desenvolvimento contínuo deste sistema bancário simples.
