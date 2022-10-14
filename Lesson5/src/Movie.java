public class Movie extends Film{
    private int runTime;

    public int getRunTime() {
        return runTime;
    }

    public void setRunTime(int runTime) {
        this.runTime = runTime;
    }

    @Override
    public String toString() {
        return "Movie{" +
                " ID= "+super.getId()+
                ", Title= "+super.getTitle()+
                ", Genre= "+super.getGenre() +
                ", Ranking= "+super.getRanking()+
                ", Runtime= " + runTime +" minutes " + '\'' +
                '}';
    }
}
