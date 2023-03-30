package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddRecordActivity extends AppCompatActivity {

    private EditText mRecordNameEditText;
    private EditText mRecordDescriptionEditText;
    private Button mAddButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_record);

        mRecordNameEditText = findViewById(R.id.record_name_edit_text);
        mRecordDescriptionEditText = findViewById(R.id.record_description_edit_text);
        mAddButton = findViewById(R.id.add_button);

        mAddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String recordName = mRecordNameEditText.getText().toString();
                String recordDescription = mRecordDescriptionEditText.getText().toString();

                // Create an intent to start the ShowDetailsActivity
                Intent intent = new Intent(AddRecordActivity.this, ShowDetailsActivity.class);

                // Add the record data as extras to the intent
                intent.putExtra("recordName", recordName);
                intent.putExtra("recordDescription", recordDescription);

                // Start the ShowDetailsActivity
                startActivity(intent);

                // Finish the AddRecordActivity
                finish(); // Close the activity and return to the previous one
            }
        });

    }
}