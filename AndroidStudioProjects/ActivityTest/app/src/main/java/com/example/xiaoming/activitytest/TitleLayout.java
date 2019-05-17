package com.example.xiaoming.activitytest;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import java.util.jar.Attributes;

public class TitleLayout extends LinearLayout {
    public TitleLayout(Context context, AttributeSet attr){
        super(context,attr);
        LayoutInflater.from(context).inflate(R.layout.title,this);
    }
}
