package com.quintero.raul.aniversariomv.fragment;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.quintero.raul.aniversariomv.MainActivity;
import com.quintero.raul.aniversariomv.R;
import com.quintero.raul.aniversariomv.Util.Font;

/**
 * A HomeFragment fragment containing a simple view.
 */
public class HomeFragment extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static HomeFragment newInstance(int sectionNumber) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public HomeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        TextView textThanks = (TextView)rootView.findViewById(R.id.text_thanks);
        TextView textLetter= (TextView)rootView.findViewById(R.id.text_letter);
        Font font = new Font();
        font.changeHame(getActivity(),textLetter);
        font.changeHand(getActivity(),textThanks);

        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((MainActivity) activity).onSectionAttached(
                getArguments().getInt(ARG_SECTION_NUMBER));
    }

}
