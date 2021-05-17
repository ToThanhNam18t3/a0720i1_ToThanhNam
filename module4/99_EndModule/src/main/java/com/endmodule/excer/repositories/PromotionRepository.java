package com.endmodule.excer.repositories;

import com.endmodule.excer.model.Promotion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;

public interface PromotionRepository extends JpaRepository<Promotion , Integer> {


    @Query("SELECT p FROM Promotion p WHERE p.promotionTitle LIKE %?1%"
            + " OR CONCAT(p.discountRate, '') LIKE %?1%")
    Page<Promotion> findPromotionByPromotionTitle(Pageable pageable , String keyword);

//    @Query("select s from Promotion s where "
//            +"concat(s.startDay, '')"
//            +"like %?1%"
//    )
//    Page<Promotion> findByPromotionStartDay(Pageable pageable , String startDay);

}
