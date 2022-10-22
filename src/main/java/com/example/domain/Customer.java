package com.example.domain;

@Data
@AllArgsConstructor
public class Customer implements Serializadle {
  private Integer id;
  private String firstName;
  private String lastName;
}