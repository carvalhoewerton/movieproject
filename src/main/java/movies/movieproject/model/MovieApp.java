package movies.movieproject.model;

import ch.qos.logback.core.net.SyslogOutputStream;
import movies.movieproject.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class MovieApp implements CommandLineRunner{
    @Autowired
    private MovieRepository repository;

    @Override
    public void run(String... args) throws Exception {
        Movie movie = new Movie();
        movie.setName("The Girl With the Dragon Tattoo");
        movie.setYear("2011");
        movie.setDirector("David Fincher");
        repository.save(movie);

        System.out.println("O filme " + movie.getName() + "foi adicionado ao banco de dados!");




    }



}
