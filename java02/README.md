# Caixa eletrônico
## Projeto de estudo

Caixa eletrônico, um programa de serviços de caixa eletrônico. Com controles simples de depósito, ver saldo e sair.
    


## Objetivos do exercício

Entender como criar um menu de escolhas que reage as escolhas do usuário, permitindo-o navegar pelas opções do programa.

## Tecnologias e ferramentas

- VsCode
- Java

## Executar

Para executar, basta executar a classe **App**.

## O que aprendi?

- Se os métodos são funções, além dos métodos Get e Set de cada objeto, é possível fazer uso de métodos privados para procedimentos internos do objeto. 

- No caso da classe **Caixa** tem somente um método **público** que é o **startMenu**, quando crio uma instancia de **Caixa** em **App**, o único método que ativo é este. Que faz uso dos outros que são **privados**. Assim outros objetos não podem ativar procedimentos **privados** deste objeto e nem acessar diretamente valores de atributos, e isso se chama encapsulamento.

- E os nomes dos métodos devem fazer sentido para melhor manutenção do código. 

- O **Scanner** pode ser instanciado fora de um método. Para assim ser usado em todos os métodos da classe.

- O uso do Byte como tipo na linha 15 da classe Caixa foi para menor consumo de memória. O Byte é um tipo primitivo que consome menos memória do que o Short, Integer e Long. Cada um é respectivamente, menor do que o tipo seguinte.

- Pude fazer um uso básico do Switch da linha 20 até a linha 42 da classe Caixa. Talvez esta não seja a melhor maneira de construir um menu, mas é algo que funciona agora. Pode ser modificado.