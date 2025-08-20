import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void deveSomarCorretamenteQuandoOsValoresForemInteiros() {

        Calculadora calculadora = new Calculadora();
        double resultadoEsperado = 5;

        double valorCalculado = calculadora.soma(2, 3);

        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }

    @Test
    public void deveSubtrairCorretamenteQuandoNumerosForemInteiros() {

        Calculadora calculadora = new Calculadora();
        double resultadoEsperado = 2;

        double valorCalculado = calculadora.subtracao(3, 1);

        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }

    @Test
    public void deveMultiplicarCorretamenteQuandoNumerosForemInteiros() {

        Calculadora calculadora = new Calculadora();
        double resultadoEsperado = 55;

        double valorCalculado = calculadora.multiplicar(5, 11);

        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }

    @Test
    public void deveDividirCorretamenteQuandoNumerosForemInteiros() {

        Calculadora calculadora = new Calculadora();
        double resultadoEsperado = 2;

        double valorCalculado = calculadora.dividir(4, 2);

        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }

    @Test
    public void deveDividirCorretamenteQuandoNumerosPossuemPontosFlutuantes() {

        Calculadora calculadora = new Calculadora();
        double resultadoEsperado = 2.5;

        double valorCalculado = calculadora.dividir(5.0, 2.0);

        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }
}