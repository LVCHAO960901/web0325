<%--
  Created by IntelliJ IDEA.
  User: wangyu
  Date: 2019/3/25
  Time: 10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
    <%
        String basepath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath();
        pageContext.setAttribute("basepath", basepath);
    %>
</body>
</html>
