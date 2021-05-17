package com.endmodule.excer.controller;

import com.endmodule.excer.model.Promotion;
import com.endmodule.excer.repositories.PromotionRepository;
import com.endmodule.excer.services.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping(value = {"/promotion"})
public class PromotionController {

    @Autowired
    PromotionService promotionService;
//
//    @GetMapping("")
//    public ModelAndView listShow(@PageableDefault(value = 4) Pageable pageable){
//        return new ModelAndView("home", "promotions", promotionService.findAll(pageable));
//    }


    @GetMapping("")
    public String searchPromotion(@RequestParam(value = "keyword" , defaultValue = "") String keyword,
                                  @PageableDefault(value = 4) Pageable pageable,
                                  Model model){

        Page<Promotion> listPromotion = promotionService.listAll(pageable,keyword);


       model.addAttribute("promotions", listPromotion);
       model.addAttribute("keyword", keyword);
       return "home";
    }

//    @GetMapping("/search1")
//    public String searchPromotion1(@RequestParam(value = "keyword1" , defaultValue = "") String keyword1 ,
//                                   Model model ,
//                                   Pageable pageable){
//        Page<Promotion> listPromotion = promotionService.listAll(pageable, keyword1);
//    }


    @GetMapping("/create")
    public ModelAndView createForm(Model model){
        return new ModelAndView("create", "promotion", new Promotion());
    }

    @PostMapping("/create")
    public String createStudent(@Valid @ModelAttribute("promotion") Promotion promotion , BindingResult bindingResult , Model model){

        if(bindingResult.hasErrors()){
            return "create";
        } else {
            model.addAttribute("promotion" , promotion.getPromotionId()); // Hoi lai
            promotionService.save(promotion);
        }
        return "redirect:/promotion/";
    }

    @GetMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable int id){
        promotionService.delete(id);
        return "redirect:/promotion/";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showFormEdit(@PathVariable int id , Model model){
        return new ModelAndView("edit", "promotion" , promotionService.findById(id));
    }

    @PostMapping("/edit")
    public String editCustomer(@ModelAttribute("customer") Promotion promotion){
        promotionService.save(promotion);
        return "redirect:/promotion/";
    }



}


