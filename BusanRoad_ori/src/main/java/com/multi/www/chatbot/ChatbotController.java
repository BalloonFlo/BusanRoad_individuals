package com.multi.www.chatbot;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatbotController {

	@MessageMapping("/chat")
	@SendTo("/topic/messages")
	public OutputMessage send(Message message) throws Exception {
		String menu = "";
		switch (message.getText()) {
		case "1":
			menu = "🐳 ChatBot : 부산로드 홈페이지에서는 부산에 위치한 관광지, 숙박업소, 음식점의 정보를 담고 있으며 보다 편리하게 관광을 즐기실 수 있도록 무장애 여행 정보와 특정 관광지의 혼잡도를 제공해드리고 있습니다.";
			break;
		case "2":
			menu = "🐳 ChatBot : 01) 감천문화마을 02) 해운대해수욕장 03) 씨라이프 부산 아쿠아리움 04) 해동용궁사 05) 다이아몬드타워(부산타워) 06) 용두산공원 07) 태종대리조트파크 08) 남포동 09) 광안리해수욕장 10) 광안대교 11) BIFF 광장 12) 범어사 13) 서면 1번가 14) 동백공원 15) 부산역 16) 오륙도 17) 비치로드 18) 서면 19) 누리마루 APEC하우스 20) 송도해상케이블카 21) 이전 22) 종료";
			break;
		case "3":
			menu = "🐟 ChatBot : 즐거운 관광하세요. 감사합니다.";
			break;
		
		default:
			menu = "🦀 다시 입력해주세요!";
			break;
		}
		return new OutputMessage(message.getFrom(), message.getText(), menu);
	}

}
