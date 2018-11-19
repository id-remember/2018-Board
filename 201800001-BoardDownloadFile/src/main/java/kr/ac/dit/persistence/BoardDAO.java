package kr.ac.dit.persistence;
import java.util.List;
import kr.ac.dit.domain.BoardVO;
public interface BoardDAO {
	public List<BoardVO> selectList() throws Exception;
	public void insert(BoardVO boardVO) throws Exception;
	public BoardVO select(int no) throws Exception;
	public List<String> selectAttachFile(int no) throws Exception;
	public void update(BoardVO boardVO) throws Exception;
	public void delete(int no) throws Exception;
	public void insertAttachFile(String fileName);
}
