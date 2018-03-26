package intern.fungjai.sirichai.fungjai_intern.model.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.List;

import intern.fungjai.sirichai.fungjai_intern.R;
import intern.fungjai.sirichai.fungjai_intern.model.pojo.MusicData;

public class FungjaiInternRecyclerViewAdapter extends RecyclerView.Adapter<FungjaiInternRecyclerViewHolder> {

    private List<MusicData> datas;
    private Context context;

    public FungjaiInternRecyclerViewAdapter(List<MusicData> datas, Context context) {
        this.datas = datas;
        this.context = context;
    }

    @Override
    public int getItemViewType(int position) {
        if (datas.get(position).getType().equals("zine")) {
            return 0;
        } else return 1;
    }

    @Override
    public FungjaiInternRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        if (viewType == 0) {
            v = LayoutInflater.from(parent.getContext()).inflate(R.layout.zine_item, parent, false);
        } else {
            v = LayoutInflater.from(parent.getContext()).inflate(R.layout.track_item, parent, false);
        }
        return new FungjaiInternRecyclerViewHolder(v);
    }

    @Override
    public void onBindViewHolder(FungjaiInternRecyclerViewHolder holder, int position) {
        MusicData musicData = datas.get(position);
        if (musicData.getType().equals("zine")) {
            Picasso.with(context).load(musicData.getCover()).placeholder(R.mipmap.ic_launcher)
                    .error(R.mipmap.ic_launcher)
                    .into(holder.coverImg);
            holder.titleTv.setText(musicData.getTitle());
            holder.descriptionTv.setText(musicData.getDescription());
        } else {
            Picasso.with(context).load(musicData.getCover()).placeholder(R.mipmap.ic_launcher)
                    .error(R.mipmap.ic_launcher)
                    .into(holder.coverTrackImg);
            holder.songTrackTv.setText(musicData.getSong());
            holder.artistTrackTv.setText(musicData.getArtist());
        }
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }
}
