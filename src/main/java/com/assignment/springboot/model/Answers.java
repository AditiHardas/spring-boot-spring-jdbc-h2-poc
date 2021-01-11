package com.assignment.springboot.model;

import java.util.List;

import org.springframework.lang.NonNull;

public class Answers {
	
	@NonNull
	public Integer answerId;// PK
	public List<String> answer;

	/**
	 * @param answerId
	 * @param answer
	 */
	public Answers(Integer answerId, List<String> answer) {
		super();
		this.answerId = answerId;
		this.answer = answer;
	}

	public Integer getAnswerId() {
		return answerId;
	}

	public void setAnswerId(Integer answerId) {
		this.answerId = answerId;
	}

	public List<String> getAnswer() {
		return answer;
	}

	public void setAnswer(List<String> answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Answers [answerId=" + answerId + ", answer=" + answer + "]";
	}

}
