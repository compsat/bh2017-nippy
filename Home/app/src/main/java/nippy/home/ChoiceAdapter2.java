package nippy.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Luis on 2/19/2017.
 */

public class ChoiceAdapter2 extends BaseAdapter {

    private Context mContext;
    private Choice[] mChoices;

    public ChoiceAdapter2(Context context, Choice[] choices) {
        mContext = context;
        mChoices = choices;
    }

    @Override
    public int getCount() {
        return mChoices.length;
    }

    @Override
    public Object getItem(int position) {
        return mChoices[position];
    }

    @Override
    public long getItemId(int position) {
        return 0; //lel
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if(convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.chosen_list_choice_layout, null);
            viewHolder = new ViewHolder();
            viewHolder.choice = (TextView) convertView.findViewById(R.id.textView6);

            convertView.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Choice choice = mChoices[position];
        viewHolder.choice.setText(choice.getName());

        return convertView;

    }

    private static class ViewHolder {
        TextView choice;

        public TextView getChoice() {
            return choice;
        }

        public void setChoice(TextView choice) {
            this.choice = choice;
        }
    }
}
