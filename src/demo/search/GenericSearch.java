package demo.search;

public class GenericSearch<T extends Comparable<T>> {
    private final T[] array;

    public GenericSearch(T[] array) {
        this.array = array;
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        GenericSearch<Integer> search = new GenericSearch<>(numbers);

        int linearResult = search.linearSearch(5);
        System.out.println("Tìm kiếm tuyến tính: Vị trí của 5 là " + linearResult);

        int binaryResult = search.binarySearch(5);
        System.out.println("Tìm kiếm nhị phân: Vị trí của 5 là " + binaryResult);
    }

    // Tìm kiếm tuyến tính
    public int linearSearch(T target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(target)) {
                return i; // Trả về vị trí của phần tử nếu được tìm thấy
            }
        }
        return -1; // Trả về -1 nếu không tìm thấy phần tử
    }

    // Tìm kiếm nhị phân
    public int binarySearch(T target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            int cmp = array[middle].compareTo(target);

            if (cmp == 0) {
                return middle; // Trả về vị trí của phần tử nếu được tìm thấy
            } else if (cmp < 0) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1; // Trả về -1 nếu không tìm thấy phần tử
    }
}

