package com.gabriellazar.orm.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Genre extends BaseEntity {

    private String Name;

    @ManyToMany(mappedBy = "genreList")
    private List<Movie> movieList;

    public Genre(String name) {
        Name = name;
    }
}
