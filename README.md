# spring-boot-spring-jdbc-h2-poc
Spring boot POC with spring jdbc and h2 database

Swagger URL 
http://localhost:8080/SpringBootApp/swagger-ui.html

End points
http://localhost:8080/SpringBootApp/api/saveData/

H2 DB console
http://localhost:8080/SpringBootApp/h2/

Sample request


[
  {
    "questionId": 1,
    "questionText": "How are you doing today",
    "questionType": "Single",
    
	"answers": {
      "answer": [
        "Good"
      ],
      "answerId": 1
    },
	"subQuestions": {
      "answers": {
        "answer": [
          "great"
        ],
        "answerId": 2
      },
      "parentQuestionId": 1,
      "subQuestionId": 1,
      "subQuestionText": "How was your day",
      "subQuestionType": "Single"
    }
  }
]
