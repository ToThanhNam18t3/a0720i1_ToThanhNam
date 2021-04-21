package com.pictureday.picture.controller;

import com.pictureday.picture.model.Comment;
import com.pictureday.picture.repository.Repository;
import com.pictureday.picture.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CommentController {
    @Autowired
    CommentService commentService;

   @GetMapping("/")
    public ModelAndView homePage(){
       ModelAndView modelAndView = new ModelAndView("index");
       modelAndView.addObject("comments", commentService.findAll());
       modelAndView.addObject("comment", new Comment());
       modelAndView.addObject("ratinglist", new int[]{1,2,3,4,5});
       return modelAndView;
   }

   @PostMapping("/save")
   public String saveComment(@ModelAttribute Comment comment){
       commentService.save(comment);
       return "redirect:/";
   }

    @GetMapping("/{id}/like")
    public String likeComment(@PathVariable int id){
        commentService.reactComment(id);
        return "redirect:/";
    }
}
