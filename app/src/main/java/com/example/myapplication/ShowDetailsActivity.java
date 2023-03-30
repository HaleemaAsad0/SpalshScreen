package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShowDetailsActivity extends AppCompatActivity {

    private TextView mRecordNameTextView;
    private TextView mRecordDescriptionTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_details);

        mRecordNameTextView = findViewById(R.id.record_name_text_view);
        mRecordDescriptionTextView = findViewById(R.id.record_description_text_view);

        // Get the record data from the intent
        Intent intent = getIntent();
        String recordName = intent.getStringExtra("recordName");
        String recordDescription = intent.getStringExtra("recordDescription");

        // Display the record data in the TextViews
        mRecordNameTextView.setText(recordName);
        mRecordDescriptionTextView.setText(recordDescription);
    }
}