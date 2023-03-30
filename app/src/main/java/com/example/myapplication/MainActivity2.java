package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    private Button mAddRecordButton;
    private LinearLayout mListLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mListLayout = findViewById(R.id.list_layout);
        mAddRecordButton = findViewById(R.id.add_record_button);
        mAddRecordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, AddRecordActivity.class);
                startActivity(intent);
            }
        });

        addRecord("Record 1");
        addRecord("Record 2");
        addRecord("Record 3");
        addRecord("Record 4");
        addRecord("Record 5");
    }

    private void addRecord(String record) {
        TextView textView = new TextView(this);
        textView.setText(record);
        mListLayout.addView(textView);
    }
}
