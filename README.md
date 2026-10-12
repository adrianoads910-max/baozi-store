# Baozi Store – API REST

API REST da Baozi Store (loja de pão chinês) para controle de clientes, produtos e pedidos.
Trabalho da disciplina Desenvolvimento Web Back-End – Adriano Souza Fonseca (RU 5565682).

## Tecnologias

- Java 17
- Spring Boot 4.1.0 (Spring Web MVC)
- Spring Data JPA
- H2 (banco relacional salvo em arquivo em `./data`)

## Como executar

```bash
./mvnw spring-boot:run        # Linux/macOS
mvnw.cmd spring-boot:run      # Windows
```

A API sobe em `http://localhost:8081`. Console do banco: `http://localhost:8081/h2-console`
(JDBC URL `jdbc:h2:file:./data/baozistore`, usuário `sa`, sem senha).

## Estrutura

```
br.com.baozistore
├── model        Cliente, Produto, Pedido, PedidoRequest
├── repository   ClienteRepository, ProdutoRepository, PedidoRepository
└── controller   ClienteController, ProdutoController, PedidoController
```

## Endpoints

| Método | Endpoint | Descrição |
|---|---|---|
| POST | `/clientes` | Cria um cliente |
| GET | `/clientes` | Lista todos os clientes |
| GET | `/clientes/{id}` | Consulta um cliente por ID |
| PUT | `/clientes/{id}` | Atualiza um cliente |
| DELETE | `/clientes/{id}` | Apaga um cliente |
| POST | `/produtos` | Cria um produto |
| GET | `/produtos` | Lista todos os produtos |
| GET | `/produtos/{id}` | Consulta um produto por ID |
| PUT | `/produtos/{id}` | Atualiza um produto |
| DELETE | `/produtos/{id}` | Apaga um produto |
| POST | `/pedidos` | Registra um pedido |
| GET | `/pedidos` | Lista todos os pedidos |
| GET | `/pedidos/{id}` | Consulta um pedido por ID |
| PUT | `/pedidos/{id}` | Atualiza um pedido |
| DELETE | `/pedidos/{id}` | Apaga um pedido |

## Exemplos de JSON

```json
POST /clientes
{ "nome": "Adriano5565682", "clienteDesde": "2026-10-12" }

POST /produtos
{ "nome": "Baozi de Porco", "preco": 8.50, "estoque": true }

POST /pedidos
{ "clienteId": 1, "produtoId": 1, "quantidade": 6 }
```

A collection do Postman com todas as requisições está em `postman/BaoziStore.postman_collection.json`.
