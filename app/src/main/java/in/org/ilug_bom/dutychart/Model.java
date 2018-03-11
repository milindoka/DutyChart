package in.org.ilug_bom.dutychart;

/**
 * Created by milind on 11/3/18.
 */
public class Model {

    private String sNo;
    private String product;
    private String category;
    private String price;

    public Model(String sNo, String product, String category, String price) {
        this.sNo = sNo;
        this.product = product;
        this.category = category;
        this.price = price;
    }

    public String getsNo() {
        return sNo;
    }

    public String getProduct() {
        return product;
    }

    public String getCategory() {
        return category;
    }

    public String getPrice() {
        return price;
    }
}