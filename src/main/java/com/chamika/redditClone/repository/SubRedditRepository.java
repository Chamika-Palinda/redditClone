package com.chamika.redditClone.repository;

import com.chamika.redditClone.model.Subreddit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubRedditRepository extends JpaRepository<Subreddit,Long> {
}
