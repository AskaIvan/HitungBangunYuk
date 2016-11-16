package id.sch.smktelkom_mlg.project.xirpl304132231.hitungbangunyuk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Asuka-PC on 11/16/2016.
 */

public class Layang extends AppCompatActivity {
    EditText etD1lay, etD2lay;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layang);

        etD1lay = (EditText) findViewById(R.id.editTextD1lay);
        etD2lay = (EditText) findViewById(R.id.editTextD2lay);
        tvHasil = (TextView) findViewById(R.id.textViewHasilLayang);

        findViewById(R.id.buttonHitungLayang).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doHitung();
            }
        });

        findViewById(R.id.buttonBackLayang).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

    private void doHitung() {
        double a = etD1lay.getText().toString().isEmpty() ? 0 : Double.parseDouble(etD1lay.getText().toString());
        double b = etD2lay.getText().toString().isEmpty() ? 0 : Double.parseDouble(etD2lay.getText().toString());
        //luas
        tvHasil.setText((int) (0.5 * a * b));
        //keliling
        tvHasil.setText((int) (2 * (a + b)));
    }
}
