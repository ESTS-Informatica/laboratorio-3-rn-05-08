public class AirTransportation extends Transport{
    
    private String name;
    private int numberOfContainers;
    private static final double honorary = 4.0;

    public AirTransportation(String name, int numberOfContainers, String origin, String destination, double price){
        super();
        this.name = name;
        this.numberOfContainers = numberOfContainers;
        setFees(honorary);
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getNumberOfContainers(){
        return numberOfContainers;
    }
    
    public void setNumberOfContainers(int numberOfContainers){
        this.numberOfContainers = numberOfContainers;
    }
    
    @Override
    public double getPriceWithFees(){
        return getPrice()* (1.0 + (getFees()*0.01));
    }
    
    @Override
    public String getTransportType(){
        return "Transporte Aéreo";
    }
    
    @Override
    public String toString() {
        return super.toString() + String.format("%15s: %s\n%15s: %d\n", "Nome", name, "Nº Contentores", numberOfContainers);
    }
}