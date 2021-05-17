package com.endmodule.excer.services;

import com.endmodule.excer.model.Promotion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Date;
import java.util.List;

public interface PromotionService {
    Page<Promotion> findAll(Pageable pageable);
    void save(Promotion promotion);
    void delete(int id);
    Promotion findById(int id);

    Page<Promotion> findPromotionByPromotionTitle(Pageable pageable , String title);

    Page<Promotion> listAll(Pageable pageable , String keyword);
}
