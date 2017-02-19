/*package nippy.home;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

import java.util.ArrayList;

public class Choice implements Parcelable {
    private String mName, mDescription;
    private boolean mDone = false;
    private ArrayList<Choice> mChoicesReq;
    private ArrayList<Building> mBuildingsReq;
    private int mTurns, mDays;

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        //fil
        dest.writeString(mName);
        dest.writeString(mDescription);

    }

    private Choice(Parcel in) {
        //fill
        mName = in.readString();
        mDescription = in.readString();
    }

    public Choice(String name, int turns, int days) {
        mDone = false;
        mName = name;
        mDescription = turns + " turn";
        if(turns != 1) mDescription += "s";
        mDescription += " for " + days + " day";
        if(days != 1) mDescription += "s";
        mChoicesReq = new ArrayList<>();
        mBuildingsReq = new ArrayList<>();
        mTurns = turns;
        mDays = days;
    }

    public void addChoiceReq(Choice choice) {
        mChoicesReq.add(choice);
    }

    public void addBuildingReq(Building building) {
        mBuildingsReq.add(building);
    }


    public boolean isReady() {
        return (mChoicesReq.isEmpty());
    }

    public void updatePreReq(Choice[] choice){
        if(mChoicesReq == null) return;
        for(int i = 0; i < choice.length; i++) {
            if(choice[i] == null) continue;
            for(int j = 0; j < mChoicesReq.size(); j++) {
                if(choice[i].getName().equals(mChoicesReq.get(j).getName())) {
                    Log.e("test", mChoicesReq.get(j).getName());
                    mChoicesReq.remove(j--);
                }
            }
        }
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }



    public boolean isDone() {
        return mDone;
    }

    public void setDone(boolean done) {
        mDone = done;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        this.mDescription = description;
    }

    public static final Creator<Choice> CREATOR = new Creator<Choice>() {
        @Override
        public Choice createFromParcel(Parcel in) {
            return new Choice(in);
        }

        @Override
        public Choice[] newArray(int size) {
            return new Choice[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }


}
*//*
        package nippy.home;

        import android.os.Parcel;
        import android.os.Parcelable;
        import android.util.Log;

        import java.util.ArrayList;

/**
 * Created by Luis on 2/18/2017.
 *//*
public class Choice implements Parcelable {
    private String mName, mDescription;
    private boolean mDone = false;
    private ArrayList<Choice> mChoicesReq;
    private ArrayList<Building> mBuildingsReq;
    private int mTurns, mDays;

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        //fil
        dest.writeString(mName);
        dest.writeString(mDescription);

    }

    private Choice(Parcel in) {
        //fill
        mName = in.readString();
        mDescription = in.readString();
    }

    public Choice(String name, int turns, int days) {
        mDone = false;
        mName = name;
        mDescription = turns + " turn";
        if(turns != 1) mDescription += "s";
        mDescription += " for " + days + " day";
        if(days != 1) mDescription += "s";
        mChoicesReq = new ArrayList<>();
        mBuildingsReq = new ArrayList<>();
        mTurns = turns;
        mDays = days;
    }

    public void addChoiceReq(Choice choice) {
        mChoicesReq.add(choice);
    }

    public void addBuildingReq(Building building) {
        mBuildingsReq.add(building);
    }


    public boolean isReady() {
        return (mChoicesReq.isEmpty());
    }

    public void updatePreReq(Choice[] choice){
        if(mChoicesReq == null) return;
        for(int i = 0; i < choice.length; i++) {
            if(choice[i] == null) continue;
            for(int j = 0; j < mChoicesReq.size(); j++) {
                if(choice[i].getName().equals(mChoicesReq.get(j).getName())) {
                    Log.e("test", mChoicesReq.get(j).getName());
                    mChoicesReq.remove(j--);
                }
            }
        }
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }



    public boolean isDone() {
        return mDone;
    }

    public void setDone(boolean done) {
        mDone = done;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        this.mDescription = description;
    }

    public static final Creator<Choice> CREATOR = new Creator<Choice>() {
        @Override
        public Choice createFromParcel(Parcel in) {
            return new Choice(in);
        }

        @Override
        public Choice[] newArray(int size) {
            return new Choice[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }
}

*/
package nippy.home;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Luis on 2/18/2017.
 */
public class Choice implements Parcelable {

    private String name, description;
    private ArrayList<Choice> req;
    private boolean done = false;
    private int turns, days;


    protected Choice(Parcel in) {
        name = in.readString();
        description = in.readString();
    }

    public static final Creator<Choice> CREATOR = new Creator<Choice>() {
        @Override
        public Choice createFromParcel(Parcel in) {
            return new Choice(in);
        }

        @Override
        public Choice[] newArray(int size) {
            return new Choice[size];
        }
    };

    public Choice(String s, int i, int i1) {
        name = s;
        req = new ArrayList<>();
        turns = i;
        days = i1;
    }

    public String getDescription() {
        if(description != null) return description;

        String mDescription = "";
        mDescription = turns + " turn";
        if(turns != 1) mDescription += "s";
        mDescription += " for " + days + " day";
        if(days != 1) mDescription += "s";
        description = mDescription;

        return mDescription;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(getDescription());
    }

    public void addChoiceReq(Choice choice) {
        for(int i = 0; i < req.size(); i++) {
            if(req.get(i) == choice) break;
        }
        req.add(choice);
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
    public boolean noReq() {
        return req.isEmpty();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }/*
    public Choice[] getChoices() {
        ArrayList<Choice> temp = new ArrayList<>();

        for(int i = 0; i < req.size(); i++) {
            if(req.get(i).noReq() && !req.get(i).isDone()) temp.add(req.get(i));
        }
        Choice[] temp2 = new Choice[temp.size()];
        for(int i = 0; i < temp.size(); i++) {
            temp2[i] = temp.get(i);
        }
        return temp2;
    }*/
}
