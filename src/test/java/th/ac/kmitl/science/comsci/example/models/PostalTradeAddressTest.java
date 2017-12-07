package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PostalTradeAddressTest {

    PostalTradeAddress postalTradeAddress = new PostalTradeAddress();
    
    @Test
    public void testgetLineOne() {
       postalTradeAddress.setLineOne("Pasthiyakan Kaewpitak");
       assertEquals(postalTradeAddress.getLineOne(), "Pasthiyakan Kaewpitak");
    }
    
    @Test
    public void testgetLineTwo() {
       postalTradeAddress.setLineTwo("24000");
       assertEquals(postalTradeAddress.getLineTwo(), "24000");
    }   
    
    @Test
    public void testgetLineThree() {
       postalTradeAddress.setLineThree("Onnut 10");
       assertEquals(postalTradeAddress.getLineThree(), "Onnut 10");
    }
     
    @Test
    public void testgetLineFour() {
       postalTradeAddress.setLineFour("Golden Town");
       assertEquals(postalTradeAddress.getLineFour(), "Golden Town");
    }

    @Test
    public void testgetLineFive() {
       postalTradeAddress.setLineFour("1");
       assertEquals(postalTradeAddress.getLineFour(), "1");
    }

    @Test
    public void testgetStreetName() {
       postalTradeAddress.setLineFour("Sukhumvit");
       assertEquals(postalTradeAddress.getLineFour(), "Sukhumvit");
    }
    
    @Test
    public void testgetCityName() {
       postalTradeAddress.setCityName("Suan Luang");
       assertEquals(postalTradeAddress.getCityName(), "Suan Luang");
    }
    
    @Test
    public void testgetCitySubDivisionName() {
       postalTradeAddress.setCitySubDivisionName("Suan Luang");
       assertEquals(postalTradeAddress.getCitySubDivisionName(), "Suan Luang");
    }
   
    @Test
    public void testgetCountry() {
       postalTradeAddress.setCountry("Thai");
       assertEquals(postalTradeAddress.getCountry(), "Thai");
    }

    @Test
    public void testgetCountrySubDivision() {
       postalTradeAddress.setCountrySubDivision("Bangkok");
       assertEquals(postalTradeAddress.getCountrySubDivision(), "Bangkok");
    }

    @Test
    public void testgetBuildingNumber() {
       postalTradeAddress.setBuildingNumber("311");
       assertEquals(postalTradeAddress.getBuildingNumber(), "311");
    }
}
