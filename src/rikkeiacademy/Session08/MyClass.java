package rikkeiacademy.Session08;

public class MyClass {
    private String myString;

    public MyClass(String myString) {
        this.myString = myString;
    }

    public static void main(String[] args) {
        MyClass myObject = new MyClass("Hello!");

        System.out.println("Initial value of myString: " + myObject.getMyString());

        myObject.setMyString("Goodbye!");

        System.out.println("Updated value of myString: " + myObject.getMyString());
    }

    public String getMyString() {
        return myString;
    }

    public void setMyString(String myString) {
        this.myString = myString;
    }
}



