<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2021/10/22
  Time: 8:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>通讯录</title>
    <meta name="viewport" content="width=device-width,initial-scale=1.0">
    <link
            href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css"
            rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>联系人列表</small>
                </h1>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-4 column">
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/contact/toAddMan">新增</a>
        </div>
        <div class="col-md-4 column"></div>
        <div class="col-md-4 column">
            <form class="form-inline" action="${pageContext.request.contextPath}/contact/queryMan" method="post" style="float: right">
                <input type="text" name="id" class="form-control" placeholder="输入查询id" required>
                <input type="submit" value="查询" class="btn btn-primary">
            </form>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>联系人编号</th>
                    <th>联系人姓名</th>
                    <th>联系人地址</th>
                    <th>联系人电话</th>
                    <th>操作</th>
                </tr>
                </thead>

                <tbody>
                <c:forEach var="man" items="${requestScope.get('list')}">
                    <tr>
                        <td>${man.getId()}</td>
                        <td>${man.getName()}</td>
                        <td>${man.getAddress()}</td>
                        <td>${man.getPhoneNumber()}</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/contact/toUpdateMan?id=${man.getId()}">更改</a>
                            <a href="${pageContext.request.contextPath}/contact/del/${man.getId()}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>
