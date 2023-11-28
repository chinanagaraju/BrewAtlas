package org.brewery.Service.UserIMPL;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Stack;

import org.brewery.Brewery.BreweryData;
import org.brewery.DTO.BreweryDTO;
import org.brewery.Repo.BreweryRepo;
import org.brewery.Service.BreweryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import antlr.collections.List;
@Service
public class BreweryImplement  implements BreweryService{
 @Autowired
	private BreweryRepo breweryRepo;

@Override
public String AddBrewery(BreweryDTO breweryDTO) {
	// TODO Auto-generated method stub
	BreweryData breweryData=new BreweryData(breweryDTO.getId(),breweryDTO.getFeedback(),breweryDTO.getRating());
	breweryRepo.save(breweryData);
	return "updated";
}

@Override
public ArrayList<BreweryData> GetAll() {
	ArrayList<BreweryData> data= (ArrayList<BreweryData>) breweryRepo.findAll();
	return data;
}
	
	
}