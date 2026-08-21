public class ObjVehiculo {
    private String Placa;
    private String Cedula;
    private int TipoVehiculo;
    private int Plan;
    private double ValorPlan;
    private double Descuento;
    private double TotalPagar;
    
    public ObjVehiculo() {
    }

    public ObjVehiculo(String placa, String cedula, int tipoVehiculo, int plan, double valorPlan, double descuento,
            double totalPagar) {
        Placa = placa;
        Cedula = cedula;
        TipoVehiculo = tipoVehiculo;
        Plan = plan;
        ValorPlan = valorPlan;
        Descuento = descuento;
        TotalPagar = totalPagar;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String cedula) {
        Cedula = cedula;
    }

    public int getTipoVehiculo() {
        return TipoVehiculo;
    }

    public void setTipoVehiculo(int tipoVehiculo) {
        TipoVehiculo = tipoVehiculo;
    }

    public int getPlan() {
        return Plan;
    }

    public void setPlan(int plan) {
        Plan = plan;
    }

    public double getValorPlan() {
        return ValorPlan;
    }

    public void setValorPlan(double valorPlan) {
        ValorPlan = valorPlan;
    }

    public double getDescuento() {
        return Descuento;
    }

    public void setDescuento(double descuento) {
        Descuento = descuento;
    }

    public double getTotalPagar() {
        return TotalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        TotalPagar = totalPagar;
    }
    
    
}
