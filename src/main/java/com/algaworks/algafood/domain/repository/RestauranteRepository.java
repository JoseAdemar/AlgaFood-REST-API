package com.algaworks.algafood.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algaworks.algafood.domain.model.Restaurante;

@Repository
public interface RestauranteRepository extends JpaRepository<Restaurante, Long> , RestauranteRepositoryQueries{

//	//List<Restaurante> findByTaxaFreteBetween(BigDecimal taxaInicial, BigDecimal taxaFinal); //pesquisa entre dois valores
//	
//	List<Restaurante> findByNomeContainingAndCozinhaId(String nome, Long cozinha);//pesquisa onde contem um nome e também um id
//	
//	Optional<Restaurante> findFirstByNomeContaining(String nome); // consulta filtrando o primeiro resultado
//	
//	Optional<Restaurante> findTop2ByNomeContaining(String nome); // consulta filtrando os dois primeiro resultado
//	
//	
//	@Query("from Restaurante where nome like %:nome% and cozinha.id = :id")
//	List<Restaurante> consultarPorNome(String nome, @Param("id") Long cozinha); // consulta JPQL 
	
	
	
	
	
	
	
}