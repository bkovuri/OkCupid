import java.util.Comparator;

/**
 * Created by Bhanu on 4/16/14.
 */
public class ProfileMatchComparator implements Comparator<ProfileMatch>
{

    public int compare(ProfileMatch profileMatch1, ProfileMatch profileMatch2)
    {
       if(profileMatch1.getScore() > profileMatch1.getScore())
       {
           return 1;
       }
       if(profileMatch1.getScore() < profileMatch2.getScore())
       {
           return -1;
       }
       return 0;
    }
}
