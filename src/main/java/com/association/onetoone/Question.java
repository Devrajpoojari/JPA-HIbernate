package com.association.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "question_table")
public class Question {

	@Id
	@Column(name = "question_id")
	private Long qId;

	@Column(name = "questions")
	private String question;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "answer_fk")
	private Answer answer;

	public Long getqId() {
		return qId;
	}

	public void setqId(Long qId) {
		this.qId = qId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	public Question(Long qId, String question, Answer answer) {
		this.qId = qId;
		this.question = question;
		this.answer = answer;
	}

	public Question() {
	}

//	@Override
//	public String toString() {
//		return "Question [qId=" + qId + ", question=" + question + ", answer=" + answer + "]";
//	}

}
