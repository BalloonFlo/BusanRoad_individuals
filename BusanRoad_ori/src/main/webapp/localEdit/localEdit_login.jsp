
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>

<link rel="stylesheet"
	href="//code.jquery.com/ui/1.13.2/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script src="https://code.jquery.com/ui/1.13.2/jquery-ui.js"></script>
</head>
<body>
	<!-- 헤더 -->
	<br>
	<div class="container">
		<header class="d-flex justify-content-center py-3">
			<h1
				style="color: #1E4FFF; font-family: 'SangSangFlowerRoad'; font-size: 50px;">
				<a href="#">🕊️부산로드🕊️</a> &nbsp;&nbsp;&nbsp;
			</h1>
			<ul class="nav nav-pills">
				<li class="nav-item"><a href="#" class="nav-link">지역별로 보기</a></li>
				<li class="nav-item"><a href="../beach/beach.jsp"
					class="nav-link">해수욕장</a></li>
				<li class="nav-item"><a href="#" class="nav-link">무장애 여행</a></li>
				<li class="nav-item"><a href="#" class="nav-link">검색</a></li>
				<li class="nav-item"><a href="#" class="nav-link">혼잡도 알아보기</a></li>
			</ul>
		</header>
		<p style="text-align: right;">
			<a href="#" class="nav-link">⚙️관리자</a>
		</p>
		<hr>

		<!-- 로그인 화면 -->
		<div
			style="width: 500px; height: 500px; position: absolute; top: 50%; left: 50%; transform: translate(-50%, -50%);">
			<div align="center">
				<h4 align="center">관리자 로그인 페이지 입니다.</h4>
				<br>
				<form action="chk.jsp" method="post">
					<table>
						<tr>
							<td><input id="id" name="id" placeholder="아이디"
								class="form-control form-control-lg"></td>
						</tr>
						<tr>
							<td><input id="pw" name="pw" placeholder="비밀번호"
								class="form-control form-control-lg"> <br></td>
						</tr>
						<tr>
							<td><button type="submit" class="btn btn-primary btn-blocky"
									style="width: 300px;">로그인</button></td>
						</tr>
					</table>
				</form>
			</div>
		</div>
	</div>
</body>
</html>