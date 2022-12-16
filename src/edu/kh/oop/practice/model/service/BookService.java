package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Book;

public class BookService {
	public void practice() {
		
		// 1) 기본 생성자를 이용하여 첫 번째 Book 객체 생성
		Book bok1 = new Book();
		// 2) 매개변수 생성자를 이용하여 두 번째 Book 객체 생성 (사용 데이터 참고)
		Book bok2 = new Book("자바의 정석" , 30000, 0.2, "남궁성");
		// 3) 객체가 가진 필드 값을 toString()을 이용하여 출력
		System.out.println(bok1.toString());
		System.out.println(bok2.toString());
		System.out.println("===============================");
		//프린트 구문으로 적어야 문자열로 리턴한다.
		
		// 4) 첫 번째 객체가 가진 값을 setter를 이용하여 수정
		System.out.println("수정 후");
	
		bok1.setTitle("C언어"); // getter / setter 다 메소드이기에 변수명. 을 붙여서 씀
		bok1.setPrice(30000);
		bok1.setDiscountRate(0.1);
		bok1.setAuthor("이현경");
		
		
		// 5) 수정된 객체의 필드 값을 toString() 메소드를 이용하여 출력
		System.out.println(bok1.toString());

		System.out.println("===============================");
		
		// 6) 각 객체의 할인율을 적용한 책 가격을 계산해서 출력
		// 7) 할인된 가격 = 가격 - (가격 * 할인율)
		
		System.out.printf("도서명 = %s\n", bok1.getTitle());
		System.out.printf("할인된 가격 = %d원\n", (int) (bok1.getPrice() -(bok1.getPrice() * bok1.getDiscountRate())));
		System.out.printf("도서명 = %s\n", bok2.getTitle());
		System.out.printf("할인된 가격 = %d원\n", (int) (bok2.getPrice() -(bok2.getPrice() * bok2.getDiscountRate())));
		/*
		System.out.println("도서명 " + bok1.getTitle());
		System.out.println("할인된 가격: " + (int) (bok1.getPrice() - (bok1.getPrice() * bok1.getDiscountRate())));
		System.out.println("도서명 " + bok2.getTitle());
		System.out.println("할인된 가격 : " + (int) (bok2.getPrice() - (bok2.getPrice() * bok2.getDiscountRate()))); */
	}

}
