import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie();//Movie số 1//
        movie1.setId("1543571");
        movie1.setTitle("The Shawshank Redemption");
        movie1.setGenre(Genre.COMEDY);
        movie1.setRanking(1.0);
        movie1.setRunTime(142);
        movie1.setDirector("Frank Darabont");
        Movie movie2 = new Movie();//Movie số 2//
        movie2.setId("1731774");
        movie2.setTitle("The God Father");
        movie2.setGenre(Genre.COMEDY);
        movie2.setRanking(2.0);
        movie2.setRunTime(189);
        movie2.setDirector("Morgan Freeman");
        Movie movie3 = new Movie();//Movie số 3//
        movie3.setId("1622882");
        movie3.setTitle("The Dark Knight");
        movie3.setGenre(Genre.DOCUMENTARY);
        movie3.setRanking(3.0);
        movie3.setRunTime(120);
        movie3.setDirector("William Sadler");
        Series series1 = new Series();//Series số 1//
        series1.setId("1474687");
        series1.setTitle("Planet Earth II");
        series1.setGenre(Genre.DOCUMENTARY);
        series1.setRanking(1.0);
        series1.setEpisodes(6);
        series1.setAverageRuntime(51);
        series1.setDirector("Gil Bellows");
        Series series2 = new Series();//Series số 2//
        series2.setId("1548321");
        series2.setTitle("Breaking Bad");
        series2.setGenre(Genre.HORROR);
        series2.setRanking(2.0);
        series2.setEpisodes(13);
        series2.setAverageRuntime(45);
        series2.setDirector("James Whitmore");
        Series series3 = new Series();//Series số 3//
        series3.setId("1328547");
        series3.setTitle("The Wire");
        series3.setGenre(Genre.HORROR);
        series3.setRanking(5.0);
        series3.setEpisodes(15);
        series3.setAverageRuntime(60);
        series3.setDirector("Larry Brandenburg");
        Film[] films = new Film[6];//Xếp
        films[0] = movie1;
        films[1] = movie2;
        films[2] = movie3;
        films[3] = series1;
        films[4] = series2;
        films[5] = series3;
        System.out.println(movie1.toString());//In ra thông tin về Movie số 1//
        System.out.println(movie2.toString());//In ra thông tin về Movie số 2//
        System.out.println(movie3.toString());//In ra thông tin về Movie số 3//
        System.out.println(series1.toString());//In ra thông tin về Series số 1//
        System.out.println(series2.toString());//In ra thông tin về Series số 2//
        System.out.println(series3.toString());//In ra thông tin về Series số 3//
        System.out.println("Xin mời bạn nhập từ khóa: ");
        Scanner sc = new Scanner(System.in);
        String keyWord = sc.nextLine();
        for (int i = 0; i < 5; i++) {
            if (films[i].getTitle().contains(keyWord)){
                System.out.println("Phim mà bạn đang tìm kiếm là: " + films[i]);
            }
        }
        double max;
        for (int i= 0; i < 5; i++){
            max =films[i].getRanking();
            for (i=0; i < 5; i++) {
                if (films[i].getRanking() >max){
                    max = films[i].getRanking();
                }
            }
            System.out.println("Phim có ranking thấp nhất là: " +films[i]);
        }
    }
}