package com.example.collapsingtoolbar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragmentlifestyle extends Fragment {

    View view;

    TextView tvsmokingHabit, tvsmokingHabitId, tvalcoholConsumption, tvalcoholConsumptionId,
             tvactivityLevel, tvactivityLevelId, tvfoodPreference, tvfoodPreferenceId,
             tvoccupation, tvoccupationId;

    public Fragmentlifestyle() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.lifestyle, container, false);

        tvsmokingHabit = (TextView)view.findViewById(R.id.smokingHabit);
        tvsmokingHabitId = (TextView)view.findViewById(R.id.smokingHabitId);
        tvalcoholConsumption = (TextView)view.findViewById(R.id.alcoholConsumption);
        tvalcoholConsumptionId = (TextView)view.findViewById(R.id.alcoholConsumptionId);
        tvactivityLevel = (TextView)view.findViewById(R.id.activityLevel);
        tvactivityLevelId = (TextView)view.findViewById(R.id.activityLevelId);
        tvfoodPreference = (TextView)view.findViewById(R.id.foodPreference);
        tvfoodPreferenceId = (TextView)view.findViewById(R.id.foodPreferenceId);
        tvoccupation = (TextView)view.findViewById(R.id.occupation);
        tvoccupationId = (TextView)view.findViewById(R.id.occupationId);

        return view;
    }
}
