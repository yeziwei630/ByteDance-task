package icu.sjtu.network.model;

import com.google.gson.annotations.SerializedName;

public class VideoModel {
    @SerializedName("student_id")
    String studentId;

    @SerializedName("user_name")
    String userName;

    @SerializedName("video_url")
    String videoUrl;

    @SerializedName("image_url")
    String imageUrl;

    // ...


    public String getStudentId() {
        return studentId;
    }

    public String getUserName() {
        return userName;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    @Override
    public String toString() {
        return "VideoModel{" +
                "studentId='" + studentId + '\'' +
                ", userName='" + userName + '\'' +
                ", videoUrl='" + videoUrl + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
