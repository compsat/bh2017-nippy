package nippy.home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private GestureDetector gestureDetector;
    private View.OnTouchListener gestureListener;
    private View webView;
    private double y1, y2, MIN_FLICK_DISTANCE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


    }
    public boolean onTouchEvent(MotionEvent touchEvent) {
        switch (touchEvent.getAction()) {
            // when user first touches the screen we get x and y coordinate
            case MotionEvent.ACTION_DOWN:
            {
                y1 = touchEvent.getY();
                break;
            }
            case MotionEvent.ACTION_UP:
            {
                y2 = touchEvent.getY();

                if (y1 - y2 > MIN_FLICK_DISTANCE) launchSGDSelectionActivity();
                break;
            }
        }
        return false;
    }

    @Override
    public void onResume(){
        super.onResume();
        if(AlertDialogFragment.answer == true) {
            finish();
            AlertDialogFragment.answer = false;
        }
    }

    public void launchSGDSelectionActivity() {
        Intent intent = new Intent(this, SDGSelectionActivity.class);
        //intent.putExtra(DAILY_FORECAST, mForecast.getDailyForecast());
        startActivity(intent);
    }
}
