package br.anhembi.flavio.appuam;

import android.content.res.AssetFileDescriptor;
import android.media.Image;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import java.io.IOException;

import static br.anhembi.flavio.appuam.R.raw.audio;

public class SobreActivity extends AppCompatActivity {

    // Abre o aquivo de audio no R.raw


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);
       final MediaPlayer mp  = MediaPlayer.create(this, R.raw.audio);
        // Listener do botao que recebe o play
        ImageButton botao =(ImageButton)findViewById(R.id.playButton);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // dá play na bagaça
              mp.start();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sobre, menu);
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
