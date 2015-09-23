package org.zerock.domain;

public class Criteria {
	
	//페이지 번호
	private int page;
	//한 페이지에 보이는 게시글 개수
	private int perPageNum;
	
	public Criteria(){
		this.page = 1;
		this.perPageNum = 10;
	}
	
	public void setPage(int page){
		if(page <= 0){
			this.page = 1;
			return;
		}
		
		this.page = page;
	}
	
	public void setPerPageNum(int perPageNum){
		if(perPageNum <= 0 || perPageNum > 100){
			this.perPageNum = 10;
			return;
		}
		
		this.perPageNum = perPageNum;
	}
	
	public int getPage(){
		return page;
	}
	
	//limit 구문에서 앞의 숫자를 지정할 때 사용. 
	//ex) 10개씩 출력하는 경우 3페이지의 데이터는 limit 20,10과 같은 형태가 되야 함 
	public int getPageStart(){
		return (this.page - 1) * perPageNum;
	}
	
	public int getPerPageNum(){
		return this.perPageNum;
	}

	@Override
	public String toString() {
		return "Criteria [page=" + page + ", perPageNum=" + perPageNum + "]";
	}
	
	
}
