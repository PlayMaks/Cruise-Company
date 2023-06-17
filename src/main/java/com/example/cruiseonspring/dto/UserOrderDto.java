package com.example.cruiseonspring.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserOrderDto {
    private Integer id;
    private Integer idUser;
    private Integer idCruiseShip;
    private String frontPassport;
    private String backPassport;
    private String status;
}
