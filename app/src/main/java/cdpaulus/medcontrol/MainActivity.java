package cdpaulus.medcontrol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
