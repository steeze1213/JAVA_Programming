import java.util.Scanner;
abstract class Converter2 {
    abstract protected double convert(double src);
    abstract protected String getSrcString();
    abstract protected String getDestString();
    protected double ratio;
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Replace "+getSrcString()+" with "+getDestString());
        System.out.print("Please enter "+getSrcString()+">> ");
        double val = scanner.nextDouble();
        double res = convert(val);
        System.out.println("Conversion Results: "+res+getDestString());
        scanner.close();
    }
}

class Km2Mile extends Converter2{
    protected double ratio;
    public Km2Mile(double ratio){this.ratio = ratio;}
    protected double convert(double src){ return src / ratio; }
    protected String getSrcString() {return "Km";}
    protected String getDestString() {return "mile";}
}

public class KmToMile {
    public static void main(String args[]) {
        Km2Mile toMile = new Km2Mile(1.6);
        toMile.run();
    }
}