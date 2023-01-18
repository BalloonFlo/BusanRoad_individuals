package com.multi.www.chatbot;

public class OutputMessage {

	private String from;
	private String text;
	private String menu;

	public OutputMessage() {
	}

	public OutputMessage(String menu) {
		super();
		this.menu = menu;
	}

	public OutputMessage(String from, String text, String menu) {
		super();
		this.from = from;
		this.text = text;
		this.menu = menu;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	@Override
	public String toString() {
		return "OutputMessage2 [from=" + from + ", text=" + text + ", menu=" + menu + "]";
	}

}
