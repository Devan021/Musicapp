// TrackAdapter.java
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class TrackAdapter extends RecyclerView.Adapter<TrackAdapter.TrackViewHolder> {

    private List<Track> tracks;

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public TrackViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_spotify_track, parent, false);
        return new TrackViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TrackViewHolder holder, int position) {
        Track track = tracks.get(position);
        holder.textViewTrackTitle.setText(track.getTitle());
        holder.textViewArtist.setText(track.getArtist());
        // Set other track information as needed

        // Placeholder image, replace with actual image loading logic
        holder.imageViewTrack.setImageResource(R.drawable.ic_music_note);
    }

    @Override
    public int getItemCount() {
        return tracks != null ? tracks.size() : 0;
    }

    static class TrackViewHolder extends RecyclerView.ViewHolder {
        TextView textViewTrackTitle;
        TextView textViewArtist;
        ImageView imageViewTrack;

        TrackViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewTrackTitle = itemView.findViewById(R.id.textViewTrackTitle);
            textViewArtist = itemView.findViewById(R.id.textViewArtist);
            imageViewTrack = itemView.findViewById(R.id.imageViewTrack);
        }
    }
}
