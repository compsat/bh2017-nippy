package nippy.home;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

public class AlertDialogFragment extends DialogFragment {

    public SettingActivity activity;
    public int n;
    public AlertDialogFragment(SettingActivity s, int i){
        activity = s;
        n = i;
    }
    public static boolean answer = false, done = false;
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context context = getActivity();
        String text;
        if(n == 0) text = "go back to the main menu";
        else {
            text = "quit";
            answer = true;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context)
                .setTitle("Wait!")
                .setMessage("You will lose all your progress if you " + text + " now! Is that okay?")
                .setNegativeButton("No", null)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        activity.finish();
                        Intent intent = new Intent(activity, MainActivity.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent);
                    }
                });
        AlertDialog dialog = builder.create();
        return dialog;
    }
}
