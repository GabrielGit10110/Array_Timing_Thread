# ⏱️ Array Timing Thread

Aplicação que compara o tempo de percorrimento de vetores utilizando diferentes estruturas de loop (for vs foreach) através de threads.

## 🎯 Funcionalidades

- Gera um vetor de 1000 posições com valores aleatórios
- Utiliza duas threads para percorrer o mesmo vetor com diferentes abordagens
- Compara o tempo de execução entre loops `for` e `foreach`
- Exibe resultados detalhados em segundos

## 🚀 Como executar

### Pré-requisitos
- JDK 8 ou superior
- Git instalado

### Passo a passo
1. Clone o repositório:
```bash
git clone https://github.com/GabrielGit10110/ThreadVetor.git
```

2. Acesse o diretório do projeto:
```bash
cd ThreadVetor
```

3. Compile o código:
```bash
javac -d bin src/*.java
```

4. Execute a aplicação:
```bash
java -cp bin Main
```

## 🛠️ Tecnologias utilizadas
- Java SE
- Programação multithread
- Medição de tempo de execução
- Geração de números aleatórios
- Manipulação de vetores
- JDK 8+

## 📋 Exemplo de saída
```
Tempo gasto com forEach: 1.6406E-5
Tempo gasto com for clássico: 1.1624E-5
```

*Nota: Os tempos de execução podem variar dependendo do hardware e condições do sistema.*

## 👨‍💻 Desenvolvido por
[GabrielGit10110](https://github.com/GabrielGit10110)
