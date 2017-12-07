package th.ac.kmitl.science.comsci.example.models;

public class Company{
    
	String id;
	String globalId;
	String name;
	String taxId;
	
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGlobalId() {
        return globalId;
    }

    public void setGlobalId(String globalId) {
        this.globalId = globalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }
    
    public String getTaxId() {
        return taxId;
    }

}
