package com.assignment.springboot.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.springboot.model.Questions;
import com.assignment.springboot.repository.QuestionsRepository;

@RestController
@RequestMapping("/api")
public class QuestionsRestController {

	@Autowired
	private QuestionsRepository questionsRepository;
	@Autowired
	JdbcTemplate jdbcTemplate;

	private static final Logger LOGGER=LoggerFactory.getLogger(QuestionsRestController.class);
	
	@RequestMapping(value = "/saveData/", method = RequestMethod.POST)
	public ResponseEntity<Object> saveHealthData(@Valid @RequestBody Questions question) {
		LOGGER.info("Execution Start:  QuestionsRestController");
		LOGGER.debug("Paramerts are : "+ question );
		try {
			questionsRepository.saveQuestionsAndAnswers(question);
		} catch (Exception e) {
			LOGGER.error("Exception occured into QuestionsRestController.saveHealthData()"+e);
			
		}
		LOGGER.info("Execution End:  QuestionsRestController");
		return new ResponseEntity<>("Questions and Answers saved successfully", HttpStatus.OK);

	}

}
