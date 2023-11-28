package org.brewery.Brewery;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "brewery")
public class BreweryData {

  @Id
  @Column
  @GeneratedValue(strategy  =GenerationType.AUTO)
  private int id;
  private  String feedback;
  
  @Column(length = 2)
  private int rating;

public BreweryData() {
	super();
	// TODO Auto-generated constructor stub
}

public BreweryData(int id, String feedback, int rating) {
	super();
	this.id=id;
	this.feedback = feedback;
	this.rating = rating;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFeedback() {
	return feedback;
}

public void setFeedback(String feedback) {
	this.feedback = feedback;
}

public int getRating() {
	return rating;
}

public void setRating(int rating) {
	this.rating = rating;
}

@Override
public String toString() {
	return "BreweryData [id=" + id + ", feedback=" + feedback + ", rating=" + rating + "]";
}
  


}