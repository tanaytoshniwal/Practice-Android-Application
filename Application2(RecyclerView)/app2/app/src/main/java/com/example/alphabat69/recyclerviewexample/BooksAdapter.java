package com.example.alphabat69.recyclerviewexample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by AlphaBAT69 on 24-11-2017.
 */

public class BooksAdapter extends RecyclerView.Adapter<BooksAdapter.ViewHolder>{
    private List<Books> booksList;
    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView bname,aname,status;
        public  ViewHolder(View view){
            super(view);
            bname=view.findViewById(R.id.bname);
            aname=view.findViewById(R.id.aname);
            status=view.findViewById(R.id.status);
        }
    }
    public BooksAdapter(List<Books> booksList){
        this.booksList=booksList;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.books_layout,parent,false);
        return new ViewHolder(itemView);
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Books book=booksList.get(position);
        holder.bname.setText(book.getBookName());
        holder.aname.setText(book.getAuthName());
        holder.status.setText(book.getStatus());
        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(v.getContext(),""+position,Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    public int getItemCount() {
        return booksList.size();
    }
}
