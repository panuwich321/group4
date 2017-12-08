package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PostalTradeAddressTest {

    PostalTradeAddress postalTradeAddress = new PostalTradeAddress();

    @Test
    public void testConstructor(){
        String lineOne = "Pasthiyakan Kaewpitak" ;

        String lineTwo = "24000";

        String lineThree = "Onnut 10";

        String lineFour = "Golden Town";

        String lineFive = "1";

        String streetName = "Sukhumvit";

        String cityName = "Suan Luang";

        String citySubDivisionName = "Suan Luang";

        String country = "Thai";

        String countrySubDivision = "Bangkok";

        String buildingNumber = "311";

        PostalTradeAddress ConstructorPostalTradeAddress = new PostalTradeAddress(lineOne,
                                                                                  lineTwo,
                                                                                  lineThree,
                                                                                  lineFour,
                                                                                  lineFive,
                                                                                  streetName,
                                                                                  cityName,
                                                                                  citySubDivisionName,
                                                                                  country,
                                                                                  countrySubDivision,
                                                                                  buildingNumber);

        assertEquals(lineOne, ConstructorPostalTradeAddress.getLineOne());
        assertEquals(lineTwo, ConstructorPostalTradeAddress.getLineTwo());
        assertEquals(lineThree, ConstructorPostalTradeAddress.getLineThree());
        assertEquals(lineFour, ConstructorPostalTradeAddress.getLineFour());
        assertEquals(lineFive, ConstructorPostalTradeAddress.getLineFive());
        assertEquals(streetName, ConstructorPostalTradeAddress.getStreetName());
        assertEquals(cityName, ConstructorPostalTradeAddress.getCityName());
        assertEquals(citySubDivisionName, ConstructorPostalTradeAddress.getCitySubDivisionName());
        assertEquals(country, ConstructorPostalTradeAddress.getCountry());
        assertEquals(countrySubDivision, ConstructorPostalTradeAddress.getCountrySubDivision());
        assertEquals(buildingNumber, ConstructorPostalTradeAddress.getBuildingNumber());
    }


    @Test
    public void testGetLineOne() {
        postalTradeAddress.setLineOne("Pasthiyakan Kaewpitak");
        assertEquals("Pasthiyakan Kaewpitak", postalTradeAddress.getLineOne());
    }

    @Test
    public void testGetLineTwo() {
       postalTradeAddress.setLineTwo("24000");
       assertEquals("24000", postalTradeAddress.getLineTwo());
    }   
    
    @Test
    public void testGetLineThree() {
       postalTradeAddress.setLineThree("Onnut 10");
       assertEquals("Onnut 10", postalTradeAddress.getLineThree());
    }
     
    @Test
    public void testGetLineFour() {
       postalTradeAddress.setLineFour("Golden Town");
       assertEquals("Golden Town", postalTradeAddress.getLineFour());
    }

    @Test
    public void testGetLineFive() {
       postalTradeAddress.setLineFive("1");
       assertEquals("1", postalTradeAddress.getLineFive());
    }

    @Test
    public void testGetStreetName() {
       postalTradeAddress.setStreetName("Sukhumvit");
       assertEquals("Sukhumvit", postalTradeAddress.getStreetName());
    }
    
    @Test
    public void testGetCityName() {
       postalTradeAddress.setCityName("Suan Luang");
       assertEquals("Suan Luang", postalTradeAddress.getCityName());
    }
    
    @Test
    public void testGetCitySubDivisionName() {
       postalTradeAddress.setCitySubDivisionName("Suan Luang");
       assertEquals("Suan Luang", postalTradeAddress.getCitySubDivisionName());
    }
   
    @Test
    public void testGetCountry() {
       postalTradeAddress.setCountry("Thai");
       assertEquals("Thai", postalTradeAddress.getCountry());
    }

    @Test
    public void testGetCountrySubDivision() {
       postalTradeAddress.setCountrySubDivision("Bangkok");
       assertEquals("Bangkok", postalTradeAddress.getCountrySubDivision());
    }

    @Test
    public void testGetBuildingNumber() {
       postalTradeAddress.setBuildingNumber("311");
       assertEquals("311", postalTradeAddress.getBuildingNumber());
    }
}
