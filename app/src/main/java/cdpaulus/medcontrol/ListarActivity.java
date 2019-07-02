package cdpaulus.medcontrol;

import android.app.ListActivity;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class ListarActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar);
        String[] menu = {"Cadastrar", "Listar"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, menu);
        setListAdapter(adapter);
        listar();
    }

    private void listar() {
        SQLiteDatabase db;
        Cursor cursor;
        SimpleCursorAdapter ad;
        ListView lista;

    }

}

