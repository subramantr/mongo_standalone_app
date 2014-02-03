/**
 * 
 */
package com.deem.survey.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

/**
 * @author Arnab Nandan
 * 
 */
public class Answer implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Long answerId;
	private String response;

	/**
	 * 
	 */
	public Answer() {
		// TODO Auto-generated constructor stub
	}

	public Answer(Long answerId, String response) {
		super();
		this.answerId = answerId;
		this.response = response;
	}

	/**
	 * @return the answerId
	 */
	public Long getAnswerId() {
		return answerId;
	}

	/**
	 * @param answerId
	 *            the answerId to set
	 */
	public void setAnswerId(Long answerId) {
		this.answerId = answerId;
	}

	/**
	 * @return the response
	 */
	public String getResponse() {
		return response;
	}

	/**
	 * @param response
	 *            the response to set
	 */
	public void setResponse(String response) {
		this.response = response;
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
				+ ((answerId == null) ? 0 : answerId.hashCode());
		result = prime * result
				+ ((response == null) ? 0 : response.hashCode());
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
		Answer other = (Answer) obj;
		if (answerId == null) {
			if (other.answerId != null)
				return false;
		} else if (!answerId.equals(other.answerId))
			return false;
		if (response == null) {
			if (other.response != null)
				return false;
		} else if (!response.equals(other.response))
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
		return "Answer [answerId=" + answerId + ", response=" + response + "]";
	}

}
