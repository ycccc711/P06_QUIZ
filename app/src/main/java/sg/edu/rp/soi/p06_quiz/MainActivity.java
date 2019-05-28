package sg.edu.rp.soi.p06_quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;

    TextView tvOperation;
    Button btnReset;

    int ttl =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.etNum1);
        num2 = findViewById(R.id.etNum2);
        tvOperation = findViewById(R.id.tvOperation);
        btnReset = findViewById(R.id.btnReset);


        registerForContextMenu(tvOperation);

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.setText("");
                num2.setText("");
                tvOperation.setText("");
            }
        });

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.add(0, 0, 0, "+");
        menu.add(0, 1, 1, "-");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
       int a = Integer.parseInt(num1.getText().toString());
        int b = Integer.parseInt(num1.getText().toString());
        if (item.getItemId() == 0) {
            ttl = a+b ;
            tvOperation.setText(ttl);

        } else if (item.getItemId() == 1) {
            ttl = a+b;
            tvOperation.setText(ttl);
        }
        return super.onContextItemSelected(item);
    }


}
