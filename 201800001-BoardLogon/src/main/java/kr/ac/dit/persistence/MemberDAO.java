package kr.ac.dit.persistence;
import kr.ac.dit.domain.LogonDTO;
import kr.ac.dit.domain.MemberVO;
public interface MemberDAO {
	public void insert(MemberVO memberVO) throws Exception;
	public MemberVO select(LogonDTO logonDTO) throws Exception;
	public void update(MemberVO memberVO) throws Exception;
	public void delete(LogonDTO logonDTO) throws Exception;
}
