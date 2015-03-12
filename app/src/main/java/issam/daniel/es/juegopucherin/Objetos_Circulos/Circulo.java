package issam.daniel.es.juegopucherin.Objetos_Circulos;

import android.app.Activity;
import android.content.pm.LabeledIntent;
import android.widget.ImageView;
import android.widget.LinearLayout;

import issam.daniel.es.juegopucherin.R;

/**
 * Created by Issam on 09/03/2015.
 */
public class Circulo {

    int posicion;
    LinearLayout linear2;
    ImageView imagenposicioncirculo2;
    Activity activity;



    public Circulo(Activity activity, int layout, int imageView, int imagen){
        this.activity=activity;
        inizializar(layout,imageView);
        cargarFondo(imagen);
        actualizarImagenPorposicion(0,0);
    }

    private void inizializar(int layout, int imageView){
        linear2 = (LinearLayout) activity.findViewById(layout);
        imagenposicioncirculo2 = (ImageView) activity.findViewById(imageView);
    }
    private void cargarFondo(int imagen){
           linear2.setBackgroundResource(imagen);
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int dados,int posicion) {
        this.posicion = posicion;
        actualizarImagenPorposicion(dados,posicion);
    }

    public ImageView getImagenposicioncirculo2() {
        return imagenposicioncirculo2;
    }

    public void setImagenposicioncirculo2(ImageView imagenposicioncirculo2) {
        this.imagenposicioncirculo2 = imagenposicioncirculo2;
    }

    public void actualizarImagenPorposicion(int dados,int posicion){
        switch (dados){
            case 2:
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
                break;
            case 3:
                switch (posicion){
                    case 0:
                        break;
                    case 1:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito3ficha1);
                        break;
                    case 2:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito3ficha2);
                        break;
                    case 3:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito3ficha3);
                        break;
                }
                break;
            case 4:
                switch (posicion){
                    case 0:
                        break;
                    case 1:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito4ficha1);
                        break;
                    case 2:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito4ficha2);
                        break;
                    case 3:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito4ficha3);
                        break;
                    case 4:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito4ficha4);
                        break;
                }
                break;
            case 5:
                switch (posicion){
                    case 0:
                        break;
                    case 1:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito5ficha1);
                        break;
                    case 2:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito5ficha2);
                        break;
                    case 3:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito5ficha3);
                        break;
                    case 4:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito5ficha4);
                        break;
                    case 5:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito5ficha5);
                        break;
                }
                break;
            case 6:
                switch (posicion){
                    case 0:
                        break;
                    case 1:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito6ficha1);
                        break;
                    case 2:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito6ficha2);
                        break;
                    case 3:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito6ficha3);
                        break;
                    case 4:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito6ficha4);
                        break;
                    case 5:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito6ficha5);
                        break;
                    case 6:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito6ficha6);
                        break;
                }
                break;
            case 7:
                break;
            case 8:
                switch (posicion){
                    case 0:
                        break;
                    case 1:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito8ficha1);
                        break;
                    case 2:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito8ficha2);
                        break;
                    case 3:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito8ficha3);
                        break;
                    case 4:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito8ficha4);
                        break;
                    case 5:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito8ficha5);
                        break;
                    case 6:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito8ficha6);
                        break;
                    case 7:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito8ficha7);
                        break;
                    case 8:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito8ficha8);
                        break;
                }
                break;
            case 9:
                switch (posicion){
                    case 0:
                        break;
                    case 1:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito9ficha1);
                        break;
                    case 2:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito9ficha2);
                        break;
                    case 3:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito9ficha3);
                        break;
                    case 4:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito9ficha4);
                        break;
                    case 5:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito9ficha5);
                        break;
                    case 6:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito9ficha6);
                        break;
                    case 7:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito9ficha7);
                        break;
                    case 8:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito9ficha8);
                        break;
                    case 9:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito9ficha9);
                        break;
                }
                break;
            case 10:
                switch (posicion){
                    case 0:
                        break;
                    case 1:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito10ficha1);
                        break;
                    case 2:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito10ficha2);
                        break;
                    case 3:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito10ficha3);
                        break;
                    case 4:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito10ficha4);
                        break;
                    case 5:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito10ficha5);
                        break;
                    case 6:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito10ficha6);
                        break;
                    case 7:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito10ficha7);
                        break;
                    case 8:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito10ficha8);
                        break;
                    case 9:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito10ficha9);
                        break;
                    case 10:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito10ficha10);
                        break;
                }
                break;
            case 11:
                switch (posicion){
                    case 0:
                        break;
                    case 1:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito11ficha1);
                        break;
                    case 2:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito11ficha2);
                        break;
                    case 3:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito11ficha3);
                        break;
                    case 4:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito11ficha4);
                        break;
                    case 5:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito11ficha5);
                        break;
                    case 6:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito11ficha6);
                        break;
                    case 7:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito11ficha7);
                        break;
                    case 8:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito11ficha8);
                        break;
                    case 9:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito11ficha9);
                        break;
                    case 10:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito11ficha10);
                        break;
                    case 11:
                        imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito11ficha11);
                        break;
                }
                break;
            case 12:
                imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito2vacio);
                imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito3vacio);
                imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito4vacio);
                imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito5vacio);
                imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito6vacio);
                imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito8vacio);
                imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito9vacio);
                imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito10vacio);
                imagenposicioncirculo2.setBackgroundResource(R.drawable.pucherito11vacio);
                break;
        }


    }

}
