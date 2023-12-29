
// FixedAssets class
public class FixedAssets {

    // variables for assets
    private String productUser;
    private String productDescription;
    private String productCategory;
    private String productSerialNumber;
    private String productPurchaseDate;
    private String productPrice;
    private String productLocation;
    private String productStatus;

    public FixedAssets(String productUser, String productDescription, String productCategory, String productSerialNumber, String productPurchaseDate, String productPrice, String productLocation, String productStatus) {
        this.productUser = productUser;
        this.productDescription = productDescription;
        this.productCategory = productCategory;
        this.productSerialNumber = productSerialNumber;
        this.productPurchaseDate = productPurchaseDate;
        this.productPrice = productPrice;
        this.productLocation = productLocation;
        this.productStatus = productStatus;
    }

    // getters
    public String getProductUser() {
        return productUser;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public String getProductSerialNumber() {
        return productSerialNumber;
    }

    public String getProductPurchaseDate() {
        return productPurchaseDate;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public String getProductLocation() {
        return productLocation;
    }

    public String getProductStatus() {
        return productStatus;
    }

}
