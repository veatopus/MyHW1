package com.example.myhw1.ui.main;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.example.myhw1.data.models.Book;
import com.example.myhw1.ui.info.InfoActivity;

import java.util.List;

public class MainPresenter implements MainContract.Presenter {

    private static final String TAG = "ololo";
    private MainContract.View mView;
    private MainContract.Model model;

    public MainPresenter(MainContract.View mView) {
        this.mView = mView;
        model = new MainModel();
    }

    @Override
    public void bookOnClick(List<Book> bookList, Context context, int position) {
        Intent intent = new Intent(context, InfoActivity.class);
        intent.putExtra("Aza", bookList.get(position));
        mView.openActivity(intent);
    }

    @Override
    public void loadBook() {
        Log.e(TAG, "loadBook: Loaded the data");
        mView.showBook(model.getBookList());
    }
}