package celeste.spring.service;

public interface BookService {

	void newBook();

	void readAllBook();

	void readOneBook(int bookid);

	void modifyBook();

	void removeBook();

}
