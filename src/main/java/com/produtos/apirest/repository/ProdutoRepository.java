package com.produtos.apirest.repository;

import com.produtos.apirest.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository <Produto, Long> {

    Produto findById(long id);
}
