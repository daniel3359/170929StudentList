package com.dit.student.persistence;

import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.session.SqlSession;
import com.dit.student.domain.StudentVO;

@Repository
public class StudentDAOImpl implements StudentDAO {
	@Inject
	SqlSession sqlSession;

	public List<StudentVO> selectStudentList() {
		return sqlSession.selectList("StudentMapper.selectStudentList");
	}

	public void insertStudent(StudentVO student) {
		sqlSession.insert("StudentMapper.insertStudent", student);
	}
}