package org.brewery.UserController;

import java.util.ArrayList;
import java.util.Optional;

import org.brewery.Brewery.BreweryData;
import org.brewery.DTO.BreweryDTO;
import org.brewery.Service.BreweryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("userfeedback")
public class BreweryController {
	@Autowired
	private BreweryService breweryService;
	
	@PostMapping("feedback")
	public String Brewery( @RequestBody BreweryDTO breweryDTO) {
		String id=breweryService.AddBrewery(breweryDTO);
		System.out.println("control");
		return id;
	}
	@GetMapping("feedback")
	 public ArrayList<BreweryData> GetAll( ) {
		ArrayList<BreweryData> data=breweryService.GetAll();
		 return data;
	 }
	
}
