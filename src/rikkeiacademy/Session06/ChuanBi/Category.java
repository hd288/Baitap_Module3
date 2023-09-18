package rikkeiacademy.Session06.ChuanBi;

public class Category {
    private int categoryId;
    private String categoryName;

    public Category(int categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public Category() {
        categoryId = 0;
        categoryName = null;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void display() {
        System.out.println("Caregory ID: " + categoryId);
        System.out.println("Category name: " + categoryName);
    }
}
