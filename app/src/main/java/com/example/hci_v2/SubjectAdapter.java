package com.example.hci_v2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

// adapter sluzi da poveze podatake i ui komponente
public class SubjectAdapter extends ArrayAdapter<Subject> {

    private Context context;
    private List<Subject> subjects;

    public SubjectAdapter(@NonNull Context context, @NonNull List<Subject> subjects) {
        super(context, 0, subjects);
        this.context = context;
        this.subjects = subjects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Subject subject = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.subject_row, parent, false);
        }
        // Lookup view for data population
        TextView tvId = (TextView) convertView.findViewById(R.id.subjectId);
        TextView tvName = (TextView) convertView.findViewById(R.id.subjectName);
        // Populate the data into the template view using the data object
        tvId.setText(Integer.toString(subject.getId()));
        tvName.setText(subject.getName());
        // Return the completed view to render on screen
        return convertView;
    }


}
