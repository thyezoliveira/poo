# Exercícios

Exercício para aprender o início de Typescript.

## Objetivo do exercício

- Aprender sobre a tipagem do Typescript.
- Aprender a rodar um código em Typescript.

## Tecnologias e ferramentas

- VsCode
- NodeJs
- Typescript

## Evecutar

Para executar, basta executar: **npm start**

## O que aprendi?

### Instalação do Typescript
- Para instalar o typescript em um projeto é preciso após o **npm init** inserir **npm install typescript** para adicionar a dependencia no package.json.
- Para adicionar o arquivo de configurações do Typescript (tsconfig.json) de se rodar **npx tsc --init**.
- No arquivo tsconfig.json podemos definir o diretório de saida na opção outDir, sendo assim, o arquivo .js gerado não cairá na pasta raiz.
- Para gerar o código js deve-se executar o comando **npx tsc**. E assim o arquivo gerado, é um arquivo js e pode ser executado tanto no nodeJs quanto no navegador. Dizemos que o arquivo foi transpilado para Javascript.

### Uso do Typescript
- Typescript é uma linguagem fortemente tipada. A tipagem do typescript vem depois do nome da variável separado por dois pontos (:). Portanto deve se atentar a declaração de variáveis. Elas deve vir acompanhadas do tipo de valor.
- Para declarar atributos verdadeiramente privados devemos inserir um # antes do nome do atributo sem espaço.
- Interfaces ajudam a construir um código conciso e baseado em modelos bem definidos. Declarar uma interface em TS é criar uma forma de objeto explicitamente definindo a tipagem de seus membros.
- Podemos passar um objeto como parametro de um método usando a interface como modelo.