public class Series extends Film{
    private int episodes;
    private int averageRuntime;

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public int getAverageRuntime() {
        return averageRuntime;
    }

    public void setAverageRuntime(int averageRuntime) {
        this.averageRuntime = averageRuntime;
    }

    @Override
    public String toString() {
        return "Series{" +
                " ID= " + super.getId() +
                ", Title= " + super.getTitle() +
                ", Genre= " + super.getGenre() +
                ", Ranking= " + super.getRanking() +
                ", Episodes= " + episodes +
                ", AverageRuntime= " + averageRuntime + " minutes" +
                '}';
    }
}
