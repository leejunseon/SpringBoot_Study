package board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import board.dto.BoardDto;
import board.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardMapper boardMapper;

	@Override
	public List<BoardDto> selectBoardList() throws Exception {
		// TODO Auto-generated method stub
		return boardMapper.selectBoardList();
	}

	@Override
	public void insertBoard(BoardDto board) throws Exception {
		// TODO Auto-generated method stub
		boardMapper.insertBoard(board);
	}

	@Override
	public BoardDto selectBoardDetail(int boardIdx) throws Exception{
		// TODO Auto-generated method stub
		boardMapper.updateHitCount(boardIdx);
		BoardDto board=boardMapper.selectBoardDetail(boardIdx);
		return board;
	}

}
