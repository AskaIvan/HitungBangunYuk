package id.sch.smktelkom_mlg.project.xirpl304132231.hitungbangunyuk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class lingkaran extends AppCompatActivity {

    EditText etJari;
    TextView tvHasil;
    Button buttonLingkaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        etJari = (EditText) findViewById(R.id.editTextJari);
        tvHasil = (TextView) findViewById(R.id.tvHasilLingkaran);
        buttonLingkaran = (Button) findViewById(R.id.buttonOk);

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
            //luas & keliling
            tvHasil.setText("Luas :" + (int) (Math.PI * a * a) + "\n" + "Keliling :" + (int) (Math.PI * 2 * a));
        }
    }

    private boolean isValid() {
        boolean valid = true;

        String a = etJari.getText().toString();

        if (a.isEmpty()) {
            etJari.setError("Jari-jari belum diisi");
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
