package adabters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.spedapp.PaintActivity;
import com.example.spedapp.R;

import java.util.ArrayList;
import java.util.List;

import Interface.ImageOnClick;
import ViewHolder.ImageViewHolder;
import common.Common;

public class ImageAdabter extends RecyclerView.Adapter<ImageViewHolder> {

    private Context mContext;
    private List<Integer> listImages;

    public ImageAdabter(Context mContext) {
        this.mContext = mContext;
        this.listImages = getImages();
    }

    private List<Integer> getImages() {
        List<Integer> results = new ArrayList<>();

        results.add(R.drawable.coloring1);
        results.add(R.drawable.coloring2);
        results.add(R.drawable.coloring3);
        results.add(R.drawable.coloring4);
        results.add(R.drawable.coloring5);
        results.add(R.drawable.coloring6);
        results.add(R.drawable.coloring7);
        results.add(R.drawable.coloring8);


        return results;
    }

    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_images,parent,false);
        return new ImageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder holder, int position) {
        holder.imageView.setImageResource(listImages.get(position));

        holder.setImageOnClick(new ImageOnClick() {
            @Override
            public void onClick(int pos) {
                Common.PICTURE_SELECTED = listImages.get(pos);
                mContext.startActivity(new Intent(mContext, PaintActivity.class));
            }
        });

    }

    @Override
    public int getItemCount() {
        return listImages.size();
    }
}
