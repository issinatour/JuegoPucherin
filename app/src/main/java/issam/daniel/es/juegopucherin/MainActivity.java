package issam.daniel.es.juegopucherin;

import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import issam.daniel.es.juegopucherin.Objetos_Circulos.Circulo;


public class MainActivity extends ActionBarActivity {

    LinearLayout linear2;
    ImageView imagencirculo2;
    View view;

    // DADOS
    TextView resultadoDados;
    Button botondado;
    ////
    // Jugador
    TextView textonombrejugador;
    ////
    //PUCHERO
    TextView fichasdelpuchero;
    // FICHAS RESTANTES
    TextView fichasRestantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Hide status bar
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // Hide the action bar
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        // DADOS
        resultadoDados = (TextView) findViewById(R.id.textViewdadoresultado);
        botondado = (Button) findViewById(R.id.buttondatdos);
        // JUGADOR
        textonombrejugador = (TextView) findViewById(R.id.textViewNombreJugador);
        //PUCHERO
        fichasdelpuchero = (TextView) findViewById(R.id.textViewFichasdelPuchero);
        // FICHAS RESTANTES
        fichasRestantes = (TextView) findViewById(R.id.textViewFichasRestantes);

        new Circulo(this,R.id.circulo2,R.id.imagencirculo2,R.drawable.pucherito2vacio);
        new Circulo(this,R.id.circulo3,R.id.imagencirculo3,R.drawable.pucherito3vacio);
        new Circulo(this,R.id.circulo4,R.id.imagencirculo4,R.drawable.pucherito4vacio);
        new Circulo(this,R.id.circulo5,R.id.imagencirculo5,R.drawable.pucherito5vacio);
        new Circulo(this,R.id.circulo6,R.id.imagencirculo6,R.drawable.pucherito6vacio);
        new Circulo(this,R.id.circulo7,R.id.imagencirculo7,R.drawable.pucherito7vacio);
        new Circulo(this,R.id.circulo8,R.id.imagencirculo8,R.drawable.pucherito8vacio);
        new Circulo(this,R.id.circulo9,R.id.imagencirculo9,R.drawable.pucherito9vacio);
        new Circulo(this,R.id.circulo10,R.id.imagencirculo10,R.drawable.pucherito10vacio);
        new Circulo(this,R.id.circulo11,R.id.imagencirculo11,R.drawable.pucherito11vacio);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
