package com.achraf.sport.cote.swipecarddeck;

import android.graphics.Bitmap;

/**
 * Created by Achraf on 01/07/2016.
 */
public class SwipeCard {
    String txt;
    Bitmap image;

    public SwipeCard(Bitmap image, String txt) {
        this.image = image;
        this.txt = txt;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public Bitmap getImage() {

        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }
}
