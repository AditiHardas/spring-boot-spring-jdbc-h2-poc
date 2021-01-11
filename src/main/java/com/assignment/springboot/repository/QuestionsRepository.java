package com.assignment.springboot.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.assignment.springboot.model.Questions;

@Repository
public class QuestionsRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static final Logger LOGGER = LoggerFactory.getLogger(QuestionsRepository.class);

	/* Adding an item into database table */
	public void saveQuestionsAndAnswers(Questions ques) {

		try {
			
			LOGGER.debug("insert into questions with parameters" + ques.getQuestionId() + ":" + ques.getQuestionText()
			+ ":" + ques.getQuestionType());
			jdbcTemplate.update("insert into questions (questionId,questionText,questionType) values(?,?,?)",
					ques.getQuestionId(), ques.getQuestionText(), ques.getQuestionType());
			
			LOGGER.debug("insert into answers with parameters" + ques.getAnswers().getAnswerId() + ":"
					+ ques.getAnswers().getAnswer().toString());
			jdbcTemplate.update("insert into answers (answerId,answer) values(?,?)", ques.getAnswers().getAnswerId(),
					ques.getAnswers().getAnswer().toString());
			
			if (null != ques.getSubQuestions() && ques.getSubQuestions().subQuestionId != 0) {

				LOGGER.debug("insert into subquestions with parameters" + ques.getQuestionId(), ques.getSubQuestions().getSubQuestionId());
				jdbcTemplate.update(
						"insert into subquestions (parentQuestionId,subQuestionId,subQuestionText,subQuestionType) values(?,?,?,?)",
						ques.getQuestionId(), ques.getSubQuestions().getSubQuestionId(),
						ques.getSubQuestions().getSubQuestionText(), ques.getSubQuestions().getSubQuestionType());
				
				LOGGER.debug("insert into answers with parameters" + ques.getSubQuestions().getAnswers().getAnswerId() + ":"
						+ ques.getAnswers().getAnswer().toString());
				jdbcTemplate.update("insert into answers (answerId,answer) values(?,?)",
						ques.getSubQuestions().getAnswers().getAnswerId(),
						ques.getSubQuestions().getAnswers().getAnswer().toString());
				
			}
		} catch (DataAccessException e) {
			LOGGER.error("QuestionsRepository occure in QuestionsRepository.saveQuestionsAndAnswers" + e);
		}

	}
}
