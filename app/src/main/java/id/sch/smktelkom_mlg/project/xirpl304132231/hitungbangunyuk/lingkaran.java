package id.sch.smktelkom_mlg.project.xirpl304132231.hitungbangunyuk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
        tvHasil = (TextView) findViewById(R.id.textViewHasil);

        findViewById(R.id.buttonOk).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doHitung();
            }
        });

        findViewById(R.id.buttonbacklingkaran).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

    private void doHitung() {
        int a = etJari.getText().toString().isEmpty()?0:Integer.parseInt(etJari.getText().toString());

        tvHasil.setText((int) (3.14*a*a));
    }
}
