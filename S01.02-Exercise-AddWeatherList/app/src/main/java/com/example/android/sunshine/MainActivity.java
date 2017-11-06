/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // DONE (1) Create a field to store the weather display TextView
    private TextView wDisplayTview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        // DONE (2) Use findViewById to get a reference to the weather display TextView
        wDisplayTview = (TextView) findViewById(R.id.tv_weather_data);

        // DONE (3) Create an array of Strings that contain fake weather data
        String [] fakeWdata = {
                "Today, Nov 6 - Partly Cloudy - 16°C / 8°C",
                "Tomorrow - Sunny - 18°C / 9°C",
                "Wednesday - Mostly Sunny- 19°C / 11°C",
                "Thursday - Sunny - 19°C / 10°C",
                "Friday - Partly Cloudy - 17°C / 9°C",
                "Saturday - Partly Cloudy - 17°C / 10°C",
                "Sunday - Partly Cloudy - 18°C / 12°C",
                "Mon, Nov 13 - Partly Cloudy - 19°C / 12°C",
                "Tue, Nov 14 - Partly Cloudy - 18°C / 10°C",
                "Wed, Nov 15 - Scattered Showers - 17°C / 9°C",
                "Thu, Nov 16 - Partly Cloudy - 18°C / 10°C",
                "Fri, Nov 17 - Partly Cloudy - 17°C / 9°C",
                "Sat, Nov 18 - Partly Cloudy - 19°C / 12°C",
                "Sun, Nov 19 - Partly Cloudy - 18°C / 10°C",
        };


        // DONE (4) Append each String from the fake weather data array to the TextView
        for (String fakeWd : fakeWdata){
            wDisplayTview.append(fakeWd +"\n\n\n");
        }
    }
}