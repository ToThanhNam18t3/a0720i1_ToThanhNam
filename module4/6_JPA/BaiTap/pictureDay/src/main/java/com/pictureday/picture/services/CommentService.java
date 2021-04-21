package com.pictureday.picture.services;

import com.pictureday.picture.model.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> findAll();
    void save(Comment comment);
    void reactComment(int id);
}
