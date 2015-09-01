package net.bitacademy.java72.domain;

import java.io.Serializable;
import java.sql.Date;

public class Board implements Serializable {

  /*
   * 직렬화 될 때 데이터의 버전 정보도 함께 저장된다. 나중에 바이트 배열을 다시 객체로 복원할 때 버전을 검사하는데 사용한다.
   * 
   */
  private static final long serialVersionUID = 1L;
  protected int no;
  protected String title;
  protected String content;
  protected Date createDate;
  protected int viewCount;
  protected String attachFile1;
  protected String attachFile2;
  protected String attachFile3;
  protected String password;
  protected String yyyyMMdd;

  public String getYyyyMMdd() {
    return yyyyMMdd;   //yyyy-[M]M-[d]d
  }

  public void setYyyyMMdd(String yyyyMMdd) {
    this.setCreateDate(Date.valueOf(yyyyMMdd));
  }

  public String getAttachFile2() {
    return attachFile2;
  }

  public void setAttachFile2(String attachFile2) {
    this.attachFile2 = attachFile2;
  }

  public String getAttachFile3() {
    return attachFile3;
  }

  public void setAttachFile3(String attachFile3) {
    this.attachFile3 = attachFile3;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public int getNo() {
    return no;
  }

  public void setNo(int no) {
    this.no = no;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
    this.yyyyMMdd = createDate.toString();
  }

  public int getViewCount() {
    return viewCount;
  }

  public void setViewCount(int viewCount) {
    this.viewCount = viewCount;
  }

  public String getAttachFile1() {
    return attachFile1;
  }

  public void setAttachFile1(String attachFile1) {
    this.attachFile1 = attachFile1;
  }

}
