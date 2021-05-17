package com.endmodule.excer.model;

import com.endmodule.excer.validation.DiscountRateCheck;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@Getter @Setter @NoArgsConstructor
public class Promotion {

    @Id
    private int promotionId;

    @NotBlank(message = "khong trong")
    private String promotionTitle;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate startDay;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate endDay;

    @DiscountRateCheck(message = "")
    private int discountRate;

    private String detail;

    public Promotion(int promotionId, LocalDate startDay, LocalDate endDay, int discountRate, String detail) {
        this.promotionId = promotionId;
        this.startDay = startDay;
        this.endDay = endDay;
        this.discountRate = discountRate;
        this.detail = detail;
    }

}
