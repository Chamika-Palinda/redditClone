package com.chamika.redditClone.repository;

import com.chamika.redditClone.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository <Post,Long>{
}
