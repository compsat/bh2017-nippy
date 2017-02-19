package nippy.home;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Parcelable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ChoiceListActivity extends ListActivity {

    private Choice[] mChoices;

    @BindView(R.id.textView4) TextView mTextView;
    @BindView(R.id.block11) ImageView nice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_list);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        Parcelable[] parcelables = intent.getParcelableArrayExtra(GameScreenActivity.CHOICE_KEY);
        mChoices = Arrays.copyOf(parcelables, parcelables.length, Choice[].class);
        mTextView.setText(GameScreenActivity.HEADER_TEXT);

        ChoiceAdapter adapter = new ChoiceAdapter(this, mChoices);
        setListAdapter(adapter);

        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                /*int[] yarra = {R.drawable.icon_lto, R.drawable.icon_school, R.drawable.icon_hospital, R.drawable.icon_water, R.drawable.icon_meralco, R.drawable.icon_mall, R.drawable.icon_trash, R.drawable.icon_do};
                nice.setImageResource(yarra[position]);*/
                GameScreenActivity.addChosen(mChoices[position], getApplicationContext());
                finish();
            }
        });
    }
}
