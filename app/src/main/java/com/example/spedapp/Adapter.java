package com.example.spedapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.myViewHolder> {

    private Context mContext;
    private List<item> mData;
    private OnNoteListener mOnNoteListener;

    public Adapter(Context mContext, List<item> mData, OnNoteListener onNoteListener) {
        this.mContext = mContext;
        this.mData = mData;
        this.mOnNoteListener = onNoteListener;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        LayoutInflater inflater = LayoutInflater.from(mContext);
        View v = inflater.inflate(R.layout.card_item, parent, false);
        return new myViewHolder(v, mOnNoteListener);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {

        holder.background_img.setImageResource(mData.get(position).getBackground());
        holder.tv_title.setText(mData.get(position).getProfileName());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


        ImageView background_img;
        TextView tv_title;
        OnNoteListener onNoteListener;

        public myViewHolder(@NonNull View itemView, OnNoteListener onNoteListener) {
            super(itemView);
            background_img = (ImageView) itemView.findViewById(R.id.card_background);
            tv_title = (TextView) itemView.findViewById(R.id.card_title);
            this.onNoteListener = onNoteListener;

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            onNoteListener.OnNoteClick(getAdapterPosition());

        }
    }
    public interface OnNoteListener{
        void OnNoteClick(int position);
    }

}
