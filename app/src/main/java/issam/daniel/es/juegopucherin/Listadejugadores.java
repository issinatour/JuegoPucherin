package issam.daniel.es.juegopucherin;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Issam on 12/03/2015.
 */
public class Listadejugadores extends BaseAdapter {

    protected Activity activity;
    protected ArrayList<Jugador> items;
    View v;

    public Listadejugadores(Activity activity, ArrayList<Jugador> items) {
        this.activity = activity;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int arg0) {
        return items.get(arg0);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


         v = convertView;


        if(convertView == null){
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.itemlista, null);
        }

        Jugador dir = items.get(position);

        ImageView foto = (ImageView) v.findViewById(R.id.foto);
        foto.setImageResource(R.drawable.avatar);

        TextView nombre = (TextView) v.findViewById(R.id.nombrelista);
        nombre.setText(dir.getNombre());

        TextView Puntos = (TextView) v.findViewById(R.id.puntoslista);
        Puntos.setText(dir.getPuntuacion()+"");



        return v;
    }

 public void   cambiarcosas (AdapterView<?> parent,int position, View convertView){
     LinearLayout v = (LinearLayout)parent.getAdapter().getView(position, convertView, parent);
     TextView textView = (TextView)v.getChildAt(0);
     String str2 = (String) textView.getText();
     textView.setText("Changing Text View");
 }


}