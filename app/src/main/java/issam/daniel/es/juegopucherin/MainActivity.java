package issam.daniel.es.juegopucherin;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;


import java.util.ArrayList;

import issam.daniel.es.juegopucherin.Codigo.Utilities;
import issam.daniel.es.juegopucherin.Objetos_Circulos.Circulo;


public class MainActivity extends ActionBarActivity {

    int fichastotales = 50;
    //JUGADORES
    ArrayList<Jugador> listaJugadores;
    // DADOS
    TextView resultadoDados;
    Button botondado;
    TextView textViewdado1;
    TextView textViewdado2;
    ImageView dado1imagen;
    ImageView dado2imagen;
    ////
    // Jugador
    TextView textonombrejugador;
    int jugadoractual = 0;
    int numerodejugadores = 0;
    ////
    //PUCHERO

    // FICHAS RESTANTES
    TextView fichasRestantes;

    TextView fichastotales7;
    //CIRCULOS
    ArrayList<Circulo> circulo;
    Circulo circulo2;
    Circulo circulo3;
    Circulo circulo4;
    Circulo circulo5;
    Circulo circulo6;
    Circulo circulo7;
    Circulo circulo8;
    Circulo circulo9;
    Circulo circulo10;
    Circulo circulo11;


    ArrayList<Listadejugadores> arraydir;
    Utilities utilidades;
    ListView VistaDePuntuaciones;

    Listadejugadores adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // Hide the action bar
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        utilidades = new Utilities();


        // DADOS
        resultadoDados = (TextView) findViewById(R.id.textViewdadoresultado);
        botondado = (Button) findViewById(R.id.buttondatdos);
        textViewdado1 = (TextView) findViewById(R.id.textViewdado1);
        textViewdado2 = (TextView) findViewById(R.id.textViewdado2);

        dado1imagen = (ImageView) findViewById(R.id.imageViewDADO1);
        dado2imagen = (ImageView) findViewById(R.id.imageViewDADO2);

        dado1imagen.setImageResource(R.drawable.dado2);
        dado2imagen.setImageResource(R.drawable.dado4);
        // JUGADOR
        textonombrejugador = (TextView) findViewById(R.id.textViewNombreJugador);
        //PUCHERO

        // FICHAS RESTANTES
        fichasRestantes = (TextView) findViewById(R.id.textViewFichasRestantes);
        //FICHAS DEL 7
        fichastotales7 = (TextView) findViewById(R.id.textView7FichasTotales);
        fichastotales7.setText(0 + "");

        fichasRestantes.setText(fichastotales + "");

        crearcirculos();

        listaJugadores = new ArrayList<Jugador>();

        Bundle b = getIntent().getExtras();
        String player1 = b.getString("Jugador1");
        String player2 = b.getString("Jugador2");
        String player3 = b.getString("Jugador3");
        String player4 = b.getString("Jugador4");

        Log.i("PLAYER", player1);
        Log.i("PLAYER", player2);
        Log.i("PLAYER", player3);
        Log.i("PLAYER", player4);

        if (!player1.equals("")) {
            Jugador jugador1 = new Jugador(1, player1, 0);
            listaJugadores.add(jugador1);
        }
        if (!player2.equals("")) {
            Jugador jugador2 = new Jugador(2, player2, 0);
            listaJugadores.add(jugador2);
        }
        if (!player3.equals("")) {
            Jugador jugador3 = new Jugador(3, player3, 0);
            listaJugadores.add(jugador3);
        }
        if (!player4.equals("")) {
            Jugador jugador4 = new Jugador(4, player4, 0);
            listaJugadores.add(jugador4);
        }


        numerodejugadores = listaJugadores.size() - 1;

        inizializarListView(listaJugadores);

        textonombrejugador.setText(listaJugadores.get(jugadoractual).getNombre());

    }

    private void inizializarListView(ArrayList<Jugador> listaJugadores) {

        VistaDePuntuaciones = (ListView) findViewById(R.id.listViewJugadores);
        arraydir = new ArrayList<Listadejugadores>();
        // adaptador PERSONALIZADO en layout itemlista.xml creado en ListadepuntuacionesAdapter
        adaptador = new Listadejugadores(this, listaJugadores);
        // adaptador inicializado
        arraydir.add(adaptador);
        VistaDePuntuaciones.setAdapter(adaptador);

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


    public void lanzarEldado(View view) {
        int dado1 = utilidades.lanzarDados();
        int dado2 = utilidades.lanzarDados();

        textViewdado1.setText(dado1 + "");
        textViewdado2.setText(dado2 + "");

        if (fichastotales > 0) {
            fichastotales--;
        }
        fichasRestantes.setText(fichastotales + "");

        int resultadototal = dado1 + dado2;
        actualizarPosiciones(resultadototal);

        utilidades.drawdado(dado1, dado2, dado1imagen, dado2imagen);
        resultadoDados.setText(resultadototal + "");


        if (jugadoractual == numerodejugadores) {
            jugadoractual = 0;
            textonombrejugador.setText(listaJugadores.get(jugadoractual).getNombre());
        } else {
            jugadoractual++;
            textonombrejugador.setText(listaJugadores.get(jugadoractual).getNombre());
        }


        if(comprobarGanador()){
            Log.i("GANADOR","Felicidades a ganado :"+ganador().getNombre());
            Intent SiguienteActivity = new Intent(view.getContext(), MainMenu.class);
            startActivity(SiguienteActivity);
        }
    }

    private void actualizarPosiciones(int dado) {
        if (fichastotales > 0) {
            switch (dado) {
                case 2:
                    if (circulo2.añadirficha(dado, listaJugadores, jugadoractual))
                        inizializarListView(listaJugadores);
                    break;
                case 3:
                    if (circulo3.añadirficha(dado, listaJugadores, jugadoractual))
                        inizializarListView(listaJugadores);
                    break;
                case 4:

                    if (circulo4.añadirficha(dado, listaJugadores, jugadoractual))
                        inizializarListView(listaJugadores);
                    break;
                case 5:
                    if (circulo5.añadirficha(dado, listaJugadores, jugadoractual))
                        inizializarListView(listaJugadores);
                    break;
                case 6:
                    if (circulo6.añadirficha(dado, listaJugadores, jugadoractual))
                        inizializarListView(listaJugadores);
                    break;
                case 7:
                    if (circulo7.añadirficha(dado, listaJugadores, jugadoractual))
                        inizializarListView(listaJugadores);
                    fichastotales7.setText(circulo7.getPosicion() + "");

                    break;
                case 8:
                    if (circulo8.añadirficha(dado, listaJugadores, jugadoractual))
                        inizializarListView(listaJugadores);
                    break;
                case 9:
                    if (circulo9.añadirficha(dado, listaJugadores, jugadoractual))
                        inizializarListView(listaJugadores);
                    break;
                case 10:
                    if (circulo10.añadirficha(dado, listaJugadores, jugadoractual))
                        inizializarListView(listaJugadores);
                    break;
                case 11:
                    if (circulo11.añadirficha(dado, listaJugadores, jugadoractual))
                        inizializarListView(listaJugadores);
                    break;
                case 12:
                    listaJugadores.get(jugadoractual).añadirpuntos(circulo7.getPosicion());
                    inizializarListView(listaJugadores);
                    circulo7.setPosicion(0);
                    fichastotales7.setText(0 + "");
                    break;
            }
        } else {
            switch (dado) {
                case 2:
                    if (circulo2.recogerFichas(dado, listaJugadores, jugadoractual))
                        inizializarListView(listaJugadores);
                    break;
                case 3:
                    if (circulo3.recogerFichas(dado, listaJugadores, jugadoractual))
                        inizializarListView(listaJugadores);
                    break;
                case 4:
                    if (circulo4.recogerFichas(dado, listaJugadores, jugadoractual))
                        inizializarListView(listaJugadores);
                    break;
                case 5:
                    if (circulo5.recogerFichas(dado, listaJugadores, jugadoractual))
                        inizializarListView(listaJugadores);
                    break;
                case 6:
                    if (circulo6.recogerFichas(dado, listaJugadores, jugadoractual))
                        inizializarListView(listaJugadores);
                    break;
                case 7:
                    if (circulo7.recogerFichas(dado, listaJugadores, jugadoractual))
                        inizializarListView(listaJugadores);
                    break;
                case 8:
                    if (circulo8.recogerFichas(dado, listaJugadores, jugadoractual))
                        inizializarListView(listaJugadores);
                    break;
                case 9:
                    if (circulo9.recogerFichas(dado, listaJugadores, jugadoractual))
                        inizializarListView(listaJugadores);
                    break;
                case 10:
                    if (circulo10.recogerFichas(dado, listaJugadores, jugadoractual))
                        inizializarListView(listaJugadores);
                    break;
                case 11:
                    if (circulo11.recogerFichas(dado, listaJugadores, jugadoractual))
                        inizializarListView(listaJugadores);
                    break;

            }
        }

    }


    private void crearcirculos() {
        circulo2 = new Circulo(this, R.id.circulo2, R.id.imagencirculo2, R.drawable.pucherito2vacio, 2);
        circulo3 = new Circulo(this, R.id.circulo3, R.id.imagencirculo3, R.drawable.pucherito3vacio, 3);
        circulo4 = new Circulo(this, R.id.circulo4, R.id.imagencirculo4, R.drawable.pucherito4vacio, 4);
        circulo5 = new Circulo(this, R.id.circulo5, R.id.imagencirculo5, R.drawable.pucherito5vacio, 5);
        circulo6 = new Circulo(this, R.id.circulo6, R.id.imagencirculo6, R.drawable.pucherito6vacio, 6);
        circulo7 = new Circulo(this, R.id.circulo7, R.id.imagencirculo7, R.drawable.pucherito7vacio, 500);
        circulo8 = new Circulo(this, R.id.circulo8, R.id.imagencirculo8, R.drawable.pucherito8vacio, 8);
        circulo9 = new Circulo(this, R.id.circulo9, R.id.imagencirculo9, R.drawable.pucherito9vacio, 9);
        circulo10 = new Circulo(this, R.id.circulo10, R.id.imagencirculo10, R.drawable.pucherito10vacio, 10);
        circulo11 = new Circulo(this, R.id.circulo11, R.id.imagencirculo11, R.drawable.pucherito11vacio, 11);

        circulo = new ArrayList<>();
        circulo.add(circulo2);
        circulo.add(circulo3);
        circulo.add(circulo4);
        circulo.add(circulo5);
        circulo.add(circulo6);
        circulo.add(circulo7);
        circulo.add(circulo8);
        circulo.add(circulo9);
        circulo.add(circulo10);
        circulo.add(circulo11);

    }

    public Jugador ganador(){
        Jugador player = null;
        int puntMax = 0;
        for(Jugador j:listaJugadores){
            if(puntMax<j.getPuntuacion()){
                player = j;
                puntMax=j.getPuntuacion();
            }
        }
        return player;
    }


    public boolean comprobarGanador() {
        boolean win = false;
        int winers = 0;
        for (Circulo cir : circulo) {
            if (cir.getPosicion() == 0) {
                winers++;
            }
        }
        if (winers == 10) {
            Log.i("GANADOR", "GANASTE!!!!!");
            win = true;
        }
        return win;
    }
}
