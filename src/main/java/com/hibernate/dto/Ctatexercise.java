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
 * Ctatexercise generated by hbm2java
 */
@Entity
@Table(name = "ctatexercise", catalog = "italk2learn")
public class Ctatexercise implements java.io.Serializable {

	private Integer idCtatexercise;
	private Exercises exercises;
	private User user;
	private String loganswer;
	private Date date;

	public Ctatexercise() {
	}

	public Ctatexercise(Exercises exercises, User user, Date date) {
		this.exercises = exercises;
		this.user = user;
		this.date = date;
	}

	public Ctatexercise(Exercises exercises, User user, String loganswer,
			Date date) {
		this.exercises = exercises;
		this.user = user;
		this.loganswer = loganswer;
		this.date = date;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_ctatexercise", unique = true, nullable = false)
	public Integer getIdCtatexercise() {
		return this.idCtatexercise;
	}

	public void setIdCtatexercise(Integer idCtatexercise) {
		this.idCtatexercise = idCtatexercise;
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

	@Column(name = "loganswer", length = 1500)
	public String getLoganswer() {
		return this.loganswer;
	}

	public void setLoganswer(String loganswer) {
		this.loganswer = loganswer;
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
