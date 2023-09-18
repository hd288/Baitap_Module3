package rikkeiacademy.Session06.ChuanBi;

public class Product {
    private int productID;
    private String productName;
    private float productPrice;
    private Category category;

    public Product(int productID, String productName, float productPrice, Category category) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.category = category;
    }

    public Product() {
        productID = 0;
        productName = null;
        productPrice = 0;
        category = null;
    }

    public static void main(String[] args) {
        Category category1 = new Category(1, "panasonic");
        Category category2 = new Category(2, "apple");

        Product product1 = new Product();
        product1.setProductID(1);
        product1.setProductName("Product 1");
        product1.setProductPrice(100);
        product1.setCategory(category1);

        Product product2 = new Product(2, "Product 2", 200, category2);

        product1.display();
        product2.display();
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void display() {
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + productPrice);
        System.out.println("Category:");
        category.display();
    }
}