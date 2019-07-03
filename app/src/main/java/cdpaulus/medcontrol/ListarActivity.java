package cdpaulus.medcontrol;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import cdpaulus.medcontrol.database.BancoController;

public class ListarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar);
        ListView remedios = (ListView) findViewById(R.id.lista);
        BancoController bc = new BancoController(getBaseContext());
        Cursor cursor = bc.findAll();
        List<Remedio> remedios_list = new ArrayList<>();
        do {
            String nome = cursor.getString(cursor.getColumnIndex("nome"));
            remedios_list.add(new Remedio(nome));
        } while (cursor.moveToNext());
        ArrayAdapter<Remedio> adapter = new ArrayAdapter<Remedio>(this, android.R.layout.simple_list_item_1, remedios_list);
        remedios.setAdapter(adapter);
    }


}