public class AirTransportation extends Transport{
    
    private String name;
    private int numberOfContainers;
    private static final double honorary = 0.04;

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
    public String getTransportType(){
        return "Transporte Aéreo";
    }
}