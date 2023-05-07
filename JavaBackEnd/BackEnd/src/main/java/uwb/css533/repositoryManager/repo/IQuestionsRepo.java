package uwb.css533.repositoryManager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uwb.css533.repositoryManager.model.questionsInfo;

//This repository interface is required to have basic CRUD functionalities.

@Repository
public interface IQuestionsRepo extends JpaRepository<questionsInfo, Integer> {

    Boolean existsByQuestionHash(int hashCode);
}
