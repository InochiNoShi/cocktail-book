package de.InochiNoShi.cocktailbookbackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "t_Tool")
public class Tool {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long tool_id;
	
	@Column(name = "tool_name", nullable = false)
	private String tool_name;
	
	@Column(name = "tool_description", nullable = false)
	private String tool_description;
}
