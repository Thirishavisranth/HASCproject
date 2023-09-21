package com.example.feedback_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.feedback_service.entity.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Integer>{

}
