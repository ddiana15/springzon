package com.antsrl.springzon.repository;

import com.antsrl.springzon.model.Description;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DescriptionRepository  extends JpaRepository<Description, Long> {
}
