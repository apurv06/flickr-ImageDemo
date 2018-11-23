package com.apurv.demoapp;

import android.text.Editable;

import com.apurv.demoapp.pojos.Photo;
import com.apurv.demoapp.pojos.RecentsRoot;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RetroService {

    @GET("?method=flickr.photos.getRecent&api_key=6f102c62f41998d151e5a1b48713cf13&format=json&nojsoncallback=2&extras=url_s")
    Call<RecentsRoot> getRecents();

    @GET("?method=flickr.photos.search&api_key=6f102c62f41998d151e5a1b48713cf13&format=json&nojsoncallback=2&extras=url_s")
    Call<RecentsRoot> getSuggestions(@Query("text") String text);
}
