package spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.shape.Shape;

public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(".spring");
        Calculator calculator = (Calculator) context.getBean(Calculator.class);
        //When
        double val1 = calculator.add(10,10);
        double val2 = calculator.sub(10,10);
        double val3 = calculator.mul(10,10);
        double val4 = calculator.div(10,10);

        //Then
        Assert.assertEquals(20.0, val1,0);
        Assert.assertEquals(0.0, val2,0);
        Assert.assertEquals(100.0, val3,0);
        Assert.assertEquals(1, val4,0);
    }
}
