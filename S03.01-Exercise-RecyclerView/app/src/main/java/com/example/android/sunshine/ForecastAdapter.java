package com.example.android.sunshine;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder> {
    // Done (15) Add a class file called ForecastAdapter
    // Done (22) Extend RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder>

    // Done (23) Create a private string array called mWeatherData
    private String[] mWeatherData;

    // Done (47) Create the default constructor (we will pass in parameters in a later lesson)
    public ForecastAdapter() {

    }

    // Done (16) Create a class within ForecastAdapter called ForecastAdapterViewHolder
    // Done (17) Extend RecyclerView.ViewHolder
    public class ForecastAdapterViewHolder extends RecyclerView.ViewHolder {

        // Done (18) Create a public final TextView variable called mWeatherTextView
        public final TextView mWeatherTextView;

        // Done (19) Create a constructor for this class that accepts a View as a parameter
        // Done (20) Call super(view) within the constructor for ForecastAdapterViewHolder
        // Done (21) Using view.findViewById, get a reference to this layout's TextView and save it to mWeatherTextView
        public ForecastAdapterViewHolder(View v) {
            super(v);
            mWeatherTextView = (TextView) v.findViewById(R.id.tv_weather_data);
        }
    }


    // Done (24) Override onCreateViewHolder
    // Done (25) Within onCreateViewHolder, inflate the list item xml into a view
    // Done (26) Within onCreateViewHolder, return a new ForecastAdapterViewHolder with the above view passed in as a parameter

    @Override
    public ForecastAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutId = R.layout.forecast_list_item;
        LayoutInflater inflater = LayoutInflater.from(context);


        View view = inflater.inflate(layoutId, parent, false);
        return new ForecastAdapterViewHolder(view);
    }


    // Done (27) Override onBindViewHolder
    // Done (28) Set the text of the TextView to the weather for this list item's position

    @Override
    public void onBindViewHolder(ForecastAdapterViewHolder holder, int position) {
        holder.mWeatherTextView.setText(mWeatherData[position]);
    }


    // Done (29) Override getItemCount
    // Done (30) Return 0 if mWeatherData is null, or the size of mWeatherData if it is not null

    @Override
    public int getItemCount() {
        if (null == mWeatherData) return 0;
        return mWeatherData.length;
    }


    // Done (31) Create a setWeatherData method that saves the weatherData to mWeatherData
    // Done (32) After you save mWeatherData, call notifyDataSetChanged
    public void setWeatherData(String[] Data) {
        mWeatherData = Data;
        notifyDataSetChanged();
    }

}
