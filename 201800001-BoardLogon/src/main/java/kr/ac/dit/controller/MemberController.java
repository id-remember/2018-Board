package kr.ac.dit.controller;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import kr.ac.dit.domain.LogonDTO;
import kr.ac.dit.domain.MemberVO;
import kr.ac.dit.service.MemberService;
@Controller
public class MemberController {
	@Autowired
	private MemberService memberService;
	@RequestMapping(value = "/member/create", method = RequestMethod.GET)
	public void createGET() throws Exception {
	}
	@RequestMapping(value = "/member/create", method = RequestMethod.POST)
	public String createPOST(MemberVO memberVO) throws Exception {
		memberService.createMember(memberVO);
		return "redirect:/board/list";
	}
	@RequestMapping(value = "/member/login", method = RequestMethod.GET)
	public void loginGET(@ModelAttribute("logonDTO") LogonDTO logonDTO) {
	}
	@RequestMapping(value = "/member/loginPost", method = RequestMethod.POST)
	public void loginPOST(LogonDTO logonDTO, HttpSession httpSession, Model model) throws Exception {
		MemberVO memberVO = memberService.readMember(logonDTO);
		if (memberVO==null) { return; }
		model.addAttribute("memberVO", memberVO);
	}
}