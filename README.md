# Lição 6 - Herança com Formas Geométricas

Programa em Java que usa **herança** e **polimorfismo** para cadastrar formas geométricas (retângulos e círculos) e calcular a área de cada uma, por meio de um menu no console.

## Estrutura

```
Licao6/
├── FormaGeometrica.java   # Classe base
├── Retangulo.java         # Herda de FormaGeometrica
├── Circulo.java           # Herda de FormaGeometrica
└── Menu.java              # Classe com o main (menu interativo)
```

## Classes

| Classe | Descrição |
|--------|-----------|
| `FormaGeometrica` | Classe base. Tem o método `calcularArea()`, que retorna `0` e é sobrescrito pelas filhas. |
| `Retangulo` | Atributos `largura` e `altura`. Área = `largura * altura`. |
| `Circulo` | Atributo `raio`. Área = `Math.PI * raio * raio`. |
| `Menu` | Guarda até 10 formas em um array de `FormaGeometrica` e mostra o menu. |

## Conceitos praticados

- **Herança:** `Retangulo` e `Circulo` usam `extends FormaGeometrica`.
- **Sobrescrita (`@Override`):** cada filha reescreve `calcularArea()` e `toString()`.
- **Polimorfismo:** o array `FormaGeometrica[]` guarda retângulos e círculos juntos, e `calcularArea()` executa a versão de cada objeto.
- **Encapsulamento:** atributos `private` com getters e setters.
- **Menu interativo:** `Scanner`, `do-while` e `switch`.

## Menu

```
===== MENU =====
1 - Inserir e calcular área
2 - Mostrar todas as formas inseridas
3 - Sair
```

- **Opção 1:** escolha o tipo (1 - Retângulo, 2 - Círculo), informe as medidas e veja a área calculada.
- **Opção 2:** lista todas as formas inseridas com a área de cada uma.
- **Opção 3:** encerra o programa.

O array comporta no máximo 10 formas. Quando enche, o programa avisa que não dá para inserir mais.

## Como executar

Pela linha de comando, dentro da pasta `src`:

```bash
javac Licao6/*.java
java Licao6.Menu
```

Ou abra o projeto no IntelliJ IDEA e execute a classe `Menu`.
