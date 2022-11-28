
import org.example.Cat;
import org.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline = new Feline();

    @Test
    public void testGetSound(){
        Cat cat = new Cat(feline);
        String expected = "Мяу";
        String actual = cat.getSound();
        Assert.assertEquals(expected,actual);
    }
        @Test
        public void testGetFood() throws Exception {
            Cat cat = new Cat(feline);
            List<String>food = List.of("Животные", "Птицы", "Рыба");
            Mockito.when(feline.eatMeat()).thenReturn(food);
            Assert.assertEquals(food,cat.getFood());
        }

}
