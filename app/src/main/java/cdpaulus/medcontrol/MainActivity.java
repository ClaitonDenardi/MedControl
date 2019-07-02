package cdpaulus.medcontrol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import cdpaulus.medcontrol.database.BancoController;

public class MainActivity extends AppCompatActivity {
    private Button btn, btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn_adicionar_medicamento);
        btn2 = findViewById(R.id.btn_listar_medicamento);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                OpenActivityAdicionar();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                OpenActivityListar();
            }
        });
        BancoController bc = new BancoController(getBaseContext());
        bc.insereDados("7898944008304", "remedioxxxxx");
        bc.insereDados("7898654490031", "bokinha");

        // Toast.makeText(getApplicationContext(), resultado, Toast.LENGTH_LONG).show();

    }
    private void OpenActivityAdicionar(){
        Intent intent= new Intent(MainActivity.this, AdicionarMedicamento.class);
        startActivity(intent);
    }

    private void OpenActivityListar(){
        Intent intent= new Intent(MainActivity.this, ListarActivity.class);
        startActivity(intent);
    }


}
