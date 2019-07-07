package cdpaulus.medcontrol.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DadosOpenHelper extends SQLiteOpenHelper {

    DadosOpenHelper(Context context) {
        super(context, "medcontrol", null, 13);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + "medicamentos_tbl" + " ("
                + "codbarras" + " TEXT primary key not null, "
                + "nome" +" TEXT not null)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists " + "medicamentos_tbl");
        onCreate(db);
    }
}
