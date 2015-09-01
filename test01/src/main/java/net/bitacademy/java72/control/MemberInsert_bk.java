package net.bitacademy.java72.control;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.context.ApplicationContext;

import net.bitacademy.java72.dao.MemberDao;
import net.bitacademy.java72.domain.Member;

public class MemberInsert_bk extends HttpServlet{
/*
  private static final long serialVersionUID = 1L;
  class FileInfo {
    String originName;
    String realFilePath;
    
    public FileInfo(String originName, String realFilePath) {
      this.originName = originName;
      this.realFilePath = realFilePath;
    }
  }
  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    Member member = new Member();
    ApplicationContext context = (ApplicationContext)this.getServletContext().getAttribute("beanContainer");
    
    DiskFileItemFactory itemFactory = new DiskFileItemFactory();
    ServletFileUpload upload = new ServletFileUpload(itemFactory);
    
    HashMap<String, Object> paramMap = new HashMap<String, Object>();
    
    try {
      List<FileItem> items = upload.parseRequest(request);
      
      for(FileItem item : items) {
        if(item.isFormField()){
          paramMap.put(item.getFieldName(), item.getString("UTF-8")); //request.setCharacterEncoding("UTF-8"); 효력 없음
          System.out.println("==========><==="+item.getFieldName());
        }else{
          ServletContext context1 = request.getServletContext();
          String realPath = context1.getRealPath("/files");
          File filePath = new File(realPath+"/"+item.getName());
          item.write(filePath);
          paramMap.put(item.getFieldName(), new FileInfo(item.getName(), filePath.getAbsolutePath()));
          System.out.println("==================>"+item.getFieldName());
        }
      }
    }catch(Exception e) {
      e.printStackTrace();
    }
    //필터로 대체한다.
    //request.setCharacterEncoding("UTF-8");
    MemberDao memberDao = (MemberDao)context.getBean("memberDao");
    
    
    try {
      member.setName((String)paramMap.get("name"));
      member.setEmail((String)paramMap.get("email"));
      member.setTel((String)paramMap.get("tel"));
      member.setPassword((String)paramMap.get("password"));
      FileInfo fileInfo = (FileInfo)paramMap.get("attachFile");
      member.setPhoto(fileInfo.originName);
      memberDao.insert(member);
    }catch(Exception e) {
      RequestDispatcher rd = request.getRequestDispatcher("/error");
      request.setAttribute("error", e);
      rd.forward(request, response);
      return;
    }
    
    response.sendRedirect("list.do");
  }
  */
}
