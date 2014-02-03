/**
 * 
 */
package com.deem.survey.model;

import java.io.Serializable;
import java.util.List;

/**
 * @author Arnab Nandan
 * 
 */
public class Question implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long questionId;
	private String query;
	private List<Answer> probableAnswers;

	/**
	 * 
	 */
	public Question() {
		// TODO Auto-generated constructor stub
	}

	public Question(Long questionId, String query, List<Answer> probableAnswers) {
		super();
		this.questionId = questionId;
		this.query = query;
		this.probableAnswers = probableAnswers;
	}

	/**
	 * @return the questionId
	 */
	public Long getQuestionId() {
		return questionId;
	}

	/**
	 * @param questionId
	 *            the questionId to set
	 */
	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}

	/**
	 * @return the query
	 */
	public String getQuery() {
		return query;
	}

	/**
	 * @param query
	 *            the query to set
	 */
	public void setQuery(String query) {
		this.query = query;
	}

	/**
	 * @return the probableAnswers
	 */
	public List<Answer> getProbableAnswers() {
		return probableAnswers;
	}

	/**
	 * @param probableAnswers
	 *            the probableAnswers to set
	 */
	public void setProbableAnswers(List<Answer> probableAnswers) {
		this.probableAnswers = probableAnswers;
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
				+ ((probableAnswers == null) ? 0 : probableAnswers.hashCode());
		result = prime * result + ((query == null) ? 0 : query.hashCode());
		result = prime * result
				+ ((questionId == null) ? 0 : questionId.hashCode());
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
		Question other = (Question) obj;
		if (probableAnswers == null) {
			if (other.probableAnswers != null)
				return false;
		} else if (!probableAnswers.equals(other.probableAnswers))
			return false;
		if (query == null) {
			if (other.query != null)
				return false;
		} else if (!query.equals(other.query))
			return false;
		if (questionId == null) {
			if (other.questionId != null)
				return false;
		} else if (!questionId.equals(other.questionId))
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
		return "Question [questionId=" + questionId + ", query=" + query
				+ ", probableAnswers=" + probableAnswers + "]";
	}

}
