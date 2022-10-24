package descomplica.desenvolvimento.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callSecondActivity(View view){
        Intent intent1 = new Intent(getApplicationContext(), MainActivity2.class);
        intent1.putExtra("Value1", "Aula05");
        intent1.putExtra("Value2", "Descomplica");
        intent1.putExtra("Value3", "Segunda Intent");
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