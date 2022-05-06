package com.Sample.LibraryManagementSystem.Repository;

import com.Sample.LibraryManagementSystem.Entity.Billing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BillingRepository extends JpaRepository<Billing, Integer> {
}
