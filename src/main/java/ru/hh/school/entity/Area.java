package ru.hh.school.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//TODO: оформите entity
@Entity
public class Area {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "area_id", nullable = false, updatable = false)
  private Integer id;

  @Column()
  private String name;

  public Area(){}

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
