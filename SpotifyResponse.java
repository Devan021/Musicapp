// SpotifyResponse.java
import com.google.gson.annotations.SerializedName;

public class SpotifyResponse {
    @SerializedName("albums")
    private SpotifyAlbums albums;

    public SpotifyAlbums getAlbums() {
        return albums;
    }
}

// SpotifyAlbums.java
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SpotifyAlbums {
    @SerializedName("items")
    private List<SpotifyAlbum> items;

    public List<SpotifyAlbum> getItems() {
        return items;
    }
}

// SpotifyAlbum.java
import com.google.gson.annotations.SerializedName;

public class SpotifyAlbum {
    @SerializedName("name")
    private String name;

    @SerializedName("artists")
    private List<SpotifyArtist> artists;

    // Add other fields as needed

    public String getName() {
        return name;
    }

    public List<SpotifyArtist> getArtists() {
        return artists;
    }
}

// SpotifyArtist.java
import com.google.gson.annotations.SerializedName;

public class SpotifyArtist {
    @SerializedName("name")
    private String name;

    public String getName() {
        return name;
    }
}

