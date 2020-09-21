package com.example.myhw1.ui.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.myhw1.R;
import com.example.myhw1.data.models.Book;
import com.example.myhw1.interfaces.OnItemClickListener;
import com.example.myhw1.ui.adapters.BookAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    private static final String TAG = "ololo";
    private MainContract.Presenter mPresenter;
    private BookAdapter adapter;
    private RecyclerView recyclerView;
    private ArrayList<Book> bookArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        adapter = new BookAdapter(bookArrayList);
        recyclerView.setAdapter(adapter);

        mPresenter = new MainPresenter(this);

        Log.e(TAG, "onCreate: Give me data nigger");
        mPresenter.loadBook();

        adapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void OnItemClick(int position) {
               mPresenter.bookOnClick(adapter.getAll(), MainActivity.this, position);
            }
        });
    }

    @Override
    public void showBook(List<Book> bookList) {
        Log.e(TAG, "showBook: Received the data and installed nigger" + bookList.toString());
        adapter.addAll(bookList);
    }

    @Override
    public void openActivity(Intent intent) {
        startActivity(intent);
    }
}