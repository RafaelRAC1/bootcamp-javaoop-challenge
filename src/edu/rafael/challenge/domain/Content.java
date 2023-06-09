package edu.rafael.challenge.domain;

public abstract class Content {
    protected static final double STANDARD_XP = 10d;

    private String title;
    private String description;

    public abstract double calculateXp();


    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

} 
