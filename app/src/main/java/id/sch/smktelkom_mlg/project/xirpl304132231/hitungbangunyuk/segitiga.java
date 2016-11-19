package id.sch.smktelkom_mlg.project.xirpl304132231.hitungbangunyuk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Icha on 16-Nov-16.
 */
public class segitiga extends AppCompatActivity {
    EditText etTinggi;
    EditText etAlas;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        etTinggi = (EditText) findViewById(R.id.editTextTinggi);
        etAlas = (EditText) findViewById(R.id.editTextAlas);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);

        findViewById(R.id.buttonHitung).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doHitung();
            }

            private void doHitung() {
                int a = etTinggi.getText().toString().isEmpty() ? 0 : Integer.parseInt(etTinggi.getText().toString());
                int b = etAlas.getText().toString().isEmpty() ? 0 : Integer.parseInt(etAlas.getText().toString());

                //luas
                tvHasil.setText(1 / 2 * b * a);
                //keliling
                tvHasil.setText(a + b + a + b);
            }
        });

    }
}