package com.chamika.redditClone.repository;

import com.chamika.redditClone.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote,Long> {
}
