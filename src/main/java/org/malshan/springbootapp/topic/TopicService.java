package org.malshan.springbootapp.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

// Business Service class
// This is a Singleton (??) : A design pattern !
// In Singleton, there's only one instance of this class, and a global point of access is provided to the class.
// Spring creates an instance of this class, and it stores it in the memory.

@Service    // Stereotype annotation as a Service class
public class TopicService {
    private List<Topic> topics = Arrays.asList(
            new Topic(),
            new Topic("1", "Spring Framework 1", "Spring Framework Description 1"),
            new Topic("2", "Spring Framework 2", "Spring Framework Description 2"),
            new Topic("3", "Spring Framework 3", "Spring Framework Description 3")
    );

    public List<Topic> getAllTopics() {
        return topics;
    }
}
