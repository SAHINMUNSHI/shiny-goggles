package com.example.myrecyclerviewapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {
    ArrayList<User> user;
    Context context;

    public UserAdapter(ArrayList<User> user, Context context) {
        this.user = user;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.single_row_user, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.nameText.setText(user.get(position).getName());
        holder.emailText.setText(user.get(position).getEmail());
    }

    @Override
    public int getItemCount() {
        return user.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView nameText;
        TextView emailText;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nameText = itemView.findViewById(R.id.name_text);
            emailText = itemView.findViewById(R.id.email_text);
        }
    }
}
