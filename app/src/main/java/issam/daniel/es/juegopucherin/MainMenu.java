package issam.daniel.es.juegopucherin;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;


public class MainMenu extends ActionBarActivity {

    Button jugador2, jugador3, jugador4;
    int players = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //Hide status bar
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // Hide the action bar
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        jugador2 = (Button) findViewById(R.id.btn2player);
        jugador2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                players =2;
                Intent SiguienteActivity = new Intent(v.getContext(), SelectNames.class);
                SiguienteActivity.putExtra("NumJugadores",players);
                startActivity(SiguienteActivity);

            }
        });

        jugador3 = (Button) findViewById(R.id.btn3player);
        jugador3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                players=3;
                Intent SiguienteActivity = new Intent(v.getContext(), SelectNames.class);
                SiguienteActivity.putExtra("NumJugadores",players);
                startActivity(SiguienteActivity);

            }
        });

        jugador4 = (Button) findViewById(R.id.btn4player);
        jugador4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                players=4;
                Intent SiguienteActivity = new Intent(v.getContext(), SelectNames.class);
                SiguienteActivity.putExtra("NumJugadores",players);
                startActivity(SiguienteActivity);

            }
        });
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
