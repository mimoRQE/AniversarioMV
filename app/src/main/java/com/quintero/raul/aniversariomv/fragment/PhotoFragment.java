package com.quintero.raul.aniversariomv.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.quintero.raul.aniversariomv.MainActivity;
import com.quintero.raul.aniversariomv.R;
import com.quintero.raul.aniversariomv.util.Font;

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
        RelativeLayout layout2010 = (RelativeLayout)rootView.findViewById(R.id.layout_2010);
        RelativeLayout layout2011 = (RelativeLayout)rootView.findViewById(R.id.layout_2011);
        RelativeLayout layout2012 = (RelativeLayout)rootView.findViewById(R.id.layout_2012);
        RelativeLayout layout2013 = (RelativeLayout)rootView.findViewById(R.id.layout_2013);
        RelativeLayout layoutHover2010= (RelativeLayout)rootView.findViewById(R.id.image_hover_2010);
        RelativeLayout layoutHover2011 = (RelativeLayout)rootView.findViewById(R.id.image_hover_2011);
        RelativeLayout layoutHover2012 = (RelativeLayout)rootView.findViewById(R.id.image_hover_2012);
        RelativeLayout layoutHover2013 = (RelativeLayout)rootView.findViewById(R.id.image_hover_2013);
        setAnimaetedBacground(layout2010,layoutHover2010);
        setAnimaetedBacground(layout2011,layoutHover2011);
        setAnimaetedBacground(layout2012,layoutHover2012);
        setAnimaetedBacground(layout2013,layoutHover2013);
        Font font = new Font();
        font.changeHame(getActivity(),text2010);
        font.changeHame(getActivity(),text2011);
        font.changeHame(getActivity(),text2012);
        font.changeHame(getActivity(),text2013);
        return rootView;
    }


    private void setAnimaetedBacground(RelativeLayout layout,final RelativeLayout layoutHover){

        layout.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                // TODO Auto-generated method stub
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        layoutHover.setVisibility(View.VISIBLE);
                        break;
                    case MotionEvent.ACTION_UP:
                        layoutHover.setVisibility(View.GONE);
                        sendGallery(v.getId());
                        break;
                }
                return true;
            }
        });
    }

    private void sendGallery(int idLayout){
        switch (idLayout){
            case R.id.layout_2010:
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                Fragment fragment =  GalleryGridFragment.newInstance(2010);
                fragmentManager.beginTransaction()
                        .replace(R.id.container, fragment)
                        .commit();
                break;
        }
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((MainActivity) activity).onSectionAttached(
                getArguments().getInt(ARG_SECTION_NUMBER));
    }

}
