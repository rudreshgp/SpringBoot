package io.javalearning.springboot.courseapidata.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {
	@Autowired
	private TopicService topicService;

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}

	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}

	@RequestMapping(method = RequestMethod.POST, path = "/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}

	@RequestMapping(method = RequestMethod.PUT, path = "/topics")
	public boolean updateTopic(@RequestBody Topic topic) {
		return topicService.updateTopic(topic);
	}

	@RequestMapping(method = RequestMethod.DELETE, path = "/topics/{id}")
	public boolean deleteTopic(@PathVariable String id) {
		return topicService.removeTopic(id);
	}


}


