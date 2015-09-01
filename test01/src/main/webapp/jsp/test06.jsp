<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%--JSP 주석
    => JSP 엔진이 클래스를 만들 때 제거한다.
    JSP의 구성요소 :
    => 템플릿 데이터, JSP 액션 태그, 스크립트릿(scriptlet), 표현식(expression element),
       선언문(declaration element), 지시문(directive element)
       
       5. 지시문: 페이지에 영향을 주는 특별한 자바 코드를 생성한다.
       => <%@ page 속성="값" %>
       => <%@ include %>
       => <%@ taglib %>
       
       1) page 지시문 
       => language 속성
          - JSP 페이지의 스크립트로 사용되는 언어를 지정한다.
          - 다양한 언어를 지원하기 위해 만들었지만, 현재는 java만 지원한다.
       => contentType 속성
          - reponse.setContentType() 코드를 생성한다.
          
       => pageEncoding 속성
          - JSP페이지를 작성 할 때 사용한 문자집합을 지정한다.
          - JSP엔진은 여기에 지정된 문자표를 바탕으로 자바 소스 코드를 생성한다.
          
       => import 속성
          - import 자바 코드를 생성한다.
          - 예) import = "java.util.*, java.net.*"
                => import java.util.*;
                   import java.net.*;
                   
       --%>
    
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>안녕!</title>
</head>
<body>
<h1>페이지 지시문</h1>
</body>
</html>
