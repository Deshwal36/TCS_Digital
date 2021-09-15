import com.Digital.CodeTemplate;
import org.junit.Assert;
import org.junit.Test;

public class MainTest {
    @Test
    public void test(){

        Assert.assertEquals(2,new CodeTemplate().gcd(4,6));
    }
}
