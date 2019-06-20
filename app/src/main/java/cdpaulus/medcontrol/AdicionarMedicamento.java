package cdpaulus.medcontrol;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class AdicionarMedicamento extends Activity implements AdapterView.OnItemSelectedListener {

    public static TextView resultExtView;
    private Button scan_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_medicamento);
        resultExtView = findViewById(R.id.result_text);
        scan_btn = findViewById(R.id.btn_scan);
        scan_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenReader();
            }
        });
        Spinner select_hora = findViewById(R.id.select_hora);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.horas, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        select_hora.setAdapter(adapter);
        select_hora.setOnItemSelectedListener(this);

    }
    private void OpenReader(){
        Intent intent = new Intent(getApplicationContext(), ScanCodeActivity.class);
        startActivity(intent);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Integer horas = (Integer) parent.getItemAtPosition(position);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}