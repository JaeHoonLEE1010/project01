<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%--JSP 주석
    1)final javax.servlet.jsp.PageContext pageContext;
    2)javax.servlet.http.HttpSession session = null;
    3)final javax.servlet.ServletContext application;
    4)final javax.servlet.ServletConfig config;
    5)javax.servlet.jsp.JspWriter out = null;
    6)final java.lang.Object page = this;
    7)final javax.servlet.http.HttpServletRequest request 
    8)final javax.servlet.http.HttpServletResponse response
    9)Exception 객체의 exception
    
    
    => JSP 엔진이 클래스를 만들 때 제거한다.
    JSP의 구성요소 :
    => 템플릿 데이터, JSP 액션 태그, 스크립트릿(scriptlet), 표현식(expression element),
       선언문(declaration element), 지시문(directive element)
       
       1. 템플릿 데이터(template data)
       => JSP에 그냥 작성하는 텍스트.
       => out.write() 또는 out.print() 등의 출력문을 생성한다.
       
     --%>
     <!-- HTML
     JSP 엔진 입장에서 HTML 주석도 웹 브라우저로 출력되어야 할 대상이다.
     따라서 출력문으로 바뀐다.
      -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>하</title>
</head>
<body>
<h1>안녕하세요!</h1>
</body>
</html>