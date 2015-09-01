package net.bitacademy.java72.dao;

import java.util.List;
import java.util.Map;

import net.bitacademy.java72.domain.Board;

public interface BoardDao {
  int delete(int no);
  int update(Board board);
  int insert(Board board);
  List<Board> list(Map<String, Object> paramMap);
  Board get(int no);
  int countAll();
}
