package rikkeiacademy.Session06.TrenLop;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    public static void main(String[] args) {
        int[] arr = generateRandomArray(100000);
        StopWatch stopwatch = new StopWatch();

        selectionSort(arr);

        stopwatch.stop();
        System.out.println("Thời gian thực thi của thuật toán sắp xếp chọn (selection sort) cho 100,000 số: " + stopwatch.getElapsedTime() + "ms");
    }

    // Hàm sắp xếp chọn (selection sort)
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Hàm tạo mảng ngẫu nhiên
    public static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        return arr;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }
}