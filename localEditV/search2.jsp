<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<table>
	<tr>
		<td>번호</td>
		<td>관광지명</td>
		<td>주소</td>
	</tr>
	<!-- <tr>
		<td><input type="text" readonly="readonly" value="1"></td>
		<td><input type="text" readonly="readonly" value="1"></td>
		<td><input type="text" readonly="readonly" value="1"></td>
	</tr> -->
	<tr>
		<td><input type="text" id="num" readonly="readonly" value="${vo.num}"></td>
		<td><input type="text" id="name" readonly="readonly" value="${vo.name}"></td>
		<td><input type="text" id="address" readonly="readonly" value="${vo.address}"></td>
	</tr>
</table>