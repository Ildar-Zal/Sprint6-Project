import org.example.Feline;
import org.example.Lion;
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

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionTest  {

    private String sex;
    private boolean mane;

    public LionTest(String sex,boolean mane){
        this.sex=sex;
        this.mane=mane;
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getSex() {
        return new Object[][]{
                {"Самец",true},
                {"Самка",false},
        };
    }


    @Mock
    Feline feline = new Feline();


    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetFood1() throws Exception {
        List<String>food = List.of("Животные","Птица","Рыба");
        Lion lion =new Lion(sex,feline);
        Mockito.when(feline.eatMeat()).thenReturn(food);
        Assert.assertEquals(food,lion.getFood());
    }



    @Test
    public void testDoesHaveMane() throws Exception {
        Lion lion = new Lion(sex,feline);
        assertEquals(mane,lion.doesHaveMane());
    }

    @Test
    public void testGetKittnes() throws Exception{
           Lion lion = new Lion(sex,feline);
           Mockito.when(feline.getKittens()).thenReturn(1);
           assertEquals(1,lion.getKittens());

    }


}
