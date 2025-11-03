package com.detersak.catalogservice.enums;

import lombok.Getter;

import java.util.stream.Stream;

@Getter
public enum PriceRange {

    Low(1),
    MediumLow(2),
    Medium(3),
    MediumHigh(4),
    High(5);

    private final int code;

    PriceRange(int code) {
        this.code = code;
        }

    public static PriceRange of(int code) {
        return Stream.of(PriceRange.values())
                .filter(p -> p.getCode() == code)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Código do PriceRange inválido: " + code));
}

}