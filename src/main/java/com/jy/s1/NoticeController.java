package com.jy.s1;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jy.s1.notice.NoticeDTO;
import com.jy.s1.notice.NoticeService;

@Controller
@RequestMapping("/notice/**")
public class NoticeController {
	
	@Inject
	private NoticeService noticeService;
	
	
	
	
	//Write -Post
	@RequestMapping(value = "noticeWrite", method = RequestMethod.POST)
	public String noticeWrite(NoticeDTO noticeDTO) {
		
		return "redirect:./noticeList";
	}
	
	
	//Write - Get
	@RequestMapping(value= "noticeWrite", method = RequestMethod.GET)
	public void noticeWrite() {
		
	}
		
	//selectone  /* @RequestParam(value = "n", required = false, defaultValue = "1") */ 
	
	@RequestMapping(value = "noticeSelect", method = {RequestMethod.GET, RequestMethod.POST})
		public Model noticeSelect(Model model,int num) throws Exception{
		NoticeDTO noticeDTO = noticeService.noticeSelect(num);
		model.addAttribute("dto", noticeDTO);
		return model;
				
	}
	
	
	//list
	@RequestMapping("noticeList")
	public ModelAndView noticeList() throws Exception {
		List<NoticeDTO> ar = noticeService.noticeList();
		//URL notice/noticeList
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", ar);
		mv.setViewName("notice/noticeList");
		return mv;
	}
	
	
	
}
