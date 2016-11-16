package id.sch.smktelkom_mlg.project.xirpl304132231.hitungbangunyuk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Asuka-PC on 11/16/2016.
 */

public class ketupat extends AppCompatActivity {
    EditText etD1, etD2;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ketupat);

        etD1 = (EditText) findViewById(R.id.editTextD1);
        etD2 = (EditText) findViewById(R.id.editTextD2);
        tvHasil = (TextView) findViewById(R.id.textViewHasilKetupat);

        findViewById(R.id.buttonHitungKetupat).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doHitung();
            }
        });

        findViewById(R.id.buttonBackKetupat).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

    private void doHitung() {
        double a = etD1.getText().toString().isEmpty() ? 0 : Double.parseDouble(etD1.getText().toString());
        double b = etD2.getText().toString().isEmpty() ? 0 : Double.parseDouble(etD2.getText().toString());
        //luas
        tvHasil.setText((int) (0.5 * a * b));
        //keliling
        tvHasil.setText((int) Math.sqrt(Math.pow(0.5 * a, 2) + Math.pow(0.5 * b, 2)));
    }
}
