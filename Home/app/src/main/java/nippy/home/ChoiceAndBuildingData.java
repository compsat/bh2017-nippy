package nippy.home;

import java.util.ArrayList;

/**
 * Created by Luis on 2/19/2017.
 */

public class ChoiceAndBuildingData {
    private ArrayList<Choice> mChoices;

    public ChoiceAndBuildingData() {
        putAllChoices();
    }

    public ArrayList<Choice> getChoices(int iconId) {
        int[] ids = {R.drawable.icon_nature1, R.drawable.icon_nature2, R.drawable.icon_school, R.drawable.icon_tracks,
                R.drawable.icon_factory, R.drawable.icon_do, R.drawable.icon_meralco, R.drawable.icon_park,
                R.drawable.icon_tree, R.drawable.icon_trash, R.drawable.icon_hospital, R.drawable.icon_water,
                R.drawable.icon_house, R.drawable.icon_lto, R.drawable.icon_empty};

        int[][] choiceIndices = {{1, 32}, {1, 32}, {3, 21}, {17, 18}, {11, 25}, {12, 26, 27, 28}, {6, 23},
                {30, 31}, {7, 8, 9}, {10, 24, 25}, {4, 22}, {5}, {29}, {2, 19, 20}, {2, 3, 4, 5, 6, 9, 10, 12, 16, 17, 29, 30}};

        ArrayList<Choice> choices = new ArrayList<>();
        for(int i = 0; i < ids.length; i++) {
            if(ids[i] == iconId) {
                for(int j = 0; j < choiceIndices[i].length; j++) {
                    choices.add(mChoices.get(choiceIndices[i][j]));
                }
            }
        }

        return choices;
    }

    private void putAllChoices() {
        mChoices = new ArrayList<>();

        Choice choice = new Choice("Fix road.", 1, 1);
        mChoices.add(choice);
        choice = new Choice("Rehabilitate natural heritage site.", 1, 1);
        mChoices.add(choice);
        choice = new Choice("Build LTO.", 1, 1);
        mChoices.add(choice);
        choice = new Choice("Build school.", 1, 2);
        mChoices.add(choice);
        choice = new Choice("Build hospital.", 1, 2);
        mChoices.add(choice);
        choice = new Choice("Build water plant.", 2, 1); //5
        mChoices.add(choice);
        choice = new Choice("Build power plant.", 2, 1);
        mChoices.add(choice);
        choice = new Choice("Go hunting.", 1, 1);
        mChoices.add(choice);
        choice = new Choice("Explore forest.", 1, 1);
        mChoices.add(choice);
        choice = new Choice("Build mall.", 1, 1);
        mChoices.add(choice);
        choice = new Choice("Build waste plant.", 2, 1); //10
        mChoices.add(choice);
        choice = new Choice("Open jobs.", 1, 1);
        mChoices.add(choice);
        choice = new Choice("Build disaster office.", 1, 2);
        mChoices.add(choice);
        choice = new Choice("Connect to other town.", 1, 1);
        choice.addChoiceReq(mChoices.get(0));
        mChoices.add(choice);
        choice = new Choice("Assign heritage protectors.", 1, 1);
        choice.addChoiceReq(mChoices.get(1));
        mChoices.add(choice);
        choice = new Choice("Promote heritage site.", 1, 1); //15
        choice.addChoiceReq(mChoices.get(1));
        mChoices.add(choice);
        choice = new Choice("Buy buses.", 1, 1);
        choice.addChoiceReq(mChoices.get(0));
        mChoices.add(choice);
        choice = new Choice("Buy trains.", 1, 1);
        choice.addChoiceReq(mChoices.get(0));
        mChoices.add(choice);
        choice = new Choice("Renovate train.", 1, 1);
        choice.addChoiceReq(mChoices.get(17));
        mChoices.add(choice);
        choice = new Choice("Test smoke emission.", 1, 1);
        choice.addChoiceReq(mChoices.get(2));
        mChoices.add(choice);
        choice = new Choice("Update drivers' test.", 1, 1); //20
        choice.addChoiceReq(mChoices.get(2));
        mChoices.add(choice);
        choice = new Choice("Support school fair.", 1, 1);
        choice.addChoiceReq(mChoices.get(3));
        mChoices.add(choice);
        choice = new Choice("Provide hygiene workshops.", 1, 1);
        choice.addChoiceReq(mChoices.get(4));
        mChoices.add(choice);
        choice = new Choice("Renovate the building.", 1, 1);
        choice.addChoiceReq(mChoices.get(6));
        mChoices.add(choice);
        choice = new Choice("Cleanliness campaign.", 1, 1);
        choice.addChoiceReq(mChoices.get(10));
        mChoices.add(choice);
        choice = new Choice("Comply with emission standards.", 1, 1); //25
        choice.addChoiceReq(mChoices.get(10));
        mChoices.add(choice);
        choice = new Choice("Build boats.", 1, 1);
        choice.addChoiceReq(mChoices.get(12));
        mChoices.add(choice);
        choice = new Choice("Prepare the rescue exits.", 1, 1);
        choice.addChoiceReq(mChoices.get(12));
        mChoices.add(choice);
        choice = new Choice("Clean city up.", 1, 1); //28
        choice.addChoiceReq(mChoices.get(12));
        mChoices.add(choice);
        choice = new Choice("Add a house.", 1, 1);
        choice.addChoiceReq(mChoices.get(4));
        choice.addChoiceReq(mChoices.get(5));
        choice.addChoiceReq(mChoices.get(6));
        mChoices.add(choice);
        choice = new Choice("Build park.", 1, 1);
        choice.addChoiceReq(mChoices.get(29));
        mChoices.add(choice);
        choice = new Choice("Feed doves.", 1, 1);
        choice.addChoiceReq(mChoices.get(30));
        mChoices.add(choice);
        choice = new Choice("Create promotional campaigns for tourists.", 1, 1); //32
        choice.addChoiceReq(mChoices.get(1));
        mChoices.add(choice);
    }
}
