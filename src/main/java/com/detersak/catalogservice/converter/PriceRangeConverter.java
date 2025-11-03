package com.detersak.catalogservice.converter;

import com.detersak.catalogservice.enums.PriceRange;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true) // autoApply = true aplica este conversor para TODOS os campos do tipo PriceRange
public class PriceRangeConverter implements AttributeConverter<PriceRange, Integer> {

    @Override
    public Integer convertToDatabaseColumn(PriceRange attribute) {
        // Converte o Enum (ex: PriceRange.Low) para o Inteiro (ex: 1)
        if (attribute == null) {
            return null;
        }
        return attribute.getCode();
    }

    @Override
    public PriceRange convertToEntityAttribute(Integer dbData) {
        // Converte o Inteiro (ex: 1) de volta para o Enum (ex: PriceRange.Low)
        if (dbData == null) {
            return null;
        }
        return PriceRange.of(dbData);
    }
}