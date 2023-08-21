package tn.csf.delivery.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity  

@Table  
public class Plat {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column 
	private int id;  
	@Column  
	private String name; 
	@Column  
	private double price; 
	@Column  
	private int cookTime;
	@Column  
	private boolean favorite;
	@Column  
	private int stars;
	
	@Column  
	private String tags;
	@Column  
	private String image;//l'image va être identifiée par un lien
	
	
	@ManyToOne(optional=false) //champ obligatoire
	@JoinColumn(name="idrestaurant", referencedColumnName="id")
	private Restaurant restaurant;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	

	
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	public int getCookTime() {
		return cookTime;
	}

	public void setCookTime(int cookTime) {
		this.cookTime = cookTime;
	}

	public boolean isFavorite() {
		return favorite;
	}

	public void setFavorite(boolean favorite) {
		this.favorite = favorite;
	}

	public int getStars() {
		return stars;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	
	public Restaurant getRestaurant() {
	return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
	this.restaurant = restaurant;
	}

	@Override
	public String toString() {
		return "Plat [id=" + id + ", name=" + name + ", price=" + price + ", image=" + image + ", restaurant="
				+ restaurant + "]";
	}


	
}