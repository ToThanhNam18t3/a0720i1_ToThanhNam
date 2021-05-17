package com.endmodule.excer.services.impl;

import com.endmodule.excer.model.Promotion;
import com.endmodule.excer.repositories.PromotionRepository;
import com.endmodule.excer.services.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PromotionServiceImpl implements PromotionService {

    @Autowired
    PromotionRepository promotionRepository;

    @Override
    public Page<Promotion> findAll(Pageable pageable) {
        return promotionRepository.findAll(pageable);
    }

    @Override
    public void save(Promotion promotion) {
        promotionRepository.save(promotion);
    }

    @Override
    public void delete(int id) {
        promotionRepository.deleteById(id);
    }

    @Override
    public Promotion findById(int id) {
        return promotionRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Promotion> findPromotionByPromotionTitle(Pageable pageable, String title) {
        if(title.equals("") || title.isEmpty()){
            return promotionRepository.findAll(pageable);
        } else {
            return promotionRepository.findPromotionByPromotionTitle(pageable , title);
        }
    }

    @Override
    public Page<Promotion> listAll(Pageable pageable , String keyword) {
        if(keyword != null){
            return promotionRepository.findPromotionByPromotionTitle(pageable, keyword);
        } else {
            return promotionRepository.findAll(pageable);
        }
    }


}
