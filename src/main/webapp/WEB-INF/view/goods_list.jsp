<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="<%=request.getContextPath() %>/resources/js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/resources/js/jquery.validate.js"></script>
<script type="text/javascript" src="/resources/My97DatePicker/WdatePicker.js"></script>
<link rel="stylesheet" href="resources/css/index3.css"/>
<title>Insert title here</title>
</head>
<body>
	<form action="goods_list.do" method="post">
		价格范围:<input type="text" name="minPrice">--<input type="text" name="maxPrice">元
		已售百分比:<input type="text" name="minSales">--<input type="text" name="maxSales">%
		排序:<select name="name" style="width: 70px">
			<option value="price">价格</option>
			<option value="sales">折扣</option>
		</select>
		<select name="order" style="width: 70px">
			<option value="asc">正序</option>
			<option value="desc">倒序</option>
		</select>
		<button>查询</button>
	</form>
	
	<table>
		<tr>
			<td>编号</td>
			<td>姓名</td>
			<td>价格</td>
			<td>折扣</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${goods }" var="good">
			<tr>
				<td>${good.gid }</td>
				<td>${good.gname }</td>
				<td>¥${good.price }</td>
				<td>${good.sales }%</td>
				<td>删除</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="10">${page }</td>
		</tr>
	</table>
</body>
</html>