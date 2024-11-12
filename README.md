# Lab Specification

Este é um projeto básico em Java que demonstra a criação de uma API REST utilizando Spring Boot. A API possui dois endpoints principais: um para cadastro de dados do cliente e outro para listagem com filtragem avançada usando `Specification` e a biblioteca `Specification Arg Resolver`.

## Tecnologias Utilizadas

- **Java**: Linguagem principal do projeto
- **Spring Boot 3**: Framework para construção da aplicação REST
- **JPA (Java Persistence API)**: Utilizado para manipulação do

## Funcionalidades

A aplicação possui duas funcionalidades principais:

1. **Cadastro de Clientes**: Endpoint para cadastrar novas entradas na base de dados.
2. **Listagem de Dados com Filtros**: Endpoint que permite listar os dados cadastrados com filtros dinâmicos através de Specifications.

## Endpoints

### 1. Cadastro de Dados

- **Método**: `POST`
- **URL**: `/client`
- **Descrição**: Este endpoint permite o cadastro de novos clientes.
- **Exemplo de Payload**:
  ```json
  {
    "name": "Jamerson",
    "age": 25,
    "email": "jamerson@mail.com"
  }

  ### 2. Listagem de Dados com Filtros Dinâmicos

- **Método**: `GET`
- **URL**: `/client`
- **Descrição**: Este endpoint retorna uma lista de entradas cadastradas, com suporte a filtros dinâmicos usando Specification e Specification Arg Resolver.
- **Exemplo de Filtro**:
  - `/client?name=Exemplo`
  - `/client?age=25`
