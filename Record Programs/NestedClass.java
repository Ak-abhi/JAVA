import java.util.Scanner;

class CPU{
	double price;
	class Processor{
		double cores;
		String manufacturer;
		double getCache() {
			return 4.3;
		}
	}
	static class RAM{
		double memory;
		String manufacturer;
		double getClockSpeed(){
			return 5.5;
		}
	}
}
public class NestedClass {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		CPU cpu=new CPU();
		CPU.Processor processor=cpu.new Processor();
		CPU.RAM ram=new CPU.RAM();
		
		System.out.println("Enter the Price of CPU:");
		double a=s.nextDouble();
		System.out.println("Enter the no of Cores:");
		int b=s.nextInt();
		System.out.println("Enter the manufacturer of processor: ");
		String m=s.next();
		System.out.println("Enter the memory of RAM: ");
		int c=s.nextInt();
		System.out.println("Enter the manufacturer of RAM: ");
		String n=s.next();
		
		cpu.price=a;
		processor.cores=b;
		processor.manufacturer=m;
		ram.memory=c;
		ram.manufacturer=n;
		
		System.out.println();
		System.out.println("Price of the CPU is "+cpu.price);
		System.out.println("No. of Cores is "+processor.cores);
		System.out.println("Name of the manufacturer is "+processor.manufacturer);
		System.out.println("Processor cache : "+processor.getCache());
		
		System.out.println("Memory capacity is "+ram.memory+"GB");
		System.out.println("Manufacturer of RAM is "+ram.manufacturer);
		System.out.println("Clock Speed of RAM : "+ram.getClockSpeed());
	}

}
