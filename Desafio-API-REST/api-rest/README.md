# API REST - Bootcamp Santander Java 2023 
- API RESTfull para uma aplicação bancária que salva informações do usuário como nome e dados bancários desenvolvida no último lab project juntamente com o instrutor. 
- Essa API realiza, até o momento, dois métodos do padrão CRUD: CREATE e READ.
- Deploy na plataforma Railway: [Acesse pelo Swagger UI](https://bootcamp-java-dio-prd.up.railway.app/swagger-ui/index.html)
- Desenvolvida utilizando o framework Spring Boot na linguagem Java.

## Testando os métodos POST e GET
Para testar, utilize a estrutura JSON abaixo, alterando os valores respectivos:
```
{
  "name": "Nome Usuário",
  "account":{
    "number": "numero conta",
    "agency": "numero agencia",
    "balance": valor do saldo,
    "limit": valor do limite
  },
  "features":[
    {
    "icon": "URL da feature",
    "description":"descrição da feature"
  }
],
  "card":{
    "number": "numero do cartao",
    "limit": limite do cartao
  },
  "news": [
  {
    "icon": "URL das notificações de noticias do app",
    "description":"descrição da notícia"
  }
  ]
}
```
## Diagrama de Classes

```mermaid
classDiagram
  class User {
    - name: string
    - account: Account
    - features[]: Features
    - card: Card
    - news[]: News
  }

  class Account {
    - number: string
    - agency: string
    - balance: float
    - limit: float
  }

  class Features {
    - icon: string
    - description: string
  }

  class Card {
    - number: string
    - limit: float
  }

  class News {
    - icon: string
    - description: string
  }

  User "1" *--> "1"Account
  User "1" *--> "N" Features 
  User "1" *--> "1" Card 
  User "1" *--> "N" News 
```
## Ferramentas utilizadas 
- [Java Spring Boot](https://spring.io/)
- [PostgreSQL (provisionado no Railway)](https://docs.railway.app/databases/postgresql)
- [Railway](https://railway.app/)
- [Json Editor](https://jsoneditoronline.org/)
- [ChatGPT (para modelagem do diagrama de classes com mermaid)](https://chat.openai.com/)
