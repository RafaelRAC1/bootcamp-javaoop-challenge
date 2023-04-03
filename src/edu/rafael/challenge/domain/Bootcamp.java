package edu.rafael.challenge.domain;

import java.time.LocalDate;
import java.util.*;

public class Bootcamp {
    private String name;
    private String description;
    final private LocalDate startDate = LocalDate.now();
    final private LocalDate endDate = startDate.plusDays(45);

    private Set<Dev> registeredDevs = new HashSet<>();
    private Set<Content> contents = new LinkedHashSet<>();
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public LocalDate getStartDate() {
        return startDate;
    }
    public LocalDate getEndDate() {
        return endDate;
    }
    public Set<Dev> getRegisteredDevs() {
        return registeredDevs;
    }
    public void setRegisteredDevs(Set<Dev> registeredDevs) {
        this.registeredDevs = registeredDevs;
    }
    public Set<Content> getContents() {
        return contents;
    }
    public void setContents(Set<Content> contents) {
        this.contents = contents;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Bootcamp)) {
            return false;
        }
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(name, bootcamp.name) && Objects.equals(description, bootcamp.description) && Objects.equals(startDate, bootcamp.startDate) && Objects.equals(endDate, bootcamp.endDate) && Objects.equals(registeredDevs, bootcamp.registeredDevs) && Objects.equals(contents, bootcamp.contents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, startDate, endDate, registeredDevs, contents);
    }
    
}
