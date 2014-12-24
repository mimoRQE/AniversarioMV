package com.quintero.raul.aniversariomv.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.quintero.raul.aniversariomv.R;
import com.quintero.raul.aniversariomv.adapter.ImageAdapter;
import com.quintero.raul.aniversariomv.provider.Images;

/**
 * A PhotoFragment fragment containing a simple view.
 */
public class GalleryGridFragment extends Fragment{

    private int[] images;

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static GalleryGridFragment newInstance(int sectionNumber) {
        GalleryGridFragment fragment = new GalleryGridFragment(sectionNumber);
        return fragment;
    }

    public GalleryGridFragment(int sectionNumber) {
        switch (sectionNumber){
            case 2010:
                this.images= Images.imageSmall2010;
                break;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_gallery_grid, container, false);
        GridView gridImage = (GridView)rootView.findViewById(R.id.grid_image_fragment);
        ImageAdapter adapter = ImageAdapter.newInstance(getActivity(),images);
        gridImage.setAdapter(adapter);
        return rootView;
    }



}
