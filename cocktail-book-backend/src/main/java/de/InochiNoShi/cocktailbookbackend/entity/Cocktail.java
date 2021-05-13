package de.InochiNoShi.cocktailbookbackend.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "t_Cocktails")
public class Cocktail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cocktail_id;
	
	@Column(name = "cocktail_name", nullable = false)
	private String cocktail_name;
	
	@ManyToOne
    private Category category;
	
	@ManyToMany
	private List<Ingredients> ingredients = new ArrayList<>();
}
