import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.services.CountOfSqrInBoundariesService;

public class CountOfSqrInBoundariesServiceTest {
    @Test
    public void shouldFindZero(){
        CountOfSqrInBoundariesService service= new CountOfSqrInBoundariesService();
        int expected=0;
        int actual=service.calcCountSqr(0,99);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldFindOne(){
        CountOfSqrInBoundariesService service= new CountOfSqrInBoundariesService();
        int expected=1;
        int actual=service.calcCountSqr(0,100);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldStillFindOne(){
        CountOfSqrInBoundariesService service= new CountOfSqrInBoundariesService();
        int expected=1;
        int actual=service.calcCountSqr(100,120);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldFindTwo(){
        CountOfSqrInBoundariesService service= new CountOfSqrInBoundariesService();
        int expected=2;
        int actual=service.calcCountSqr(100,121);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldFindMany(){
        CountOfSqrInBoundariesService service= new CountOfSqrInBoundariesService();
        int expected=3;
        int actual=service.calcCountSqr(200,300);
        Assertions.assertEquals(expected,actual);
    }
}
