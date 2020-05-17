package com.example.collapsingtoolbar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentMedical extends Fragment {

    View view;
    TextView tvAllargies, tvAllergiesId, tvCurrentMedications, tvtvCurrentMedicationsId,
             tvPastMedications, tvPastMedicationsId, tvChronicDiseases, tvChronicDiseasesId,
             tvInjuries, tvInjuriesid, tvSurgeries, tvSurgeriesId;

    public FragmentMedical() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.medical, container, false);

        tvAllargies = (TextView)view.findViewById(R.id.allergies);
        tvAllergiesId = (TextView)view.findViewById(R.id.allergierId);
        tvCurrentMedications = (TextView)view.findViewById(R.id.currentMedications);
        tvtvCurrentMedicationsId = (TextView)view.findViewById(R.id.currentMedicationsId);
        tvPastMedications = (TextView)view.findViewById(R.id.pastMedications);
        tvPastMedicationsId = (TextView)view.findViewById(R.id.pastMedicationsId);
        tvChronicDiseases = (TextView)view.findViewById(R.id.chronicDiseases);
        tvChronicDiseasesId = (TextView)view.findViewById(R.id.chronicDiseasesId);
        tvInjuries = (TextView)view.findViewById(R.id.injuries);
        tvInjuriesid = (TextView)view.findViewById(R.id.injuriesId);
        tvSurgeries = (TextView)view.findViewById(R.id.surgeries);
        tvSurgeriesId = (TextView)view.findViewById(R.id.surgeriesId);

        return view;
    }
}
