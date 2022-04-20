<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- <a href="queryKeysByLockId">根据lockid查询</a> -->
<form action="queryKeysByLockId">
请输入lockid：<input name="lockid" type="text" value="1"><br><br>
<input type="submit" value="提交lockid"><br><br>
</form>
<!-- <a href="queryKeysByLikeLockName">根据lockname查询</a> -->
<form action="queryKeysByLikeLockName">
请输入lock名称：<input name="lockname" type="text" value="B3"><br><br>
<input type="submit" value="提交lockname"><br><br>
</form>


</body>
</html>