package com.muvara.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import retrofit2.http.Url;

@Getter
@Setter
@ToString
public class DownloadLink {

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("size")
    @Expose
    private Integer size;

    @SerializedName("sh1")
    @Expose
    private String sh1;

    @SerializedName("url")
    @Expose
    private Url url;

}
