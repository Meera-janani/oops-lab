 class CPU {
   		 double price;
    class Processor{
        double cores;
        String manufacturer;
	double getCache(){
            return 4.5;
        }
    }
    class RAM{
        double memory;
        String manufacturer;
	double getClockSpeed(){
            return 5.8;
        }
    }
}
public class main{
    public static void main(String[] args) {
        CPU c = new CPU();
        CPU.Processor p = c.new Processor();
        CPU.RAM r = c.new RAM();
        System.out.println("Processor Cache = " + p.getCache());
        System.out.println("Ram Clock speed = " + r.getClockSpeed());
    }
}