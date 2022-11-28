import org.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;


public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void testEatMeat() throws Exception{
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = feline.eatMeat();
        Assert.assertEquals(expectedFood,actualFood);
    }
    @Test
    public void testGetFamily() throws Exception{
        String expect = "Кошачьи";
        String actual = feline.getFamily();
        Assert.assertEquals(expect,actual);
    }
    @Test
    public void testGetKittens() throws Exception{
        int expect = 1;
        int actual = feline.getKittens();
        Assert.assertEquals(expect,actual);
    }

    @Test
    public void testGetKittensArg() throws Exception{
        int expect = 4;
        int actual = feline.getKittens(4);
        Assert.assertEquals(expect,actual);
    }
}