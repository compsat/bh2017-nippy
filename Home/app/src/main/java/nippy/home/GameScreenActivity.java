/*package nippy.home;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class GameScreenActivity extends AppCompatActivity {

    public static String HEADER_TEXT = "pineapples are people";
    private static Building[] mBuildings;
    private ImageView[] mImageViews;
    public static final int NUM_BUILDINGS = 16, EMPTY_ID = R.drawable.icon_empty;
    public static final String CHOICES_KEY = "mikeetomyluiscallantajazminesligunas";
    public static final String CHOSEN_KEY = "callantajazminesligunasmikeetomyluis";
    private static ArrayList<Building> allBuildings;
    private static ArrayList<Choice> allChoices;

    private static Choice[] mCurrChoices;
    private static Choice[] mDoneChoices;
    public static Choice[] mCurrChosen;
    private static int year = 2019;
    private static int numTurns = 0;
    public static String block;

    @BindView(R.id.year_text_view) TextView yearTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);
        ButterKnife.bind(this);

        setChoices();
        setImageViews();
        setBuildings();
        //setOnClickListeners();
        update();
        incrementYear();
        mDoneChoices = new Choice[allChoices.size()];
    }

    public static void incrementYear() {
        year++;
    }

    @OnClick(R.id.options)
    public void switchScreen(){
        Intent intent = new Intent(this, SettingActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();

        yearTextView.setText("Year " + year);
    }

    private void setImageViews() {
        mImageViews = new ImageView[NUM_BUILDINGS];

        int[] ids = {R.id.block1, R.id.block2, R.id.block3, R.id.block4,
                R.id.block5, R.id.block6, R.id.block7, R.id.block8,
                R.id.block9, R.id.block10, R.id.block11, R.id.block12,
                R.id.block13, R.id.block14, R.id.block15, R.id.block16};

        for(int i= 0; i < NUM_BUILDINGS; i++)
            mImageViews[i] = (ImageView) findViewById(ids[i]);
    }

    private void setBuildings() {
        mBuildings = new Building[NUM_BUILDINGS];

        mBuildings[0] = allBuildings.get(0);
        mBuildings[1] = allBuildings.get(1);
        mBuildings[2] = allBuildings.get(8);
        mBuildings[4] = allBuildings.get(4);
        mBuildings[11] = allBuildings.get(12);
        mBuildings[3] = allBuildings.get(14);
        mBuildings[5] = allBuildings.get(15);
        mBuildings[6] = allBuildings.get(16);
        mBuildings[7] = allBuildings.get(17);
        mBuildings[8] = allBuildings.get(18);
        mBuildings[9] = allBuildings.get(19);
        mBuildings[10] = allBuildings.get(20);
        mBuildings[12] = allBuildings.get(21);
        mBuildings[13] = allBuildings.get(22);
        mBuildings[14] = allBuildings.get(23);
        mBuildings[15] = allBuildings.get(24);

    }

    private void setChoices() {
        ChoiceAndBuildingData choiceAndBuildingData = new ChoiceAndBuildingData();
        allBuildings = choiceAndBuildingData.getBuildings();
        allChoices = choiceAndBuildingData.getChoices();
    }

    @OnClick(R.id.block1)
    public void socl1(View v) {
        mCurrChoices = mBuildings[0].getChoices();
        HEADER_TEXT = mBuildings[0].getName();
        startChoiceListActivity(v);
    }
    @OnClick(R.id.block2)
    public void socl2(View v) {
        mCurrChoices = mBuildings[1].getChoices();
        HEADER_TEXT = mBuildings[1].getName();
        startChoiceListActivity(v);
    }
    @OnClick(R.id.block3)
    public void socl3(View v) {
        mCurrChoices = mBuildings[2].getChoices();
        HEADER_TEXT = mBuildings[2].getName();
        startChoiceListActivity(v);
    }
    @OnClick(R.id.block4)
    public void socl4(View v) {
        mCurrChoices = mBuildings[3].getChoices();
        HEADER_TEXT = mBuildings[3].getName();
        startChoiceListActivity(v);
    }
    @OnClick(R.id.block5)
    public void socl5(View v) {
        mCurrChoices = mBuildings[4].getChoices();
        HEADER_TEXT = mBuildings[4].getName();
        startChoiceListActivity(v);
    }
    @OnClick(R.id.block6)
    public void socl6(View v) {
        mCurrChoices = mBuildings[5].getChoices();
        HEADER_TEXT = mBuildings[5].getName();
        startChoiceListActivity(v);
    }
    @OnClick(R.id.block7)
    public void socl7(View v) {
        mCurrChoices = mBuildings[6].getChoices();
        HEADER_TEXT = mBuildings[6].getName();
        startChoiceListActivity(v);
    }
    @OnClick(R.id.block8)
    public void socl8(View v) {
        mCurrChoices = mBuildings[7].getChoices();
        HEADER_TEXT = mBuildings[7].getName();
        startChoiceListActivity(v);
    }
    @OnClick(R.id.block9)
    public void socl9(View v) {
        mCurrChoices = mBuildings[8].getChoices();
        HEADER_TEXT = mBuildings[8].getName();
        startChoiceListActivity(v);
    }
    @OnClick(R.id.block10)
    public void socl10(View v) {
        mCurrChoices = mBuildings[9].getChoices();
        HEADER_TEXT = mBuildings[9].getName();
        startChoiceListActivity(v);
    }
    @OnClick(R.id.block11)
    public void socl11(View v) {
        mCurrChoices = mBuildings[10].getChoices();
        HEADER_TEXT = mBuildings[10].getName();
        startChoiceListActivity(v);
    }
    @OnClick(R.id.block12)
    public void socl12(View v) {
        mCurrChoices = mBuildings[11].getChoices();
        HEADER_TEXT = mBuildings[11].getName();
        startChoiceListActivity(v);
    }
    @OnClick(R.id.block13)
    public void socl13(View v) {
        mCurrChoices = mBuildings[12].getChoices();
        HEADER_TEXT = mBuildings[12].getName();
        startChoiceListActivity(v);
    }
    @OnClick(R.id.block14)
    public void socl14(View v) {
        mCurrChoices = mBuildings[13].getChoices();
        HEADER_TEXT = mBuildings[13].getName();
        startChoiceListActivity(v);
    }
    @OnClick(R.id.block15)
    public void socl15(View v) {
        mCurrChoices = mBuildings[14].getChoices();
        HEADER_TEXT = mBuildings[14].getName();
        startChoiceListActivity(v);
    }
    @OnClick(R.id.block16)
    public void socl16(View v) {
        mCurrChoices = mBuildings[15].getChoices();
        HEADER_TEXT = mBuildings[15].getName();
        startChoiceListActivity(v);
    }


    private void update() {
        for(int i = 0; i < NUM_BUILDINGS; i++)
            mImageViews[i].setImageResource(mBuildings[i].getIconID());
    }

    @OnClick(R.id.doing_list)
    public void startChosenListActivity(View v) {
        Intent intent = new Intent(this, ChosenListActivity.class);

        intent.putExtra(CHOSEN_KEY, trimChosen());

        startActivity(intent);
    }

    public void startChoiceListActivity(View v) {
        Intent intent = new Intent(this, ChoiceListActivity.class);
        if(mCurrChoices == null) mCurrChoices = new Choice[0];
        intent.putExtra(CHOICES_KEY, mCurrChoices);

        startActivity(intent);
    }

    private Choice[] trimChosen() {
        if(mCurrChosen == null) return new Choice[0];

        int j = 0;
        while(j < mCurrChosen.length && mCurrChosen[j] != null) {
            j++;
        }
        Choice[] temp = new Choice[j];
        for(int i = 0; i < j; i++) {
            temp[i] = mCurrChosen[i];
        }
        return temp;
    }
    public static void addChosen(Choice choice, Context context) {
        if(mCurrChosen == null) mCurrChosen = new Choice[3];

        if(mCurrChosen[2] != null) {
            Toast.makeText(context, "Sorry. You cannot choose any more projects for the year.", Toast.LENGTH_SHORT).show();
            return;
        }

        for(int i = 0; i < mCurrChosen.length; i++) {
            if(mCurrChosen[i] == null) {
                //Toast.makeText(context, ">> " + i, Toast.LENGTH_SHORT).show();
                mCurrChosen[i] = choice;
                break;
            }
            if(mCurrChosen[i].getName().equals(choice.getName())) {
                Toast.makeText(context, "Sorry. You've already chosen this task.", Toast.LENGTH_SHORT).show();
                break;
            }

        }
    }

    public static void newYear() {
        for(int i = 0; i < mCurrChosen.length; i++) {
            if(mCurrChosen[i] == null) continue;
            mDoneChoices[numTurns++] = mCurrChosen[i];
            mCurrChosen[i].setDone(false);
        }
        for(int i = 0; i < mCurrChoices.length; i++) {
            if (mCurrChoices[i] == null) continue;
            mCurrChoices[i].updatePreReq(mDoneChoices);
        }
        mCurrChosen = null;
        for(int i = 0; i < mBuildings.length; i++){
            mBuildings[i].updateChoices(mDoneChoices);
            mCurrChoices = mBuildings[i].getChoices();
        }
    }
}
*/

package nippy.home;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class GameScreenActivity extends AppCompatActivity {

    public static final String CHOICE_KEY = "Dogs are people";
    public static String HEADER_TEXT = "Hey.";
    public static String CHOSEN_KEY = "Waddup";
    private static boolean end = false;
    private Building[] mBuildings;
    private ImageView[] mImageViews;
    private static ArrayList<Choice> mChosen;
    private int indexOpen;
    private static int year = 2020;
    @BindView(R.id.year_text_view) TextView yearTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);
        ButterKnife.bind(this);

        yearTextView.setText("Year " + year);
        mChosen = new ArrayList<>();
        loadBuildings();
        addClickListeners();
    }


    private void loadBuildings() {
        mImageViews = new ImageView[16];

        mImageViews[0] = (ImageView) findViewById(R.id.block1);
        mImageViews[1] = (ImageView) findViewById(R.id.block2);
        mImageViews[2] = (ImageView) findViewById(R.id.block3);
        mImageViews[3] = (ImageView) findViewById(R.id.block4);
        mImageViews[4] = (ImageView) findViewById(R.id.block5);
        mImageViews[5] = (ImageView) findViewById(R.id.block6);
        mImageViews[6] = (ImageView) findViewById(R.id.block7);
        mImageViews[7] = (ImageView) findViewById(R.id.block8);
        mImageViews[8] = (ImageView) findViewById(R.id.block9);
        mImageViews[9] = (ImageView) findViewById(R.id.block10);
        mImageViews[10] = (ImageView) findViewById(R.id.block11);
        mImageViews[11] = (ImageView) findViewById(R.id.block12);
        mImageViews[12] = (ImageView) findViewById(R.id.block13);
        mImageViews[13] = (ImageView) findViewById(R.id.block14);
        mImageViews[14] = (ImageView) findViewById(R.id.block15);
        mImageViews[15] = (ImageView) findViewById(R.id.block16);

        mBuildings = new Building[16];
        for(int i = 0; i < 16; i++) {
            mBuildings[i] = new Building(i);
            mBuildings[i].setImageView(mImageViews[i]);
        }
        int[] ids = {R.drawable.icon_nature1, R.drawable.icon_nature2, R.drawable.icon_tree, R.drawable.icon_empty,
                R.drawable.icon_factory, R.drawable.icon_empty, R.drawable.icon_empty, R.drawable.icon_empty,
                R.drawable.icon_empty, R.drawable.icon_empty, R.drawable.icon_empty, R.drawable.icon_house,
                R.drawable.icon_empty, R.drawable.icon_empty, R.drawable.icon_empty, R.drawable.icon_empty};

        for(int i = 0; i < ids.length; i++) {
            mBuildings[i].setIconID(ids[i]);
        }
    }
    private void addClickListeners() {
        for(int i = 0; i < 16; i++) {
            final int finalI = i;
            mImageViews[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    indexOpen = finalI;
                    startChoiceActivity(v);
                }
            });
        }
    }


    public void startChoiceActivity(View v) {
        Intent intent = new Intent(this, ChoiceListActivity.class);
        HEADER_TEXT = mBuildings[indexOpen].getName();
        intent.putExtra(CHOICE_KEY, getChoiceArray());
        startActivity(intent);
    }

    private Choice[] getChoiceArray() {
        return mBuildings[indexOpen].getChoices();
    }

    public static void addChosen(Choice choice, Context applicationContext) {
        if(mChosen.size() == 3) {
            Toast.makeText(applicationContext, "Sorry. You have exceeded your maximum number of tasks this day.", Toast.LENGTH_SHORT).show();
            return;
        }
        for(int i = 0; i < mChosen.size(); i++) {
            if(mChosen.get(i) == choice) {
                Toast.makeText(applicationContext, "Sorry. You have alreaedy selected this task.", Toast.LENGTH_SHORT).show();
                return;
            }
        }
        mChosen.add(choice);
    }

    @OnClick(R.id.doing_list)
    public void startChosenActivity() {
        Intent intent = new Intent(this, ChosenListActivity.class);
        HEADER_TEXT = mBuildings[indexOpen].getName();
        intent.putExtra(CHOSEN_KEY, getChosenArray());
        startActivity(intent);
    }

    private Choice[] getChosenArray() {
        Choice[] temp = new Choice[mChosen.size()];

        for(int i = 0; i < mChosen.size(); i++) {
            temp[i] = mChosen.get(i);
        }

        return temp;
    }

    @OnClick(R.id.options)
    public void goToOptions(){
        Intent intent = new Intent(this, SettingActivity.class);
        startActivity(intent);

    }

    @Override
    protected void onResume() {
        super.onResume();
        yearTextView.setText("Year " + year);

        if(end) {
            removeStuff(mBuildings);
            end = false;
        }

    }
    public static void removeStuff(Building[] mBuildings) {
        while(!mChosen.isEmpty()) {
            mChosen.get(0).setDone(true);

            for(int i = 0; i < mBuildings.length; i++) {
                Choice[] temp = mBuildings[i].getChoices();

                for(int j = 0; j < temp.length; j++) {
                    if(temp[j].getName().equals(mChosen.get(0).getName()) && temp[j].getDescription().equals(mChosen.get(0).getDescription()))
                        mBuildings[i].remove(temp[j]);
                }
            }

            mChosen.remove(0);
        }
    }

    public static void endYear() {
        end = true;
        year++;
    }
}
