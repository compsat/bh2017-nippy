/*
package nippy.home;


import android.util.Log;

import java.util.ArrayList;

/**
 * Created by Luis on 2/18/2017.

public class Building {
    private int mIconID;
    private ArrayList<Choice> mChoices;
    private static final int EMPTY_ID = GameScreenActivity.EMPTY_ID;
    private String mName;
    private boolean mIsDone;
    private int mAfterIndex;

    public Building(int iconID) {
        mIconID = iconID;
        mIsDone = false;
        mChoices = new ArrayList<Choice>();
        assignName();
    }

    public void changeIconID( )

    private void assignName() {
        if(mIconID == R.drawable.icon_bus) mName = "Bus";
        else if(mIconID == R.drawable.icon_empty) mName = "Empty Slot";
        else if(mIconID == R.drawable.icon_factory) mName = "Factory";
        else if(mIconID == R.drawable.icon_house) mName = "House";
        else if(mIconID == R.drawable.icon_tree) mName = "Tree";
        else if(mIconID == R.drawable.icon_do) mName = "Disaster Office";
        else if(mIconID == R.drawable.icon_hospital) mName = "Hospital";
        else if(mIconID == R.drawable.icon_lto) mName = "Land Transport Office";
        else if(mIconID == R.drawable.icon_meralco) mName = "Power plant";
        else if(mIconID == R.drawable.icon_nature1) mName = "Natural Heritage Site";
        else if(mIconID == R.drawable.icon_nature2) mName = "Natural Heritage Site";
        else if(mIconID == R.drawable.icon_options) mName = "Options";
        else if(mIconID == R.drawable.icon_park) mName = "Park";
        else if(mIconID == R.drawable.icon_train) mName = "Train";
        else if(mIconID == R.drawable.icon_school) mName = "School";
        else if(mIconID == R.drawable.icon_trash) mName = "Trash";
        else if(mIconID == R.drawable.icon_water) mName = "Water";
        else if(mIconID == R.drawable.icon_mall) mName = "Mall";
        else if(mIconID == R.drawable.icon_tracks) mName = "Tracks";
        else if(mIconID == R.drawable.icon_broken) mName = "Broken Road";
        else if(mIconID == R.drawable.icon_fixed) mName = "Road";
    }

    public boolean isDone() {
        return mIsDone;
    }

    public void setDone(boolean done) {
        mIsDone = done;
    }

    public int getAfterIndex() {
        return mAfterIndex;
    }

    public void setAfterIndex(int afterIndex) {
        mAfterIndex = afterIndex;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getIconName(){
        return mName;
    }

    public int getIconID() {
        return mIconID;
    }

    public void setIconID(int iconID) {
        mIconID = iconID;
    }

    public boolean isEmpty() {
        return mIconID == EMPTY_ID;
    }

    public Choice[] getChoices() {
        ArrayList<Choice> temp = new ArrayList<>();
        for(int i = 0; i < mChoices.size(); i++) {
            if (mChoices.get(i).isReady()) {
                Log.e("test", mChoices.get(i).getName());
                temp.add(mChoices.get(i));
            }
        }

        Choice[] choices = new Choice[temp.size()];
        for(int i = 0; i < choices.length; i++) {
            choices[i] = temp.get(i);
        }

        return choices;
    }

    public void updateChoices(Choice[] choice){
        for(int i = 0; i < choice.length; i++) {
            if(choice[i] == null) continue;
            for(int j = 0; j < mChoices.size(); j++) {
                if(choice[i].getName().equals(mChoices.get(j).getName())) {
                    mChoices.remove(j--);
                }
            }
        }
    }

    public void addChoice(Choice choice) {
        mChoices.add(choice);
    }
}
*/

package nippy.home;

import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by Luis on 2/18/2017.
 */
public class Building {
    private ImageView mImageView;
    private ArrayList<Choice> mChoices;
    private int mIconID, mIndex;
    private String mName;

    public Building(int index) {
        mChoices = new ArrayList<>();
        this.mIndex = index;
    }

    private void assignName() {
        if(mIconID == R.drawable.icon_bus) mName = "Bus";
        else if(mIconID == R.drawable.icon_empty) mName = "Empty Slot";
        else if(mIconID == R.drawable.icon_factory) mName = "Factory";
        else if(mIconID == R.drawable.icon_house) mName = "House";
        else if(mIconID == R.drawable.icon_tree) mName = "Tree";
        else if(mIconID == R.drawable.icon_do) mName = "Disaster Office";
        else if(mIconID == R.drawable.icon_hospital) mName = "Hospital";
        else if(mIconID == R.drawable.icon_lto) mName = "Land Transport Office";
        else if(mIconID == R.drawable.icon_meralco) mName = "Power plant";
        else if(mIconID == R.drawable.icon_nature1) mName = "Natural Heritage Site";
        else if(mIconID == R.drawable.icon_nature2) mName = "Natural Heritage Site";
        else if(mIconID == R.drawable.icon_options) mName = "Options";
        else if(mIconID == R.drawable.icon_park) mName = "Park";
        else if(mIconID == R.drawable.icon_train) mName = "Train";
        else if(mIconID == R.drawable.icon_school) mName = "School";
        else if(mIconID == R.drawable.icon_trash) mName = "Trash";
        else if(mIconID == R.drawable.icon_water) mName = "Water";
        else if(mIconID == R.drawable.icon_mall) mName = "Mall";
        else if(mIconID == R.drawable.icon_tracks) mName = "Tracks";
        else if(mIconID == R.drawable.icon_broken) mName = "Broken Road";
        else if(mIconID == R.drawable.icon_fixed) mName = "Road";
    }

    public ImageView getImageView() {
        return mImageView;
    }

    public void setImageView(ImageView imageView) {
        mImageView = imageView;
    }

    public Choice[] getChoices() {
        ArrayList<Choice> temp2 = new ArrayList<>();

        for(int i = 0; i < mChoices.size(); i++) {
            if(mChoices.get(i) == null) continue;
            if(!mChoices.get(i).isDone() && mChoices.get(i).noReq()) temp2.add(mChoices.get(i));
        }

        Choice[] temp = new Choice[temp2.size()];
        for(int i = 0; i < temp2.size(); i++) {
            temp[i] = temp2.get(i);
        }
        return temp;
    }

    public void setIconID(int iconID) {
        this.mIconID = iconID;

        ChoiceAndBuildingData cabd = new ChoiceAndBuildingData();
        mChoices = cabd.getChoices(iconID);

        assignName();
    }

    public String getName() {
        return mName;
    }

    public void remove(Choice j) {
        for(int i = 0; i < mChoices.size(); i++) {
            if(mChoices.get(i).equals(j)) mChoices.remove(i);
        }
    }
}
