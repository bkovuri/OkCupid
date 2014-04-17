import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Bhanu on 4/16/14.
 */
public class Question {


    private int questionId;

    private int answer;

    private Set<Integer> acceptableAnswers;

    private ImportanceEnum importance;

    Question()
    {
        acceptableAnswers = new LinkedHashSet<Integer>();
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public Set<Integer> getAcceptableAnswers() {
        return acceptableAnswers;
    }

    public void setAcceptableAnswers(Set<Integer> acceptableAnswers) {
        this.acceptableAnswers = acceptableAnswers;
    }

    public ImportanceEnum getImportance() {
        return importance;
    }

    public void setImportance(ImportanceEnum importance) {
        this.importance = importance;
    }
}
