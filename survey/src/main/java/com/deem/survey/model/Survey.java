/**
 * 
 */
package com.deem.survey.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

/**
 * @author Arnab Nandan
 * 
 */
@Document(collection = "surveys")
public class Survey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Indexed
	private Long surveyId;
	private String topic;
	private String template;
	private List<Question> questionare;
	@DateTimeFormat(iso = ISO.DATE_TIME)
	private Date createdDate;

	/**
	 * 
	 */
	public Survey() {
		// TODO Auto-generated constructor stub
	}

	public Survey(Long surveyId, String topic, String template,
			List<Question> questionare, Date createdDate) {
		super();
		this.surveyId = surveyId;
		this.topic = topic;
		this.template = template;
		this.questionare = questionare;
		this.createdDate = createdDate;
	}

	/**
	 * @return the surveyId
	 */
	public Long getSurveyId() {
		return surveyId;
	}

	/**
	 * @param surveyId
	 *            the surveyId to set
	 */
	public void setSurveyId(Long surveyId) {
		this.surveyId = surveyId;
	}

	/**
	 * @return the topic
	 */
	public String getTopic() {
		return topic;
	}

	/**
	 * @param topic
	 *            the topic to set
	 */
	public void setTopic(String topic) {
		this.topic = topic;
	}

	/**
	 * @return the template
	 */
	public String getTemplate() {
		return template;
	}

	/**
	 * @param template
	 *            the template to set
	 */
	public void setTemplate(String template) {
		this.template = template;
	}

	/**
	 * @return the questionare
	 */
	public List<Question> getQuestionare() {
		return questionare;
	}

	/**
	 * @param questionare
	 *            the questionare to set
	 */
	public void setQuestionare(List<Question> questionare) {
		this.questionare = questionare;
	}

	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate
	 *            the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((createdDate == null) ? 0 : createdDate.hashCode());
		result = prime * result
				+ ((questionare == null) ? 0 : questionare.hashCode());
		result = prime * result
				+ ((surveyId == null) ? 0 : surveyId.hashCode());
		result = prime * result
				+ ((template == null) ? 0 : template.hashCode());
		result = prime * result + ((topic == null) ? 0 : topic.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Survey other = (Survey) obj;
		if (createdDate == null) {
			if (other.createdDate != null)
				return false;
		} else if (!createdDate.equals(other.createdDate))
			return false;
		if (questionare == null) {
			if (other.questionare != null)
				return false;
		} else if (!questionare.equals(other.questionare))
			return false;
		if (surveyId == null) {
			if (other.surveyId != null)
				return false;
		} else if (!surveyId.equals(other.surveyId))
			return false;
		if (template == null) {
			if (other.template != null)
				return false;
		} else if (!template.equals(other.template))
			return false;
		if (topic == null) {
			if (other.topic != null)
				return false;
		} else if (!topic.equals(other.topic))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Survey [surveyId=" + surveyId + ", topic=" + topic
				+ ", template=" + template + ", questionare=" + questionare
				+ ", createdDate=" + createdDate + "]";
	}

}
