package issam.daniel.es.juegopucherin.Objetos_Circulos;

import android.app.Activity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;

import issam.daniel.es.juegopucherin.Codigo.Utilities;
import issam.daniel.es.juegopucherin.Jugador;
import issam.daniel.es.juegopucherin.R;

/**
 * Created by Issam on 09/03/2015.
 */
public class Circulo {

    int posicion=0;
    LinearLayout linear2;
    ImageView imagenposicioncirculo2;
    Utilities utilidades;
    public int getMaxposiciones() {
        return maxposiciones;
    }

    public void setMaxposiciones(int maxposiciones) {
        this.maxposiciones = maxposiciones;
    }

    int maxposiciones;
    Activity activity;
    int imageView;



    public Circulo(Activity activity, int layout, int imageView, int imagen,int maxposiciones){
        this.activity=activity;
        this.maxposiciones=maxposiciones;
        this.activity=activity;
        this.imageView=imageView;
        utilidades=new Utilities();
        inizializar(layout,imageView);
        cargarFondo(imagen);
        utilidades.actualizarImagenPorposicion(activity,imageView,0,0);
    }

    private void inizializar(int layout, int imageView){
        linear2 = (LinearLayout) activity.findViewById(layout);
        imagenposicioncirculo2 = (ImageView) activity.findViewById(imageView);}

    private void cargarFondo(int imagen){
        linear2.setBackgroundResource(imagen);
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;

    }

    public boolean añadirficha(int dados,ArrayList<Jugador> listajugadores,int jugadoractual){
        boolean repartir=false;
        posicion++;
      if(posicion>maxposiciones) {
          listajugadores.get(jugadoractual).añadirpuntos(posicion-1);
          repartir=true;
          posicion = 0;
      }
        utilidades.actualizarImagenPorposicion(activity,imageView,dados, posicion);

        return  repartir;
    }

    public boolean recogerFichas(int dados,ArrayList<Jugador> listajugadores,int jugadoractual){
        boolean repartir=false;

        if(posicion>0){
            listajugadores.get(jugadoractual).añadirpuntos(posicion);
            repartir=true;
            posicion = 0;

            utilidades.actualizarImagenPorposicion(activity,imageView,dados, posicion);
        }

        return repartir;
    }

    public ImageView getImagenposicioncirculo2() {
        return imagenposicioncirculo2;
    }

    public void setImagenposicioncirculo2(ImageView imagenposicioncirculo2) {
        this.imagenposicioncirculo2 = imagenposicioncirculo2;
    }


}