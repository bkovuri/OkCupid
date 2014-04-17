import java.util.*;

/**
 * Created by Bhanu on 4/16/14.
 */
public class Profile {

    private Integer id;

    private Map<Integer, Question> questions;

    private List<ProfileMatch> profileMatches;

    Profile()
    {
        questions = new LinkedHashMap<Integer, Question>();
        setProfileMatches(new ArrayList<ProfileMatch>());
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Map<Integer, Question> getQuestions() {
        return questions;
    }

    public void setQuestions(Map<Integer, Question> questions) {
        this.questions = questions;
    }

    public Collection<ProfileMatch> getProfileMatches() {
        return profileMatches;
    }

    public void setProfileMatches(List<ProfileMatch> profileMatches) {
        this.profileMatches = profileMatches;
    }

    Collection<ProfileMatch> getTopTenProfileMatches()
    {
        Collections.sort(profileMatches, new ProfileMatchComparator());
        Collection<ProfileMatch> topMatches = new ArrayList<ProfileMatch>(10);

        for(int i = 0; i < 10; i++)
        {
            if(profileMatches.get(i) == null)
            {
               return topMatches;
            }
            topMatches.add(profileMatches.get(i));
        }
        return topMatches;
    }

}
