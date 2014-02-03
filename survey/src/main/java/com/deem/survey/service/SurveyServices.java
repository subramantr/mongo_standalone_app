package com.deem.survey.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.deem.survey.config.SpringMongoConfig;
import com.deem.survey.model.Answer;
import com.deem.survey.model.Question;
import com.deem.survey.model.Survey;

public class SurveyServices {

	public static void main(String[] args) {
		// For Annotation
		ApplicationContext ctx = new AnnotationConfigApplicationContext(
				SpringMongoConfig.class);
		MongoOperations mongoOperation = (MongoOperations) ctx
				.getBean("mongoTemplate");

		// Case1 - insert a user, put "tableA" as collection name
		System.out.println("Case 1...");
		List<Answer> probableAnswers = new ArrayList<Answer>();
		Answer a1 = new Answer(1l, "Yes");
		Answer a2 = new Answer(2l, "Yes");
		Answer a3 = new Answer(3l, "No");
		Answer a4 = new Answer(4l, "Yes");
		Answer a5 = new Answer(5l, "No");
		Answer a6 = new Answer(6l, "Yes");
		Answer a7 = new Answer(7l, "No");
		Answer a8 = new Answer(8l, "Yes");
		Answer a9 = new Answer(9l, "Yes");
		probableAnswers.add(a1);
		probableAnswers.add(a2);
		probableAnswers.add(a3);
		probableAnswers.add(a4);
		probableAnswers.add(a5);
		probableAnswers.add(a6);
		probableAnswers.add(a7);
		probableAnswers.add(a8);
		probableAnswers.add(a9);
		Question q1 = new Question(1l,
				"Do you want to refer your friend in Deem ?", probableAnswers);
		List<Question> questionare = new ArrayList<Question>();
		questionare.add(q1);
		Survey firstSurvey = new Survey(1l, "referal", "basic", questionare,
				new Date());
		mongoOperation.save(firstSurvey);

		 // find
		 Query findSurveyQuery = new Query();
		 findSurveyQuery.addCriteria(Criteria.where("surveyId").is(1l));
		 Survey retrievedFirstSurvey = mongoOperation.findOne(findSurveyQuery, Survey.class);
		 System.out.println(retrievedFirstSurvey);
	}
}
