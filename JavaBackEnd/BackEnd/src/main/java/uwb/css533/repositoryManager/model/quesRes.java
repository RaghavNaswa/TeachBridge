package uwb.css533.repositoryManager.model;

import lombok.AllArgsConstructor;
import lombok.Builder;

import javax.persistence.*;
import java.io.Serializable;

//Class that will create the database with columns

@Entity
@Builder //Used during integration tests
@AllArgsConstructor //Used during integration tests
@Table(name = "questionsResponses")
public class quesRes implements Serializable {

    @Id
    @GeneratedValue
    @Column(nullable = false, updatable = false)
    private int id;

    @Column(length = 100000)
    private String answer;

    private int questionHash;

    public quesRes() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getQuestionHash() {
        return questionHash;
    }

    public void setQuestionHash(int questionHash) {
        this.questionHash = questionHash;
    }
}
