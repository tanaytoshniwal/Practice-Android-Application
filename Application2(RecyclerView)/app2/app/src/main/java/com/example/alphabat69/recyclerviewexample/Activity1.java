package com.example.alphabat69.recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Activity1 extends AppCompatActivity implements RecyclerView.OnItemTouchListener{
    private RecyclerView recyclerView;
    private List<Books> booksList=new ArrayList<>();
    private BooksAdapter booksAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_1);
        recyclerView=findViewById(R.id.recyclerView);
        booksAdapter=new BooksAdapter(booksList);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,LinearLayoutManager.VERTICAL));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(booksAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addOnItemTouchListener(this);
        setData();
    }
    private void setData(){
        Books book=new Books("Book 1","author 1","available");
        booksList.add(book);
        book=new Books("Book 1","author 1","available");
        booksList.add(book);
        book=new Books("Book 2","author 2","not available");
        booksList.add(book);
        book=new Books("Book 3","author 3","available");
        booksList.add(book);
        book=new Books("Book 4","author 4","available");
        booksList.add(book);
        book=new Books("Book 5","author 5","not available");
        booksList.add(book);
        book=new Books("Book 6","author 6","available");
        booksList.add(book);
        book=new Books("Book 7","author 7","available");
        booksList.add(book);
        book=new Books("Book 8","author 8","available");
        booksList.add(book);
        book=new Books("Book 9","author 9","not available");
        booksList.add(book);
        book=new Books("Book 10","author 10","available");
        booksList.add(book);
        book=new Books("Book 11","author 11","available");
        booksList.add(book);
        book=new Books("Book 12","author 12","not available");
        booksList.add(book);
        book=new Books("Book 13","author 13","available");
        booksList.add(book);
        book=new Books("Book 14","author 14","not available");
        booksList.add(book);
        book=new Books("Book 15","author 15","available");
        booksList.add(book);
        book=new Books("Book 16","author 16","available");
        booksList.add(book);
        book=new Books("Book 17","author 17","not available");
        booksList.add(book);
        book=new Books("Book 18","author 18","available");
        booksList.add(book);
        book=new Books("Book 19","author 19","available");
        booksList.add(book);
        book=new Books("Book 20","author 20","not available");
        booksList.add(book);
    }

    @Override
    public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
        return false;
    }

    @Override
    public void onTouchEvent(RecyclerView rv, MotionEvent e) {
        View child=rv.findChildViewUnder(e.getX(),e.getY());
        if(child!=null)
            Toast.makeText(this,rv.getChildAdapterPosition(child),Toast.LENGTH_LONG);
    }

    @Override
    public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

    }
}
