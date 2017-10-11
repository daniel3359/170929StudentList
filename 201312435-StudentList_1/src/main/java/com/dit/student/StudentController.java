package com.dit.student;

import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.dit.student.business.StudentService;
import com.dit.student.domain.StudentVO;

@Controller
public class StudentController {
	@Inject
	private StudentService studentService;

	@RequestMapping("/list")
	public String list(Model model) {
		model.addAttribute("students", studentService.readStudentList());
		return "StudentList";
	}

	@RequestMapping("/StudentAdd")
	public void StudentAddGET() {
	}

	@RequestMapping(value = "/StudentAdd", method = RequestMethod.POST)
	public String StudentAddPOST(StudentVO student) {
		studentService.createStudent(student);
		return "redirect:/list";
	}
}