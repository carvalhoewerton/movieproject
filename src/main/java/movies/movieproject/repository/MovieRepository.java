package movies.movieproject.repository;

import movies.movieproject.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository <Movie, Integer>{
}
