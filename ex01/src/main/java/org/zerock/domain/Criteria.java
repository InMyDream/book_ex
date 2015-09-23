package org.zerock.domain;

public class Criteria {
	
	//������ ��ȣ
	private int page;
	//�� �������� ���̴� �Խñ� ����
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
	
	//limit �������� ���� ���ڸ� ������ �� ���. 
	//ex) 10���� ����ϴ� ��� 3�������� �����ʹ� limit 20,10�� ���� ���°� �Ǿ� �� 
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
