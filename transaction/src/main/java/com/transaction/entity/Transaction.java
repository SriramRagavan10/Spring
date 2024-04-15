package com.transaction.entity;

import com.transaction.receiver_entity.Receiver;
import com.transaction.sender_entity.Sender;

public class Transaction {

	private Sender sender;
	private Receiver receiver;

	public Sender getSender() {
		return sender;
	}

	public void setSender(Sender sender) {
		this.sender = sender;
	}

	public Receiver getReceiver() {
		return receiver;
	}

	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}

}
