package th.ac.kmitl.science.comsci.example.models;

public class TradeProduct {

    private String id;
    private String globalId;
    private String name;

    public TradeProduct() {
    }

    public TradeProduct(String id,
                        String globalId,
                        String name) {
        this.id = id;
        this.globalId = globalId;
        this.name = name;
    }

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
}
