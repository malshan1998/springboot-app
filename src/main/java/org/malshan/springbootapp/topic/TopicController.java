package org.malshan.springbootapp.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return Arrays.asList(
          new Topic(),
          new Topic("1", "Spring Framework 1", "Spring Framework Description 1"),
          new Topic("2 ", "Spring Framework 2", "Spring Framework Description 2"),
          new Topic("3", "Spring Framework 3", "Spring Framework Description 3")
        );
    }
}
