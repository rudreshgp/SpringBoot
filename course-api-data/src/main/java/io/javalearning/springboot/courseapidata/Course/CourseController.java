package io.javalearning.springboot.courseapidata.Course;

import io.javalearning.springboot.courseapidata.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
	@Autowired
	private CourseService courseService;

	@RequestMapping("/topics/{id}/courses")
	public List<Course> getAllCourses(@PathVariable String id) {
		return courseService.getAllCourses(id);
	}

	@RequestMapping("/topics/{topicId}/courses/{courseId}")
	public Course getCourse(@PathVariable String topicId, @PathVariable String courseId) {
		return courseService.getCourse(courseId);
	}

	@RequestMapping(method = RequestMethod.POST, path = "/topics/{topicId}/courses")
	public void addCourse(@RequestBody Course course, @PathVariable String topicId) {
		course.setTopic(new Topic(topicId,"",""));
		courseService.addCourse(course);
	}

	@RequestMapping(method = RequestMethod.PUT, path = "/topics/{topicId}/courses/{courseId}")
	public boolean updateCourse(@RequestBody Course course,@PathVariable String topicId,@PathVariable  String courseId) {
		course.setTopic(new Topic(topicId,"",""));
		return courseService.updateCourse(course);
	}

	@RequestMapping(method = RequestMethod.DELETE, path = "/topics/{topicId}/courses/{courseId}")
	public boolean deleteCourse(@PathVariable String courseId) {
		return courseService.removeCourse(courseId);
	}


}


