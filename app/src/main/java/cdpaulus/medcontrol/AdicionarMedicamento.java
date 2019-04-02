package cdpaulus.medcontrol;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class AdicionarMedicamento extends Activity {

    public static TextView resultExtView;
    Button scan_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_medicamento);

        resultExtView = (TextView)findViewById(R.id.btn_scan);
        scan_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ScanCodeActivity.class);
                startActivity(intent);
            }
        });
    }
}