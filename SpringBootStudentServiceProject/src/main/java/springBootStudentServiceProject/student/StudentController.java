package springBootStudentServiceProject.student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import springBootStudentServiceProject.course.Course;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
//	
//	@RequestMapping("/students")
//	public List<Student> getAllStudents(){
//		return studentService.getAllStudents();
//	}
//	
//	@RequestMapping("/students/{id}")
//	 public Optional<Student> getStudent(@PathVariable String id) {
//		 return studentService.getStudent(id);
//	 }
//	@RequestMapping(method=RequestMethod.POST,value="/students")
//	public void addStudent(@RequestBody Student student) {
//		studentService.addStudent(student);
//	}
//	@RequestMapping(method=RequestMethod.PUT,value="/students/{id}")
//	public void updateStudent(@RequestBody Student student,@PathVariable String id) {
//		studentService.updateStudent(student,id);
//	}
//	@RequestMapping(method=RequestMethod.DELETE,value="/students/{id}")
//	public void deleteStudent(@PathVariable String id) {
//		studentService.deleteStudent(id);
//	}
/////////////////////////////////////////////////////////////////////////
	@RequestMapping("/students")
	public List<StudentVM> getAllStudentsOnly(){
		return studentService.getAllStudentsOnly();
	}
	@RequestMapping(method=RequestMethod.POST,value="/students")
	public void addCoursesOnly(@RequestBody Student student) {
		studentService.addStudentsOnly(student);

	}
	
}