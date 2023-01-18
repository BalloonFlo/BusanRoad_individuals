<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>부산로드 챗봇입니다</title>
<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<script type="text/javascript" src="resources/js/sockjs-0.3.4.js"></script>
<script type="text/javascript" src="resources/js/stomp.js"></script>
<script type="text/javascript"
	src="resources/js/webSocketSendToUserApp.js"></script>
<script type="text/javascript">
	var stompClient = null;

	function setConnected(connected) { //연결 여부에 따라 설정 
		document.getElementById('response').innerHTML = '';
	}

	//서버로 연결함. 
	function connect() {
		//chat주소 서버와의 소켓객체 생성
		var socket = new SockJS('${pageContext.request.contextPath}/chat');
		//소켓을 통해 클라이언트 객체 획득 
		stompClient = Stomp.over(socket);
		//소켓 클라이언트를 통해 연결 획득 
		stompClient.connect({}, function(frame) {
			setConnected(true); //연결 설정 
			console.log('Connected: ' + frame);
			stompClient.subscribe('/topic/messages', function(messageOutput) {
				//서버에서 받은 메시지 출력 
				showMessageOutput(JSON.parse(messageOutput.body));
			});
		});
	}

	//서버로 연결 끊음. 
	function disconnect() {
		if (stompClient != null) {
			stompClient.disconnect();
		}
		setConnected(false); //연결끊어졌을 때 설정 변경 
		console.log("Disconnected");
	}

	//서버로 메세지 보냄 
	function sendMessage() {
		//입력한 정보를 가지고 와서 
		var from = "guest";
		var text = document.getElementById('text').value;

		stompClient.send("/app/chat", {}, JSON.stringify({
			'from' : from,
			'text' : text
		}));
	}

	//받은 데이터를 원하는 위치에 넣음. 
	function showMessageOutput(messageOutput) {
		var response = document.getElementById('response');
		var p = document.createElement('p');
		p.style.wordWrap = 'break-word';
		p.appendChild(document.createTextNode(messageOutput.menu));
		response.appendChild(p);
		document.getElementById('text').innerHTML = '';
	}
</script>
</head>
<body onload="connect();">
	<div style="height: 100px"></div>
	<div style="width: 50px; float:left;"></div>
	<div style="width: 500px;float:left;">
		<div class="alert alert-danger"
			style="width: 100%; height: 100px; background-color: #35598f; float: left; margin: 0px;"></div>
		<div class="alert alert-danger"
			style="width: 100%; background-color: #b1c0bf; float: left; margin: 0px;">
			<div>
				<br>
				<p>🐟 ChatBot : 안녕하세요 부산로드 챗봇입니다.</p> <br>
				<p>🐟 ChatBot : 무엇을 도와드릴까요?(번호입력)</p> <br>
				<p>🐟 ChatBot : 1) 홈페이지 소개 2) 관광지 추천(top20)</p>
			</div>
			<br>
			<div id="response"></div>
			<div class="form-floating mb-3 mt-3" id="conversationDiv">
				<table>
					<tr>
						<td><input type="text" class="form-control" id="text"
							style="width: 400px; background: white"></td>
						<td><button id="sendMessage" onclick="sendMessage();"
								class="btn btn-primary">전송</button></td>
					</tr>
				</table>
			</div>
		</div>
	</div>
</body>
</html>