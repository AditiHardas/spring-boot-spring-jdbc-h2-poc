DROP TABLE questions IF EXISTS;

CREATE TABLE `questions` (
  `questionId` INT(11) NOT NULL,
  `questionText` VARCHAR(500) ,
  `questionType` VARCHAR(500)
);

CREATE TABLE `answers` (
  `answerId` INT(11) NOT NULL,
  `answer` VARCHAR(5000) 
);

CREATE TABLE `subquestions` (
  `parentQuestionId` INT(11) NOT NULL,
  `subQuestionId` INT(11) NOT NULL,
  `subQuestionText` VARCHAR(500) ,
  `subQuestionType` VARCHAR(500)
);