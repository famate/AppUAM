package br.anhembi.flavio.appuam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Abrir a activity Sobre
           Button botaoSobre = (Button)findViewById(R.id.button3);
             botaoSobre.setOnClickListener(new View.OnClickListener() {
                 public void onClick(View v) {
                     startActivity(new Intent(MainActivity.this, SobreActivity.class));
                 }
             }); // fim Abrir Activity Sobre


         //Abrir a activity Cadastro
           Button botaoCadastro = (Button)findViewById(R.id.button);
           botaoCadastro.setOnClickListener(new View.OnClickListener() {
               public void onClick(View v) {
               startActivity(new Intent(MainActivity.this, CadastroActivity.class));
           }}); // fim Abrir Activity Cadastro


         //Abrir a activity Consulta
           Button botaoConsulta = (Button)findViewById(R.id.button2);
           botaoConsulta.setOnClickListener(new View.OnClickListener() {
               public void onClick(View v) {
               startActivity(new Intent(MainActivity.this, ConsultaActivity.class));
            }}); // fim Abrir Activity Cadastro
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
