package me.afua.anotherrestapi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Person {
    @GeneratedValue
    @Id
    private long id;

    private String fullName;

    private String address;

    @JsonIgnoreProperties("people")
    @ManyToMany
    private Set<Colour> favouriteColours;

    public Person() {
        this.favouriteColours = new HashSet<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<Colour> getFavouriteColours() {
        return favouriteColours;
    }

    public void setFavouriteColours(Set<Colour> favouriteColours) {
        this.favouriteColours = favouriteColours;
    }
}
