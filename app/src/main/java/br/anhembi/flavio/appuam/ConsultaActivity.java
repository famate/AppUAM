package br.anhembi.flavio.appuam;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class ConsultaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulta);
        BancoController crud = new BancoController(getBaseContext());
        Cursor cursor = crud.carregaDados();
        String[] nomeCampos = new String[] { CriaBanco.NOME  };
        int[] idViews = new int[] {R.id.textNOME};

        SimpleCursorAdapter adaptador = new SimpleCursorAdapter(getBaseContext(), R.layout.activity_consulta,cursor,nomeCampos,idViews, 0);
        ListView lista = (ListView) findViewById(R.id.listView);
        lista.setAdapter(adaptador);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_consulta, menu);
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
