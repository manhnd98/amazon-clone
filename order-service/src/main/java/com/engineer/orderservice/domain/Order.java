package com.engineer.orderservice.domain;

import java.time.Instant;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;

public record Order(

  @Id
  Long id,
  String bookIsbn,
  String bookName,
  Double bookPrice,
  Integer quantity,
  OrderStatus status,

  @CreatedDate
  Instant createdDate,

  @LastModifiedDate
  Instant lastModifiedDate,

  @Version
  int version
) {

  public static Order of(
    Long id,
    String bookIsbn,
    String bookName,
    Double bookPrice,
    Integer quantity,
    OrderStatus status,
    Instant createdDate,
    Instant lastModifiedDate,
    int version
  ) {
    return new Order(
      null,
      bookIsbn,
      bookName,
      bookPrice,
      quantity,
      status,
      createdDate,
      lastModifiedDate,
      version
    );
  }

}
