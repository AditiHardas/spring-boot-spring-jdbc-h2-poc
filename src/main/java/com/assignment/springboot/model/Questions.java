package com.assignment.springboot.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import org.springframework.lang.NonNull;

public class Questions {
	
	@NonNull
	public Integer questionId;//PK
	@NotBlank
	@NotEmpty
	@NonNull
	public String questionText;
	@NotBlank
	@NotEmpty
	@NonNull
	public String questionType;
	public Answers answers;
	public SubQuestions subQuestions;
	
	
	/**
	 * @param questionId
	 * @param questionText
	 * @param questionType
	 * @param answers
	 */
	public Questions(Integer questionId, String questionText, String questionType, Answers answers,SubQuestions subQuestions) {
		super();
		this.questionId = questionId;
		this.questionText = questionText;
		this.questionType = questionType;
		this.answers = answers;
		this.subQuestions = subQuestions;
	}


	/**
	 * 
	 */
	public Questions() {
		super();
	}


	public Integer getQuestionId() {
		return questionId;
	}


	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}


	public String getQuestionText() {
		return questionText;
	}


	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}


	public String getQuestionType() {
		return questionType;
	}


	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}


	public Answers getAnswers() {
		return answers;
	}


	public void setAnswers(Answers answers) {
		this.answers = answers;
	}


	public SubQuestions getSubQuestions() {
		return subQuestions;
	}


	public void setSubQuestions(SubQuestions subQuestions) {
		this.subQuestions = subQuestions;
	}


	@Override
	public String toString() {
		return "Questions [questionId=" + questionId + ", questionText=" + questionText + ", questionType="
				+ questionType + ", answers=" + answers + ", subQuestions=" + subQuestions + "]";
	}
	
	
}
