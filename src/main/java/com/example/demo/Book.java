package com.example.demo;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Data
@Document
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	 private String id;
	 private String author;
	 private String title;

}
