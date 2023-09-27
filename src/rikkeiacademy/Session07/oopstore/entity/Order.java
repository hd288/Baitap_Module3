package rikkeiacademy.Session07.oopstore.entity;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Order {
    private static final int count = 1;
    private String orderId;
    private int quantity;
    private String productId;
    private String createdDate;
    private int userCreateId;
    private int userUpdateId;
    private String updatedDate;
    private boolean orderType;
    private float price;
    private boolean orderStatus;

    /**
     * Constructor
     */
    public Order() {
    }


    /**
     * Getter / Setter
     */

    public int getUserUpdateId() {
        return userUpdateId;
    }

    public void setUserUpdateId(int userUpdateId) {
        this.userUpdateId = userUpdateId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public int getUserCreateId() {
        return userCreateId;
    }

    public void setUserCreateId(int userCreateId) {
        this.userCreateId = userCreateId;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    public boolean isOrderType() {
        return orderType;
    }

    public void setOrderType(boolean orderType) {
        this.orderType = orderType;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(boolean orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * name: inputData(Scanner scanner)
     *
     * @param: scanner
     * function: input order information
     * date: 22/09/2023
     */
    public void inputData(Scanner scanner, String billType, Product[] products, int productLength, Employee[] employees, int empCurIndex) {
        boolean isLoop = true;
        boolean isExist = false;

        /** Input OrderID */
        // Get month-year
        YearMonth ym = YearMonth.now();
        String ymStr = ym.format(DateTimeFormatter.ofPattern("MMyy"));

        // STT autoIncrement
        String stt = count < 10 ? "0" + count : Integer.toString(count);

        this.productId = billType + "-" + ymStr + "-" + stt;

        /** Input Quantity */
        while (isLoop) {
            System.out.println("Enter Quantity:");
            this.quantity = scanner.nextInt();
            scanner.nextLine();

            if (this.quantity < 1) {
                System.err.println("The quantity must be greater than 0");
            } else {
                break;
            }
        }

        /** Input ProductId */
        while (isLoop) {
            isExist = false;

            System.out.println("Enter ProductId:");
            String productId = scanner.nextLine().trim();

            for (int i = 0; i < productLength; i++) {
                if (products[i].getProductId().equalsIgnoreCase(productId)) {
                    this.productId = products[i].getProductId();
                    isExist = true;
                    break;
                }
            }

            if (!isExist) {
                System.err.printf("The Product \"%s\" is not exist in product list!\n", productId);
            }
        }

        /** Input UserCreateId */
        while (isLoop) {
            try {
                System.out.println("Enter UserID:");
                this.userCreateId = Integer.parseInt(scanner.nextLine().trim());

                if (this.userCreateId >= 1 && this.userCreateId <= empCurIndex) {
                    break;
                } else {
                    System.err.printf("The UserID %d is no exist in employee list\n", userCreateId);
                }
            } catch (Exception e) {
                System.err.println("The User ID must be integer.");
            }

        }

        /** Input CreatedDate */
        LocalDate localDate = LocalDate.now();
        this.createdDate = localDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));


        /** Input OrderType */
        this.orderType = billType == "PN";

        /** Input Price */
        while (isLoop) {
            System.out.println("Enter Price:");
            this.price = scanner.nextFloat();
            scanner.nextLine();

            if (price < 1) {
                System.err.printf("The price of %s must be greater than 0\n", price);
            } else {
                break;
            }
        }

        /** Input OrderStatus */
        while (isLoop) {
            System.out.println("Enter OrderStatus (true - Active, false - Cancel):");
            String status = scanner.nextLine().trim();

            if (status.equalsIgnoreCase("true") || status.equalsIgnoreCase("false")) {
                this.orderStatus = Boolean.parseBoolean(status);
                break;
            } else {
                System.err.printf("The OrderStatus \"%s\" is incorrect\n", status);
            }
        }
    }

    /**
     * name: updateData(Scanner scanner)
     *
     * @param: scanner
     * function: update order information
     * date: 22/09/2023
     */
    public void updateData(Scanner scanner, Product[] products, int proCurIndex, Employee[] employees, int empCurIndex) {
        boolean isLoop = true;
        boolean isExist = false;

        /** Input updateQuantity */
        while (isLoop) {
            System.out.println("Enter updateQuantity:");
            String quantity = scanner.nextLine().trim();

            if (quantity == "") {
                break;
            }

            if (Pattern.matches("^[1-9].*$", quantity)) {
                this.quantity = Integer.parseInt(quantity);
                break;
            }

            System.err.println("The quantity must be integer!");
        }

        /** Input updateProductId */
        while (isLoop) {
            System.out.println("Enter updateProductId:");
            String productId = scanner.nextLine().trim();
            isExist = false;

            if (productId == "") {
                break;
            }

            for (int i = 0; i < proCurIndex; i++) {
                if (products[i].getProductId().equals(productId)) {
                    isExist = true;
                    this.productId = productId;
                    break;
                }
            }

            if (!isExist) {
                System.err.printf("The Product %s is not exist in product list", productId);
            }
        }

        /** Input updateCreatedDate */
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        this.updatedDate = simpleDateFormat.format(LocalDate.now());

        /** Input updateUserCreatedId */
        while (isLoop) {
            isExist = false;

            System.out.println("Enter updateUserCreatedId:");
            String userID = scanner.nextLine().trim();

            if (userID == "") {
                break;
            }

            if (Integer.parseInt(userID) >= 1 && Integer.parseInt(userID) <= empCurIndex) {
                isExist = true;
                this.userCreateId = Integer.parseInt(userID);
                break;
            }

            if (!isExist) {
                System.err.printf("The UserID %s is no exist in employee list\n", userID);
            }
        }

        /** Input updatePrice */
        while (isLoop) {
            System.out.println("Enter updatePrice:");
            String price = scanner.nextLine().trim();

            if (price == "") {
                break;
            }

            if (Integer.parseInt(price) > 1) {
                this.price = Float.parseFloat(price);
                break;
            } else {
                System.err.println("The price must be greater than 0");
            }
        }

        /** Input updateOrderStatus */
        while (isLoop) {
            System.out.println("Enter updateOrderStatus:");
            String orderStatus = scanner.nextLine();

            if (orderStatus == "") {
                break;
            }

            if (orderStatus.equalsIgnoreCase("true")) {
                this.orderStatus = true;
                break;
            } else if (orderStatus.equalsIgnoreCase("false")) {
                this.orderStatus = false;
                break;
            } else {
                System.err.println("The Order status must be true or false");
            }
        }
    }

    /**
     * name: display()
     * function: show order information
     * date: 22/09/2023
     */
    public void display() {
        String orderType = this.orderType ? "Receipt" : "Bill";
        String oderStatus = this.orderStatus ? "Active" : "Non-active";

        System.out.println("==============");
        System.out.printf("OrderId: %s\n" +
                        "Quantity: %d - Price: %.2f\n" +
                        "CreatedUserID: %d - CreatedDate: %s\n" +
                        "UpdateUserID: %d - UpdateDate: %s\n" +
                        "OrderType: %s - OrderStatus: %s\n",
                this.orderId, this.quantity, this.price,
                this.userCreateId, this.createdDate,
                this.userUpdateId, this.updatedDate,
                orderType, oderStatus);
    }
}
