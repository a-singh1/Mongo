package com.example.mongodb.demo.spring.mongodb.document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
@Builder
@Data
@AllArgsConstructor

@Document(collection = "Users")
public class Users {
  @Id
  private Long Id;
  private String name;
  private Long salary;

}
