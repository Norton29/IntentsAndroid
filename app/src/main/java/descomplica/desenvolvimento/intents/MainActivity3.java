package descomplica.desenvolvimento.intents;

import android.content.Intent;
import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Toast;


public class MainActivity3 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Bundle extras = getIntent().getExtras();
        String value1 = extras.getString("Value1");
        String value2 = extras.getString("Value2");
        String value3 = extras.getString("Value3");
        Toast.makeText(getApplicationContext(), "Values are:\n First Value: " + value1 + "\n Second Value: " + value2 + "\n Third Value: " + value3,
                Toast.LENGTH_LONG).show();
    }

    public void callSecondActivity(View view){
        Intent intent1 = new Intent(getApplicationContext(), MainActivity2.class);
        intent1.putExtra("Value1", "Aula05");
        intent1.putExtra("Value2", "Descomplica");
        intent1.putExtra("Value3", "Segunda Intent");
        startActivity(intent1);
    }
    public void callFirstActivity(View view){
        Intent intent2 = new Intent(getApplicationContext(), MainActivity.class);
        intent2.putExtra("Value1", "Aula05");
        intent2.putExtra("Value2", "Descomplica");
        intent2.putExtra("Value3", "Primeira Intent");
        startActivity(intent2);
    }


}