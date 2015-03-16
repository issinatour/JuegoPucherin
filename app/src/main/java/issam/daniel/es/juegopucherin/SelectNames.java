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
import android.widget.EditText;
import android.widget.LinearLayout;


public class SelectNames extends ActionBarActivity {
    EditText player1;
    EditText player2;
    EditText player3;
    EditText player4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_names);
        //Hide status bar
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // Hide the action bar
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        Bundle b = getIntent().getExtras();
        int players = b.getInt("NumJugadores");

        LinearLayout layout3 = (LinearLayout)findViewById(R.id.layoutPlayer3);
        LinearLayout layout4 = (LinearLayout)findViewById(R.id.layoutPlayer4);

        if(players==2){
            layout3.setVisibility(LinearLayout.GONE);
            layout4.setVisibility(LinearLayout.GONE);
        }else if(players==3){
            layout4.setVisibility(LinearLayout.GONE);
        }

        player1 = (EditText)findViewById(R.id.editTextJ1);
        player2 = (EditText)findViewById(R.id.editTextJ2);
        player3 = (EditText)findViewById(R.id.editTextJ3);
        player4 = (EditText)findViewById(R.id.editTextJ4);

        Button play = (Button)findViewById(R.id.buttonPlay);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent SiguienteActivity = new Intent(v.getContext(), MainActivity.class);
                SiguienteActivity.putExtra("Jugador1",player1.getText().toString());
                SiguienteActivity.putExtra("Jugador2",player2.getText().toString());
                SiguienteActivity.putExtra("Jugador3",player3.getText().toString());
                SiguienteActivity.putExtra("Jugador4",player4.getText().toString());

                startActivity(SiguienteActivity);
                finish();
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_select_names, menu);
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
