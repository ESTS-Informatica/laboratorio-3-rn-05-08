public class GroundTransportation extends Transport{
    
    private String licensePlate;
    private static final double honorary = 0.03;
    
    public GroundTransportation(String licensePlate, String origin, String destination, double price){
        super();
        this.licensePlate = licensePlate;
        setFees(3.0);
    }
    
    public String getLicensePlate(){
        return licensePlate;
    }
    
    public void setLicensePlate(String licensePlate){
        this.licensePlate = licensePlate;
    }
    
    @Override
    public String getTransportType(){
        return "Transporte Terrestre";
    }
}