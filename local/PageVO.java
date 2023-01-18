package com.multi.www.local;

public class PageVO {

	private int start; //시작페이지
	private int end; //끝페이지
	private int page; //현재 페이지
	private int pages; //전체 페이지
	private int count; //게시글 갯수
	
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	public int getPages() {
		return pages;
	}
	public void setStartEnd(int page) {
		start = 1 + (page -1) * 12;
		end = page * 12; //5의 배수
		// page --> start 	~ 	end
		// --------------------------
		//1page --> 1 		~ 	5
		//2page --> 6		~ 	10
		//3page --> 11		~ 	15
		//int onePage = 5;
		//(page * 5) - 4 ==> 1page --> 1
		//(2 * 5) - 4 ==> 2page --> 6
		//(3 * 5) - 4 ==> 3page --> 11
		//(page * onePage ) - page
	}
	
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	@Override
	public String toString() {
		return "PageVO [start=" + start + ", end=" + end + ", page=" + page + "]";
	}
	
}