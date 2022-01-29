# Projeto Vendas
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/igor-lourenco/projeto-spring-react-vendas/blob/main/LICENSE) 

# Sobre o projeto

https://igor-lourenco-projeto-spring-react.netlify.app/


A aplicação consiste em uma pesquisa de vendas e taxa de sucesso de cada vendedor, onde os dados coletados são listados na web, que também apresenta um dashboard com gráficos baseados nestes dados.


## Layout web
![Web 1](https://github.com/igor-lourenco/projeto-spring-react-vendas/blob/main/frontend/src/assets/img/home.png)

![Web 2](https://github.com/igor-lourenco/projeto-spring-react-vendas/blob/main/frontend/src/assets/img/dashboard.png)

## Modelo conceitual
![Modelo Conceitual](https://github.com/igor-lourenco/projeto-spring-react-vendas/blob/main/frontend/src/assets/img/modelo_conceitual.png)

## Padrão camadas
![Modelo Conceitual](https://github.com/igor-lourenco/projeto-spring-react-vendas/blob/main/frontend/src/assets/img/padrao_camadas.png)

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven
## Front end
- HTML / CSS / JS / TypeScript
- ReactJS
- React Native
- Apex Charts
- Expo
## Implantação em produção
- Back end: Heroku
- Front end web: Netlify
- Banco de dados: Postgresql

# Como executar o projeto

## Back end
Pré-requisitos: Java 11

```bash
# clonar repositório
git clone https://github.com/igor-lourenco/projeto-spring-react-vendas

# entrar na pasta do projeto back end(os dados demoram 30s para ser carregados pelo heroku)
cd backend

# executar o projeto
./mvnw spring-boot:run
```

## Front end web
Pré-requisitos: npm / yarn

```bash
# clonar repositório
git clone https://github.com/igor-lourenco/projeto-spring-react-vendas

# entrar na pasta do projeto front end web
cd front-web

# instalar dependências
yarn install

# executar o projeto
yarn start
```

# Autor

Igor Lourenço Dos Santos

https://www.linkedin.com/in/igor-lourenco-santos
