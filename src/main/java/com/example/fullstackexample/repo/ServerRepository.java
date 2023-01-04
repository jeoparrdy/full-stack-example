package com.example.fullstackexample.repo;

import com.example.fullstackexample.model.Server;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepository extends JpaRepository<Server, Long> {
    Server findByIpAddress(String ipAddress);
}
