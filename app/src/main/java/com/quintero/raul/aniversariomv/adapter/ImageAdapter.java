package com.quintero.raul.aniversariomv.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.quintero.raul.aniversariomv.util.Image;

/**
 * Created by nodus7 on 24/12/14.
 */
public class ImageAdapter extends BaseAdapter {

    private int[] images;
    private Context context;
    private GridView.LayoutParams imageViewLayoutParams;

    public static ImageAdapter newInstance(Context context,int[] images) {
        ImageAdapter adapter = new ImageAdapter(context,images);
        return adapter;
    }

    public ImageAdapter(Context context,int[] images) {
        this.images=images;
        this.context=context;
        this.imageViewLayoutParams = new GridView.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
    }

    @Override
    public int getCount() {
        return images.length;
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


        // Now handle the main ImageView thumbnails
        ImageView imageView;
        if (convertView == null) { // if it's not recycled, instantiate and initialize
            imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setLayoutParams(imageViewLayoutParams);
        } else { // Otherwise re-use the converted view
            imageView = (ImageView) convertView;
        }

        Image image = new Image();
        Bitmap bmProgram = image.getBitmapFromMemCache(""+images[position],600,300);
        if(bmProgram==null){
            imageView.setImageBitmap(image.getBitmapResource(context,images[position],600,300));
        }else{
            imageView.setImageBitmap(bmProgram);
        }

        return imageView;

    }
}

