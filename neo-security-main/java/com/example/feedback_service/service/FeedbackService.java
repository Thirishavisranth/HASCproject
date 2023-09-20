package com.example.feedback_service.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.example.feedback_service.dto.FeedbackRequest;
import com.example.feedback_service.dto.FeedbackResponse;
import com.example.feedback_service.entity.Feedback;
import com.example.feedback_service.repository.FeedbackRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FeedbackService {
	private final FeedbackRepository feedbackRepository;

	public boolean addFeedback(FeedbackRequest feedbackRequest) {
		var feedback = Feedback.builder()
				.id(feedbackRequest.getId())
				.fullName(feedbackRequest.getFullName())
				.email(feedbackRequest.getEmail())
				.commentText(feedbackRequest.getCommentText())
				.build();
		feedbackRepository.save(feedback);
		List<Feedback> feedbackData = feedbackRepository.findAll();
		if(feedbackData.size() > 0) {
			return true;
		} else {
			return false;
		}
	}

	public List<FeedbackResponse> getFeedback() {
		List<Feedback> feedbacks = feedbackRepository.findAll();
		return feedbacks.stream().map(feedback -> mapToFeedbackResponse(feedback)).toList();
	}

	private FeedbackResponse mapToFeedbackResponse(Feedback feedback) {
	    return FeedbackResponse.builder()
	    		.id(feedback.getId()) 
	            .fullName(feedback.getFullName())
	            .email(feedback.getEmail())
	            .commentText(feedback.getCommentText())
	            .build();
	}

}