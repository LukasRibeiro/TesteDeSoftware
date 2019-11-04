import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

//@TestInstance(Lifecycle.PER_CLASS)
public class calculadoraTest {

    Calculadora cal = new Calculadora();

    @ParameterizedTest
    @CsvSource(value={"1:2:3","10:10:20","30:30:60","25:25:50"}, delimiter = ':')
    public void somaTest(int x, int y)
    {   int result;
        result = cal.soma(x,y);
        assertEquals(x + y, result);
    }

    @ParameterizedTest
    @CsvSource(value={"10:10:0","7:5:2","5:2:3","2:1:1"}, delimiter = ':')
    public void subtrairTest(int x, int y)
    {   int result;
        result = cal.subtrair(x,y);
        assertEquals(x - y, result);
    }

    @ParameterizedTest
    @CsvSource(value={"10:10:100","7:5:35","5:2:10","2:1:2"}, delimiter = ':')
    public void multiplicaTest(int x, int y)
    {   int result;
        result = cal.multiplica(x,y);
        assertEquals(x * y, result);
    }

    
    @ParameterizedTest(name="teste [index] => x ={0} y={1}," + "resultado {2}")
    @CsvFileSource(resources ="/teste.txt", delimiter = ':')
    public void somaTestFile(int x, int y, int resultado)
    {   int result;
        result = cal.soma(x,y);
        assertEquals(resultado, result);
    }





    // @ParameterizedTest(name="teste [index] => x =[0] y=[1]," + "resultado [500]")

    // @CsvFileSource(resources ="/teste.txt", delimiter = ',')
    // public void multiplicaTestFile(int x, int y)
    // {   int result;
    //     result = cal.multiplica(x,y);
    //     assertEquals(x * y, result);
    // }

    // @ParameterizedTest
    // @ValueSource(ints={1,2,3,4,5,6,7,8,9,10})
    // public void quadradoTest(int x)
    // {   int result;
    //     result = cal.quadrado(x);
    //     assertEquals(x * x, result);
    // }
}