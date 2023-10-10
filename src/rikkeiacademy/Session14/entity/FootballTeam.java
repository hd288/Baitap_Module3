package rikkeiacademy.Session14.entity;

public class FootballTeam {
    private int id;
    private String name;
    private int numberOfPlayer;
    private int score;


    public FootballTeam(int id, String name, int numberOfPlayer, int score) {
        this.id = id;
        this.name = name;
        this.numberOfPlayer = numberOfPlayer;
        this.score = score;
    }

    public static FootballTeam[] selectionSort(FootballTeam[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getScore() < arr[j].getScore()) {
                    swapElement(arr, i, j);
                }
            }
        }

        return arr;
    }

    public static FootballTeam[] bubbleSort(FootballTeam[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[i].getScore() > arr[j].getScore()) {
                    swapElement(arr, j, j + 1);
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
        return arr;
    }

    public static FootballTeam[] insertionSort(FootballTeam[] arr) {
        int length = arr.length;

        for (int i = 1; i < length; i++) {
            FootballTeam key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].getScore() < key.getScore()) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = key;
        }

        return arr;
    }

    static <T> void swapElement(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPlayer() {
        return numberOfPlayer;
    }

    public void setNumberOfPlayer(int numberOfPlayer) {
        this.numberOfPlayer = numberOfPlayer;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
