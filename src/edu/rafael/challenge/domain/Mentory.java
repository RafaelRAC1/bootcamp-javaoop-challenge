package edu.rafael.challenge.domain;

import java.time.LocalDate;

public class Mentory extends Content {
    
    private LocalDate date;

    public LocalDate getDate() {
        return this.date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public double calculateXp() {
        return STANDARD_XP + 20d;
    }

    @Override
    public String toString() {
        return "Mentory{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", date=" + date +
                '}';
    }


}
