package net.bitacademy.java72.service;

import java.util.List;

import net.bitacademy.java72.domain.Board;

public interface BoardService {
  int delete(int no);
  int update(Board board);
  int insert(Board board);
  List<Board> list(int pageNo, int pageSize);
  Board get(int no);
  //int totalCount();
  int countAll();
}
