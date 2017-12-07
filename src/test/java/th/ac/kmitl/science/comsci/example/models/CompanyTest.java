package th.ac.kmitl.science.comsci.example.models;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CompanyTest {

	Company company = new Company();
	
	@Test
	public void testgetId() {
		String id = "id58050418";
		company.setId(id);
		assertEquals(company.getId(), "id58050418");
    }
    
	@Test
	public void testgetName() {
		String name = "Auttapon Kan-uphai";
		company.setName(name);
		assertEquals(company.getName(), "Auttapon Kan-uphai");
    }
    
	@Test
	public void testgetGlobalId() {
		String globalId = "GId58050418";
		company.setGlobalId(globalId);
		assertEquals(company.getGlobalId(), "GId58050418");
	}
    
	@Test
	public void testgetTaxId() {
		String taxId = "TId58050418";
		company.setTaxId(taxId);
		assertEquals(company.getTaxId(), "TId58050418");
	}
}
