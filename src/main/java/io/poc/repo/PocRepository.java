package io.poc.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import io.poc.entity.PocEntity;
import io.poc.model.StrategyQuickEditDTO;


@Repository
public interface PocRepository extends JpaRepository<PocEntity, Long> {

	PocEntity findById(long id); //Query methods : bcz spring makes query

//	@Query(value="SELECT * FROM advertiser_2" , nativeQuery = true)
//	public List<Object[]> random(); 


	//cast-get
	//	  @Query(value = "SELECT NEW io.poc.StrategyQuickEditDTO(T.userId , T.name , T.lastName , T.email)  \n"+
	//			  "FROM advertiser_2 T where T.userId = :id" , nativeQuery = true )
	//	  StrategyQuickEditDTO getCastDetails(@Param("id") String id);


	//working
//	@Query(value = "select new io.poc.StrategyQuickEditDTO(T.userId , T.firstName , T.lastName , T.email)  \n"+
//			"from PocEntity T where T.userId = :id"  )
//	StrategyQuickEditDTO getCastDetails(@Param("id") Long id);

	//not - working
	//	@Query(value = "SELECT T.userId , T.firstName , T.lastName , T.email \n"+
	//			"FROM PocEntity T where T.userId = :id"  )
	//	StrategyQuickEditDTO getCastDetails(@Param("id") Long id);




}
