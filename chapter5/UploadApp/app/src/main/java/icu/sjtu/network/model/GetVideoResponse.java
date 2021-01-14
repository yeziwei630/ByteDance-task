package icu.sjtu.network.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetVideoResponse {
    @SerializedName("feeds")
    List<VideoModel> feeds;

    @SerializedName("success")
    boolean success;

    public List<VideoModel> getFeeds() {
        return feeds;
    }

    public boolean isSuccess() {
        return success;
    }

    @Override
    public String toString() {
        return "GetVideoResponse{" +
                "feeds=" + feeds +
                ", success=" + success +
                '}';
    }
}
