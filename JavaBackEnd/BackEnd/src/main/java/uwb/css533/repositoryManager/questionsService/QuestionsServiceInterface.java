package uwb.css533.repositoryManager.questionsService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uwb.css533.repositoryManager.model.questionsInfo;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionsServiceInterface {

    private final QuestionsServiceImplementation questionsServiceImplementation;
    private final QuesResImplementation quesResImplementation;

    public QuestionsServiceInterface(QuestionsServiceImplementation searchServiceImplementation, QuesResImplementation quesResImplementation) {
        this.questionsServiceImplementation = searchServiceImplementation;
        this.quesResImplementation = quesResImplementation;
    }

    @CrossOrigin
    @GetMapping("/all")
    //Will return HTTP response and in the body there is going to be a list of dependencies
    public ResponseEntity<List<questionsInfo>> getAllQuestions(){
        List<questionsInfo> deps = questionsServiceImplementation.findAllQuestions();
        return new ResponseEntity<>(deps, HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping("/add")
    public ResponseEntity uploadQuestion(@RequestBody questionsInfo question){
//        System.out.println(question.getQuestion());
//        System.out.println(question.getAnswer());
//        System.out.println(question.getName());
        quesResImplementation.uploadResponse(question.getQuestion(), question.getAnswer());
        questionsServiceImplementation.uploadQuestion(question);
        return new ResponseEntity(HttpStatus.OK);
    }

}
