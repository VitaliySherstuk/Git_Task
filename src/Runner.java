/**
 * Created by VS-PC on 17.09.17.
 */
public class Runner {

    public static void main(String[] args)
    {
        System.out.println("First commit");

        MasterBranch masterBranch = new MasterBranch();
        masterBranch.displaySecondCommit();

        DevelopBranch developBranch = new DevelopBranch();
        developBranch.displayFirstCommitDevelopBranch();
        developBranch.displaySecondCommitDevelopBranch();
    }
}
