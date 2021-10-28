<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2021/10/22
  Time: 9:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
        <title>新增联系人</title>
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
                    <small>新增联系人</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/contact/addMan" method="post">
        编号：<input type="text" name="id"><br><br><br>
        姓名：<input type="text" name="name"><br><br><br>
        地址：<input type="text" name="address"><br><br><br>
        电话号码：<input type="text" name="phoneNumber"><br><br><br>
        <input type="submit" value="添加">
    </form>
</div>

</body>
</html>
