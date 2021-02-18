import junit.framework.TestCase;
import lombok.Data;
import org.junit.Assert;
import org.junit.Test;

public class NokTest extends TestCase {


@Test
    public void testSearchNok(){
    Nok nokFirst = new Nok();
    Assert.assertEquals(108,nokFirst.SearchNok(36,27));
}

}