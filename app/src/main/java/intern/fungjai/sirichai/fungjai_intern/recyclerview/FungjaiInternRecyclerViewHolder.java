package intern.fungjai.sirichai.fungjai_intern.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import intern.fungjai.sirichai.fungjai_intern.R;

class FungjaiInternRecyclerViewHolder extends RecyclerView.ViewHolder {

    protected ImageView coverZineImg;
    protected TextView titleZineTv;
    protected TextView descriptionZineTv;

    protected ImageView coverTrackImg;
    protected TextView songTrackTv;
    protected TextView artistTrackTv;

    protected FungjaiInternRecyclerViewHolder(View itemView) {
        super(itemView);
        coverZineImg = itemView.findViewById(R.id.coverZineImg);
        titleZineTv = itemView.findViewById(R.id.titleZineTv);
        descriptionZineTv = itemView.findViewById(R.id.descriptionZineTv);

        coverTrackImg = itemView.findViewById(R.id.coverTrackImg);
        songTrackTv = itemView.findViewById(R.id.songTrackTv);
        artistTrackTv = itemView.findViewById(R.id.artistTrackTv);
    }
}
