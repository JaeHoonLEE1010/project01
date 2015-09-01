<%@page import="net.bitacademy.java72.domain.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--
Expression Language
  => 꺼낼 보관소를 지정하지 않으면, 다름 순서로 찾는다.
  => PageContext ---> ServletRequest ---> HttpSession ---> ServletContext
  => 객체를 찾지 못했다고 해서 NullPointerException 오류를 발생시키지는 않는다.
  => 단지 빈 문자열 출력
--%>
<%
Member member = new Member();
member.setNo(1);
member.setName("홍길동");
member.setEmail("hong@test.com");
member.setTel("111-1111");

application.setAttribute("member", member);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>안녕!</title>
</head>
<body>
번호: ${member.no}<br>
이름: ${member.name}<br>
이메일: ${member.email}<br>
전화번호: ${member.tel}<br>
</body>
</html>