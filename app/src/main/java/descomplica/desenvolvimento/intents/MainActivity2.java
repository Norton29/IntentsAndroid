package descomplica.desenvolvimento.intents;

import android.content.Intent;
import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Toast;



public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle extras = getIntent().getExtras();
        String value1 = extras.getString("Value1");
        String value2 = extras.getString("Value2");
        String value3 = extras.getString("Value3");
        Toast.makeText(getApplicationContext(), "Values are:\n First Value: " + value1 + "\n Second Value: " + value2 + "\n Third Value: " + value3,
                Toast.LENGTH_LONG).show();
    }

    public void callFirstActivity(View view){
        Intent intent1 = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent1);
    }
    public void callThirdActivity(View view){
        Intent intent2 = new Intent(getApplicationContext(), MainActivity3.class);
        intent2.putExtra("Value1", "Aula05");
        intent2.putExtra("Value2", "Descomplica");
        intent2.putExtra("Value3", "Terceira Intent");
        startActivity(intent2);
    }



}