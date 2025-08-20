# 📌 Calculadora em Java

Este projeto implementa uma **calculadora simples em Java**, com operações básicas e testes unitários.  
O objetivo é praticar a criação de métodos, organização de código e escrita de testes com **JUnit**.  

---

## ⚙️ Funcionalidades

A classe `Calculadora` implementa os seguintes métodos:

- **Soma** ➝ `soma(double a, double b)`
- **Subtração** ➝ `subtracao(double a, double b)`
- **Multiplicação** ➝ `multiplicacao(double a, double b)`
- **Divisão** ➝ `divisao(double a, double b)`

### 🔥 Desafios opcionais
- **Raiz quadrada** ➝ `raizQuadrada(double a)`
- **Exponenciação** ➝ `exponenciacao(double base, double expoente)`
- **Bhaskara** ➝ `bhaskara(double a, double b, double c)` → retorna a **soma de x' e x''**

---

## 🧪 Testes Unitários

Os testes foram escritos utilizando **JUnit**.  
Os métodos de teste obrigatórios são:

- `deveSomarCorretamenteQuandoOsValoresForemInteiros`
- `deveDividirCorretamenteQuandoNumerosForemInteiros`
- `deveMultiplicarCorretamenteQuandoNumerosForemInteiros`
- `deveDividirCorretamenteQuandoNumerosPossuemPontosFlutuantes`

### ✅ Exemplo de teste
```java
@Test
public void deveSomarCorretamenteQuandoOsValoresForemInteiros(){
    //Arrange
    double valor1 = 2;
    double valor2 = 2;
    double resultadoEsperado = 4;
    Calculadora calculadora = new Calculadora();

    //Act
    double valorCalculado = calculadora.soma(valor1, valor2);

    //Assert
    Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
}
