package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

    private String title;
    private String description;
    private final LocalDate startDate = LocalDate.now();
    private final LocalDate finalDate = startDate.plusDays(45);

    private Set<Developer> subscribedDevelopers = new HashSet<>();
    private Set<Content> bootcampContents = new LinkedHashSet<>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public LocalDate getFinalDate() {
        return finalDate;
    }

    public Set<Developer> getSubscribedDevelopers() {
        return subscribedDevelopers;
    }

    public void setSubscribedDevelopers(Set<Developer> subscribedDevelopers) {
        this.subscribedDevelopers = subscribedDevelopers;
    }

    public Set<Content> getBootcampContents() {
        return bootcampContents;
    }

    public void setBootcampContents(Set<Content> bootcampContents) {
        this.bootcampContents = bootcampContents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(title, bootcamp.title)
                && Objects.equals(description, bootcamp.description)
                && Objects.equals(startDate, bootcamp.startDate)
                && Objects.equals(finalDate, bootcamp.finalDate)
                && Objects.equals(subscribedDevelopers, bootcamp.subscribedDevelopers)
                && Objects.equals(bootcampContents, bootcamp.bootcampContents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, startDate, finalDate, subscribedDevelopers, bootcampContents);
    }
}
