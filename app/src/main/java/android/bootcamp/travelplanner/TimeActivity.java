package android.bootcamp.travelplanner;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;

public class TimeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        ((TextView) findViewById(R.id.velocity)).setText(getIntent().getStringExtra("result"));
    }

}
