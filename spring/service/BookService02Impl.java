package celeste.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import celeste.spring.dao.BookDAO;
import celeste.spring.vo.Book;

@Service("bsrv02")
public class BookService02Impl implements BookService {
	
	@Autowired
	private BookDAO bdao02;

	@Override
	public void newBook() {
		Book b = new Book(19, "루피, 그는 누구인가", "잔망루피", 28000);
		int cnt = bdao02.insertBook(b);
		if (cnt > 0) System.out.println("도서 정보 등록 완료!");
		
	}

	@Override
	public void readAllBook() {
		StringBuffer sb = new StringBuffer();
		List<Book> bls = bdao02.selectAllBook();
		
		for (Book b : bls) sb.append(b);
		System.out.println(sb.toString());
		
	}

	@Override
	public void readOneBook(int bookid) {
		Book b = bdao02.selectOneBook(bookid);
		System.out.println(b);
		
	}

	@Override
	public void modifyBook() {
		Book b = new Book(16, "패티의 삶", "패티출판사", 38000);
		
		bdao02.updateBook(b);
		
	}

	@Override
	public void removeBook() {
		bdao02.deleteBook(18);
		
	}

}
