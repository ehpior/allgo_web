package com.allgo.web.dto;

public class AdminDto {
	
	@Override
	public String toString() {
		return "adminDto [seq=" + seq + ", id=" + id + ", password=" + password + ", nickname=" + nickname + "]";
	}
	private int seq;
	private String id;
	private String password;
	private String nickname;
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
}
