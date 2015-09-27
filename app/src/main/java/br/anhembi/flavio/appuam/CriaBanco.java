package br.anhembi.flavio.appuam;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
/**
 * Created by Flavio on 26/09/2015.
 **/

public class CriaBanco extends SQLiteOpenHelper {

    protected static final String NOME_BANCO = "banco.db";
    protected static final String TABELA = "cadastro";
    protected static final String ID = "_id";
    protected static final String NOME = "nome";
    protected static final String EMAIL = "email";
    protected static final String FONE = "fone";
    protected static final int VERSAO = 1;

    public CriaBanco(Context context){
           super(context, NOME_BANCO, null, VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
               String sql = "CREATE TABLE "+TABELA+" ( " + ID + " integer primary key autoincrement, " + NOME + " text," + EMAIL + " text," + FONE + " text" +" ) ";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) { db.execSQL("DROP TABLE IF EXISTS" + TABELA);

        onCreate(db);

    }
}

