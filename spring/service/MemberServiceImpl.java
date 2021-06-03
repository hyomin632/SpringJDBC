package celeste.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import celeste.spring.dao.MemberDAO;
import celeste.spring.vo.Member;

@Service("msrv")
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDAO mdao;

	@Override
	public void newMember() {
		Member m = new Member("roopy", "zanmang", "루피", "roopy@naver.com");
		System.out.println("회원 데이터 생성 완료!");
		
		mdao.insertMember(m);
	}
	
	@Override
	public void showAllMember() {
		StringBuffer sb = new StringBuffer();
		List<Member> ms = mdao.selectAllMember();
		
		for (Member m : ms) sb.append(m);
		System.out.println(sb);
	}

	@Override
	public void showOneMember(int mno) {
		Member m = mdao.selectOneMember(mno);
		System.out.println(m);
	}

	@Override
	public void modifyMember() {
		Member m = new Member("5", null, "zanmang", "잔망루피", "roopy@gmail.com", null);
		
		mdao.updateMember(m);
	}

	@Override
	public void deleteMember() {
		mdao.deleteMember(5);
	}
		
}
