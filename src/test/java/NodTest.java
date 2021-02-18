import junit.framework.TestCase;
import lombok.Data;
import org.junit.Assert;
import org.junit.Test;

public class NodTest extends TestCase {

    @Test

    public void TestSearchNod() {
        Nod nodFirst = new Nod();
        Assert.assertEquals(9,nodFirst.SearchNod(36,27));
    }
}