package com.iamneo.user_service.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Feedback {
	private int id;
	private String fullName;
	private String email;
	private String commentText;
}
