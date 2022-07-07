package parcial;

public class Bicicleta {
    private String nro_serie;
    private String modelo;
    private int anio;
    float precio;

    public Bicicleta(String nro_serie, String modelo, int anio, float precio) {
        this.nro_serie = nro_serie;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
    }
    
    public Bicicleta() {
    }

    public String getNro_serie() {
        return nro_serie;
    }

    public void setNro_serie(String nro_serie) {
        this.nro_serie = nro_serie;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
               
}
