package a160802_interface;

public class BoardArrayDAO implements IBoardDAO {

	@Override
	public int insertArticle(BoardVO vo) {
		//게시판의 bbsno값은 입력이 안 된 상태로 넘어오기 때문에
		//bbsno값을 설정해 줄 필요가 있습니다.
		//게시판 글 번호 설정
		int maxBbsno=0;
		for(int i=0;i<BoardDATA.count;i++){
			BoardVO board=BoardDATA.boardList[i];
			if(board.getBbsno()>maxBbsno){
				maxBbsno=board.getBbsno();
			}
		}
		vo.setBbsno(++maxBbsno);
		
		BoardDATA.boardList[BoardDATA.count]=vo;
		BoardDATA.count++;
		return maxBbsno;
	}
	//수정
	@Override
	public int updateArticle(BoardVO vo) {
		int bbsno=vo.getBbsno();
		for(int i=0;i<BoardDATA.count;i++){
			BoardVO board = BoardDATA.boardList[i];
			if(board.getBbsno()==bbsno){
				BoardDATA.boardList[i]=vo;
				BoardDATA.index=i;
			}
		}
		// TODO 2.게시판 수정 구현
		return vo.getBbsno();	//변경한 게시판 글 번호를 리턴
	}

	@Override
	public int deleteArticle(int bbsno) {
		//찾고
		for(int i=0;i<BoardDATA.count;i++){
			if(bbsno==BoardDATA.boardList[i].getBbsno()){
				BoardDATA.index=i;
			}
		}
		//삭제 구현
		for(int i=BoardDATA.index;i<BoardDATA.count-1;i++){
			BoardDATA.boardList[i]=BoardDATA.boardList[i+1];
		}
		BoardDATA.count--;
		return bbsno;
	}

	@Override
	public BoardVO selectArticle(int bbsno) {
		for(int i=0;i<BoardDATA.count;i++){
			if(BoardDATA.boardList[i].getBbsno()==bbsno){
				return BoardDATA.boardList[i];
			}
		}
		// TODO 4.게시판 조회 구현
		return null;
	}

	@Override
	public BoardVO[] listArticle(int page) {
		//
		return BoardDATA.boardList;
	}
//Window--showview=general-tasks
}
