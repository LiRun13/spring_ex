package com.runni.common;

import java.util.ArrayList;
import java.util.List;

public class Page<T> {
	
	private int pageNo = 1; // ��ǰҳ��
	private int pageSize = 10; // ҳ���С������Ϊ��-1����ʾ�����з�ҳ����ҳ��Ч��
	
	private long count;// �ܼ�¼��������Ϊ��-1����ʾ����ѯ����
	
	private int first;// ��ҳ����
	private int last;// βҳ����
	private int prev;// ��һҳ����
	private int next;// ��һҳ����
	
	private boolean firstPage;//�Ƿ��ǵ�һҳ
	private boolean lastPage;//�Ƿ������һҳ
	
	private List<T> list = new ArrayList<T>();
	
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		this.count = count;
	}
	public int getFirst() {
		return first;
	}
	public void setFirst(int first) {
		this.first = first;
	}
	public int getLast() {
		return last;
	}
	public void setLast(int last) {
		this.last = last;
	}
	public int getPrev() {
		return prev;
	}
	public void setPrev(int prev) {
		this.prev = prev;
	}
	public int getNext() {
		return next;
	}
	public void setNext(int next) {
		this.next = next;
	}
	public boolean isFirstPage() {
		return firstPage;
	}
	public void setFirstPage(boolean firstPage) {
		this.firstPage = firstPage;
	}
	public boolean isLastPage() {
		return lastPage;
	}
	public void setLastPage(boolean lastPage) {
		this.lastPage = lastPage;
	}
	
	

}
