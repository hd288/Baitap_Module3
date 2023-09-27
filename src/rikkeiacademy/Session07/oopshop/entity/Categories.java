package rikkeiacademy.Session07.oopshop.entity;

import java.util.ArrayList;
import java.util.Scanner;

public class Categories {
    private int catalogId;
    private String catalogName;
    private String descriptions;
    private boolean catalogStatus;

    public Categories() {
    }

    public Categories(int catalogId, String catalogName, String descriptions, boolean catalogStatus) {
        this.catalogId = catalogId;
        this.catalogName = catalogName;
        this.descriptions = descriptions;
        this.catalogStatus = catalogStatus;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public boolean getCatalogStatus() {
        return catalogStatus;
    }

    public void setCatalogStatus(boolean catalogStatus) {
        this.catalogStatus = catalogStatus;
    }

    public void inputData(Scanner scanner, ArrayList<Categories> categoriesList) {
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Enter catalog name: ");
                String name = scanner.nextLine();
                validateCatalogName(name);

                System.out.print("Enter description: ");
                String description = scanner.nextLine();

                System.out.print("Enter catalog status (true/false): ");
                boolean status = scanner.nextBoolean();

                int maxCatalogId = 0;
                for (Categories category : categoriesList) {
                    if (category.getCatalogId() > maxCatalogId) {
                        maxCatalogId = category.getCatalogId();
                    }
                }
                int newCatalogId = maxCatalogId + 1;

                Categories newCategory = new Categories(newCatalogId, name, description, status);
                categoriesList.add(newCategory);

                validInput = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input. " + e.getMessage());
                scanner.nextLine();
            }
        }
    }

    public void displayData() {
        System.out.println("_____________________________");
        System.out.println("Catalog ID: " + catalogId);
        System.out.println("Catalog Name: " + catalogName);
        System.out.println("Description: " + descriptions);
        System.out.println("Catalog Status: " + catalogStatus);
    }

    // Validate catalog name
    private void validateCatalogName(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Catalog name cannot be empty.");
        }
        if (name.length() > 50) {
            throw new IllegalArgumentException("Catalog name exceeds the maximum length of 50 characters.");
        }
    }
}