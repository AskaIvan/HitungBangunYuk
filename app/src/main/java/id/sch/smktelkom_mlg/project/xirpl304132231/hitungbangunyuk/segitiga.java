package id.sch.smktelkom_mlg.project.xirpl304132231.hitungbangunyuk;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;


/**
 * Created by Icha on 16-Nov-16.
 */
public class segitiga extends AppCompatActivity {
    Spinner spinner;
    Button bSegitiga;
    String[] SPINNERVALUES = {"Sama Sisi", "Sama Kaki", "Sembarang"};
    String SpinnerValue;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        spinner = (Spinner) findViewById(R.id.spinnerSegitiga);
        bSegitiga = (Button) findViewById(R.id.buttonHitungS);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(segitiga.this, android.R.layout.simple_list_item_1, SPINNERVALUES);

        spinner.setAdapter(adapter);

        //Adding setOnItemSelectedListener method on spinner.
        spinner.setOnItemSelectedListener(new OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {

                SpinnerValue = (String) spinner.getSelectedItem();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub

            }
        });

        bSegitiga.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                switch (SpinnerValue) {

                    case "Sama Sisi":
                        intent = new Intent(segitiga.this, Samasisi.class);
                        startActivity(intent);
                        break;

                    case "Sama Kaki":
                        intent = new Intent(segitiga.this, SamaKaki.class);
                        startActivity(intent);
                        break;

                    case "Sembarang":
                        intent = new Intent(segitiga.this, Sembarang.class);
                        startActivity(intent);
                        break;


                }
            }
        });

    }
}

