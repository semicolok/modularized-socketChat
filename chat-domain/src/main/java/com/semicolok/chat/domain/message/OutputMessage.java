package com.semicolok.chat.domain.message;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class OutputMessage extends Message {

	private Date time;

	public OutputMessage(Message original, Date time) {
		super(original.getId(), original.getMessage());
		this.time = time;
	}
}
