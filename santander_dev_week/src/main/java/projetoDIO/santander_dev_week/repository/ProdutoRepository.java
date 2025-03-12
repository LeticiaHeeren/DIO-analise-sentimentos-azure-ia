package projetoDIO.santander_dev_week.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import projetoDIO.santander_dev_week.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}