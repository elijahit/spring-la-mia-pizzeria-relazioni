package it.elijah.pizzeria.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "ingredients")
public class Ingredients {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer Id;

  @NotBlank(message = "L'ingrediente è obbligatorio")
  @Column(nullable = false)
  private String ingredient;

  @ManyToMany(mappedBy = "ingredients_fk")
  private List<Pizza> pizze;

  public Integer getId() {
    return Id;
  }

  public void setId(Integer id) {
    Id = id;
  }

  public String getIngredient() {
    return ingredient;
  }

  public void setIngredient(String ingredient) {
    this.ingredient = ingredient;
  }

  public List<Pizza> getPizze() {
    return pizze;
  }

  public void setPizze(List<Pizza> pizze) {
    this.pizze = pizze;
  }


}
