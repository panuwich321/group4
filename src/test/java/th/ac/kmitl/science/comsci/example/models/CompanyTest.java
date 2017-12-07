package th.ac.kmitl.science.comsci.example.models;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CompanyTest {

	Company Testinputdata = new Company();
	
	@Test
	public void testgetId() {
		String id = "id58050418";
		Testinputdata.setId(id);
		assertEquals(Testinputdata.getId(), "id58050418");
    }
    
	@Test
	public void testgetName() {
		String name = "Auttapon Kan-uphai";
		Testinputdata.setName(name);
		assertEquals(Testinputdata.getName(), "Auttapon Kan-uphai");
    }
    
	@Test
	public void testgetGlobalId() {
		String globalId = "GId58050418";
		Testinputdata.setGlobalId(globalId);
		assertEquals(Testinputdata.getGlobalId(), "GId58050418");
	}
    
	@Test
	public void testgetTaxId() {
		String taxId = "TId58050418";
		Testinputdata.setTaxId(taxId);
		assertEquals(Testinputdata.getTaxId(), "TId58050418");
	}
}
