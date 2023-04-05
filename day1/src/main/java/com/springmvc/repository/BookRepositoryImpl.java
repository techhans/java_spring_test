package com.springmvc.repository;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springmvc.domain.Book;

@Repository
public class BookRepositoryImpl implements BookRepository {

	private List<Book> listOfBooks = new ArrayList<Book>();
	
	public BookRepositoryImpl() {
		Book book1 = new Book("ISBN1234", "C# ������","30000");
		book1.setAuthor("�ڿ���");
		book1.setDescription("C# �������� ���� ù ���α׷� ���� C#�� �����ϴ� ���ڸ� ������� �Ѵ�. Ư�� ���� ���α׷��Ӹ� ���� C# �Թ�����, C#�� ����Ͽ� ����(����Ƽ), ��, �����, IOT���� ������ �� �ʿ��� C# ���� ������ ������ �⺻�⸦ źź�ϰ� ������ ���� �����̴�");

		book1.setPublisher("���");
		book1.setCategory("IT������");
		book1.setUnitsInStock(1000);
		book1.setReleaseDate("2020/05/29");
		
		Book book2 = new Book("ISBN1235", "Node.js ������","36000");
		book2.setAuthor("�ڿ���");
		book2.setDescription("Node.js �������� ���� ù ���α׷� ���� C#�� �����ϴ� ���ڸ� ������� �Ѵ�. Ư�� ���� ���α׷��Ӹ� ���� C# �Թ�����, C#�� ����Ͽ� ����(����Ƽ), ��, �����, IOT���� ������ �� �ʿ��� C# ���� ������ ������ �⺻�⸦ źź�ϰ� ������ ���� �����̴�");

		book2.setPublisher("���");
		book2.setCategory("IT������");
		book2.setUnitsInStock(1000);
		book2.setReleaseDate("2020/07/25");
		
		Book book3 = new Book("ISBN1236", "��� CC 2020","25000");
		book3.setAuthor("�ڿ���");
		book3.setDescription("��� CC 2020�� ���� ù ���α׷� ���� C#�� �����ϴ� ���ڸ� ������� �Ѵ�. Ư�� ���� ���α׷��Ӹ� ���� C# �Թ�����, C#�� ����Ͽ� ����(����Ƽ), ��, �����, IOT���� ������ �� �ʿ��� C# ���� ������ ������ �⺻�⸦ źź�ϰ� ������ ���� �����̴�");

		book3.setPublisher("���");
		book3.setCategory("IT������");
		book3.setUnitsInStock(1000);
		book3.setReleaseDate("2020/05/29");
		
		listOfBooks.add(book1);
		listOfBooks.add(book2);
		listOfBooks.add(book3);

		
	}
	
	
	
	
	@Override
	public List<Book> getAllBookList() {
		// TODO Auto-generated method stub
		return listOfBooks;
	}

}
