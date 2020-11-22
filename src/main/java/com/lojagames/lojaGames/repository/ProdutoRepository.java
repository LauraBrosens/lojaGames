package com.lojagames.lojaGames.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lojagames.lojaGames.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	
}
