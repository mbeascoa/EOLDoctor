package com.beastek.eoldoctor.adapter;

import android.database.Cursor;

import com.beastek.eoldoctor.model.Task;

import java.util.ArrayList;

public interface UpdateAdapter {
    public void updateTaskArrayAdapter(ArrayList<Task> tasks);
    public void updateTaskArrayAdapter(Cursor cursor);
    public void update();
}
