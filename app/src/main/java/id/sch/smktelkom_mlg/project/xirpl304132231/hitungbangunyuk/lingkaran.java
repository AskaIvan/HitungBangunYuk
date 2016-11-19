package id.sch.smktelkom_mlg.project.xirpl304132231.hitungbangunyuk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class lingkaran extends AppCompatActivity {

    EditText etJari;
    TextView tvHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        etJari = (EditText) findViewById(R.id.editTextJari);
        tvHasil = (TextView) findViewById(R.id.tvHasilLingkaran);

        findViewById(R.id.buttonOk).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doHitung();
            }
        });
    }

    private void doHitung() {
        if (isValid()) {
            int a = etJari.getText().toString().isEmpty() ? 0 : Integer.parseInt(etJari.getText().toString());
            //luas
            tvHasil.setText(22 / 7 * a * a);
            //keliling
            tvHasil.setText(22 / 7 * 2 * a);
        }
    }

    private boolean isValid() {
        boolean valid = true;

        String a = etJari.getText().toString();

        if (a.isEmpty()) {
            etJari.setError("Tinggi belum diisi");
            valid = false;
        } else if (a.length() > 2) {
            etJari.setError("Hanya bisa puluhan");
            valid = false;
        } else {
            etJari.setError(null);
        }
        return valid;
    }
}
