package com.quintero.raul.aniversariomv.Util;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

/**
 * Esta clase Font cambia el estilo de fuente
 * @author Triolabs
 * @Developer Raul Quintero Esparza
 * @Designer Ivan Padilla
 * @version 1.0
 */
public class Font {

    /** Se crea una instancia de Font
     */
    public Font(){
    }

    /** Metodo changeFontIntro cambia la funete aun estlio de COFFEE
     * @param context contexto de la actividad
     * @param textView textView que se cambiara la fuente
     */
    public void changeReally(Context context,TextView textView){
        Typeface type = Typeface.createFromAsset(context.getAssets(),"really.ttf");
        textView.setTypeface(type);
    }

    /** Metodo changeFontIntro cambia la funete aun estlio de Hame
     * @param context contexto de la actividad
     * @param textView textView que se cambiara la fuente
     */
    public void changeHame(Context context,TextView textView){
        Typeface type = Typeface.createFromAsset(context.getAssets(),"hame.ttf");
        textView.setTypeface(type);
    }

    /** Metodo changeFontIntro cambia la funete aun estlio de Hand
     * @param context contexto de la actividad
     * @param textView textView que se cambiara la fuente
     */
    public void changeHand(Context context,TextView textView){
        Typeface type = Typeface.createFromAsset(context.getAssets(),"hand.ttf");
        textView.setTypeface(type);
    }



}

