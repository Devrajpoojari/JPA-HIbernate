package com.association.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "answer")
public class Answer {

	@Id
	@Column(name = "answer_id")
	private Long aId;

	@Column(name = "answer")
	private String answer; 

	@OneToOne(mappedBy = "answer")
	private Question question;

	public Long getaId() {
		return aId;
	}

	public void setaId(Long aId) {
		this.aId = aId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Answer(Long aId, String answer) {
		this.aId = aId;
		this.answer = answer;
	}

	public Answer() {
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Answer(Long aId, String answer, Question question) {
		this.aId = aId;
		this.answer = answer;
		this.question = question;
	}

	@Override
	public String toString() {
		return "Answer [aId=" + aId + ", answer=" + answer + ", question=" + question + "]";
	}

}
