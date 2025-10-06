// PowerOutletApplication.java
public class PowerOutletApplication {
    public static void main(String[] args) {
        // Create devices
        Laptop laptop = new Laptop();
        Refrigerator refrigerator = new Refrigerator();
        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();
        
        // Create adapters
        PowerOutlet laptopOutlet = new LaptopAdapter(laptop);
        PowerOutlet refrigeratorOutlet = new RefrigeratorAdapter(refrigerator);
        PowerOutlet smartphoneOutlet = new SmartphoneAdapter(smartphoneCharger);
        
        // Use the common interface to plug in devices
        System.out.println("Plugging in devices to power outlets:");
        System.out.println("--------------------------------------");
        
        laptopOutlet.plugIn();
        refrigeratorOutlet.plugIn();
        smartphoneOutlet.plugIn();
        
        // Demonstrate with a collection
        System.out.println("\nManaging all devices through power outlets:");
        System.out.println("--------------------------------------------");
        
        PowerOutlet[] outlets = {laptopOutlet, refrigeratorOutlet, smartphoneOutlet};
        
        for (PowerOutlet outlet : outlets) {
            outlet.plugIn();
        }
    }
}
