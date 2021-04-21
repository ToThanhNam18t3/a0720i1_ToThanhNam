package com.pictureday.picture.repository;

import com.pictureday.picture.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Comment, Integer> {
}
