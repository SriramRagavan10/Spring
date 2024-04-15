package com.transaction.receiver_repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transaction.receiver_entity.Receiver;

public interface ReceiverRepository extends JpaRepository<Receiver, Integer> {

}
