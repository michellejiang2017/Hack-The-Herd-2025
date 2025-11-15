package com.wheelymammoth.model;

import java.util.UUID;

public class User {

    // -------------------
    // Fields
    // -------------------
    private String userId;
    private String name;
    private String email;
    private String phone;
    private String profilePhotoUrl;
    private boolean isDriver;
    private double rating;        // average rating
    private int ratingCount;      // number of ratings

    // -------------------
    // Constructors
    // -------------------

    // Required no-arg constructor (important for Firebase / serialization)
    public User() {}

    // Standard constructor for new users
    public User(String name, String email, String phone) {
        this.userId = UUID.randomUUID().toString();
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.profilePhotoUrl = null;
        this.isDriver = false;
        this.rating = 0.0;
        this.ratingCount = 0;
    }

    // Full constructor for loading from a database
    public User(String userId, String name, String email, String phone,
                String profilePhotoUrl, boolean isDriver,
                double rating, int ratingCount) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.profilePhotoUrl = profilePhotoUrl;
        this.isDriver = isDriver;
        this.rating = rating;
        this.ratingCount = ratingCount;
    }

    // -------------------
    // Getters & Setters
    // -------------------

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) { 
        this.userId = userId; 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        ret

