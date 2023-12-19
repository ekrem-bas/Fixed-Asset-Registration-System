
public class FixedAssets {

    private String productDescription;
    private String productCategory;
    private String productSerialNumber;
    private String productPurchaseDate;
    private String productPrice;
    private String productLocation;
    private String productStatus;

    public FixedAssets(String productDescription, String productCategory, String productSerialNumber, String productPurchaseDate, String productPrice, String productLocation, String productStatus) {
        this.productDescription = productDescription;
        this.productCategory = productCategory;
        this.productSerialNumber = productSerialNumber;
        this.productPurchaseDate = productPurchaseDate;
        this.productPrice = productPrice;
        this.productLocation = productLocation;
        this.productStatus = productStatus;
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
