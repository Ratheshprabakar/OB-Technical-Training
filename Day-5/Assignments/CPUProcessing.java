/*
 @ClassName : CPUProcessing
 @OuterClassName : CPU
 @InnerClassName : RAM,Processor
 @Description : Program to understand the nested class with an example of CPU Properties including RAM, Processor Configurations
 @Version 1.0 24/05/2021
 @Author : Rathesh Prabakar
*/
class CPU{
	static String manufacturerName = "DELL";
	static int fanCount = 2;
	private class RAM{
		String size = "4GB";
		int layers = 5;
		int slotCount = 2;
		
		void displaySize() {
			System.out.println("RAM Size "+size);
		}
		void displayLayers() {
			System.out.println("RAM Layers "+layers);
		}
		void displaySlotCount() {
			System.out.println("RAM Slot Count "+slotCount);
		}// End of Inner class RAM
	}
	class Processor {
		int processorLayer = 3;
		int processorVersion = 2;
		
		void displayProcessorProperties() {
			System.out.println("Processor Layer "+ processorLayer+"\n"+"Processor Version "+processorVersion);
		}
	}
	
	void displayProperties() {
		RAM pc1= new RAM();
		Processor pc2 = new Processor();
		System.out.println("Manufacturer Name "+ manufacturerName);
		System.out.println("Fan Count "+ fanCount);
		pc1.displaySize();
		pc1.displaySlotCount();
		pc1.displayLayers();
		pc2.displayProcessorProperties();
	}
}

public class CPUProcessing {

	public static void main(String[] args) {
		CPU pc1= new CPU();
		pc1.displayProperties();
		
				
	}

}
