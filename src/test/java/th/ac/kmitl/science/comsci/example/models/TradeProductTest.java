package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TradeProductTest {

    TradeProduct tradeProduct = new TradeProduct();

    @Test
    public void testConstructor(){
        String id = "id2780101";
        String globalId = "GId2780101";
        String name = "Laptop";
        TradeProduct ConstructorTradeProduct = new TradeProduct(id,
                                                                globalId,
                                                                name);
        assertEquals(id, ConstructorTradeProduct.getId());
        assertEquals(globalId, ConstructorTradeProduct.getGlobalId());
        assertEquals(name, ConstructorTradeProduct.getName());
    }

    @Test
    public void testGetAllVariable() {
        tradeProduct.setId("id2780101");
        tradeProduct.setGlobalId("GId2780101");
        tradeProduct.setName("Laptop");
        assertEquals("id2780101", tradeProduct.getId());
        assertEquals("GId2780101", tradeProduct.getGlobalId());
        assertEquals("Laptop", tradeProduct.getName());
    }
}
