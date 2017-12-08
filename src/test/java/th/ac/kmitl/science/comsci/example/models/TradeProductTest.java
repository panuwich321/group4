package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TradeProductTest {
    TradeProduct tradeProduct = new TradeProduct();

    @Test
    public void testConstructor(){
        String id = "id2780101";
        String globalId = "GId2780101";
        String name = "Richard Mille RM 30 Le Mans Classic";
        TradeProduct ConstructorTradeProduct = new TradeProduct(id,
                                                                globalId,
                                                                name);
        assertEquals(id, ConstructorTradeProduct.getId());
        assertEquals(globalId, ConstructorTradeProduct.getGlobalId());
        assertEquals(name, ConstructorTradeProduct.getName());
    }

    @Test
    public void testGetId() {
        tradeProduct.setId("id2780101");
        assertEquals("id2780101", tradeProduct.getId());
    }

    @Test
    public void testGetGlobalId() {
        tradeProduct.setGlobalId("GId2780101");
        assertEquals("GId2780101", tradeProduct.getGlobalId());
    }

    @Test
    public void testGetName() {
        tradeProduct.setName("Richard Mille RM 30 Le Mans Classic");
        assertEquals("Richard Mille RM 30 Le Mans Classic", tradeProduct.getName());
    }
}
