package com.transaction.sender_repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transaction.sender_entity.Sender;

public interface SenderRepository extends JpaRepository<Sender, Integer> {

}
