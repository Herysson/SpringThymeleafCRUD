package com.herysson.springcrudthymeleaf.repository;

import com.herysson.springcrudthymeleaf.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}