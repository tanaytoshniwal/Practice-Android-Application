package com.example.alphabat69.recyclerviewexample;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

/**
 * Created by AlphaBAT69 on 24-11-2017.
 */

public class RecyclerTouchListener implements RecyclerView.OnItemTouchListener{
    @Override
    public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
        return false;
    }

    @Override
    public void onTouchEvent(RecyclerView rv, MotionEvent e) {

    }

    @Override
    public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

    }
}

