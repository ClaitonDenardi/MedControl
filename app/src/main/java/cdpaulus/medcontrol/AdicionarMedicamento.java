package cdpaulus.medcontrol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class AdicionarMedicamento extends AppCompatActivity{

    public static TextView resultExtView;
    Button scan_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_medicamento);

        resultExtView = (TextView)findViewById(R.id.btn_scan);
        scan_btn = (Button) findViewById(new OnClickListener() {
            @Override
            public void onClick(View view){
                startActivity(new Intent(getApplicationContext(), ScanCodeActivity.class));
            }
        });
    }

    private Object findViewById(OnClickListener onClickListener) {

    }
}
