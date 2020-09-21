package com.example.myhw1.ui.info;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.myhw1.R;
import com.example.myhw1.data.models.Book;

public class InfoActivity extends AppCompatActivity {

    private TextView textTitle;
    private TextView textDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        textTitle = findViewById(R.id.text_title_info);
        textDescription = findViewById(R.id.text_desc_info);

        if (getIntent() != null){
            Book book = (Book) getIntent().getSerializableExtra("Aza");

            textTitle.setText(book.getName());
            textDescription.setText(book.getDesc());
        }
    }
}