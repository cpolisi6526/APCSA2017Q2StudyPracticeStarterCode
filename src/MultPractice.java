/**
 * Created by Teacher on 4/1/2019.
 */
public class MultPractice implements StudyPractice {
    int firstInteger;
    int secondInteger;
    public MultPractice(int f, int s){
        this.firstInteger=f;
        this.secondInteger=s;
    }

    @Override
    public String getProblem() {
        return firstInteger + " TIMES " + secondInteger;
    }

    @Override
    public void nextProblem() {
        secondInteger++;
    }
}
