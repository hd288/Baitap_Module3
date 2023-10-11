package tonghop.business.config;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOFile {
    public static final String BASE_PATH = "D:\\Module3\\Session19-IOFile\\src\\business\\data\\";
    public static final String CUSTOMER_PATH = buildPath("customer.txt");
    public static final String FOOD_PATH = buildPath("food.txt");
    public static final String ORDER_PATH = buildPath("order.txt");
    public static final String ORDERDETAIL_PATH = buildPath("orderdetail.txt");

    public static <T> List<T> readFromFile(String path) {
        List<T> list = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(path);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            list = (List<T>) ois.readObject();
        } catch (FileNotFoundException e) {
            return new ArrayList<>();
        } catch (EOFException ignored) {
            // Do nothing on EOFException
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static <T> void writeToFile(String path, List<T> list) {
        try (FileOutputStream fos = new FileOutputStream(path);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String buildPath(String fileName) {
        return BASE_PATH + fileName;
    }
}
