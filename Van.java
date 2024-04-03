public class Van extends GroundTransportation {

    private int packages;

    public Van(String licensePlate, double price, int packages) {
        super(licensePlate);
        this.packages = packages;
    }

    public int getPackages() {
        return packages;
    }

    public void setPackages(int packages) {
        this.packages = packages;
    }

    @Override
    public String getTransportType() {
        return "Furgoneta";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(String.format("%15s: %d\n", "Nº de Pacotes", packages));
        return sb.toString();
}

}
