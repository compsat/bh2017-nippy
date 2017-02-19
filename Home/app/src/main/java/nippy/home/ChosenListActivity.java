package nippy.home;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Parcelable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;

import java.util.Arrays;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ChosenListActivity extends ListActivity {

    private Choice[] mChoices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chosen_list);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        Parcelable[] parcelables = intent.getParcelableArrayExtra(GameScreenActivity.CHOSEN_KEY);
        mChoices = Arrays.copyOf(parcelables, parcelables.length, Choice[].class);

        ChoiceAdapter2 adapter = new ChoiceAdapter2(this, mChoices);
        setListAdapter(adapter);
        /*
        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });*/
    }
    @OnClick(R.id.end_year_button)
    public void endYear() {
        GameScreenActivity.endYear();
        finish();
    }
}

