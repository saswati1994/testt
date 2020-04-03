package com.example.restaurantservice.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
@Table(name = "cart")
public class Cart {
	
	@Id
	  @SequenceGenerator(sequenceName = "cart_item_seq", name = "cart_item_seq_gen", allocationSize = 1)
	  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cart_item_seq_gen")
	  @Column(name = "id")
	  private Long cartId;

	  @ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	  @JoinColumn(name = "cart_id")
	  private Set<Item> items;


	  @Column(name = "user_id")
	  private String userId;
	
	
	

}
