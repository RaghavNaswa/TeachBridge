package uwb.css533.repositoryManager.questionsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uwb.css533.repositoryManager.model.quesRes;
import uwb.css533.repositoryManager.model.questionsInfo;
import uwb.css533.repositoryManager.repo.IQuesRes;
import uwb.css533.repositoryManager.repo.IQuestionsRepo;

import java.util.List;

@Service
public class QuesResImplementation {
    private final IQuesRes quesRes;

    @Autowired
    public QuesResImplementation(IQuesRes quesRes) {
        this.quesRes = quesRes;
    }


    public void uploadResponse(String currQuestion, String currAnswer){
        quesRes qr = new quesRes();
        qr.setQuestionHash(currQuestion.hashCode());
        qr.setAnswer(currAnswer);
        quesRes.save(qr);
    }

}
