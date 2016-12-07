package wizardpager.android.example.com.dayornight;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import wizardpager.android.example.com.dayornight.util.MarketPreferences;

public class TestActivity extends BaseActivity {

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MarketPreferences sp = MarketPreferences
                        .getInstance(TestActivity.this);
                sp.setDayOrNight(!sp.getDayOrNight());
                Intent intent10 = new Intent(
                        BaseActivity.DAYORNIGHT_ACTION);
                TestActivity.this.sendBroadcast(intent10);
            }
        });
    }
}
