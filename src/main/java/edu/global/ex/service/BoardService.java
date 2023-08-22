package edu.global.ex.service;

import java.util.List;

import edu.global.ex.page.Criteria;
import edu.global.ex.vo.BoardVO;

public interface BoardService {

	public List<BoardVO> getList(); // 리스트메소드
	public BoardVO read(int bid);  // 글보기메소드
	public int modify(BoardVO board); // 글수정
	public int delete(BoardVO boardVO); // 삭제
	public void register(BoardVO boardVO); //글쓰기
	public void registerReply(BoardVO boardVO); //답글달기
	
	public int getTotal();
	public List<BoardVO> getListWithPaging(Criteria cri);

}
