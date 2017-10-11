package com.dit.student.business;

import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Repository;
import com.dit.student.domain.StudentVO;
import com.dit.student.persistence.StudentDAO;

@Repository
public class StudentServiceImpl implements StudentService {
	@Inject
	private StudentDAO studentDAO;

	@Override
	public List<StudentVO> readStudentList() {
		return studentDAO.selectStudentList();
	}

	@Override
	public void createStudent(StudentVO student) {
		studentDAO.insertStudent(student);
	}
}