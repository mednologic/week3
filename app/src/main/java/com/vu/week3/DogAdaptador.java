package com.vu.week3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DogAdaptador extends RecyclerView.Adapter<DogAdaptador.DogViewHolder> {

    ArrayList<DocClass> dogsArray;

    public DogAdaptador(ArrayList<DocClass> dogsArray){
        this.dogsArray = dogsArray;
    }

    @NonNull
    @Override
    public DogViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.dog_card, parent, false);
        return new DogViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull DogViewHolder dogViewHolder, int position) {
        DocClass docClass = dogsArray.get(position);
        dogViewHolder.image.setImageResource(docClass.getImage());
        dogViewHolder.likes.setText(String.valueOf(docClass.getLikes()));
        dogViewHolder.name.setText(docClass.getName());
        dogViewHolder.likes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //dogsArray.get(position).setLikes(dogsArray.get(position).getLikes()+1);
                docClass.setLikes(docClass.getLikes()+1);
                System.out.println("--------------"+ docClass.getLikes());
                dogViewHolder.likes.setText(docClass.getLikes());
            }
        });
        /*dogViewHolder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //dogsArray.get(position).setLikes(dogsArray.get(position).getLikes()+1);;
            }
        });*/
    }

    @Override
    public int getItemCount() {
        return dogsArray.size();
    }

    public static class DogViewHolder extends RecyclerView.ViewHolder{

        private ImageView image;
        private TextView likes;
        private TextView name;

        public DogViewHolder(@NonNull View itemView) {
            super(itemView);
            image   = itemView.findViewById(R.id.imgcard);
            likes   = (TextView) itemView.findViewById(R.id.likecard);
            name    = itemView.findViewById(R.id.textcard);
        }
    }
}
