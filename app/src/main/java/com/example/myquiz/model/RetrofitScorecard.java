package com.example.myquiz.model;

import com.google.gson.annotations.SerializedName;

public class RetrofitScorecard {
    @SerializedName("email")
    private String email;

    @SerializedName("categories")
    private String categories;

    @SerializedName("sets")
    private int sets;

    @SerializedName("score")
    private int score;



    public RetrofitScorecard() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    public RetrofitScorecard(String email, String categories, int sets, int score) {
        this.email = email;
        this.categories = categories;
        this.sets = sets;
        this.score = score;

    }


}
