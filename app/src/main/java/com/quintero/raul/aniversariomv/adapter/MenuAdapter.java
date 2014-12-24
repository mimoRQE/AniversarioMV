package com.quintero.raul.aniversariomv.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.quintero.raul.aniversariomv.R;
import com.quintero.raul.aniversariomv.util.Font;

/**
 * Created by nodus7 on 19/12/14.
 */
public class MenuAdapter extends BaseAdapter {

    private String[] listOptions;
    int[] imageOptions={R.drawable.home,R.drawable.photo,R.drawable.other};
    private Context context;

    public static MenuAdapter newInstance(Context context,String[] listOptions) {
        MenuAdapter adapter = new MenuAdapter(context,listOptions);
        return adapter;
    }

    public MenuAdapter(Context context,String[] listOptions) {
        this.listOptions=listOptions;
        this.context=context;
    }

    @Override
    public int getCount() {
        return listOptions.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(context==null)
            return null;
        LayoutInflater view = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = view.inflate(R.layout.menu_item, null);
        ImageView imageOption =(ImageView)convertView.findViewById(R.id.menu_image);
        imageOption.setImageResource(imageOptions[position]);
        TextView textOption =(TextView) convertView.findViewById(R.id.menu_text);
        Font font = new Font();
        font.changeHame(context,textOption);
        textOption.setText(listOptions[position]);
        return convertView;
    }
}
