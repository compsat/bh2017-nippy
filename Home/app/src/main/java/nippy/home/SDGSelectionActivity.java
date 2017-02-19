package nippy.home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SDGSelectionActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sdgselection);
        ButterKnife.bind(this);

    }


    @OnClick(R.id.upLeftImageButton)
    public void launchGame() {
        Intent intent = new Intent(this, GameScreenActivity.class);
        startActivity(intent);
    }
}
