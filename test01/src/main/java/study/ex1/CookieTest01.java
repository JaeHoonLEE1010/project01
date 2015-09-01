package study.ex1;
/*
 *  Cookie
 *  1) 같은 경로는 정보가 전달됨 /study/ex1/test01
 *  2) 다른 경로는 정보전달 X  /study/ex2/test03
 *  3) 하위 경로인 경우는 정보 전달 가능 /study/ex1/exam1/test04
 *  4) 다른 경로에 정보 전달하려면 setPath로 명시
 *  5) 웹 서버가 웹 브라우저에게 맡기는 정보
 *  6) 같은 경로의 servlet에 요청할 때마다 보내줌
 *  // 쿠키에 유효기간이 있으면 하드 디스크에 보관한다. 
 */
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/study/ex1/test01")
public class CookieTest01 extends HttpServlet {

  private static final long serialVersionUID = 1L;

  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    //1) 쿠키 생성
    Cookie cookie1 = new Cookie("name", "hong");
    Cookie cookie2 = new Cookie("age", "20");
    //2)응답 헤더에 추가
    response.addCookie(cookie1);
    response.addCookie(cookie2);
    response.setContentType("text/html;charset=UTF-8");
    
    PrintWriter out = response.getWriter();
    
    out.println("<html>");
    out.println(" <body>");
    out.println("  <h1>CookieTest01</h1>");
    out.println("</body>");
    out.println("</html>");
  }
}
