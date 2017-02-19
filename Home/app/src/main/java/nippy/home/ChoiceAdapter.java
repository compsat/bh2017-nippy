package nippy.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Luis on 2/18/2017.
 */

public class ChoiceAdapter extends BaseAdapter {

    private Context mContext;
    private Choice[] mChoices;

    public ChoiceAdapter(Context context, Choice[] choices) {
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
        return 0; //i don't care
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if(convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.choice_list_layout, null);
            viewHolder = new ViewHolder();
            viewHolder.choice = (TextView) convertView.findViewById(R.id.textView2);
            viewHolder.description = (TextView) convertView.findViewById(R.id.textView3);

            convertView.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Choice choice = mChoices[position];
        viewHolder.choice.setText(choice.getName());
        viewHolder.description.setText(choice.getDescription());
        /*
        viewHolder.iconImageView.setImageResource(day.getIconId());
        viewHolder.temperatureLabel.setText(day.getTemperatureMax() + "");
        if(position == 0) viewHolder.dayLabel.setText("Today");
        else viewHolder.dayLabel.setText(day.getDayOfTheWeek());*/

        return convertView;

    }

    private static class ViewHolder {
        TextView choice, description;

        public TextView getChoice() {
            return choice;
        }

        public void setChoice(TextView choice) {
            this.choice = choice;
        }

        public TextView getDescription() {
            return description;
        }

        public void setDescription(TextView description) {
            this.description = description;
        }

    }
}
