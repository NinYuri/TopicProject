package entidades;

public class Color 
{
    private int idColor;
    private String nombreSclervicio;
    private String duracionSclervicio;
    private double costoSclervicio;

    public Color(int idColor, String nombreSclervicio, String duracionSclervicio, double costoSclervicio) {
        this.idColor = idColor;
        this.nombreSclervicio = nombreSclervicio;
        this.duracionSclervicio = duracionSclervicio;
        this.costoSclervicio = costoSclervicio;
    }

    public Color() {
    }

    public int getIdColor() {
        return idColor;
    }

    public void setIdColor(int idColor) {
        this.idColor = idColor;
    }

    public String getNombreSclervicio() {
        return nombreSclervicio;
    }

    public void setNombreSclervicio(String nombreSclervicio) {
        this.nombreSclervicio = nombreSclervicio;
    }

    public String getDuracionSclervicio() {
        return duracionSclervicio;
    }

    public void setDuracionSclervicio(String duracionSclervicio) {
        this.duracionSclervicio = duracionSclervicio;
    }

    public double getCostoSclervicio() {
        return costoSclervicio;
    }

    public void setCostoSclervicio(double costoSclervicio) {
        this.costoSclervicio = costoSclervicio;
    }

    @Override
    public String toString() {
        return "Color{" + "idColor=" + idColor + ", nombreSclervicio=" + nombreSclervicio + ", duracionSclervicio=" + duracionSclervicio + ", costoSclervicio=" + costoSclervicio + '}';
    }
}
