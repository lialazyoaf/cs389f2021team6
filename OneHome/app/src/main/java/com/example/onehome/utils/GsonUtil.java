package com.example.onehome.utils;
import com.google.gson.Gson;
public class GsonUtil {
    public static Gson mGson = new Gson();

    public static Gson getGson(){
        return mGson;
    }

}
