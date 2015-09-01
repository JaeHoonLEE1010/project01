package net.bitacademy.java72.service;

import java.util.List;

import net.bitacademy.java72.domain.Member;

public interface MemberService {
  int delete(int no);
  int update(Member member);
  int insert(Member member);
  List<Member> list(int pageNo, int pageSize);
  Member get(int no);
  Member getUser(String email, String password);
  int countAll();
  boolean existEmail(String email);
}
