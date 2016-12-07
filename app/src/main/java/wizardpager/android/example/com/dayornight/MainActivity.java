package wizardpager.android.example.com.dayornight;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import wizardpager.android.example.com.dayornight.util.MarketPreferences;

public class MainActivity extends BaseActivity {
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MainActivity.this.startActivity(new Intent(MainActivity.this,TestActivity.class));
            }
        });
    }


    @Override
    protected void dayOrNight(boolean dayornight) {
        super.dayOrNight(dayornight);
        if (dayornight)
        {
            btn.setBackgroundColor(0xff2b2b37);
        }
        else
        {
            btn.setBackgroundColor(0xfffbfbfb);
        }
    }
}
