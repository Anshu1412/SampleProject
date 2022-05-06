package com.Sample.LibraryManagementSystem.Repository;

import com.Sample.LibraryManagementSystem.Entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Integer> {

}
