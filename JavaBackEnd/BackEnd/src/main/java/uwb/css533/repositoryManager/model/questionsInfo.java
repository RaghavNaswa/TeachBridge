package uwb.css533.repositoryManager.model;

import lombok.AllArgsConstructor;
import lombok.Builder;

import javax.persistence.*;
import java.io.Serializable;

//Class that will create the database with columns

@Entity
@Builder //Used during integration tests
@AllArgsConstructor //Used during integration tests
@Table(name = "questionsHash")
public class questionsInfo implements Serializable {

    @Id
    @GeneratedValue
    @Column(nullable = false, updatable = false)
    private int id;

    private String name;

    @Column(length = 100000)
    private String question;

    @Column(length = 100000)
    private String answer;

    private int questionHash;

    public questionsInfo() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuestionHash() {
        return questionHash;
    }

    public void setQuestionHash(int questionHash) {
        this.questionHash = questionHash;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }


    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Questions Info{" +
                "id=" + id +
                ", questionsHash='" + questionHash + '\'' +
                ", question='" + question + '\'' +
                '}';
    }
}
