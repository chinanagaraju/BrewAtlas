package org.brewery.Service;

import java.util.ArrayList;
import java.util.Optional;

import org.brewery.Brewery.BreweryData;
import org.brewery.DTO.BreweryDTO;

public interface BreweryService {

	String AddBrewery(BreweryDTO breweryDTO);

	ArrayList<BreweryData>GetAll();




}
