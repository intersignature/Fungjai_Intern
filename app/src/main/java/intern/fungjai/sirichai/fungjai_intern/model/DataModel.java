
package intern.fungjai.sirichai.fungjai_intern.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataModel {

    @SerializedName("artist")
    @Expose
    private String artist;
    @SerializedName("cover")
    @Expose
    private String cover;
    @SerializedName("song")
    @Expose
    private String song;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("url")
    @Expose
    private String url;

    public DataModel() {
    }

    public DataModel(String artist, String cover, String song, String type, String description, String title, String url) {
        super();
        this.artist = artist;
        this.cover = cover;
        this.song = song;
        this.type = type;
        this.description = description;
        this.title = title;
        this.url = url;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "artist:" + artist + " cover:" + cover + " song:" + song + " type:" + type
                + " description:" + description + " title:" + title + " url:" + url;
    }
}