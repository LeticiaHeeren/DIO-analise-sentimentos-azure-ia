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
            repository.save(new Produto("Notebook Gamer", "Notebook potente para jogos", 5500.0, 10, "https://i.dell.com/is/image/DellContent/content/dam/ss2/product-images/dell-client-products/notebooks/alienware-notebooks/alienware-m16-r2-intel/media-gallery/laptop-aw-m16r2-nt-bk-gallery-3.psd?fmt=png-alpha&pscan=auto&scl=1&hei=320&wid=406&qlt=100,1&resMode=sharp2&size=406,320&chrss=full"));
            repository.save(new Produto("Smartphone", "Celular de última geração", 3200.0, 20, "https://m.media-amazon.com/images/I/61bK6PMOC3L._AC_UF1000,1000_QL80_.jpg"));
            repository.save(new Produto("Fone de Ouvido", "Fone bluetooth com cancelamento de ruído", 499.0, 50, "https://m.media-amazon.com/images/I/517BOM4tUkL._AC_UF1000,1000_QL80_.jpg"));
        };
    }
}