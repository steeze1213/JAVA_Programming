import java.util.Scanner;
abstract class Converter {
    abstract protected double convert(double src);
    abstract protected String getSrcString();
    abstract protected String getDestString();
    protected double ratio;
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Replace "+getSrcString()+" with "+getDestString()+".");
        System.out.print("Please enter "+getSrcString()+" >> ");
        double val = scanner.nextDouble();
        double res = convert(val);
        System.out.println("Conversion Results: "+res+getDestString()+".");
        scanner.close();
    }
}

class Won2Dollar extends Converter{
    protected double ratio;
    public Won2Dollar(int ratio){this.ratio = ratio;}
    protected double convert(double src){ return src / ratio; }
    protected String getSrcString() {return "Won";}
    protected String getDestString() {return "Dollar";}
}

public class WonToDollar {
    public static void main(String args[]) {
        Won2Dollar toDollar = new Won2Dollar(1200);
        toDollar.run();
    }
}