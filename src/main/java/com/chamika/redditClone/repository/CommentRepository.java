package com.chamika.redditClone.repository;

import com.chamika.redditClone.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {
}
