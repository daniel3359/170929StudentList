package com.dit.student.business;

import java.util.List;
import com.dit.student.domain.StudentVO;

public interface StudentService {
	public List<StudentVO> readStudentList();

	public void createStudent(StudentVO student);
}