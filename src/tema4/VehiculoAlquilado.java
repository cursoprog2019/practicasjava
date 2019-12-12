package tema4;

/**
 * VehiculoAlquilado pag.61
 */
public class VehiculoAlquilado {
    private Cliente cliente;
    private Vehiculo vehiculo;
    private int diaAlquiler;
    private int mesAlquiler;
    private int annoAlquiler;
    private int totalDiasAlquiler;

    public VehiculoAlquilado(final Cliente cliente, final Vehiculo vehiculo, final int diaAlquiler, final int mesAlquiler, final int annoAlquiler,
            final int totalDiasAlquiler) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.diaAlquiler = diaAlquiler;
        this.mesAlquiler = mesAlquiler;
        this.annoAlquiler = annoAlquiler;
        this.totalDiasAlquiler = totalDiasAlquiler;
    }
    // Métodos getter y setter
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getDiaAlquiler() {
        return diaAlquiler;
    }

    public void setDiaAlquiler(int diaAlquiler) {
        this.diaAlquiler = diaAlquiler;
    }

    public int getMesAlquiler() {
        return mesAlquiler;
    }

    public void setMesAlquiler(int mesAlquiler) {
        this.mesAlquiler = mesAlquiler;
    }

    public int getAnnoAlquiler() {
        return annoAlquiler;
    }

    public void setAnnoAlquiler(int annoAlquiler) {
        this.annoAlquiler = annoAlquiler;
    }

    public int getTotalDiasAlquiler() {
        return totalDiasAlquiler;
    }

    public void setTotalDiasAlquiler(int totalDiasAlquiler) {
        this.totalDiasAlquiler = totalDiasAlquiler;
    }

   


    
}