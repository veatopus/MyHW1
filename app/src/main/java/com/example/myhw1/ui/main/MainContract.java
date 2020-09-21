package com.example.myhw1.ui.main;

import android.content.Context;
import android.content.Intent;

import com.example.myhw1.data.models.Book;

import java.util.List;

public interface MainContract {

    interface View {
        void showBook(List<Book> bookList);
        void openActivity(Intent intent);
    }

    interface Presenter {
        void bookOnClick(List<Book> bookList, Context context, int position);
        void loadBook();
    }

    interface Model {
        List<Book> getBookList();
    }
}