package issam.daniel.es.juegopucherin;

/**
 * Created by Issam on 12/03/2015.
 */
public class Jugador {
    int id;
    String nombre;
    int puntuacion;



    public Jugador(int id,String nombre,int puntuacion){
        this.id=id;
        this.nombre=nombre;
        this.puntuacion=puntuacion;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public void añadirpuntos(int numeropuntos){
        puntuacion+=numeropuntos;
    }
}
