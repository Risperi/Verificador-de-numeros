

# 🔐 Verificador de Número de Conta

Este é um projeto simples em **Java** criado para praticar **validação de dados**, **tratamento de exceções** e **organização de código**.
A ideia é garantir que o número de conta informado pelo usuário siga um padrão válido antes de continuar a execução do programa.

---

##  Sobre o projeto

Ao executar o programa, o usuário informa um número de conta pelo terminal.
Se o valor não estiver no formato correto, o sistema avisa o erro e pede para tentar novamente — tudo de forma clara e amigável.

O programa só finaliza quando um número de conta válido é digitado.

Este projeto foi feito com foco em **aprendizado**, principalmente para entender como funcionam:

* exceções personalizadas
* `try` / `catch`
* validação com regras simples
* separação de responsabilidades entre classes

---

##  Como o programa funciona

1. O usuário digita o número da conta
2. O sistema verifica se ele possui **exatamente 8 dígitos**
3. Se estiver inválido, uma exceção personalizada é lançada
4. Uma mensagem de erro é exibida
5. O usuário pode tentar novamente
6. Quando o número é válido, o programa é finalizado

---

##  Estrutura do projeto

```text
Verificador-de-numeros/
├── src/
│   └── Program/
│       ├── VerificadorNumeroConta.java
│       ├── ValidadorNumeroConta.java
│       └── NumeroContaInvalidoException.java
└── README.md
```

Cada classe tem um papel bem definido:

* **VerificadorNumeroConta** → ponto de entrada do programa
* **ValidadorNumeroConta** → responsável apenas pela validação
* **NumeroContaInvalidoException** → exceção criada para tratar erros de forma clara

---

##  Tecnologias usadas

* Java (JDK )
* *Eclipse
* Scanner para entrada de dados
* Programação Orientada a Objetos
* Tratamento de exceções

---

##  Como executar o projeto

1. Clone o repositório:

```bash
git clone https://github.com/Risperi/Verificador-de-numeros.git
```

2. Entre na pasta do projeto:

```bash
cd Verificador-de-numeros
```

3. Compile os arquivos:

```bash
javac Program/*.java
```

4. Execute o programa:

```bash
java Program.VerificadorNumeroConta
```

---

##  Exemplo de uso

```text
Digite o numero da conta: 123
Erro: Numero de conta invalido. Digite exatamente 8 digitos.
Tente novamente.

Digite o numero da conta: 12345678
Numero de conta valido.
Programa finalizado!
```

---

##  O que aprendi com esse projeto

* Criar e usar **exceções personalizadas**
* Validar dados antes de processá-los
* Organizar o código em classes com responsabilidades claras
* Tornar mensagens de erro mais amigáveis para o usuário

---

## 👤 Autor

Feito por **André Thiago (Risperi)**
Estudante de Ciência da Computação e apaixonado por tecnologia 🚀

🔗 GitHub: [https://github.com/Risperi](https://github.com/Risperi)

---

