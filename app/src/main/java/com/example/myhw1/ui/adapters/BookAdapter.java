package com.example.myhw1.ui.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myhw1.R;
import com.example.myhw1.data.models.Book;
import com.example.myhw1.interfaces.OnItemClickListener;

import java.util.ArrayList;
import java.util.List;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.ViewHolder> {

    private ArrayList<Book> books = new ArrayList<>();
    private OnItemClickListener onItemClickListener;

    public BookAdapter(ArrayList<Book> books) {
        this.books = books;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_book_item, parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(books.get(position), position);
    }

    @Override
    public int getItemCount() {
        return books.size();
    }

    public void addAll(List<Book> bookList){
        books.addAll(bookList);
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public List<Book> getAll() {
        return books;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private CardView cardView;
        private TextView textTitle;
        private TextView textDesc;
        int position;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textTitle = itemView.findViewById(R.id.text_title_book);
            textDesc = itemView.findViewById(R.id.text_desc_book);
            cardView = itemView.findViewById(R.id.card_view);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onItemClickListener.OnItemClick(getAdapterPosition());
                }
            });
        }

        public void bind(Book book, int position) {
            this.position = position;
            textTitle.setText(book.getName());
            textDesc.setText(book.getDesc());
        }
    }
}
