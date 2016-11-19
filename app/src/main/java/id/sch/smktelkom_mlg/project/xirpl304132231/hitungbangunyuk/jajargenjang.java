package id.sch.smktelkom_mlg.project.xirpl304132231.hitungbangunyuk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by SavinaRP on 11/19/2016.
 */
public class jajargenjang extends AppCompatActivity {
    EditText etTinggiJ;
    EditText etAlasJ;
    EditText etMiring;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jajargenjang);

        etTinggiJ = (EditText) findViewById(R.id.editTextTinggiJ);
        etAlasJ = (EditText) findViewById(R.id.editTextAlasJ);
        etMiring = (EditText) findViewById(R.id.editTextMiring);

        findViewById(R.id.buttonHitungJ).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doHitung();
            }

            private void doHitung() {
                int a = etTinggiJ.getText().toString().isEmpty() ? 0 : Integer.parseInt(etTinggiJ.getText().toString());
                int b = etAlasJ.getText().toString().isEmpty() ? 0 : Integer.parseInt(etAlasJ.getText().toString());
                int c = etMiring.getText().toString().isEmpty() ? 0 : Integer.parseInt(etMiring.getText().toString());

                //luas
                int luas = (a * b);
                //keliling
                int a1 = (2 * (b + c));

                tvHasil.setText("Luas Jajar Genjang = " + luas + "\n" + "Keliling Jajar Genjang = " + a1);
            }
        });
    }
}
