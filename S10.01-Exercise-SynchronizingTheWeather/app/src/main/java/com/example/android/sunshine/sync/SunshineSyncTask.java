package com.example.android.sunshine.sync;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;

import com.example.android.sunshine.data.WeatherContract;
import com.example.android.sunshine.utilities.NetworkUtils;
import com.example.android.sunshine.utilities.OpenWeatherJsonUtils;

import java.net.URL;


//  Done (1) Create a class called SunshineSyncTask
public class SunshineSyncTask {
    //  Done (2) Within SunshineSyncTask, create a synchronized public static void method called syncWeather
    synchronized public static void syncWeather(Context context){
    //Done (3) Within syncWeather, fetch new weather data
        try {
            URL url = NetworkUtils.getUrl(context);
            String jsonWeatherRes = NetworkUtils.getResponseFromHttpUrl(url);
            ContentValues[] contentValues = OpenWeatherJsonUtils.getWeatherContentValuesFromJson(context, jsonWeatherRes);
            //Done (4) If we have valid results, delete the old data and insert the new
            if (contentValues != null && contentValues.length != 0) {
                ContentResolver contentResolver = context.getContentResolver();
                contentResolver.delete(WeatherContract.WeatherEntry.CONTENT_URI,null,null);
                contentResolver.bulkInsert(WeatherContract.WeatherEntry.CONTENT_URI, contentValues);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}