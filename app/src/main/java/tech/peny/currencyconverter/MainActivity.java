package tech.peny.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    public void ConvertCurrency(View view){
        Log.i("Action","Button Pressed!");
        EditText currencyTextEdit = findViewById(R.id.currencyEditText);

        String amountInPounds = currencyTextEdit.getText().toString();
        double amountInPoundsDouble = Double.parseDouble(amountInPounds);
        double amountInGhcDouble = 6.94 * amountInPoundsDouble;

        String amountInGhc = Double.toString(amountInGhcDouble);
        Log.i("Pounds", amountInPounds);
        Log.i("Ghc",amountInGhc );
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}