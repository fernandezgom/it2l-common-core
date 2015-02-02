package com.hibernate.dto;

// Generated 02-Feb-2015 16:55:20 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name = "user", catalog = "italk2learn")
public class User implements java.io.Serializable {

	private int idUser;
	private String user;
	private Integer idView;
	private String sequencer;
	private int condition;
	private String idSequencerView;
	private Integer lastScore;
	private Set<Sequence> sequences = new HashSet<Sequence>(0);
	private Set<Flexercise> flexercises = new HashSet<Flexercise>(0);
	private Set<Whizzexercise> whizzexercises = new HashSet<Whizzexercise>(0);
	private Set<Ctatexercise> ctatexercises = new HashSet<Ctatexercise>(0);
	private Set<Audiostream> audiostreams = new HashSet<Audiostream>(0);

	public User() {
	}

	public User(int idUser, int condition) {
		this.idUser = idUser;
		this.condition = condition;
	}

	public User(int idUser, String user, Integer idView, String sequencer,
			int condition, String idSequencerView, Integer lastScore,
			Set<Sequence> sequences, Set<Flexercise> flexercises,
			Set<Whizzexercise> whizzexercises, Set<Ctatexercise> ctatexercises,
			Set<Audiostream> audiostreams) {
		this.idUser = idUser;
		this.user = user;
		this.idView = idView;
		this.sequencer = sequencer;
		this.condition = condition;
		this.idSequencerView = idSequencerView;
		this.lastScore = lastScore;
		this.sequences = sequences;
		this.flexercises = flexercises;
		this.whizzexercises = whizzexercises;
		this.ctatexercises = ctatexercises;
		this.audiostreams = audiostreams;
	}

	@Id
	@Column(name = "id_user", unique = true, nullable = false)
	public int getIdUser() {
		return this.idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	@Column(name = "user", length = 50)
	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	@Column(name = "idView")
	public Integer getIdView() {
		return this.idView;
	}

	public void setIdView(Integer idView) {
		this.idView = idView;
	}

	@Column(name = "sequencer", length = 2)
	public String getSequencer() {
		return this.sequencer;
	}

	public void setSequencer(String sequencer) {
		this.sequencer = sequencer;
	}

	@Column(name = "condition", nullable = false)
	public int getCondition() {
		return this.condition;
	}

	public void setCondition(int condition) {
		this.condition = condition;
	}

	@Column(name = "idSequencerView", length = 30)
	public String getIdSequencerView() {
		return this.idSequencerView;
	}

	public void setIdSequencerView(String idSequencerView) {
		this.idSequencerView = idSequencerView;
	}

	@Column(name = "lastScore")
	public Integer getLastScore() {
		return this.lastScore;
	}

	public void setLastScore(Integer lastScore) {
		this.lastScore = lastScore;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Sequence> getSequences() {
		return this.sequences;
	}

	public void setSequences(Set<Sequence> sequences) {
		this.sequences = sequences;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Flexercise> getFlexercises() {
		return this.flexercises;
	}

	public void setFlexercises(Set<Flexercise> flexercises) {
		this.flexercises = flexercises;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Whizzexercise> getWhizzexercises() {
		return this.whizzexercises;
	}

	public void setWhizzexercises(Set<Whizzexercise> whizzexercises) {
		this.whizzexercises = whizzexercises;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Ctatexercise> getCtatexercises() {
		return this.ctatexercises;
	}

	public void setCtatexercises(Set<Ctatexercise> ctatexercises) {
		this.ctatexercises = ctatexercises;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Audiostream> getAudiostreams() {
		return this.audiostreams;
	}

	public void setAudiostreams(Set<Audiostream> audiostreams) {
		this.audiostreams = audiostreams;
	}

}
