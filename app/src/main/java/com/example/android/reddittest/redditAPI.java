package com.example.android.reddittest;

import com.example.android.reddittest.model.Feed;

import retrofit2.Call;
import retrofit2.http.GET;

public interface redditAPI {

    String BASE_URL = "https://www.reddit.com/";


    @GET("top/.rss")
    Call<Feed> getFeed();

}
