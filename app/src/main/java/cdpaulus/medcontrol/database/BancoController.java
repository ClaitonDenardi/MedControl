package cdpaulus.medcontrol.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class BancoController {

    private SQLiteDatabase db;
    private DadosOpenHelper banco;

    public BancoController(Context context){

        banco = new DadosOpenHelper(context);

    }


    public String insereDados(String codbarras, String nome){

        ContentValues valores;
        db = banco.getWritableDatabase();

        valores = new ContentValues();
        valores.put("codbarras", codbarras);
        valores.put("nome", nome);
        long resultado = -1;
        try {
            resultado = db.insertOrThrow("medicamentos_tbl", null, valores);
        } catch (Exception e) {
            db.close();
        }
        db.close();


        if(resultado == -1){
            return "ERRO ao inserir registro";
        }else{
            return "Registo inserido com sucesso";
        }

    }

    public Cursor carregaDados(String cod){
        Cursor cursor;
        db = banco.getReadableDatabase();
        String selectQuery = "SELECT nome from medicamentos_tbl where codbarras = ?";
        cursor = db.rawQuery(selectQuery, new String[] { cod });
        if(cursor != null){
            cursor.moveToFirst();
        }
        db.close();
        return cursor;
    }


    public Cursor findAll(){
        Cursor cursor;
        db = banco.getReadableDatabase();
        String selectQuery = "SELECT nome from medicamentos_tbl";
        cursor = db.rawQuery(selectQuery, null);
        if(cursor != null){
            cursor.moveToFirst();
        }
        db.close();
        return cursor;
    }
}
