package com.transaction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.transaction.entity.Transaction;
import com.transaction.receiver_repository.ReceiverRepository;
import com.transaction.sender_repository.SenderRepository;

import jakarta.transaction.Transactional;

@RestController
public class TransactionController {

	@Autowired
	SenderRepository senderRepository;

	@Autowired
	ReceiverRepository receiverRepository;

	@Transactional
	@PostMapping(value = "/post")
	public String postSR(@RequestBody Transaction t) {
		senderRepository.save(t.getSender());
		int a = 10 / 0;
		receiverRepository.save(t.getReceiver());

		return "Saved Successfully";
	}

}
