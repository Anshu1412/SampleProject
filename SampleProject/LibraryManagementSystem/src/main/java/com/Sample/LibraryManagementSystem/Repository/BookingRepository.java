package com.Sample.LibraryManagementSystem.Repository;

import com.Sample.LibraryManagementSystem.Entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {
}
