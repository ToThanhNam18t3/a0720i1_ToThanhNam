package com.pictureday.picture.services.impl;

import com.pictureday.picture.model.Comment;
import com.pictureday.picture.repository.Repository;
import com.pictureday.picture.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    Repository repository;

    @Override
    public List<Comment> findAll() {
        return repository.findAll();
    }

    @Override
    public void save(Comment comment) {
        repository.save(comment);
    }

    @Override
    public void reactComment(int id) {

    }
}
