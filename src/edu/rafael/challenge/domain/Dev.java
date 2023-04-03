package edu.rafael.challenge.domain;

import java.util.LinkedHashSet;
import java.util.*;

public class Dev {
    private String name;
    private Set<Content> enrolledContent = new LinkedHashSet<>();
    private Set<Content> completedContents = new LinkedHashSet<>();

    public void registerBootcamp(Bootcamp bootcamp){
        this.enrolledContent.addAll(bootcamp.getContents());
        bootcamp.getRegisteredDevs().add(this);
    }

    public void progress(){
        Optional<Content> content = this.enrolledContent.stream().findFirst();
        if(content.isPresent())
        {
            this.completedContents.add(content.get());
            this.enrolledContent.remove(content.get());
        } else {
            System.err.println("You are not registered in any Bootcamp");
        }
    };

    public double calculateTotalXp(){
        return this.completedContents.stream()
        .mapToDouble(Content::calculateXp)
        .sum();
    };


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getEnrolledContent() {
        return this.enrolledContent;
    }

    public void setEnrolledContent(Set<Content> enrolledContent) {
        this.enrolledContent = enrolledContent;
    }

    public Set<Content> getCompletedContents() {
        return this.completedContents;
    }

    public void setCompletedContents(Set<Content> completedContents) {
        this.completedContents = completedContents;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Dev)) {
            return false;
        }
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(enrolledContent, dev.enrolledContent) && Objects.equals(completedContents, dev.completedContents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, enrolledContent, completedContents);
    }
}