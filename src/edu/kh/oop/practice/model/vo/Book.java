package edu.kh.oop.practice.model.vo;

public class Book { // 속성 값
	// 필드
	private String title;
	private int price;
	private double discountRate;
	private String author;
	
	
	
	public Book() { // 기본생성자 
		
	}
	
	public Book(String title, int price, double discountRate, String author) {
		//매개변수 생성자
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
		
	}
	
	// 메서드
	// getter / setter 구현하기
	public String getTitle(){
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	// 어노테이션 toString() 오버라이딩
	@Override
	public String toString() {
		return title + " / " + price + " / " + discountRate + " / " + author;
		// 문자열을 리턴하는 것 프린트 구문을 리턴하는 것이 아니다.
		
	}
	

}


