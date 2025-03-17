package projetoDIO.santander_dev_week;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import projetoDIO.santander_dev_week.model.Produto;
import projetoDIO.santander_dev_week.repository.ProdutoRepository;

@Component
public class DataLoader {

    @Bean
    CommandLineRunner initDatabase(ProdutoRepository repository) {
        return args -> {
            repository.save(new Produto("Notebook Gamer", "Notebook potente para jogos", 5500.0, 10));
            repository.save(new Produto("Smartphone", "Celular de última geração", 3200.0, 20));
            repository.save(new Produto("Fone de Ouvido", "Fone bluetooth com cancelamento de ruído", 499.0, 50));
        };
    }
}