package issam.daniel.es.juegopucherin.Objetos_Circulos;

import android.app.Activity;
import android.widget.ImageView;
import android.widget.LinearLayout;

import issam.daniel.es.juegopucherin.R;

/**
 * Created by Issam on 09/03/2015.
 */
public class Circulo2 {

    int posicion;
    LinearLayout linear2;
    ImageView imagenposicioncirculo2;
    Activity activity;



    public Circulo2(int posicion,Activity activity){
        this.activity=activity;
        this.posicion=posicion;


        inizializar();
        cargarFondo();
        actualizarImagenPorposicion(posicion);
    }

    private void inizializar(){
        linear2 = (LinearLayout) activity.findViewById(R.id.circulo2);
        imagenposicioncirculo2 = (ImageView) activity.findViewById(R.id.imagencirculo2);
    }
    private void cargarFondo(){
           linear2.setBackgroundResource(R.drawable.pucherito2vacio);
    }

    public void actualizarImagenPorposicion(int posicion){
        switch (posicion){
            case 0:
                break;
            case 1:
                imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito2ficha1);
                break;
            case 2:
                imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito2ficha2);
                break;
        }
    }


    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
        actualizarImagenPorposicion(posicion);
    }

}
