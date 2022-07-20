### Tarefa 011 - 08/07/2022

## Padrões de codificação
Tais padrões são utilizados para facilitar o processo de desenvolvimento, eliminar bugs com facilidade, e fazer manutenção de maneira mais ágil, aumentando assim a produtividade do projeto no geral. Para isso utilizamos de várias convenções para deseolver um código mais legível, como por exemplo: o uso de comentários, a identação correta, quebras de linhas e organização das classes tanto quanto aos níveis quanto a ordenação, e também convenções de nomenclatura de arquivos, classes, métodos, variáveis e etc.

## Reflexão
O Reflection fornece objetos (Type) que descrevem assemblies, módulos e tipos. Você pode usar a reflexão para criar dinamicamente uma instância de um tipo, associar esse tipo a um objeto existente ou obter o tipo de um objeto existente e chamar seus métodos ou acessar suas propriedades e campos. Se você usar propriedades em seu código, a reflexão permitirá acessá-las, por exemplo:

```
int i = 42;

Type type = i.GetType();

Console.WriteLine(type);
```
A saída será: System.Int32

## Programação defensiva
A programação defensiva é a criação de código para algum software projetado para evitar problemas e tornar o produto mais estável. A ideia básica por trás dessa abordagem é criar um programa que funcione corretamente mesmo durante processos imprevistos ou entradas inesperadas do usuário. A programação defensiva geralmente depende de alguma combinação paradoxal de eliminação de código desnecessário, garantindo que código suficiente seja gerado para lidar com todas as ações possíveis do usuário. Testes extensivos também são importantes para esse processo, assim como a criação de software que seja fácil de auditar e verificar. O teste de software é um dos principais aspectos na programação defensiva.