package com.hibernate.dto;

// Generated 14-Jul-2014 17:26:25 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Whizzexercise generated by hbm2java
 */
@Entity
@Table(name = "whizzexercise", catalog = "italk2learn")
public class Whizzexercise implements java.io.Serializable {

	private Integer idWhizzexercise;
	private Exercises exercises;
	private User user;
	private Integer score;
	private Integer percentage;
	private String help1;
	private String help2;
	private String help3;
	private String time;
	private Integer totalQuestions;
	private Date date;

	public Whizzexercise() {
	}

	public Whizzexercise(Exercises exercises, User user, Date date) {
		this.exercises = exercises;
		this.user = user;
		this.date = date;
	}

	public Whizzexercise(Exercises exercises, User user, Integer score,
			Integer percentage, String help1, String help2, String help3,
			String time, Integer totalQuestions, Date date) {
		this.exercises = exercises;
		this.user = user;
		this.score = score;
		this.percentage = percentage;
		this.help1 = help1;
		this.help2 = help2;
		this.help3 = help3;
		this.time = time;
		this.totalQuestions = totalQuestions;
		this.date = date;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_whizzexercise", unique = true, nullable = false)
	public Integer getIdWhizzexercise() {
		return this.idWhizzexercise;
	}

	public void setIdWhizzexercise(Integer idWhizzexercise) {
		this.idWhizzexercise = idWhizzexercise;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_exercise", nullable = false)
	public Exercises getExercises() {
		return this.exercises;
	}

	public void setExercises(Exercises exercises) {
		this.exercises = exercises;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_user", nullable = false)
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "score")
	public Integer getScore() {
		return this.score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	@Column(name = "percentage")
	public Integer getPercentage() {
		return this.percentage;
	}

	public void setPercentage(Integer percentage) {
		this.percentage = percentage;
	}

	@Column(name = "help1", length = 100)
	public String getHelp1() {
		return this.help1;
	}

	public void setHelp1(String help1) {
		this.help1 = help1;
	}

	@Column(name = "help2", length = 100)
	public String getHelp2() {
		return this.help2;
	}

	public void setHelp2(String help2) {
		this.help2 = help2;
	}

	@Column(name = "help3", length = 100)
	public String getHelp3() {
		return this.help3;
	}

	public void setHelp3(String help3) {
		this.help3 = help3;
	}

	@Column(name = "time", length = 100)
	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Column(name = "total_questions")
	public Integer getTotalQuestions() {
		return this.totalQuestions;
	}

	public void setTotalQuestions(Integer totalQuestions) {
		this.totalQuestions = totalQuestions;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date", nullable = false, length = 19)
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}