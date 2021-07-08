package com.appspouch.edumed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    TextView text_facts;
    TextView text_cause;
    TextView text_symptoms;
    TextView text_treatment;

    private String factsdetails;
    private String causedetails;
    private  String symptomsdetails;
    private String treatmentdetails;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Intent factsintent = getIntent();
        Intent causeintent = getIntent();
        Intent symptomsintent = getIntent();
        Intent treatmentintent = getIntent();

        factsdetails = factsintent.getStringExtra("factsDetails");
        causedetails = causeintent.getStringExtra("causeDetails");
        symptomsdetails = symptomsintent.getStringExtra("symptomsDetails");
        treatmentdetails = treatmentintent.getStringExtra("treatmentDetails");

        text_facts = findViewById(R.id.facts_detail);
        text_facts.setText(factsdetails);

        text_cause = findViewById(R.id.cause_detail);
        text_cause.setText(causedetails);

        text_symptoms = findViewById(R.id.symptoms_detail);
        text_symptoms.setText(symptomsdetails);

        text_treatment = findViewById(R.id.treatment_detail);
        text_treatment.setText(treatmentdetails);

    }


}
