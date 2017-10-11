package com.dit.student.persistence;

import java.util.List;
import com.dit.student.domain.StudentVO;

public interface StudentDAO {
	public List<StudentVO> selectStudentList();

	public void insertStudent(StudentVO student);
}