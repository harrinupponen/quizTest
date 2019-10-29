package op.arkilouhinta.quiz.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface QuestionRepository extends CrudRepository<Question, Long> {

	
	List<Question> findByName(String name);
	
	
}