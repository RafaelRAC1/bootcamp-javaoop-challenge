package edu.rafael.challenge.domain;

public class Course extends Content {
    private int timeDuration;

    @Override
    public double calculateXp() {
        return STANDARD_XP * timeDuration;
    }

    public int getTimeDuration() {
        return this.timeDuration;
    }

    public void setTimeDuration(int timeDuration) {
        this.timeDuration = timeDuration;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", timeDuration=" + timeDuration +
                '}';
    }

    
}