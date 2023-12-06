// MainActivity.java
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewTracks;
    private TrackAdapter trackAdapter;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set up the toolbar
        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Initialize RecyclerView
        recyclerViewTracks = findViewById(R.id.recyclerViewTracks);
        recyclerViewTracks.setLayoutManager(new LinearLayoutManager(this));

        // Initialize the progress bar
        progressBar = findViewById(R.id.progressBar);

        // Initialize and set up the adapter
        trackAdapter = new TrackAdapter();
        recyclerViewTracks.setAdapter(trackAdapter);

        // Dummy data (replace with actual data from the Spotify API)
        List<Track> dummyTracks = generateDummyTracks();
        trackAdapter.setTracks(dummyTracks);
    }

    private List<Track> generateDummyTracks() {
        // Generate and return dummy track data
        // You can replace this with actual data fetched from the Spotify API
        List<Track> tracks = new ArrayList<>();
        tracks.add(new Track("Track 1", "Artist 1"));
        tracks.add(new Track("Track 2", "Artist 2"));
        // Add more tracks as needed
        return tracks;
    }
}
