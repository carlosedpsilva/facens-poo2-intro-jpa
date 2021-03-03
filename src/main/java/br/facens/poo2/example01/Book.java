package br.facens.poo2.example01;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Book implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  private Long id;
  private String author;
  private double price;
  private String title;
}
