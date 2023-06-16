package com.example.googlelensappllication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SearchRVAdapter extends RecyclerView.Adapter<SearchRVAdapter.Viewholder> {

    private Context context;
    private ArrayList<SearchRVModel> searchRVModels;

    public SearchRVAdapter(Context context, ArrayList<SearchRVModel> searchRVModels) {
        this.context = context;
        this.searchRVModels = searchRVModels;
    }

    @NonNull
    @Override
    public SearchRVAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.search_results_rv_item,parent,false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SearchRVAdapter.Viewholder holder, int position) {
        SearchRVModel searchRVModel=searchRVModels.get(position);
        holder.titleTV.setText(searchRVModel.getTitle());
        holder.descTV.setText(searchRVModel.getDisplayed_link());
        holder.snipperTV.setText(searchRVModel.getSnippet());
    }

    @Override
    public int getItemCount() {
        return searchRVModels.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder{
        private TextView titleTV,snipperTV,descTV;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            titleTV=itemView.findViewById(R.id.TVTitle);
            snipperTV=itemView.findViewById(R.id.TVSnippet);
            descTV=itemView.findViewById(R.id.TVDescription);
        }
    }
}
