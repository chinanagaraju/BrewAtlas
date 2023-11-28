package org.brewery.DTO;

public class BreweryDTO {

	
	 private int id; 
	  private String feedback;
	
	   	private int rating;

		public BreweryDTO() {
			super();
			// TODO Auto-generated constructor stub
		}

		

		public int getId() {
			return id;
		}



		public void setId(int id) {
			this.id = id;
		}



		public BreweryDTO(int id, String feedback, int rating) {
			super();
			this.id = id;
			this.feedback = feedback;
			this.rating = rating;
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
			return "BreweryDTO [id=" + id + ", feedback=" + feedback + ", rating=" + rating + "]";
		}

		
		

}