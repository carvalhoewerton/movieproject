package movies.movieproject.model;


import jakarta.persistence.*;


@Entity
@Table(name = "tab_mo")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    private Integer id;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 6, nullable = false)
    private String year;

    @Column(length = 50, nullable = false)
    private String director;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }


    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}