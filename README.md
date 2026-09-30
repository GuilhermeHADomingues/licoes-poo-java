# Lições de POO em Java

Exercícios da minha jornada de estudos em **Programação Orientada a Objetos com Java**, organizados por lição. Cada lição tem uma classe de domínio e um `Menu` de console para testá-la.

## Conteúdo

| Lição | Tema | O que pratica |
|---|---|---|
| [Licao1](src/Licao1) | Pessoa | Classe com atributos `private`, getters e setters, menu com `Scanner` |
| [Licao2](src/Licao2) | Aluno | Média ponderada (AC1 15%, AC2 30%, AG 10%, AF 45%) e verificação de aprovação |
| [Licao3](src/Licao3) | Funcionário | Horista x mensalista, cálculo de salário com desconto, alteração de remuneração |

## Como executar

É preciso ter o JDK instalado. A partir da pasta `src`:

```bash
cd src
javac Licao1/*.java
java Licao1.Menu
```

Troque `Licao1` por `Licao2` ou `Licao3` para rodar as outras.

## Estrutura

```
licoes-poo-java/
├── README.md
├── .gitignore
└── src/
    ├── Licao1/  (Pessoa.java, Menu.java)
    ├── Licao2/  (Aluno.java, Menu.java)
    └── Licao3/  (Funcionario.java, Menu.java)
```

## Autor

Guilherme Henrique — [GitHub](https://github.com/GuilhermeHADomingues) · [LinkedIn](https://linkedin.com/in/guilhermeadomingues)
