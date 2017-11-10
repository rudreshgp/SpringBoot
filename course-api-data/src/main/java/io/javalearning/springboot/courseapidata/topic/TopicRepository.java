package io.javalearning.springboot.courseapidata.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {

	//getAllTopics
	//getTopic(id)
	//updateTopic(Topic)
	//deleteTopic(id)


}
