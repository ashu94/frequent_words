package com.example.juggernaut.frequent_words;

import android.app.Activity;
import android.os.Bundle;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/**
 * Created by juggernaut on 2/3/16.
 */
public class Word extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RelativeLayout relativeLayout
        AbsListView.LayoutParams lp = new AbsListView.LayoutParams(AbsListView.LayoutParams.MATCH_PARENT, AbsListView.LayoutParams.WRAP_CONTENT);
        ll.addView(myButton, lp);
    }
}
