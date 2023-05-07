package uwb.css533.repositoryManager.questionsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uwb.css533.repositoryManager.model.questionsInfo;
import uwb.css533.repositoryManager.repo.IQuestionsRepo;

import java.util.List;

@Service
public class QuestionsServiceImplementation {
    private final IQuestionsRepo questRepo;

    @Autowired
    public QuestionsServiceImplementation(IQuestionsRepo questRepo) {
        this.questRepo = questRepo;
    }

    public List<questionsInfo> findAllQuestions(){
        return questRepo.findAll();
    }

    public void uploadQuestion(questionsInfo currQuestion){
        currQuestion.setQuestionHash(currQuestion.getQuestion().hashCode());
        questRepo.save(currQuestion);
    }

}
