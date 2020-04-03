package com.example.restaurantservice.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;




import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "items")
@Getter @Setter @NoArgsConstructor
public class Item {

	@Id
	  @SequenceGenerator(sequenceName = "item_seq", name = "item_seq_gen", allocationSize = 1)
	  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "item_seq_gen")
	  @Column(name = "item_id")
	  private Long itemId;


	  @Column(name = "item_name")
	  private String itemName;

	  @Column(name = "item_desc")
	  private String itemDesc;

	  @Column(name = "price")
	  private Long price;


	  @Column(name="date_added")
	  private Date dateAdded;
	
	
}
