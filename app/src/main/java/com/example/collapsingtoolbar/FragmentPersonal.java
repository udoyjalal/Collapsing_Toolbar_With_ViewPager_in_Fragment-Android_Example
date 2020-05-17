package com.example.collapsingtoolbar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentPersonal extends Fragment {

    View view;
    ImageView ivPatientPic;
    TextView tvName, tvNameId, tvContact, tvContactId, tvEmail, tvEmailId, tvGender, tvGenderId,
             tvBirth, tvBirthId, tvBlood, tvBloodId, tvMerid, tvMeridId, tvHeight, tvHeightId,
             tvWeight, tvWeightId, tvEmergencyContact, tvEmergencyContactNameId,
             tvEmergencyContactNumberId, tvLocation, tvLocationId;

    public FragmentPersonal() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.personal, container, false);

        ivPatientPic = (ImageView)view.findViewById(R.id.patientPic);
        tvName = (TextView)view.findViewById(R.id.name);
        tvNameId = (TextView)view.findViewById(R.id.nameId);
        tvContact = (TextView)view.findViewById(R.id.contact);
        tvContactId = (TextView)view.findViewById(R.id.contactId);
        tvEmail = (TextView)view.findViewById(R.id.email);
        tvEmailId = (TextView)view.findViewById(R.id.emailId);
        tvGender = (TextView)view.findViewById(R.id.gender);
        tvGenderId = (TextView)view.findViewById(R.id.genderId);
        tvBirth = (TextView)view.findViewById(R.id.birth);
        tvBirthId = (TextView)view.findViewById(R.id.birthId);
        tvBlood = (TextView)view.findViewById(R.id.blood);
        tvBloodId = (TextView)view.findViewById(R.id.bloodId);
        tvMerid = (TextView)view.findViewById(R.id.meridId);
        tvMeridId = (TextView)view.findViewById(R.id.meridId);
        tvHeight = (TextView)view.findViewById(R.id.height);
        tvHeightId = (TextView)view.findViewById(R.id.heightId);
        tvWeight = (TextView)view.findViewById(R.id.weight);
        tvWeightId = (TextView)view.findViewById(R.id.weightId);
        tvEmergencyContact = (TextView)view.findViewById(R.id.emergencyContact);
        tvEmergencyContactNameId = (TextView)view.findViewById(R.id.emergencyContactNameId);
        tvEmergencyContactNumberId = (TextView)view.findViewById(R.id.emergencyContactNumberId);
        tvLocation = (TextView)view.findViewById(R.id.location);
        tvLocationId = (TextView)view.findViewById(R.id.locationId);


        return view;
    }
}
