package rikkeiacademy.Session06.TrenLop;

public class Fan {
    private static final int SLOW = 1;
    private static final int MEDIUM = 1;
    private static final int FAST = 1;

    private int speed;
    private boolean on;
    private double radius;
    private String color;


    public Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        System.out.println("Fan 1: " + fan1);
        System.out.println("Fan 2: " + fan2);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {

        if (on) {
            return
                    "speed=" + speed +
                            ", on=" + on +
                            ", radius=" + radius +
                            ", color='" + color + '\'' +
                            "Fan is on";
        } else {
            return
                    "speed=" + speed +
                            ", on=" + on +
                            ", radius=" + radius +
                            ", color='" + color + '\'' +
                            "Fan is off";
        }
    }

}
