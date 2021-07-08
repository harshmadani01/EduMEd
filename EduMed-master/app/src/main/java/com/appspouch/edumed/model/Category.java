package com.appspouch.edumed.model;

public class Category {

    private String diseaseName;
    private String diseaseFacts;
    private String diseaseCauses;
    private  String diseaseSymptoms;
    private String diseaseTreatment;


    public Category() {
    }

    public Category(String diseaseName, String diseaseFacts, String diseaseCauses, String diseaseSymptoms, String diseaseTreatment) {
        this.diseaseName = diseaseName;
        this.diseaseFacts = diseaseFacts;
        this.diseaseCauses = diseaseCauses;
        this.diseaseSymptoms = diseaseSymptoms;
        this.diseaseTreatment = diseaseTreatment;
    }

    public String getdiseaseName() {
        return diseaseName;
    }

    public void setdiseaseName(String diseaseName) {

        this.diseaseName = diseaseName;
    }

    public String getdiseaseFacts() {

        return diseaseFacts;
    }

    public void setdiseaseFacts(String diseaseFacts) {

        this.diseaseFacts = diseaseFacts;
    }

    public String getDiseaseCauses() {

        return diseaseCauses;
    }

    public void setDiseaseCauses(String diseaseCauses) {

        this.diseaseCauses = diseaseCauses;
    }

    public String getDiseaseSymptoms() {
        return diseaseSymptoms;
    }

    public void setDiseaseSymptoms(String diseaseSymptoms) {
        this.diseaseSymptoms = diseaseSymptoms;
    }

    public String getDiseaseTreatment() {
        return diseaseTreatment;
    }

    public void setDiseaseTreatment(String diseaseTreatment) {
        this.diseaseTreatment = diseaseTreatment;
    }
}
