package kr.ac.dit.persistence;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import kr.ac.dit.domain.BoardVO;
import kr.ac.dit.domain.LogonDTO;
import kr.ac.dit.domain.MemberVO;
@Repository
public class MemberDAOImpl implements MemberDAO {
	@Autowired
	SqlSession sqlSession;
	@Override
	public void insert(MemberVO memberVO) throws Exception {
		sqlSession.insert("MemberMapper.insert", memberVO);
	}
	@Override
	public MemberVO select(LogonDTO logonDTO) throws Exception {
		return sqlSession.selectOne("MemberMapper.select", logonDTO); 
	}
	@Override
	public void update(MemberVO memberVO) throws Exception {
		sqlSession.update("MemberMapper.update", memberVO);
	}
	@Override
	public void delete(LogonDTO logonDTO) throws Exception {
		sqlSession.delete("MemberMapper.delete", logonDTO); 
	}
}
