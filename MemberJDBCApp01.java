package celeste.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import celeste.spring.service.MemberService;

public class MemberJDBCApp01 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springjdbc01.xml");
		
		MemberService msrv = (MemberService) ctx.getBean("msrv");
		
		// 회원 정보 등록
		// msrv.newMember();
		
		// 회원 정보 전체 조회
		// msrv.showAllMember();
		
		// 회원 정보 상세 조회
		// msrv.showOneMember(5);
		
		// 회원 정보 수정
		// msrv.modifyMember();
		
		// 회원 정보 삭제
		msrv.deleteMember();

	}

}
