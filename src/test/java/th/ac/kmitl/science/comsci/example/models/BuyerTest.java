package th.ac.kmitl.science.comsci.example.models;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BuyerTest {
 
    Buyer Testinputdata = new Buyer();
    @Test
    public void TestgetId() {
       Testinputdata.setId("P123");
       assertEquals(Testinputdata.getId(), "P123");
    }

    public void TestgetName() {
       Testinputdata.setName("Auttapon Laoudom");
       assertEquals(Testinputdata.getId(), "Auttapon Laoudom");
    }
    
    public void TestgetGlobalId() {
       Testinputdata.setGlobalId("G123");
       assertEquals(Testinputdata.getGlobalId(), "P123");
    }

    public void TestgetTaxId() {
        Testinputdata.setTaxId("123");
        assertEquals(Testinputdata.getTaxId(), "123");
    }
}
