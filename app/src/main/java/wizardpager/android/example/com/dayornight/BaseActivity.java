package wizardpager.android.example.com.dayornight;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

import wizardpager.android.example.com.dayornight.util.MarketPreferences;


public class BaseActivity extends AppCompatActivity {

    /** 白天与夜间模式切换广播 */
    public static final String DAYORNIGHT_ACTION = "com.gionee.aora.market.gui.main.DAYORNIGHT_ACTION";

    /**
     * 界面上留给Tab条的空间
     */
    protected LinearLayout tabSpace;

    private DayOrNightBroadcastReceiver receiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        receiver = new DayOrNightBroadcastReceiver();
        IntentFilter filter = new IntentFilter();
        filter.addAction(DAYORNIGHT_ACTION);
        this.registerReceiver(receiver,filter);



    }

    /**
     * 白天与夜间模式切换广播
     *
     * @author denglh
     */
    class DayOrNightBroadcastReceiver extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {
            dayOrNight(MarketPreferences.getInstance(context).getDayOrNight());
        }
    }


    /**
     * 设置tab背景
     * @param dayornight true：夜间模式 false：白天模式
     */
    protected void dayOrNight(boolean dayornight)
    {
        if (dayornight)
        {
            tabSpace.setBackgroundColor(0xff2b2b37);
        }
        else
        {
            tabSpace.setBackgroundColor(0xfffbfbfb);
        }
    }

}
