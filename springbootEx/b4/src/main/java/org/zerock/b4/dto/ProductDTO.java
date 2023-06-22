package org.zerock.b4.dto;

import java.util.List;

import groovy.transform.builder.Builder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {

  private Integer pno;
  private String pname;
  private int price;
  private boolean status;

  private String regDate, modDate;

  private List<String> fileNames ;
  
}
