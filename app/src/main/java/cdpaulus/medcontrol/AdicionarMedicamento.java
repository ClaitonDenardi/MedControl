package cdpaulus.medcontrol;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AdicionarMedicamento extends Activity {

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

    }
    private void OpenReader(){
        Intent intent = new Intent(getApplicationContext(), ScanCodeActivity.class);
        startActivity(intent);
    }

}