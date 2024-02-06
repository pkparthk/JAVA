import java.util.Scanner;

abstract class Solid {
    protected double r, h; // Changed to protected to allow subclasses access
    abstract void surfaceArea();
    abstract void volume();

    void readRadiusAndHeight() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius:");
        r = sc.nextDouble();
        System.out.println("Enter the height:");
        h = sc.nextDouble();
    }
}

class Cone extends Solid {
    void surfaceArea() {
        double l = Math.sqrt(r * r + h * h);
        double area = Math.PI * r * (r + l);
        System.out.println("Surface area of cone is " + area);
    }

    void volume() {
        double volume = Math.PI * r * r * (h / 3);
        System.out.println("Volume of cone is " + volume);
    }
}

class Cylinder extends Solid {
    void surfaceArea() {
        double area = 2 * Math.PI * r * (r + h);
        System.out.println("Surface area of cylinder is " + area);
    }

    void volume() {
        double volume = Math.PI * r * r * h;
        System.out.println("Volume of cylinder is " + volume);
    }
}

class Sphere extends Solid {
    void surfaceArea() {
        double area = 4 * Math.PI * r * r;
        System.out.println("Surface area of sphere is " + area);
    }

    void volume() {
        double volume = (4.0 / 3) * Math.PI * r * r * r;
        System.out.println("Volume of sphere is " + volume);
    }
}

public class MySolid {
    public static void main(String args[]) {
        Solid s = new Cylinder();
        s.readRadiusAndHeight();
        s.surfaceArea();
        s.volume();

        s = new Cone();
        s.readRadiusAndHeight();
        s.surfaceArea();
        s.volume();

        s = new Sphere();
        s.readRadiusAndHeight();
        s.surfaceArea();
        s.volume();
    }
}
