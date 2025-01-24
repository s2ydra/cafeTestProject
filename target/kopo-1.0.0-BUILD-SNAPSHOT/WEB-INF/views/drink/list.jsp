<%--
  Created by IntelliJ IDEA.
  User: super
  Date: 2025-01-24
  Time: 오후 10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Sspare | "나눠주고싶은 한 잔"</title>
</head>
<body>
    <div class="container">
        <div>
            <h3>음료목록</h3>
        </div>
        <div>
            <table border="1">
                <thead>
                    <tr>
                        <th>음료번호</th>
                        <th>음료명</th>
                        <th>카테고리번호</th>
                        <th>가격</th>
                        <th>관리</th>
                    </tr>
                </thead>
                <tbody>
                    <c:if test="${list.size() < 1}">
                        <tr>
                            <td colspan="6">검색된 음료가 없습니다.</td>
                        </tr>
                    </c:if>
                <c:forEach var="item" items="${list}">
                    <tr>
                        <td>${item.drinkId}</td>
                        <td>${item.drinkName}</td>
                        <td>${item.drCategoryId}</td>
                        <td>${item.drinkPrice}</td>
                        <td colspan="2">
                            <button type="button" onclick="location.href='update/${item.drinkId}'">수정</button>
                            <button type="button" onclick="location.href='delete/${item.drinkId}'">삭제</button>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
        <div class="buttons">
            <div>
                <button type="button" onclick="location.href='add'">추가</button>
            </div>
        </div>
    </div>
</body>
</html>
