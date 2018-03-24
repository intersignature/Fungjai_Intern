package intern.fungjai.sirichai.fungjai_intern.model.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import intern.fungjai.sirichai.fungjai_intern.R;

public class FungjaiInternRecyclerViewHolder extends RecyclerView.ViewHolder {

    protected ImageView coverImg;
    protected TextView titleTv;
    protected TextView descriptionTv;

    protected ImageView coverTrackImg;
    protected TextView songTrackTv;
    protected TextView artistTrackTv;

    protected FungjaiInternRecyclerViewHolder(View itemView) {
        super(itemView);
        coverImg = itemView.findViewById(R.id.coverZineImg);
        titleTv = itemView.findViewById(R.id.titleTv);
        descriptionTv = itemView.findViewById(R.id.descriptionZineTv);

        coverTrackImg = itemView.findViewById(R.id.coverTrackImg);
        songTrackTv = itemView.findViewById(R.id.songTrackTv);
        artistTrackTv = itemView.findViewById(R.id.artistTrackTv);
    }
}
