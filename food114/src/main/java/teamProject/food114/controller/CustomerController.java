package teamProject.food114.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

@Controller
public class CustomerController {
	

	// 글 내용
	@RequestMapping("/main.do")
	public String bbsBoardView(HttpServletRequest request, Model model, @RequestParam HashMap<String, Object> map)
			throws Exception {
		return "/main";
	}
	
	@RequestMapping("/login.do")
	public String login(HttpServletRequest request, Model model, @RequestParam HashMap<String, Object> map)
			throws Exception {
		return "/login";
	}
	
	   //글 내용
	   @RequestMapping(value = "/main.dox", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	   @ResponseBody
	   public String main(Model model, @RequestParam HashMap<String, Object> map) throws Exception {   
	      HashMap<String, Object> resultMap = new HashMap<String, Object>();
	      return new Gson().toJson(resultMap);
	   }


}
