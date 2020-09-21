package com.example.myhw1.ui.main;

import com.example.myhw1.data.TestRepo;
import com.example.myhw1.data.models.Book;
import com.example.myhw1.ui.main.MainContract;

import java.util.List;

public class MainModel implements MainContract.Model {

    @Override
    public List<Book> getBookList() {
        return TestRepo.getBookList();
    }
}