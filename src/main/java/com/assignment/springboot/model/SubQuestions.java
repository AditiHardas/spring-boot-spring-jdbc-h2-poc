package com.assignment.springboot.model;

import org.springframework.beans.factory.annotation.Autowired;

public class SubQuestions {
	
	public Integer parentQuestionId;
	public Integer subQuestionId;
	public String subQuestionText;
	public String subQuestionType;
	
	@Autowired
	public Answers answers;

	public Integer getParentQuestionId() {
		return parentQuestionId;
	}

	public void setParentQuestionId(Integer parentQuestionId) {
		this.parentQuestionId = parentQuestionId;
	}

	public int getSubQuestionId() {
		return subQuestionId;
	}

	public void setSubQuestionId(Integer subQuestionId) {
		this.subQuestionId = subQuestionId;
	}

	public String getSubQuestionText() {
		return subQuestionText;
	}

	public void setSubQuestionText(String subQuestionText) {
		this.subQuestionText = subQuestionText;
	}

	public String getSubQuestionType() {
		return subQuestionType;
	}

	public void setSubQuestionType(String subQuestionType) {
		this.subQuestionType = subQuestionType;
	}

	public Answers getAnswers() {
		return answers;
	}

	public void setAnswers(Answers answers) {
		this.answers = answers;
	}

	/**
	 * @param parentQuestionId
	 * @param subQuestionId
	 * @param subQuestionText
	 * @param subQuestionType
	 * @param answers
	 */
	public SubQuestions(Integer parentQuestionId, Integer subQuestionId, String subQuestionText, String subQuestionType,
			Answers answers) {
		super();
		this.parentQuestionId = parentQuestionId;
		this.subQuestionId = subQuestionId;
		this.subQuestionText = subQuestionText;
		this.subQuestionType = subQuestionType;
		this.answers = answers;
	}
	
	
	

}
