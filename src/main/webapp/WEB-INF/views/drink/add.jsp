<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: super
  Date: 2025-01-24
  Time: 오후 11:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Sspare | "나눠주고싶은 한 잔"</title>
  <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
          integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
          crossorigin="anonymous"></script>
  <link
          href="https://cdn.jsdelivr.net/npm/summernote@0.9.0/dist/summernote-lite.min.css"
          rel="stylesheet">
  <script
          src="https://cdn.jsdelivr.net/npm/summernote@0.9.0/dist/summernote-lite.min.js"></script>
</head>
<body>
  <div class="container">
    <div>
      <h3>음료 추가하기</h3>
    </div>
    <div>
      <form method="post">
        <div>
          <label>음료이름</label>
          <input type="text" name="drinkName" placeholder="음료명을 입력하세요.">
        </div>
        <div>
          <label>카테고리</label>
<%--          <input type="text" name="drCategoryId" placeholder="카테고리 번호를 작성하시오.">--%>
          <select name="drCategoryId">
            <c:forEach var="item" items="${categories}">
                <option value="${item.drCategoryId}">${item.drCategoryName}</option>
            </c:forEach>

          </select>
        </div>
        <div>
          <label>가격</label>
          <input type="text" name="drinkPrice" placeholder="가격을 정해주세요.">
        </div>
        <div>
          <label>음료 설명</label>
          <textarea id="drinkInfo" name="drinkInfo"></textarea>
        </div>
        <div>
          <button type="submit">추가</button>
          <button type="button" onclick="location.href='list'">취소</button>
        </div>
      </form>
    </div>
  </div>
  <script type="text/javascript">
    $(() => {
      $("#drinkInfo").summernote({
        lang: 'ko-KR',
        height:300,
      });
    });
  </script>
</body>
</html>
