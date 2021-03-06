package com.cvc.challenge.dto.custom;

import com.cvc.challenge.dto.HotelDTO;
import com.cvc.challenge.dto.PriceDTO;
import com.cvc.challenge.enums.Category;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class NoIdRoomDTO {

    private Category category;

    private HotelDTO hotel;

    private PriceDTO price;
}