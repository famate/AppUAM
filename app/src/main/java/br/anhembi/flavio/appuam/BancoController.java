package br.anhembi.flavio.appuam;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Flavio on 26/09/2015.
 */

public class BancoController {

    private SQLiteDatabase db;
    private CriaBanco banco;
    public BancoController(Context context){
        banco = new CriaBanco(context);
    }

    public String insereDado(String nome, String email, String fone){
        ContentValues valores;
        long resultado;
        db = banco.getWritableDatabase();
        valores = new ContentValues();
        valores.put(CriaBanco.NOME , nome);
        valores.put(CriaBanco.EMAIL , email);
        valores.put(CriaBanco.FONE , fone);
        resultado = db.insert(CriaBanco.TABELA, null, valores);
        db.close();

        if (resultado ==-1)
            return "Erro ao inserir registro";
        else
            return "Registro Inserido com sucesso";
    }

    public Cursor carregaDados(){
        Cursor cursor; String[] campos = {banco.ID, banco.NOME};
        db = banco.getReadableDatabase();
        cursor = db.query(banco.TABELA, campos, null, null, null, null, null, null);
        if(cursor!=null){
            cursor.moveToFirst();
        }
        db.close();
        return cursor;

    }




}

