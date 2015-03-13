package issam.daniel.es.juegopucherin.Codigo;

import android.widget.ImageView;

import java.util.Random;

import issam.daniel.es.juegopucherin.R;

/**
 * Created by Issam on 11/03/2015.
 */
public class Utilities {

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

}
