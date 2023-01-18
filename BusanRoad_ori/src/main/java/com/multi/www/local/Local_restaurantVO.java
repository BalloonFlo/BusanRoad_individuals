package com.multi.www.local;

public class Local_restaurantVO {
	private int num;
	private String img;
	private String address;
	private int latitude;
	private int longtitude;
	private String category;
	private String off;
	private String time;
	private String park;
	private String menu;
	private String name;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getLatitude() {
		return latitude;
	}
	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}
	public int getLongtitude() {
		return longtitude;
	}
	public void setLongtitude(int longtitude) {
		this.longtitude = longtitude;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getOff() {
		return off;
	}
	public void setOff(String off) {
		this.off = off;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getPark() {
		return park;
	}
	public void setPark(String park) {
		this.park = park;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Local_restaurantVO [num=" + num + ", img=" + img + ", address=" + address + ", latitude=" + latitude
				+ ", longtitude=" + longtitude + ", category=" + category + ", off=" + off + ", time=" + time
				+ ", park=" + park + ", menu=" + menu + ", name=" + name + "]";
	}
	
}
