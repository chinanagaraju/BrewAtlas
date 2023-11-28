package org.brewery.Repo;




import javax.persistence.Id;

import org.brewery.Brewery.BreweryData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface BreweryRepo extends CrudRepository<BreweryData,  Id> {


 

}
