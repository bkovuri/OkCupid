/**
 * Created by Bhanu on 4/16/14.
 */
public class ProfileManager {

    private static ProfileMatchingCalculator profileMatchingCalculator = new ProfileMatchingCalculator();

    public static ProfileMatchingCalculator getProfileMatchingCalculator()
    {
        return profileMatchingCalculator;
    }
}
