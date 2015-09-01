<%@page import="net.bitacademy.java72.domain.Board"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset='UTF-8'>
<title>게시물 상세보기</title>
<jsp:include page="/Header.jsp"/>
<style>
    table {
    border-collapse: separate;
    }
    th {
     background-color: lightgray;
      padding: 5px;
     }
    </style>
    </head>
    <body>
<jsp:include page="/LoginInfo.jsp"/>
<h1>게시물 상세보기</h1>
    <form action='update.do' method='post' enctype='multipart/form-data'>
    <table>
    <% 
    Board board = (Board)request.getAttribute("board");
    if (board != null) {
      out.println("<tr><th>번호</th>"
          + "<td>"
          + "<input type='text' readonly"
          + " name='no' value='"+board.getNo()+"'>"
          + "</td></tr>");
      out.println("<tr><th>제목</th>"
          + "<td>"
          + "<input type='text' name='title' value='"+board.getTitle()+"'>"
          + "</td></tr>");
      out.println("<tr><th>내용</th>"
          + "<td><textarea name='content'"
          + " rows='5' cols='50'>"+board.getContent()+"</textarea>"
          + "</td></tr>");
      out.println("<tr><th>암호</th>"
          + "<td>"
          + "<input type='password' name='password' value='"+board.getPassword()+"'>"
          + "</td></tr>");
      out.println("<tr><th>조회수</th><td>"+board.getViewCount()+"</td></tr>\n");
      out.println("<tr><th>등록일</th><td>"+board.getCreateDate()+"</td></tr>");
      out.println("<tr><th>첨부파일</th>"
          + "<td><a href='../files/"+board.getAttachFile1()+"'>"+board.getAttachFile1()+"</a>"
          + "<input type='file' name='file1'>"
          + "</td></tr>");
    } else {
      out.println("<tr><td>"
          + "해당 번호의 게시물을 찾을 수 없습니다."
          + "</td></tr>");
    }
    out.println("<tr>");
    out.println("  <th></th>");
    out.println("  <td>"
        + "<input type='submit' value='변경'>"
        + "<a href='delete.do?no="+board.getNo()+"'>삭제</a>"
        + "</td>");
    out.println("</tr>");
    %>
    </table>
    </form>
    <p><a href='list.do'>목록</a><p>
<jsp:include page="/Footer.jsp"/>
</body>
</html>