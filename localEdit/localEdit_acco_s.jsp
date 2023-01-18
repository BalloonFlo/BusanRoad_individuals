
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.13.2/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script src="https://code.jquery.com/ui/1.13.2/jquery-ui.js"></script>
<title>Insert title here</title>
<script>
	$(function() {
		$('#search_btn').click(function() {
			$.ajax({
				url : "localEditV/search2",
				data : {
					name : $("#name").val()
				},
				success : function(result) {
					$('#search_div').html(result)
				},
				error : function() {
					alert('실패')
				}
			})
		})
	})
</script>
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

		<!-- 등록페이지 화면 -->
		<div>

			<!-- 관광지, 숙박시설, 음식점 선택 -->
			<div style="height: 100px;">
				<div class="alert alert-danger"
					style="width: 100%; background-color: #b1c0bf; float: left; margin: 0px;">
				</div>
				<div
					style="width: 33%; background-color: #b1c0bf; float: left; margin: 0px; top: 50%;">
					<a href="#" onclick="location.href='localEdit_tour_c.jsp'">
						<button class="text" style="width: 100%">관광지</button>
					</a>
				</div>
				<div
					style="width: 34%; background-color: #b1c0bf; float: left; margin: 0px;">
					<a href="#" onclick="location.href='localEdit_acco_c.jsp'">
						<button class="text" style="width: 100%">숙박시설</button>
					</a>
				</div>
				<div
					style="width: 33%; background-color: #b1c0bf; float: left; margin: 0px;">
					<a href="#" onclick="location.href='localEdit_rest_c.jsp'">
						<button class="text" style="width: 100%">음식점</button>
					</a>
				</div>
				<div class="alert alert-danger"
					style="width: 100%; background-color: #b1c0bf; float: left; margin: 0px;">
				</div>
			</div>
			<br>
			<!-- 관광지 등록 조회 폼 -->
			<div>
				<!-- 등록, 조회 선택 -->
				<div>
					<div>
						<a href="#" onclick="location.href='localEdit_acco_c.jsp'"><button>등록</button></a>
					</div>
					<div>
						<a href="#" onclick="location.href='localEdit_acco_s.jsp'"><button>조회</button></a>
					</div>
				</div>
				<div>
					<p>숙박시설 정보 등록하는 페이지 입니다</p>
					<form action="localEditV/insert">
						<table style="width: 1050px; font-size: 20px;">
							<tr style="height: 50px;">
								<td align="center" style="width: 342px;">이름</td>
								<td align="left"><input
									style="width: 600px; font-size: 15px;" type="text" id="name"
									name="name"></td>
							</tr>
							<tr style="height: 50px;">
								<td align="center">주소</td>
								<td align="left"><input
									style="width: 600px; font-size: 15px;" type="text" id="address"
									name="address"></td>
							</tr>
							<!-- <tr style="height: 50px;">
								<td align="center">위도</td>
								<td align="left"><input
									style="width: 600px; font-size: 15px;" type="text"
									id="latitude" name="latitude"></td>
							</tr>
							<tr style="height: 50px;">
								<td align="center">경도</td>
								<td align="left"><input
									style="width: 600px; font-size: 15px;" type="text"
									id="longtitude" name="longtitude"></td>
							</tr> -->
							<tr style="height: 50px;">
								<td align="center">체크인</td>
								<td align="left"><input
									style="width: 600px; font-size: 15px;" type="text" id="checkin"
									name="checkin">
							</tr>
							<tr style="height: 50px;">
								<td align="center">체크아웃</td>
								<td align="left"><input
									style="width: 600px; font-size: 15px;" type="text" id="checkout"
									name="checkout"></td>
							</tr>
							<tr style="height: 50px;">
								<td align="center">주차시설</td>
								<td align="left"><input
									style="width: 600px; font-size: 15px;" type="text" id="park"
									name="park"></td>
							</tr>
							<tr style="height: 50px;">
								<td align="center">카테고리</td>
								<td align="left"><input
									style="width: 600px; font-size: 15px;" type="text"
									id="category" name="category"></td>
							</tr>
							<tr style="height: 50px;">
								<td align="center">부대시설</td>
								<td align="left"><input
									style="width: 600px; font-size: 15px;" type="text"
									id="etc" name="etc"></td>
							</tr>
							<tr style="height: 50px;">
								<td align="center">웹사이트</td>
								<td align="left"><input
									style="width: 600px; font-size: 15px;" type="text"
									id="website" name="website"></td>
							</tr>
							<tr style="height: 50px;">
								<td align="center">이미지</td>
								<td align="left"><input
									style="width: 600px; font-size: 15px;" id="img" name="img"
									type="file" multiple="multiple"></td>
							</tr>
							<tr align="right">
								<td colspan="2">
									<button type="submit"
										onclick="javascript: form.action='localEditV/update2';">수정</button>

									<button type="submit"
										onclick="javascript: form.action='localEditV/delete2';">삭제</button>
									<button type="reset">취소</button>
								</td>
							</tr>
						</table>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>