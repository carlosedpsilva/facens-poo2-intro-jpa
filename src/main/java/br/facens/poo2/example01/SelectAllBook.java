package br.facens.poo2.example01;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SelectAllBook {
  public static void main(String[] args) {

    EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU_SAMPLES");

    EntityManager em = factory.createEntityManager();

    List<Book> list = em.createQuery("SELECT o FROM Book o", Book.class).getResultList();

    for (Book b : list) {
      System.out.println(b);
    }
    
    em.close();
    factory.close();
  }
}
