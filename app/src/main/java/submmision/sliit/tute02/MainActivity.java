package submmision.sliit.tute02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText num01, num02;
    Button okBtn;
    String number01, number02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        okBtn = (Button) findViewById(R.id.okBtn);

        num01 = (EditText) findViewById(R.id.number01);
        num02 = (EditText) findViewById(R.id.number02);

        okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent okIntent = new Intent(MainActivity.this, Second.class);

                number01 = num01.getText().toString();
                number02 = num02.getText().toString();

                okIntent.putExtra("EXTRA1", number01);
                okIntent.putExtra("EXTRA2", number02);

                Context context = getApplicationContext();
                CharSequence message = "Data received";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, message, duration);
                toast.show();

                startActivity(okIntent);

            }
        });
    }
}
