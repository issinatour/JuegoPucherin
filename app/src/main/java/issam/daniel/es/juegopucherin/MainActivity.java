package issam.daniel.es.juegopucherin;

import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import issam.daniel.es.juegopucherin.Objetos_Circulos.Circulo2;


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

        // DADOS
        resultadoDados = (TextView) findViewById(R.id.textViewdadoresultado);
        botondado = (Button)  findViewById(R.id.buttondatdos);
        // JUGADOR
        textonombrejugador = (TextView) findViewById(R.id.textViewNombreJugador );
        //PUCHERO
        fichasdelpuchero = (TextView) findViewById(R.id.textViewFichasdelPuchero);
        // FICHAS RESTANTES
        fichasRestantes = (TextView) findViewById(R.id.textViewFichasRestantes);

      new Circulo2(2,this);
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
