package com.spring.camelLearn_b;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurrencyExchange {

        private Long id;
        private String from;
        private String to;
        private BigDecimal conversionMultiple;

}
