package br.anhembi.flavio.appuam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_cadastro, menu);

        Button botao = (Button)findViewById(R.id.button4);
        botao.setOnClickListener(new View.OnClickListener()
        { @Override public void onClick(View v) {
                BancoController crud = new BancoController(getBaseContext());
                EditText nome = (EditText)findViewById(R.id.editNome);
                EditText email = (EditText)findViewById((R.id.editEmail));
                EditText fone = (EditText)findViewById(R.id.editFone);
                String nomeString = nome.getText().toString();
                String emailString = email.getText().toString();
                String foneString = fone.getText().toString();
                String resultado; resultado = crud.insereDado(nomeString,emailString,foneString);
                Toast.makeText(getApplicationContext(), resultado, Toast.LENGTH_LONG).show();
            } });

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
