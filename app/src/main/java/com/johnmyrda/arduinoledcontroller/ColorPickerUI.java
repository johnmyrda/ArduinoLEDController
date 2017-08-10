package com.johnmyrda.arduinoledcontroller;

import android.app.Fragment;

import com.larswerkman.holocolorpicker.ColorPicker;
import com.larswerkman.holocolorpicker.SaturationBar;
/**
 * Created by John on 8/5/2017.
 */

public class ColorPickerUI extends Fragment{

    ColorPicker picker = (ColorPicker) getActivity().findViewById(R.id.picker);
    SaturationBar saturationBar = (SaturationBar) getActivity().findViewById(R.id.saturationbar);

    public ColorPickerUI(){
        picker.addSaturationBar(saturationBar);
    }

//    picker.addSaturationBar(saturationBar);
//
//    //To get the color
//    picker.getColor();
//
//    //To set the old selected color u can do it like this
//    picker.setOldCenterColor(picker.getColor());
//    // adds listener to the colorpicker which is implemented
//    //in the activity
//    picker.setOnColorChangedListener(this);
//
//    //to turn off showing the old color
//    picker.setShowOldCenterColor(false);

//    //adding onChangeListeners to bars
//    saturationBar.setOnSaturationChangeListener(new OnSaturationChangeListener …
}
