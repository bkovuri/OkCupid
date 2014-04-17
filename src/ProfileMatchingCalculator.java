import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Bhanu on 4/16/14.
 */
public class ProfileMatchingCalculator {

    private Collection<Profile> profiles;
    private Map<Integer, ProfileMatch> profileMatchMap;

    public ProfileMatchingCalculator()
    {
        setProfileMatchMap(new LinkedHashMap<Integer, ProfileMatch>());
    }

    public Collection<Profile> getProfiles() {
        return profiles;
    }

    public void setProfiles(Collection<Profile> profiles) {
        this.profiles = profiles;
    }

    void calculateMatch(Profile profile)
    {

        for(Profile matchProfile: getProfiles())
        {
            Double countSameQuestions = 0.0;

            // Total importance based on matched questions
            Double cImportance = 0.0;
            // Importance calculated based on accepted answers
            Double aImportance = 0.0;


            for(Question question: profile.getQuestions().values())
            {
                if(matchProfile.getQuestions().containsKey(question.getQuestionId()))
                {
                    Question questionInMatch  = matchProfile.getQuestions().get(question.getQuestionId());

                    countSameQuestions++;
                    if(question.getAcceptableAnswers().contains(questionInMatch.getAnswer()))
                    {
                        aImportance = aImportance + question.getImportance().getValue();
                    }
                }

            }

            Double score = ((aImportance / cImportance) * (1/countSameQuestions));
            ProfileMatch profileMatch = new ProfileMatch();
            profileMatch.setProfileId(matchProfile.getId());
            profileMatch.setScore(score);
            profile.getProfileMatches().add(profileMatch);
        }

    }

    public Map<Integer, ProfileMatch> getProfileMatchMap() {
        return profileMatchMap;
    }

    public void setProfileMatchMap(Map<Integer, ProfileMatch> profileMatchMap) {
        this.profileMatchMap = profileMatchMap;
    }
}
