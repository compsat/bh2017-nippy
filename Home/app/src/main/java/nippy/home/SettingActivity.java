package nippy.home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class SettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.howToButton)
    public void showHowTo(){

    }

    @OnClick(R.id.mainMenuButton)
    public void backToMenu() {
        alertUserAboutError(0);
    }

    @OnClick(R.id.quitButton)
    public void quit() {
        alertUserAboutError(1);
    }

    private void alertUserAboutError(int i) {
        AlertDialogFragment dialog = new AlertDialogFragment(this, i);
        dialog.show(getFragmentManager(), "error_dialog");
    }

}
