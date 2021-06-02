package celeste.spring.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import celeste.spring.vo.Book;

@Repository("bdao02")
public class BookDAO02Impl implements BookDAO {
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public int insertBook(Book b) {
		return sqlSession.insert("book.insertBook", b);
		
	}

	@Override
	public List<Book> selectAllBook() {
		return sqlSession.selectList("book.selectBook");
		
	}

	@Override
	public Book selectOneBook(int bookid) {
		return sqlSession.selectOne("book.selectOneBook", bookid);
		
	}

	@Override
	public int updateBook(Book b) {
		int cnt = sqlSession.update("book.updateBook", b);
		if (cnt > 0) System.out.println("도서 정보 수정 완료!");
		return cnt;
		
	}

	@Override
	public int deleteBook(int bookid) {
		int cnt = sqlSession.delete("book.deleteBook", bookid);
		if (cnt > 0) System.out.println("도서 정보 삭제 완료!");
		return cnt;
		
	}

}
