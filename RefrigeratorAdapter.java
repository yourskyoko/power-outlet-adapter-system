public class RefrigeratorAdapter implements PowerOutlet {
    private final Refrigerator refrigerator;  // Made final
    
    public RefrigeratorAdapter(Refrigerator refrigerator) {
        this.refrigerator = refrigerator;
    }
    
    @Override
    public void plugIn() {
        refrigerator.startCooling();
    }
}