package io.poc.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import io.poc.entity.PocEntity;
import io.poc.model.SomeFeildsDTO;


@Repository
public interface PocRepository extends JpaRepository<PocEntity, Long> {

	//SQL NATIVE QUERY
	@Query(value="select * from advertiser_3 a where a.av_id = :id" , nativeQuery=true)
	PocEntity searchSQLById(@Param("id")long id); //Query methods : bcz spring makes query
	
	
	//JPQL
	@Query("select new io.poc.model.SomeFeildsDTO(a.id , a.name , a.email) from PocEntity a where a.id = :id" )
	SomeFeildsDTO getSomeFeilds(@Param("id")long id); //Query methods : bcz spring makes query


	//	PocEntity findById(long id); //Query methods : bcz spring makes query

	//	@Query(value="SELECT * FROM advertiser_2" , nativeQuery = true)
	//	public List<Object[]> random(); 


	//working
	//	@Query(value = "select new io.poc.StrategyQuickEditDTO(T.userId , T.firstName , T.lastName , T.email)  \n"+
	//			"from PocEntity T where T.userId = :id"  )
	//	StrategyQuickEditDTO getCastDetails(@Param("id") Long id);

	




}
