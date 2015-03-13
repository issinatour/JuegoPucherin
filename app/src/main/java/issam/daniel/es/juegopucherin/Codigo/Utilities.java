package issam.daniel.es.juegopucherin.Codigo;

import android.app.Activity;
import android.widget.ImageView;

import java.util.Random;

import issam.daniel.es.juegopucherin.R;

/**
 * Created by Issam on 11/03/2015.
 */
public class Utilities {
    ImageView imagenposicioncirculo2;
    public Utilities(){

    }

    public int lanzarDados(){
      int numeromax=6;
      int numeromin=1;

            Random rand = new Random();
            int randomNum = rand.nextInt((numeromax - numeromin) + 1) + numeromin;

            return randomNum;
    }

    public void drawdado(int numdado1,int numdado2,ImageView dado1imagen,ImageView dado2imagen){
        switch (numdado1){
            case 1:
                dado1imagen.setImageResource(R.drawable.dado1);
                break;
            case 2:
                dado1imagen.setImageResource(R.drawable.dado2);
                break;
            case 3:
                dado1imagen.setImageResource(R.drawable.dado3);
                break;
            case 4:
                dado1imagen.setImageResource(R.drawable.dado4);
                break;
            case 5:
                dado1imagen.setImageResource(R.drawable.dado5);
                break;
            case 6:
                dado1imagen.setImageResource(R.drawable.dado6);
                break;
        }


        switch (numdado2){
            case 1:
                dado2imagen.setImageResource(R.drawable.dado1);
                break;
            case 2:
                dado2imagen.setImageResource(R.drawable.dado2);
                break;
            case 3:
                dado2imagen.setImageResource(R.drawable.dado3);
                break;
            case 4:
                dado2imagen.setImageResource(R.drawable.dado4);
                break;
            case 5:
                dado2imagen.setImageResource(R.drawable.dado5);
                break;
            case 6:
                dado2imagen.setImageResource(R.drawable.dado6);
                break;
        }
    }



    public void actualizarImagenPorposicion(Activity activity,int imageView,int dados,int posicion) {

          imagenposicioncirculo2 = (ImageView) activity.findViewById(imageView);
        if (posicion != 0) {
            switch (dados) {
                case 0:
                    imagenposicioncirculo2.setImageResource(0);
                    break;

                case 2:
                    switch (posicion) {
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
                    switch (posicion) {
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
                    switch (posicion) {
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
                    switch (posicion) {
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
                    switch (posicion) {
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
                    switch (posicion) {
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
                    switch (posicion) {
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
                    switch (posicion) {
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
                    switch (posicion) {
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
                    imagenposicioncirculo2.setImageResource(0);
                    break;
            }


        } else {
            imagenposicioncirculo2.setBackgroundResource(0);
        }
    }
}
