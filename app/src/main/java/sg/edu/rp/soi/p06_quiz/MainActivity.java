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
TextView operation;
Button reset;
TextView ans;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.etNum1);
        num2 = findViewById(R.id.etNum2);
        operation = findViewById(R.id.tvOperation);
        reset = findViewById(R.id.btnReset);
        ans = findViewById(R.id.results);
        registerForContextMenu(operation);


    }

    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.add(0, 0, 0, "+");
        menu.add(0, 1, 1, "-");

    }
    public boolean onContextItemSelected(MenuItem item) {
        if(item.getItemId()==0) {
            int i = Integer.parseInt(num1.getText().toString());
            int s = Integer.parseInt(num2.getText().toString());
            int total=i-s;
            ans.setText(total);
            return true;
        }
        else if(item.getItemId()==1) {
            int i = Integer.parseInt(num1.getText().toString());
            int s = Integer.parseInt(num2.getText().toString());
            int total=i+s;
            ans.setText(total);
            return true;
        }
        return super.onContextItemSelected(item);
    }
            reset.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            num1.setText("");
            num2.setText("");
        }
    });

}
