package com.quintero.raul.aniversariomv.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.quintero.raul.aniversariomv.MainActivity;
import com.quintero.raul.aniversariomv.R;
import com.quintero.raul.aniversariomv.Util.Font;

/**
 * A PhotoFragment fragment containing a simple view.
 */
public class PhotoFragment extends Fragment{

    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static PhotoFragment newInstance(int sectionNumber) {
        PhotoFragment fragment = new PhotoFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public PhotoFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_photo, container, false);;
        TextView text2010 = (TextView)rootView.findViewById(R.id.text_2010);
        TextView text2011= (TextView)rootView.findViewById(R.id.text_2011);
        TextView text2012= (TextView)rootView.findViewById(R.id.text_2012);
        TextView text2013= (TextView)rootView.findViewById(R.id.text_2013);
        Font font = new Font();
        font.changeHame(getActivity(),text2010);
        font.changeHame(getActivity(),text2011);
        font.changeHame(getActivity(),text2012);
        font.changeHame(getActivity(),text2013);
        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((MainActivity) activity).onSectionAttached(
                getArguments().getInt(ARG_SECTION_NUMBER));
    }

}
