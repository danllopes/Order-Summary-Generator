# Sistema de Resumo de Pedidos

Este projeto em Java foi desenvolvido para gerar um resumo detalhado de pedidos com base nas entradas fornecidas pelo usuário, utilizando conceitos avançados de Programação Orientada a Objetos (POO), manipulação de listas e biblioteca Java para manipulação de datas.

## Descrição do Projeto

O projeto permite ao usuário inserir dados de um pedido com N itens, capturando informações do cliente, status do pedido, itens individuais e total, utilizando o instante de registro do sistema.

## Funcionalidades Implementadas

- Captura de dados do cliente e do pedido.
- Geração de um resumo detalhado do pedido com base nas informações fornecidas.
- Utilização do instante do sistema para registrar o momento do pedido.
- Uso de enums para representar o status do pedido (por exemplo: PROCESSING, SHIPPED, DELIVERED).

## Tecnologias Utilizadas

- Java 21
- IntelliJ IDEA

## Como Executar

1. Clone o repositório para o seu ambiente local.
2. Abra o projeto no IntelliJ IDEA.
3. Execute o programa a partir do método `main` na classe `Main`.

## Exemplo de Uso

Ao executar o programa, você será solicitado a inserir dados do cliente e do pedido, incluindo o status do pedido e detalhes de cada item. O sistema utilizará o instante atual do sistema para registrar o momento do pedido.

Após inserir todos os dados necessários, o programa exibirá um resumo detalhado do pedido, incluindo o momento do registro, status do pedido (como PROCESSING, SHIPPED, ou DELIVERED), informações do cliente e detalhes de cada item do pedido com seus respectivos preços e quantidades.
